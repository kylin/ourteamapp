package net.ui.eclipse.editorpart;

import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.model.action.ActionBean;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormStatus;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

abstract public class AbstractFormEditorPart<K, T extends IDataModelEditorInput<K>>
		extends AbstractEditorPart<K, T> {

	private GridFormComposite<K> formComposite;

	private ModifyListener modifyListener;

	abstract protected String getFormId();

	public void doSave(IProgressMonitor monitor) {

		try {

			removeAllMessage();

			formComposite.validate();
			formComposite.getFormDataModel();
			super.doSave(monitor);

		} catch (Exception ex) {
			String[] errors = StringUtils.split(ex.getLocalizedMessage(),
					SystemUtils.LINE_SEPARATOR);
			setErrorMessages(errors);
		}
	}

	protected void doInitFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doCreatePartControl(Composite parent) {

		FillLayout fillLayout = new FillLayout();

		parent.setLayout(fillLayout);

		FormBean formBean = UIConfigFactory.getInstance().getFormConfig(
				getFormId());

		formComposite = new GridFormComposite<K>(parent, formBean) {

			@Override
			protected void initFormOptionListDataProviders(
					Map listDataProiverMap) {
				super.initFormOptionListDataProviders(listDataProiverMap);
				doInitFormOptionListDataProviders(listDataProiverMap);
			}

		};

		modifyListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				setDirty(true);
				updateActionStatus();
			}

		};

		formComposite.addModifyListener(modifyListener);

		formComposite.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setDirty(true);
				updateActionStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				setDirty(true);
				updateActionStatus();
			}
		});

	}

	@Override
	public void dispose() {
		this.formComposite.dispose();
		super.dispose();
	}

	@Override
	protected void reloadDataModel() throws Exception {
		if (this.isDirty() == false) {
			formComposite.setModifyListenerEnable(false);
			formComposite.setFormDataModel(getDataModel());
			formComposite.setModifyListenerEnable(true);
			if (getEditorInput().exists()) {
				formComposite.setFormStatus(FormStatus.MODIFY_STATUS);
			} else {
				formComposite.setFormStatus(FormStatus.NEW_STATUS);
			}
		}
	}

	@Override
	public void setCanSaveChange(boolean canSaveChange) {
		super.setCanSaveChange(canSaveChange);
		formComposite.setEnabled(canSaveChange);
	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "formEditorActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new DefaultFormEditorActionHandler();
	}

	protected class DefaultFormEditorActionHandler extends
			AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("save".equals(aAction.getId())) {
				return isDirty();
			} else {
				return true;
			}

		}

		public void save(ActionEvent actionEvent) throws Exception {
			getSite().getPage().saveEditor(AbstractFormEditorPart.this, false);
		}

	}

}
