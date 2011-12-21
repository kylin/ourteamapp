package com.ourteam.app.middleware;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.ui.part.ViewPart;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.middleware.editor.AddMiddleWareWizardProvider;
import com.ourteam.app.middleware.editor.DatabaseEditorProvider;
import com.ourteam.app.middleware.ui.DatabaseTreeViewProvider;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class DatabaseViewPart extends AbstractTreeViewPart {

	public static final String VIEW_ID = "com.ourteam.app.modelbase.DatabaseViewPart";

	private static List<IEditorProvider<TreeNodeItem>> editorProviderList = new ArrayList<IEditorProvider<TreeNodeItem>>();

	static {
		editorProviderList.add(new DatabaseEditorProvider());
	}

	public DatabaseViewPart() {

	}

	@Override
	protected ITreeViewProvider getTreeViewProvider() {

		return new DatabaseTreeViewProvider();

	}

	@Override
	protected List<IEditorProvider<TreeNodeItem>> getEditorProviderList(TreeNodeItem item) {
		return editorProviderList;
	}

	@Override
	protected String[] getMenuActionGrous() {
		return null;
	}

	@Override
	protected String[] getToolbarActionGrous() {
		return (String[]) ArrayUtils.add(super.getToolbarActionGrous(),
				"databaseServerTypeActionGroup");
	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new DatabaseExplorerActionHandler(this);
	}

	class DatabaseExplorerActionHandler extends TreeViewActionHandler {

		public DatabaseExplorerActionHandler(AbstractTreeViewPart treeViewPart) {
			super(treeViewPart);
		}

		public void addNewDataBaseServer(ActionEvent actionEvent)
				throws Exception {

			if (SWTUtils.openWizardDialog(getSite().getShell(),
					new AddMiddleWareWizardProvider(
							MiddleWareTypeEnum.DATABASE_SERVER,0))) {
				getTreeComposite().refreshTree();
			}
		}

		public void deleteDataBaseServer(ActionEvent actionEvent)
				throws Exception {
			MiddleWareBean middleWareBean = (MiddleWareBean) getSelectedUserObject();

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.deleteMiddleWare(new long[] { middleWareBean.getId() });
		}
	}

}
