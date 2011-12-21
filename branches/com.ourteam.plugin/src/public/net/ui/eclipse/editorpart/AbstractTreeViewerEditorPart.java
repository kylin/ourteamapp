package net.ui.eclipse.editorpart;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;


public abstract class AbstractTreeViewerEditorPart<K, T extends IDataModelEditorInput<K>>
		extends AbstractViewerEditorPart<K, T> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractTreeViewerEditorPart.class);

	private TreeViewComposite treeViewComposite;

	abstract protected String getTableConfigId();

	abstract protected String getTreeConfigId();

	abstract protected String getEditActionId();

	protected Object getTreeRootNodeUserObject() throws Exception {
		return null;
	}

	protected void initTreeSubNodeBuilder(String id,
			ISubNodeBuilder<?, ?> builder) {

	}

	public boolean allowMultiSelection() {
		return true;
	}

	@Override
	public boolean showCheckBox() {
		return false;
	}

	@Override
	public String[] getActionGroupIds() {

		if (this.getTreeViewComposite() != null) {

			String[] nodeActionGroupId = this.getTreeViewComposite()
					.getSelectedItemActionGroupIds();

			return (String[]) ArrayUtils.addAll(
					new String[] { "defaultTreeEditorActionGroup" },
					nodeActionGroupId);

		} else {
			return new String[] { "defaultTreeEditorActionGroup" };
		}

	}

	@Override
	public IActionHandler createActionHandler() {
		return new TreeEditorActionHandler();
	}

	@Override
	protected void doCreatePartControl(Composite parent) {

		parent.setLayout(new GridLayout());

		int style = SWT.NONE;

		if (allowMultiSelection()) {
			style = style | SWT.MULTI;
		}

		if (showCheckBox()) {
			style = style | SWT.CHECK;
		}

		treeViewComposite = new TreeViewComposite(parent,
				new AbstractTreeTableViewProvider(style) {

					@Override
					public TableBean getTableConfig() {
						if (StringUtils.isNotBlank(getTableConfigId())) {
							return UIConfigFactory.getInstance()
									.getTableConfig(getTableConfigId());
						} else {
							return super.getTableConfig();
						}
					}

					@Override
					public TreeBean getTreeConfig() {
						if (StringUtils.isNotBlank(getTreeConfigId())) {
							return UIConfigFactory.getInstance().getTreeConfig(
									getTreeConfigId());
						} else {
							return null;
						}
					}

					@Override
					public Object getRootNodeUserObject() {

						try {

							return getTreeRootNodeUserObject();

						} catch (Exception e) {
							logger.error(e);
							return null;
						}
					}

					public int getDefaultExpandToLevel() {
						return AbstractTreeViewerEditorPart.this
								.getDefaultExpandToLevel();
					}

					@Override
					public void initSubNodeBuilder(String id,
							ISubNodeBuilder builder) {
						initTreeSubNodeBuilder(id, builder);
					}

				});

		treeViewComposite.getTreeViewer().getTree().setLinesVisible(true);

		treeViewComposite.getTreeViewer().addSelectionChangedListener(
				new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						updateActionStatus();
						onSelectionChanged((IStructuredSelection) event
								.getSelection());
					}
				});

		treeViewComposite.getTreeViewer().addDoubleClickListener(this);

		treeViewComposite.setActionHandler(getActionHandler());

		treeViewComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

	}

	@Override
	public void doubleClick(DoubleClickEvent event) {
		try {
			String editActionId = getEditActionId();
			if (StringUtils.isNotBlank(editActionId)) {
				this.getActionHandler().fireAction(editActionId);
			}

		} catch (Exception e) {
			logger.error(e);
		}
	}

	protected int getDefaultExpandToLevel() {
		return 0;
	}

	public TreeViewComposite getTreeViewComposite() {
		return treeViewComposite;
	}

	@Override
	public Viewer getViewer() {
		return treeViewComposite.getTreeViewer();
	}

	public Object[] getSelectedUserObjects() {
		return this.treeViewComposite.getSlectedUserObjects();
	}

	public TreeNodeItem[] getSlectedTreeNodeItems() {
		return this.treeViewComposite.getSlectedTreeNodeItems();
	}

	public void refreshTree() {
		this.treeViewComposite.refreshTree();
	}

	public void refresh() {

		this.treeViewComposite.refresh();
	}

	public void refreshNode(TreeNodeItem treeNodeItem) {
		this.treeViewComposite.refresh(treeNodeItem);
	}

	public void refreshSelectedTreeNode() {
		TreeNodeItem[] treeNodeItems = treeViewComposite
				.getSlectedTreeNodeItems();
		if (ArrayUtils.isNotEmpty(treeNodeItems)) {
			for (int i = 0; i < treeNodeItems.length; i++) {
				TreeNodeItem treeNodeItem = treeNodeItems[i];
				treeViewComposite.refresh(treeNodeItem);
			}
		}

	}

	public void refreshSelectedParentTreeNode() {
		TreeNodeItem[] treeNodeItems = treeViewComposite
				.getSlectedTreeNodeItems();
		if (ArrayUtils.isNotEmpty(treeNodeItems)) {
			for (int i = 0; i < treeNodeItems.length; i++) {
				TreeNodeItem treeNodeItem = treeNodeItems[i];
				treeViewComposite.refresh(treeNodeItem.getParentNodeItem());
			}

		} else {
			treeViewComposite.refreshTree();
		}
	}

	public void update(TreeNodeItem treeNodeItem) {
		this.treeViewComposite.update(treeNodeItem);
	}

	public void update(TreeNodeItem[] treeNodeItems) {
		this.treeViewComposite.update(treeNodeItems);
	}

	public TreeNodeItem[] getCheckedTreeNodeItems() {
		List<TreeNodeItem> items = this.treeViewComposite
				.getCheckedTreeNodeItems();
		return items.toArray(new TreeNodeItem[items.size()]);
	}

	public void setSelection(Object userObj) {
		this.treeViewComposite.setSelection(userObj);
	}

	public void clearCheckedItems() {
		this.treeViewComposite.clearCheckedItems();
	}

	public class TreeEditorActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return true;
		}

		public void refresh(ActionEvent actionEvent) throws Exception {
			refreshTree();
			reloadDataModel();
		}
	}

}
