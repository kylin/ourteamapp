package net.ui.eclipse.tree;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.swt.SWT;

public abstract class AbstractTreeViewProvider implements ITreeViewProvider {

	private int extendStyle;

	public AbstractTreeViewProvider() {
		this(SWT.SINGLE);
	}

	public AbstractTreeViewProvider(int extendStyle) {
		super();
		this.extendStyle = extendStyle;
	}

	@Override
	public Object getRootNodeUserObject() {
		return null;
	}

	@Override
	public String getDefaultNodeDefineId() {
		return null;
	}

	@Override
	public int getDefaultExpandToLevel() {
		return 0;
	}

	@Override
	public int getStyle() {
		return extendStyle | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER
				| SWT.FULL_SELECTION;
	}

	@Override
	public boolean isEditable() {
		return false;
	}

	@Override
	public void initSubNodeBuilder(String id, ISubNodeBuilder builder) {
		
	}

	public  void buildContextMenu(IMenuManager menuMgr) throws Exception {
		 
	}

	
}
