package net.ui.eclipse.tree;

import org.eclipse.swt.widgets.TreeItem;

public interface NodeBuilder {

	public static final String NODE_CREATOR = "NODE_CREATOR";

	public static final String NODE_CONFIG = "NODE_CONFIG";

	public static final String TREE_CONFIG = "TREE_CONFIG";
	
	public static final String USER_OBJECT = "USER_OBJECT";

	public String getId();
	
	/**
	 * ���½ڵ����
	 * @param aData
	 * @throws Exception
	 */
	public void updateNodeData(TreeItem aNode,Object aData);
}
