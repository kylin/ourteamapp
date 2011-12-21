package net.ui.eclipse.editorpart;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.action.ToolBarBuilder;

import org.eclipse.swt.graphics.Image;

public interface IEditor {

	public void setCanSaveChange(boolean canSaveChange);

	public String[] getActionGroupIds();

	public IActionHandler createActionHandler();
	
	public IActionHandler getActionHandler();
	
	public ICustomActionControl getCustomActionControl();
	
	public void setToolBarBuilder(ToolBarBuilder toolBarBuilder);
	
	public ToolBarBuilder getToolBarBuilder();
	
	public void onClosed();
	
	public void updateEditorInfo();
	
	public void setPageName(String pageName);
	
	public void setPageIcon(Image pageIcon);
}
