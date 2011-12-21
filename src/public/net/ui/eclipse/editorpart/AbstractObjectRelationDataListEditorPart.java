package net.ui.eclipse.editorpart;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ActionEvent;
import net.ui.model.action.ActionBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

abstract public class AbstractObjectRelationDataListEditorPart<K, T extends IDataModelEditorInput<K>, M>
		extends AbstractTableViewerEditorPart<K, T, M> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractObjectRelationDataListEditorPart.class);

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "defaultRelationActionGroup" };
	}

	@Override
	protected void onSelectionChanged(IStructuredSelection selection) {
		super.onSelectionChanged(selection);
	}

	@Override
	protected void onDoubleClick(IStructuredSelection selection) {
		if (selection.isEmpty() == false) {
			
			ActionBean editActionBean = UIConfigFactory.getInstance().getActionBean("editRelation");
			
			if (getActionHandler().isActionEnable(editActionBean)) {
				try {

					
					ActionEvent actionEvent = new ActionEvent();

					actionEvent.setActionBean(editActionBean);

					this.getActionHandler()
							.doAction(actionEvent);
				} catch (Exception ex) {
					MessageDialog.openError(this.getSite().getShell(),
							"Do Edit Action Error", ex.getLocalizedMessage());

					logger.error("Do Edit Action Error", ex);
				}
			}
		}
	}

	abstract public class ObjectRelationActionHandler extends
			AbstractObjectRelationActionHandler<M> {

		@Override
		protected List<M> getSelectedItems() {
			return AbstractObjectRelationDataListEditorPart.this
					.getSelectedItems();
		}

		@Override
		protected void reLoadDataList() throws Exception {
			AbstractObjectRelationDataListEditorPart.this.loadDataList();

		}

		@Override
		protected Shell getShell() {
			return getSite().getShell();
		}

	}

}
