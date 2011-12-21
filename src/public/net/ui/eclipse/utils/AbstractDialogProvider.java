package net.ui.eclipse.utils;

import net.ui.eclipse.ImageChache;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public abstract class AbstractDialogProvider implements IDialogProvider {

	private String errorMessage;

	private String infoMessage;

	private boolean okPressed;

	private int dialogStyle = FORM_DIALOG_STYLE;

	@Override
	public int getInitialHeight() {
		return 500;
	}

	@Override
	public int getInitialWidth() {
		return 600;
	}

	@Override
	public int getStyle() {
		return SWT.RESIZE | SWT.APPLICATION_MODAL | SWT.TITLE | SWT.CLOSE;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getInfoMessage() {
		return infoMessage;
	}

	public void setInfoMessage(String infoMessage) {
		this.infoMessage = infoMessage;
	}

	@Override
	public void beforeOkPressed() throws Exception {

	}

	@Override
	public String getTitleImagePath() {
		return "information";
	}

	public boolean canCancel() {
		return true;
	}

	@Override
	public Image getDialogIcon() {
		return ImageChache.getImage("information");
	}

	public boolean isOkPressed() {
		return okPressed;
	}

	public void setOkPressed(boolean okPressed) {
		this.okPressed = okPressed;
	}

	public int getDialogStyle() {
		return dialogStyle;
	}

}
