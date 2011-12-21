package net.ui.eclipse.utils;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

public interface IDialogProvider {
	
	public static int TITLE_DIALOG_STYLE = 1;
	
	public static int FORM_DIALOG_STYLE = 2;

	void createContentComposite(Composite parent) throws Exception;
	
	int getInitialWidth();
	
	int getInitialHeight();
	
	String getTitle();
	
	void beforeOkPressed() throws Exception;
	
	boolean doOkPressed() throws Exception;
	
	int getStyle();
	
	void setErrorMessage(String errorMessage);
	
	String getErrorMessage();
	
	void setInfoMessage(String infoMessage);
	
	String getInfoMessage();
	
	String getTitleImagePath(); 
	
	Image getDialogIcon();
	
	boolean canCancel();
	
	boolean isOkPressed();
	
	void setOkPressed(boolean flag);
	
	int getDialogStyle();
}
