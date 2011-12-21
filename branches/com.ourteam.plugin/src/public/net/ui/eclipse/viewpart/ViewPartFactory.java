package net.ui.eclipse.viewpart;

import java.util.List;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ViewPartFactory {

	public static AbstractViewPart createViewPart(
			final IViewPartProvider viewPartProvider) throws Exception {

		AbstractViewPart viewPart = null;

		if (viewPartProvider instanceof ITreeViewPartProvider) {
			viewPart = createTreeViewPartInternal(viewPartProvider);
		} else {

			viewPart = createViewPartInternal(viewPartProvider);
		}

		configViewPart(viewPart, viewPartProvider);

		return viewPart;
	}

	private static AbstractViewPart createViewPartInternal(
			final IViewPartProvider viewPartProvider) {
		AbstractViewPart viewPart = new AbstractViewPart() {

			private Composite contentComposite;

			@Override
			public void setFocus() {
				if (contentComposite != null
						&& contentComposite.isDisposed() == false) {
					contentComposite.setFocus();
				}
			}

			@Override
			protected String[] getToolbarActionGrous() {
				return viewPartProvider.getToolbarActionGrous();
			}

			@Override
			protected String[] getMenuActionGrous() {
				return viewPartProvider.getMenuActionGrous();
			}

			@Override
			protected IActionHandler getActionHandler(ViewPart viewPart) {
				return viewPartProvider.getActionHandler(this);
			}

			@Override
			protected void doCreatePartControl(Composite parent) {
				contentComposite = viewPartProvider.createPartControl(parent);

			}

		};

		return viewPart;
	}

	private static void configViewPart(AbstractViewPart viewPart,
			IViewPartProvider viewPartProvider) {
		viewPart.setPartName(viewPartProvider.getPartName());

		viewPart.setTitleToolTip(viewPartProvider.getTitleToolTip());

		viewPart.setTitleImage(viewPartProvider.getTitleImage());
	}

	private static AbstractViewPart createTreeViewPartInternal(
			final IViewPartProvider viewPartProvider) {
		AbstractTreeViewPart treeViewPart = new AbstractTreeViewPart() {

			@Override
			protected ITreeViewProvider getTreeViewProvider() {

				return (ITreeViewProvider) viewPartProvider;
			}

			@Override
			protected List<IEditorProvider<TreeNodeItem>> getEditorProviderList(
					TreeNodeItem item) {
				return ((IEditableViewPartProvider<TreeNodeItem>) viewPartProvider)
						.getEditorProviderList();
			}

			@Override
			protected String[] getToolbarActionGrous() {
				return (String[]) ArrayUtils.addAll(
						viewPartProvider.getToolbarActionGrous(),
						super.getToolbarActionGrous());
			}

			@Override
			protected String[] getMenuActionGrous() {
				return viewPartProvider.getMenuActionGrous();
			}

			@Override
			protected IActionHandler getActionHandler(ViewPart viewPart) {
				return viewPartProvider.getActionHandler(this);
			}

			@Override
			protected void addSelectionlistener(SelectionListener listener) {
				getTreeComposite().getTreeViewer().getTree()
						.addSelectionListener(listener);
			}

		};

		return treeViewPart;
	}
}
