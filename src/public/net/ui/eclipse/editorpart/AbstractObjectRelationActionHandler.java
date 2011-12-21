package net.ui.eclipse.editorpart;

import java.util.List;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

import org.eclipse.swt.widgets.Shell;

public abstract class AbstractObjectRelationActionHandler<M> extends
		AbstractRoleBasedDispatchActionHandler {

	abstract protected List<M> getSelectedItems();

	abstract protected void reLoadDataList() throws Exception;

	abstract protected Shell getShell();

	@Override
	public boolean isActionEnable(ActionBean aAction) {
		boolean flag = super.isActionEnable(aAction);
		if (("removeRelation").equals(aAction.getId())
				|| "editRelation".equals(aAction.getId())) {
			if (getSelectedItems().isEmpty()) {
				return false;
			} else {
				return true && flag;
			}
		}
		return flag;
	}

	public void refresh(ActionEvent actionEvent) throws Exception {
		reLoadDataList();
	}

	public void removeRelation(ActionEvent actionEvent) throws Exception {

		List<M> itemList = getSelectedItems();

		doRemoveRelations(itemList);

		reLoadDataList();
	}

	abstract protected void doRemoveRelations(List<M> items) throws Exception;

	public void addRelation(ActionEvent actionEvent) throws Exception {

		IDialogProvider dialogProvider = getAddRelationDialogProvider(actionEvent
				.getActionBean());

		if (dialogProvider == null) {
			IWizardProvider wizardProvider = getAddRelationWizardProvider(actionEvent
					.getActionBean());

			if (SWTUtils.openWizardDialog(getShell(), wizardProvider)) {
				reLoadDataList();
			}
		} else {
			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				reLoadDataList();
			}
		}

	}

	abstract protected IWizardProvider getAddRelationWizardProvider(
			ActionBean actionBean) throws Exception;

	protected IDialogProvider getAddRelationDialogProvider(ActionBean actionBean)
			throws Exception {
		return null;
	}

	abstract protected IDialogProvider getEditDialogProvider(List<M> item)
			throws Exception;

	public void editRelation(ActionEvent actionEvent) throws Exception {
		List<M> itemList = getSelectedItems();

		if (itemList.isEmpty() == false) {
			doEditRelation(itemList);
		}
	}

	protected void doEditRelation(List<M> items) throws Exception {

		IDialogProvider dialogProvider = getEditDialogProvider(items);

		if (dialogProvider != null) {
			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				reLoadDataList();
			}
		}

	}

}
