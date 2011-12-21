package com.ourteam.app.workspace.editor;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractTableViewerEditorPart;
import net.ui.model.action.ActionBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;

abstract public class AbstractUIItemListConfigEditorPart<UIItemBean>
		extends
		AbstractTableViewerEditorPart<WorkspaceResourceFileObject, FileResourceEditorInput, UIItemBean> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractUIItemListConfigEditorPart.class);

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "uiSelectListConfigEditorActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHndler();
	}

	protected void onDoubleClick(IStructuredSelection selection) {
		try {
			this.getActionHandler().fireAction("edit");
		} catch (Exception e) {
			MessageDialog.openError(this.getSite().getShell(),
					"Do Edit Action Error", e.getLocalizedMessage());

			logger.error("Do Edit Action Error", e);
		}
	}
	
	abstract protected boolean editUIItem(UIItemBean uiItemBean) throws Exception;
	
	abstract protected UIItemBean addUIItem() throws Exception;

	class ActionHndler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("remove".equals(aAction.getId())
					|| "edit".equals(aAction.getId())) {
				return getSelectedItems().isEmpty() == false;
			} else {
				return true;
			}
		}

		public void edit(ActionEvent actionEvent) throws Exception {

			UIItemBean tableBean = getSelectedItems().get(0);
			
			if (editUIItem(tableBean)) {

				getTableComposite().refresh();

				getTableComposite().setSelection(tableBean);

				setDirty(true);
			}

		}

		public void add(ActionEvent actionEvent) throws Exception {

			UIItemBean uiItemBean = addUIItem();

			if (uiItemBean != null) {

				getTableComposite().addRow(uiItemBean);

				getTableComposite().setSelection(uiItemBean);

				setDirty(true);
			}

		}

		public void remove(ActionEvent actionEvent) throws Exception {
			getTableComposite().removeSelectedRows();
			setDirty(true);
		}
	}

}
