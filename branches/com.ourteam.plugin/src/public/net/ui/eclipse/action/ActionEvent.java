package net.ui.eclipse.action;

import net.ui.model.action.ActionBean;

public class ActionEvent {

	private ActionBean actionBean;
	
	private boolean checked;

	private Object eventSource;

	public ActionBean getActionBean() {
		return actionBean;
	}

	public void setActionBean(ActionBean actionBean) {
		this.actionBean = actionBean;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Object getEventSource() {
		return eventSource;
	}

	public void setEventSource(Object eventSource) {
		this.eventSource = eventSource;
	}
	
	
}
