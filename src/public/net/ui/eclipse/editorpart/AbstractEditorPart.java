package net.ui.eclipse.editorpart;

import java.util.ArrayList;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.action.ShowTextContributionItem;
import net.ui.eclipse.action.ToolBarBuilder;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.HyperlinkSettings;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.part.EditorPart;

public abstract class AbstractEditorPart<K, T extends IDataModelEditorInput<K>>
		extends EditorPart implements IEditor {

	private static final Log logger = LogFactory
			.getLog(AbstractEditorPart.class);

	public static final int EDITOR_SAVED = 10000;

	private String pageName;

	private Image pageIcon;

	private boolean canSaveChange = true;

	private boolean dirty = false;

	private boolean autoReload = true;

	private boolean hasLoaded = false;

	private IActionHandler actionHandler;

	private ToolBarBuilder toolBarBuilder;

	protected FormToolkit toolkit;

	protected Form form;

	@SuppressWarnings("unchecked")
	public T getDataModelEditorInput() {
		return (T) getEditorInput();
	}

	public K getDataModel() {
		return getDataModelEditorInput().getDataModel();
	}

	abstract protected void saveDataModel(K aDataModel) throws Exception;

	abstract protected void reloadDataModel() throws Exception;

	abstract protected void doCreatePartControl(Composite parent);

	protected Shell getShell() {
		return getSite().getShell();
	}

	public AbstractEditorPart() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);

		FillLayout fillLayout = new FillLayout();

		composite.setLayout(fillLayout);

		toolkit = new FormToolkit(composite.getDisplay());

		toolkit.getHyperlinkGroup().setHyperlinkUnderlineMode(
				HyperlinkSettings.UNDERLINE_HOVER);

		form = toolkit.createForm(composite);

		updateFormTitle();

		form.setImage(getEditorInput().getImageDescriptor().createImage());

		form.addMessageHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				Object href = e.getHref();
				if (href instanceof IMessage[]) {

					String details = form.getMessageManager().createSummary(
							(IMessage[]) href);
					((Hyperlink) e.widget).setToolTipText(details);
				}
			}
		});

		toolkit.decorateFormHeading(form);

		ActionGroupBean[] actionGroupBeans = getActionGroupBeans();

		if (ArrayUtils.isNotEmpty(actionGroupBeans)) {
			toolBarBuilder = new ToolBarBuilder(form.getToolBarManager(),
					actionGroupBeans, getActionHandler(),
					getCustomActionControl());
			form.getToolBarManager().add(new ShowTextContributionItem(null));
		}

		form.getBody().setLayout(new FillLayout());

		doCreatePartControl(form.getBody());

		if (toolBarBuilder != null) {
			toolBarBuilder.updateActionStatus();
		}

	}

	protected ActionGroupBean[] getActionGroupBeans() {
		String[] actionGroupIds = getActionGroupIds();

		if (ArrayUtils.isNotEmpty(actionGroupIds)) {
			ActionGroupBean[] actionGroupBeans = new ActionGroupBean[actionGroupIds.length];

			for (int i = 0; i < actionGroupBeans.length; i++) {

				actionGroupBeans[i] = UIConfigFactory.getInstance()
						.getActionGroupConfig(actionGroupIds[i]);

				if (actionGroupBeans[i] == null) {
					continue;
				}

				ActionBean[] actionBeans = actionGroupBeans[i].getActionBeans();

				for (int j = 0; j < actionBeans.length; j++) {
					ActionBean actionBean = actionBeans[j];
					if (StringUtils.endsWith(actionBean.getIcon(), "_24")) {
						actionBean.setIcon(StringUtils.remove(
								actionBean.getIcon(), "_24"));
					}
				}
			}

			return actionGroupBeans;

		} else {
			return new ActionGroupBean[0];
		}
	}

	public Form getForm() {
		return form;
	}

	public void setErrorMessages(String[] details) {

		IMessageManager mmng = form.getMessageManager();

		for (int i = 0; i < details.length; i++) {
			mmng.addMessage("message" + i, details[i], null,
					IMessageProvider.ERROR);
		}
	}

	protected void removeAllMessage() {
		IMessageManager mmng = form.getMessageManager();
		mmng.removeAllMessages();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {

		final K dataModel = getDataModel();

		form.setBusy(true);

		Job job = new Job("保存数据...") {
			protected IStatus run(final IProgressMonitor monitor) {

				final List<Throwable> errors = new ArrayList<Throwable>();

				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						try {
							saveDataModel(dataModel);

						} catch (Exception e) {

							errors.add(e);

						}
					}
				});

				if (errors.isEmpty()) {
					return Status.OK_STATUS;
				} else {

					return new Status(IStatus.ERROR, getSite().getPluginId(),
							"保存异常", errors.get(0));
				}

			}

		};

		job.setUser(true);

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {

				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						form.setBusy(false);
						if (event.getResult().isOK()) {
							setDirty(false);
							firePropertyChange(EDITOR_SAVED);
							updateEditorInfo();
							updateActionStatus();
						} else {
							logger.error("保存异常", event.getResult()
									.getException());
							setErrorMessages(new String[] { "保存异常 ： "
									+ event.getResult().getException()
											.getLocalizedMessage() });
						}
					}
				});
			}
		});

		job.schedule();

	}

	@Override
	public void doSaveAs() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		this.setInput(input);
		this.setSite(site);
		this.updateEditorInfo();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
		try {
			if (this.isDirty() == false) {
				if (isAutoReload()
						|| (isAutoReload() == false && this.hasLoaded == false)) {
					reloadDataModel();
					this.hasLoaded = true;
				}
			}
		} catch (Exception e) {
			logger.error("reloadDataModel Error", e);
			MessageDialog.openError(
					this.getSite().getShell(),
					UIConfigFactory.getInstance().getLocalMessage(
							"message.error", LocalHelper.getLocale()),
					e.getLocalizedMessage());
		}
	}

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		if (this.isCanSaveChange()) {
			this.dirty = dirty;
			firePropertyChange(PROP_DIRTY);
		}
	}

	public boolean isAutoReload() {
		return autoReload;
	}

	public void setAutoReload(boolean autoReload) {
		this.autoReload = autoReload;
	}

	public boolean isCanSaveChange() {
		return canSaveChange;
	}

	public void setCanSaveChange(boolean canSaveChange) {
		this.canSaveChange = canSaveChange;
	}

	@Override
	public ICustomActionControl getCustomActionControl() {
		return null;
	}

	@Override
	public IActionHandler getActionHandler() {
		if (this.actionHandler == null) {
			this.actionHandler = createActionHandler();
		}
		return this.actionHandler;
	}

	@Override
	public void setToolBarBuilder(ToolBarBuilder toolBarBuilder) {
		this.toolBarBuilder = toolBarBuilder;
	}

	public ToolBarBuilder getToolBarBuilder() {
		return toolBarBuilder;
	}

	public void updateActionStatus() {
		if (this.toolBarBuilder != null && form.isDisposed() == false) {
			this.toolBarBuilder.reBuildActionItems(getActionGroupBeans(), true);
			form.getToolBarManager().add(new ShowTextContributionItem(null));
			this.toolBarBuilder.updateActionStatus();
		}
	}

	public void onClosed() {

	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public Image getPageIcon() {
		return pageIcon;
	}

	public void setPageIcon(Image pageIcon) {
		this.pageIcon = pageIcon;
	}

	public void updateEditorInfo() {
		IEditorInput input = getEditorInput();
		this.setPartName(input.getName());
		this.setTitleToolTip(input.getToolTipText());
		if (input.getImageDescriptor() != null) {
			this.setTitleImage(input.getImageDescriptor().createImage());
		}

		updateFormTitle();

	}

	protected void updateFormTitle() {
		if (form != null) {
			StringBuffer formTitle = new StringBuffer();

			if (StringUtils.isNotBlank(getEditorInput().getToolTipText())) {
				formTitle.append(getEditorInput().getToolTipText());
			} else {
				formTitle.append(getEditorInput().getName());
			}

			if (StringUtils.isNotBlank(getPageName())) {
				formTitle.append(" - ").append(getPageName());
			}

			form.setText(formTitle.toString());

			if (getPageIcon() != null) {
				form.setImage(getPageIcon());
			}
		}
	}

	@Override
	public void dispose() {
		if (this.form != null && this.form.isDisposed() == false) {
			this.form.dispose();
		}
		if (this.toolkit != null) {
			this.toolkit.dispose();
		}

		super.dispose();
	}

}
