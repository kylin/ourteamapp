package net.ui.eclipse.tree;

import net.ui.eclipse.table.ITableViewProvider;
import net.ui.model.tree.TreeBean;

import org.eclipse.jface.action.IMenuManager;

public interface ITreeViewProvider extends ITableViewProvider{

	TreeBean getTreeConfig();
	
	Object getRootNodeUserObject();
	
	String getDefaultNodeDefineId();
	
	int getDefaultExpandToLevel();
	
	void initSubNodeBuilder(String id, ISubNodeBuilder builder);
	
	 void buildContextMenu(IMenuManager menuMgr) throws Exception;
		
}
