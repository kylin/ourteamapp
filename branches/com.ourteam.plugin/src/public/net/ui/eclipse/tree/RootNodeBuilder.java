package net.ui.eclipse.tree;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public interface RootNodeBuilder extends NodeBuilder {

	/**
	 * �����¼��ڵ�
	 * @param aParaneNode
	 * @throws Exception
	 */
	public void buildSubNode(Tree aParaneTree) throws Exception;
	
	/**
	 * ȡ���½ڵ�ʵ��
	 * @return
	 * @throws Exception
	 */
	public TreeItem getNewNode(Tree aParaneTree,Object aData) throws Exception;
		
}
