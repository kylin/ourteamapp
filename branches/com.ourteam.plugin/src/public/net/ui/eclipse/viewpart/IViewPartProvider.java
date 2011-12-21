package net.ui.eclipse.viewpart;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public interface IViewPartProvider {

	public Composite createPartControl(Composite parent);

	public String[] getToolbarActionGrous();

	public String[] getMenuActionGrous();

	public IActionHandler getActionHandler(ViewPart viewPart);

	public ICustomActionControl getCustomActionControl();

	public String getPartName();

	public Image getTitleImage();

	public String getTitleToolTip();
}
