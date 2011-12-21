package net.ui.eclipse.action;

import net.ui.model.action.ActionBean;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ToolItem;

public interface ICustomActionControl {

	Control customAction(final ToolItem toolItem, ActionBean actionBean);
}
