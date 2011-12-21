package net.ui.eclipse.utils;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.dialogs.IInputValidator;

public class NoneEmptyInputValidator implements IInputValidator {
	
	private String errorMessage = "";
	
	public NoneEmptyInputValidator(String aMessage) {
		super();
		errorMessage = aMessage;
	}
	
	public NoneEmptyInputValidator() {
		super();
		errorMessage = "不能为空";
	}

	public String isValid(String newText) {
		if(StringUtils.isEmpty(newText)){
			return errorMessage;
		}
		return null;
	}

}
