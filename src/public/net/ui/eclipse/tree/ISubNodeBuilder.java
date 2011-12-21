package net.ui.eclipse.tree;

public interface ISubNodeBuilder<ParentType,ChildType> {

	public ChildType[] getSubNodes(ParentType aParentObject) throws Exception;

	public String getSubNodeDefineId(ChildType nodeObject);
	
	public String[] getSubNodeActionGroupIds(ChildType nodeObject);
}
