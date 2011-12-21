package net.ui.eclipse.tree;

import org.eclipse.swt.widgets.TreeItem;

/**
 * �ڵ㹹�����ӿ�
 * @author qilin
 *
 */
public interface SubNodeBuilder extends NodeBuilder {
		
	/**
	 * �����¼��ڵ�
	 * @param aParaneNode
	 * @throws Exception
	 */
	public void buildSubNode(TreeItem aParaneNode) throws Exception;
	
	/**
	 * ȡ���½ڵ�ʵ��
	 * @return
	 * @throws Exception
	 */
	public TreeItem getNewNode(TreeItem aParaneNode,Object aData) throws Exception;
	
}
