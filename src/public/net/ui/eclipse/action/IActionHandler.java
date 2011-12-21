package net.ui.eclipse.action;

import java.util.List;

import net.ui.model.action.ActionBean;

public interface IActionHandler {

	public void doInit() throws Exception;

	public void doAction(ActionEvent actionEvent) throws Exception;

	public boolean isActionEnable(ActionBean aAction);

	public boolean isActionVisible(ActionBean aAction);
	
	public boolean isActionSelected(ActionBean aAction);
	
	public String getActionLabel(ActionBean aAction);
	
	public void fireAction(String actionId) throws Exception;
	
	public void addListener(IActionHandlerListener actionHandlerListener);
	
	public void removeListener(IActionHandlerListener actionHandlerListener);
	
	public List<IActionHandlerListener> getListeners();
}
