package net.ui.eclipse.action;

import net.ui.model.action.ActionBean;

import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class CustomActionControlContributionItem extends ContributionItem {

	private ICustomActionControl customActionable;

	private ActionBean actionBean;

	public CustomActionControlContributionItem(
			ICustomActionControl customActionable, ActionBean actionBean) {
		super();
		this.customActionable = customActionable;
		this.actionBean = actionBean;
	}

	@Override
	public void fill(ToolBar parent, int index) {
		ToolItem toolItem = null;
		if (index >= 0) {
			toolItem = new ToolItem(parent, SWT.SEPARATOR, index);
		} else {
			toolItem = new ToolItem(parent, SWT.SEPARATOR);
		}

		if (this.customActionable != null) {
			Control control = this.customActionable.customAction(toolItem,
					actionBean);
			if (control != null) {
				toolItem.setControl(control);
			}

		}

	}

	@Override
	public void fill(Composite parent) {
		System.out.println(parent);
	}

	@Override
	public void fill(Menu menu, int index) {
		System.out.println(menu);
	}

	@Override
	public void fill(CoolBar parent, int index) {
		System.out.println(parent);
	}

}
