package net.ui.eclipse.viewpart;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.common.AbstractContentViewerComposite;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.action.ActionBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractTreeViewPart extends
		AbstractStructuredViewPart<TreeNodeItem> {
	/**
	 * Logger for this class
	 */
	static final Log logger = LogFactory.getLog(AbstractTreeViewPart.class);

	private TreeViewComposite treeComposite;

	public AbstractTreeViewPart() {
		super();

	}

	protected TreeViewComposite createTreeComposite(Composite parent) {

		ITreeViewProvider treeViewProvider = getTreeViewProvider();

		if (treeViewProvider == null) {
			logger.warn("ITreeViewProvider is Null!");
			return null;
		}

		TreeViewComposite treeViewComposite = new TreeViewComposite(parent,
				treeViewProvider);

		treeViewComposite.getTreeViewer().refresh(true);

		return treeViewComposite;
	}

	abstract protected ITreeViewProvider getTreeViewProvider();

	@Override
	protected AbstractContentViewerComposite createContentViewerComposite(
			Composite parent) {

		treeComposite = createTreeComposite(parent);

		return treeComposite;
	}

	@Override
	protected void addSelectionlistener(SelectionListener listener) {

		treeComposite.getTreeViewer().getTree().addSelectionListener(listener);

	}

	public Object getSelectedUserObject() {

		Object[] selectedObjects = treeComposite.getSlectedUserObjects();

		if (ArrayUtils.isNotEmpty(selectedObjects)) {

			return selectedObjects[0];
		} else {
			return null;
		}
	}

	public IEditorProvider<TreeNodeItem> getEditorProvider(TreeNodeItem item) {

		IEditorProvider<TreeNodeItem> editorProvider = null;

		List<IEditorProvider<TreeNodeItem>> editorProviders = getEditorProviderList(item);

		if (editorProviders == null) {
			return null;
		}

		for (Iterator<IEditorProvider<TreeNodeItem>> iterator = editorProviders
				.iterator(); iterator.hasNext();) {
			IEditorProvider<TreeNodeItem> tempEditorProvider = iterator.next();

			if (tempEditorProvider.isMatched(item)) {
				editorProvider = tempEditorProvider;
				break;
			}

		}

		return editorProvider;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected TreeNodeItem findTreeItemByDataModel(TreeItem[] treeItems,
			IDataModelEditorInput editorInput) {

		if (ArrayUtils.isEmpty(treeItems)) {
			return null;
		}

		TreeNodeItem findedTreeItem = null;

		for (int i = 0; i < treeItems.length; i++) {
			TreeNodeItem treeItem = (TreeNodeItem) treeItems[i].getData();

			if (treeItem == null) {
				continue;
			}

			Object userObject = treeItem.getUserObject();

			if (userObject != null
					&& userObject.getClass().equals(
							editorInput.getDataModel().getClass())
					&& editorInput.isDataModelEquals(userObject)) {
				findedTreeItem = treeItem;

				findedTreeItem.setUserObject(editorInput.getDataModel());

				break;
			} else {
				findedTreeItem = findTreeItemByDataModel(
						treeItems[i].getItems(), editorInput);

				if (findedTreeItem != null) {
					break;
				}
			}
		}

		return findedTreeItem;
	}

	@Override
	protected ImageDescriptor getEditorImage(TreeNodeItem treeNodeItem) {
		if (treeNodeItem.getImage() != null) {

			return ImageDescriptor.createFromImage(treeNodeItem.getImage());

		} else {
			return null;
		}
	}

	@Override
	protected void update(
			AbstractContentViewerComposite contentViewerComposite,
			IDataModelEditorInput<?> editorInput) {

		TreeNodeItem treeItem = findTreeItemByDataModel(getTreeComposite()
				.getTreeViewer().getTree().getItems(), editorInput);

		getTreeComposite().update(treeItem);

	}

	public void refreshTreeNode(TreeNodeItem treeItem) {
		treeComposite.refresh(treeItem);
	}

	public void refreshSelectedTreeNode() {
		TreeNodeItem[] treeNodeItems = treeComposite.getSlectedTreeNodeItems();
		if (ArrayUtils.isNotEmpty(treeNodeItems)) {
			for (int i = 0; i < treeNodeItems.length; i++) {
				TreeNodeItem treeNodeItem = treeNodeItems[i];
				treeComposite.refresh(treeNodeItem);
			}
		}
	}

	public void refreshSelectedParentTreeNode() {
		TreeNodeItem[] treeNodeItems = treeComposite.getSlectedTreeNodeItems();
		if (ArrayUtils.isNotEmpty(treeNodeItems)) {
			for (int i = 0; i < treeNodeItems.length; i++) {
				TreeNodeItem treeNodeItem = treeNodeItems[i];
				treeComposite.refresh(treeNodeItem.getParentNodeItem());
			}
		} else {
			treeComposite.refreshTree();
		}
	}

	public void refreshTree() {
		treeComposite.refreshTree();
	}

	public TreeViewComposite getTreeComposite() {
		return treeComposite;
	}

	@Override
	protected String[] getToolbarActionGrous() {
		return new String[] { "defaultTreeViewActionGroup" };
	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new TreeViewActionHandler(this);
	}

	static public class TreeViewActionHandler extends
			AbstractDispatchActionHandler {

		private AbstractTreeViewPart treeViewPart;

		public TreeViewActionHandler(AbstractTreeViewPart treeViewPart) {
			super();
			this.treeViewPart = treeViewPart;
		}

		public AbstractTreeViewPart getTreeViewPart() {
			return treeViewPart;
		}

		public void refresh(ActionEvent actionEvent) throws Exception {
			getTreeViewPart().refreshTree();
		}

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return true;
		}
	}
}
