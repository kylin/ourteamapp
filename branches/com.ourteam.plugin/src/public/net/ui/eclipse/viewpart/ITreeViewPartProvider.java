package net.ui.eclipse.viewpart;

import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;

public interface ITreeViewPartProvider extends
		IEditableViewPartProvider<TreeNodeItem>, ITreeViewProvider {

	public int getTreeViewStyle();
}
