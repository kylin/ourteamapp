package net.ui.eclipse.viewpart;

import org.eclipse.swt.graphics.Image;

import net.ui.eclipse.action.ICustomActionControl;

public abstract class AbstractViewPartProvider implements IViewPartProvider {

	private String partName;
	
	private String titleToolTip;
	
	private Image titleImage;
	
	@Override
	public ICustomActionControl getCustomActionControl() {
		return null;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getTitleToolTip() {
		return titleToolTip;
	}

	public void setTitleToolTip(String titleToolTip) {
		this.titleToolTip = titleToolTip;
	}

	public Image getTitleImage() {
		return titleImage;
	}

	public void setTitleImage(Image titleImage) {
		this.titleImage = titleImage;
	}
	
	

}
