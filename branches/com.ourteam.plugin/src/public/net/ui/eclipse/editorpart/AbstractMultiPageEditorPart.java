package net.ui.eclipse.editorpart;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.ImageChache;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.action.ToolBarBuilder;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.reflect.ConstructorUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;

public abstract class AbstractMultiPageEditorPart extends MultiPageEditorPart
		implements IEditor {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractMultiPageEditorPart.class);

	protected abstract TabbedPaneConfig getTabbedPaneConfig();

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		updateEditorInfo();

	}

	protected IEditorInput getEditorPageInput(TabConfig tabConfig,
			IEditorInput editorInput) {
		return editorInput;
	}

	public IEditorPart getEditorByType(Class pageClass) {
		TabbedPaneConfig tabbedPaneConfig = getTabbedPaneConfig();

		int index = 0;

		List<TabConfig> tabList = tabbedPaneConfig.getTabPageList();

		for (Iterator<TabConfig> iterator = tabList.iterator(); iterator
				.hasNext();) {
			TabConfig tabConfig = iterator.next();

			String editorClass = tabConfig.getCompentclass();

			if (pageClass.getName().equals(editorClass)) {
				return getEditor(index);
			}

			index++;
		}

		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected void createPages() {
		TabbedPaneConfig tabbedPaneConfig = getTabbedPaneConfig();

		int index;

		List tabList = tabbedPaneConfig.getTabPageList();

		try {

			for (Iterator iterator = tabList.iterator(); iterator.hasNext();) {
				TabConfig tabConfig = (TabConfig) iterator.next();

				String editorClass = tabConfig.getCompentclass();

				IEditorPart editorPart = (IEditorPart) ConstructorUtils
						.invokeConstructor(Class.forName(editorClass),
								new Object[0]);

				IEditorInput editorInput = getEditorPageInput(tabConfig,
						getEditorInput());

				if (editorPart instanceof IEditor) {
					((IEditor) editorPart).setPageName(tabConfig.getLabel());
				}

				index = addPage(editorPart, editorInput);

				setPageText(index, tabConfig.getLabel());

				if (StringUtils.isNotBlank(tabConfig.getIcon())) {

					setPageImage(index,
							ImageChache.getImage(tabConfig.getIcon()));

					if (editorPart instanceof IEditor) {
						((IEditor) editorPart).setPageIcon(ImageChache
								.getImage(tabConfig.getIcon()));
					}
				}
			}

		} catch (Exception ex) {
			IStatus status = new Status(IStatus.ERROR,
					"com.ourteam.app.modelbase", 10, "createPages error", ex);
			ErrorDialog.openError(this.getSite().getShell(),
					"createPages error", ex.getLocalizedMessage(), status);

			logger.error("createPages error", ex);
		}

	}

	@Override
	public void doSave(IProgressMonitor monitor) {

		int count = this.getPageCount();

		IEditorPart editorPart;

		for (int i = 0; i < count; i++) {
			editorPart = this.getEditor(i);
			if (editorPart.isDirty()) {
				editorPart.doSave(monitor);
			}
		}

		updateEditorInfo();

	}

	@Override
	public void onClosed() {
		int count = this.getPageCount();

		IEditorPart editorPart;

		for (int i = 0; i < count; i++) {
			editorPart = this.getEditor(i);
			if (editorPart instanceof IEditor) {
				((IEditor) editorPart).onClosed();
			}
		}
	}

	@Override
	public void doSaveAs() {

	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
		this.getSite().getPage().activate(this);
		super.setFocus();
		updateEditorInfo();
	}

	@Override
	public void setCanSaveChange(boolean canSaveChange) {
		int pageCount = this.getPageCount();

		for (int i = 0; i < pageCount; i++) {
			IEditorPart editorPart = this.getEditor(i);

			if (editorPart instanceof IEditor) {
				((IEditor) editorPart).setCanSaveChange(canSaveChange);
			}

		}

	}

	@Override
	public String[] getActionGroupIds() {
		return ((IEditor) getActiveEditor()).getActionGroupIds();
	}

	@Override
	public IActionHandler createActionHandler() {
		return null;
	}

	@Override
	public IActionHandler getActionHandler() {
		return ((IEditor) getActiveEditor()).getActionHandler();
	}

	@Override
	public ICustomActionControl getCustomActionControl() {
		return ((IEditor) getActiveEditor()).getCustomActionControl();
	}

	@Override
	public void setToolBarBuilder(ToolBarBuilder toolBarBuilder) {
		((IEditor) getActiveEditor()).setToolBarBuilder(toolBarBuilder);
	}

	public ToolBarBuilder getToolBarBuilder() {
		return ((IEditor) getActiveEditor()).getToolBarBuilder();
	}

	public void updateEditorInfo() {
		IEditorInput input = getEditorInput();
		this.setPartName(input.getName());
		this.setTitleToolTip(input.getToolTipText());
		if (input.getImageDescriptor() != null) {
			this.setTitleImage(input.getImageDescriptor().createImage());
		}
	}

	@Override
	protected void pageChange(int newPageIndex) {
		getEditorSite().getActionBars().getStatusLineManager()
				.setMessage(null, "");
		super.pageChange(newPageIndex);
		this.setTitleToolTip(getEditorInput().getToolTipText() + "  "
				+ getPageText(newPageIndex));
	}

	@Override
	public void setPageName(String pageName) {

	}

	@Override
	public void setPageIcon(Image pageIcon) {

	}

}
