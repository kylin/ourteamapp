package net.ui.eclipse.widget;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.ICompositeInitHelper;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.tree.TreeBean;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;


public abstract class AbstractTreeNodePropertyConfigComposite<T extends ICompositeInitHelper>
		extends AbstractComposite<T> {

	private TreeViewComposite treeViewComposite;

	private IActionHandler actionHandler;

	public AbstractTreeNodePropertyConfigComposite(Composite parent, int style,
			T initHelper) {
		super(parent, style, initHelper);
	}

	public AbstractTreeNodePropertyConfigComposite(Composite parent, int style) {
		super(parent, style);
	}

	abstract protected IActionHandler createActionHandler();

	abstract protected String getTreeConfigId();

	abstract protected Object getTreeRootNodeUserObject();

	abstract public void applyChange() throws Exception;

	public String getTreeDefaultNodeDefineId() {
		return null;
	}

	abstract protected void createConfigContent(Composite parent);

	@Override
	protected void createContent(Composite parent) {

		this.setLayout(new GridLayout());

		actionHandler = createActionHandler();

		SashForm sashForm = new SashForm(this, SWT.HORIZONTAL);

		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite leftComposite = new Composite(sashForm, SWT.NONE);

		leftComposite.setLayout(new FillLayout());

		treeViewComposite = new TreeViewComposite(leftComposite,
				new AbstractTreeTableViewProvider() {

					@Override
					public TreeBean getTreeConfig() {
						return UIConfigFactory.getInstance().getTreeConfig(
								getTreeConfigId());
					}

					@Override
					public Object getRootNodeUserObject() {
						return getTreeRootNodeUserObject();
					}

					@Override
					public String getDefaultNodeDefineId() {
						return getTreeDefaultNodeDefineId();
					}

					@Override
					public int getDefaultExpandToLevel() {
						return TreeViewer.ALL_LEVELS;
					}

				});

		treeViewComposite.setActionHandler(actionHandler);

		treeViewComposite.getTreeViewer().addSelectionChangedListener(
				new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						treeNodeSelectionChanged(event.getSelection().isEmpty() ? null
								: treeViewComposite.getSlectedTreeNodeItems()[0]);
					}
				});

		Composite rightComposite = new Composite(sashForm, SWT.NONE);

		rightComposite.setLayout(new FillLayout());

		createConfigContent(rightComposite);

		sashForm.setWeights(getWeights());

	}

	protected int[] getWeights() {
		return new int[] { 30, 70 };
	}

	protected void treeNodeSelectionChanged(TreeNodeItem treeNodeItem) {

	}

	public TreeViewComposite getTreeViewComposite() {
		return treeViewComposite;
	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

}
