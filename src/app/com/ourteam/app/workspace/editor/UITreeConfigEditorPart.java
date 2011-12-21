package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractTreeViewerEditorPart;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.AbstractTableListDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.tree.NodeBean;
import net.ui.model.tree.SubNodeBuilderBean;
import net.ui.model.tree.TreeBean;
import net.ui.model.tree.TreeConfigAgent;
import net.ui.model.tree.TreeNodeBean;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;

import com.ourteam.app.utils.UIConfigUtils;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;

public class UITreeConfigEditorPart
		extends
		AbstractTreeViewerEditorPart<WorkspaceResourceFileObject, FileResourceEditorInput> {

	private TreeBean treeBean;

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "uiTreeConfigEditorActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHndler();
	}

	@Override
	protected String getTreeConfigId() {
		return "ui/work/ui_tree_root.tree";
	}

	@Override
	protected String getEditActionId() {
		return "edit";
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUITreeConfig(treeBean, outputWriter);

		FileUtils.writeStringToFile(aDataModel.getResourceFile(),
				outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

	@Override
	protected void reloadDataModel() throws Exception {

	}

	@Override
	protected String getTableConfigId() {
		return "uiTreeNodeListTable";
	}

	@Override
	public boolean showCheckBox() {
		return true;
	}

	protected int getDefaultExpandToLevel() {
		return 2;
	}

	@Override
	protected Object getTreeRootNodeUserObject() throws Exception {
		File file = getDataModel().getResourceFile();

		treeBean = TreeConfigAgent.getTreeConfig(FileUtils
				.openInputStream(file));

		return treeBean;

	}

	class ActionHndler extends TreeEditorActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("remove".equalsIgnoreCase(aAction.getId())) {
				return ArrayUtils.isEmpty(getCheckedTreeNodeItems()) == false;
			} else if ("edit".equalsIgnoreCase(aAction.getId())) {
				return ArrayUtils.isEmpty(getSlectedTreeNodeItems()) == false
						&& (getSelectedUserObjects()[0] instanceof NodeBean || getSelectedUserObjects()[0] instanceof SubNodeBuilderBean);
			} else if ("moveUp".equalsIgnoreCase(aAction.getId())) {
				TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

				return treeNodeItem.getParentNodeItem().getChildTreeNodeItems()
						.indexOf(treeNodeItem) > 0;

			} else if ("moveDown".equalsIgnoreCase(aAction.getId())) {
				TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

				return treeNodeItem.getParentNodeItem().getChildTreeNodeItems()
						.indexOf(treeNodeItem) < treeNodeItem
						.getParentNodeItem().getChildTreeNodeItems().size() - 1;
			} else if ("addRootNode".equalsIgnoreCase(aAction.getId())) {
				TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];
				return treeNodeItem.getUserObject() instanceof TreeBean ? treeNodeItem
						.getChildTreeNodeItems().isEmpty() : true;
			} else {
				return true;
			}

		}

		public void remove(ActionEvent actionEvent) throws Exception {
			TreeNodeItem[] treeNodeItems = getCheckedTreeNodeItems();

			for (int i = 0; i < treeNodeItems.length; i++) {
				TreeNodeItem treeNodeItem = treeNodeItems[i];
				if (treeNodeItem.getUserObject() instanceof NodeBean) {
					treeBean.removeNodeDefine((NodeBean) treeNodeItem
							.getUserObject());
				} else if (treeNodeItem.getUserObject() instanceof SubNodeBuilderBean) {

					((NodeBean) treeNodeItem.getParentNodeItem()
							.getUserObject())
							.removeSubNodeBuilder((SubNodeBuilderBean) treeNodeItem
									.getUserObject());

				} else if (treeNodeItem.getUserObject() instanceof TreeNodeBean) {

					TreeNodeBean rootNode = (TreeNodeBean) treeNodeItem
							.getUserObject();

					if (treeBean.getRootNodeList().indexOf(rootNode) != -1) {
						treeBean.removeRootNode(rootNode);
					} else {
						((TreeNodeBean) treeNodeItem.getParentNodeItem()
								.getUserObject()).removeSubNode(rootNode);
					}

				}
			}

			refreshTree();

			clearCheckedItems();

			setDirty(true);

		}

		public void editImagePath(ActionEvent actionEvent) throws Exception {

			final InputDialog dlg = new InputDialog(getSite().getShell(),
					"编辑图标基本目录", "输入图标基本目录", treeBean.getImageBase(), null);
			if (dlg.open() == Window.OK) {
				treeBean.setImageBase(dlg.getValue());
				setDirty(true);
			}
		}

		public void edit(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			if (treeNodeItem.getUserObject() instanceof NodeBean) {
				UITreeNodeConfigDialogProvider dialogProvider = new UITreeNodeConfigDialogProvider(
						(NodeBean) treeNodeItem.getUserObject());

				if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
					update(treeNodeItem);
					setDirty(true);
				}
			} else if (treeNodeItem.getUserObject() instanceof SubNodeBuilderBean) {
				UITreeNodeBuilderConfigDialogProvider dialogProvider = new UITreeNodeBuilderConfigDialogProvider(
						(SubNodeBuilderBean) treeNodeItem.getUserObject());

				if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
					update(treeNodeItem);
					setDirty(true);
				}
			}

		}

		public void addSubNodeBuilder(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			SubNodeBuilderBean subNodeBuilderBean = new SubNodeBuilderBean();

			subNodeBuilderBean.setId("subNodeBuilder");

			UITreeNodeBuilderConfigDialogProvider dialogProvider = new UITreeNodeBuilderConfigDialogProvider(
					subNodeBuilderBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

				((NodeBean) treeNodeItem.getUserObject())
						.addSubNodeBuilder(subNodeBuilderBean);

				refreshNode(treeNodeItem);
				setDirty(true);
			}
		}

		public void addNodeDefine(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			NodeBean nodeBean = new NodeBean();

			nodeBean.setId("treeNode");

			UITreeNodeConfigDialogProvider dialogProvider = new UITreeNodeConfigDialogProvider(
					nodeBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
				treeBean.addNodeDefine(nodeBean);
				refreshNode(treeNodeItem);
				setDirty(true);
			}
		}

		public void addRootNode(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			final Object object = treeNodeItem.getUserObject();

			AbstractTableListDialogProvider<NodeBean> dialogProvider = new AbstractTableListDialogProvider<NodeBean>() {

				@Override
				public String getTitle() {
					return "选择根节点";
				}

				@Override
				protected String getTableConfigId() {
					return "uiTreeNodeListTable";
				}

				@Override
				protected List<NodeBean> getDataList() {
					return treeBean.getNodeIdIndex();
				}

				@Override
				protected boolean isShowCheckBox() {
					return object instanceof TreeNodeBean;
				}

			};

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
				List<NodeBean> selectedNodeBeans = dialogProvider
						.getSelectedDataList();

				if (object instanceof TreeBean) {
					treeBean.getRootNodeList().clear();
					for (Iterator<NodeBean> iterator = selectedNodeBeans
							.iterator(); iterator.hasNext();) {
						NodeBean nodeBean = iterator.next();
						TreeNodeBean rootNodeBean = new TreeNodeBean();
						rootNodeBean.setId(nodeBean.getId());
						treeBean.addRootNode(rootNodeBean);
					}

				} else if (object instanceof TreeNodeBean) {
					TreeNodeBean parentTreeNodeBean = (TreeNodeBean) object;
					for (Iterator<NodeBean> iterator = selectedNodeBeans
							.iterator(); iterator.hasNext();) {
						NodeBean nodeBean = iterator.next();
						TreeNodeBean rootNodeBean = new TreeNodeBean();
						rootNodeBean.setId(nodeBean.getId());
						parentTreeNodeBean.addSubNode(rootNodeBean);
					}
				}

				refreshNode(treeNodeItem);

				setDirty(true);
			}

		}

		public void moveUpNodeBuilder(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			List<SubNodeBuilderBean> nodeBuilderBeans = ((NodeBean) treeNodeItem
					.getParentNodeItem().getUserObject())
					.getSubNodBuilderList();

			int index = nodeBuilderBeans.indexOf(treeNodeItem.getUserObject());

			Collections.swap(nodeBuilderBeans, index, index - 1);

			refreshNode(treeNodeItem.getParentNodeItem());

			setSelection(treeNodeItem.getUserObject());

			setDirty(true);
		}

		public void moveDownNodeBuilder(ActionEvent actionEvent)
				throws Exception {
			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			List<SubNodeBuilderBean> nodeBuilderBeans = ((NodeBean) treeNodeItem
					.getParentNodeItem().getUserObject())
					.getSubNodBuilderList();

			int index = nodeBuilderBeans.indexOf(treeNodeItem.getUserObject());

			Collections.swap(nodeBuilderBeans, index, index + 1);

			refreshNode(treeNodeItem.getParentNodeItem());

			setSelection(treeNodeItem.getUserObject());

			setDirty(true);
		}

		public void moveDown(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			List<TreeNodeBean> treeNodeBeans = null;

			if (treeNodeItem.getParentNodeItem().getUserObject() instanceof TreeBean) {
				treeNodeBeans = treeBean.getRootNodeList();
			} else {
				treeNodeBeans = ((TreeNodeBean) treeNodeItem
						.getParentNodeItem().getUserObject()).getSubNodeList();
			}

			int index = treeNodeBeans.indexOf(treeNodeItem.getUserObject());

			Collections.swap(treeNodeBeans, index, index + 1);

			refreshTree();

			setSelection(treeNodeItem.getUserObject());

			setDirty(true);
		}

		public void moveUp(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			List<TreeNodeBean> treeNodeBeans = null;

			if (treeNodeItem.getParentNodeItem().getUserObject() instanceof TreeBean) {
				treeNodeBeans = treeBean.getRootNodeList();
			} else {
				treeNodeBeans = ((TreeNodeBean) treeNodeItem
						.getParentNodeItem().getUserObject()).getSubNodeList();
			}

			int index = treeNodeBeans.indexOf(treeNodeItem.getUserObject());

			Collections.swap(treeNodeBeans, index, index - 1);

			refreshTree();

			setSelection(treeNodeItem.getUserObject());

			setDirty(true);
		}

	}

}
