package net.ui.model.validate;

import net.ui.model.form.DynamicForm;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;


public class DynamicFormValidator {

	public DynamicFormValidator() {
		super();
	}
	
	public static boolean validateRequired(Object bean, Field field) {
        Object value = ((DynamicForm)bean).getValue(field.getProperty());
        if(value == null){
        	return false;
        }
        else{
        	return !GenericValidator.isBlankOrNull(String.valueOf(value));
        }
        
	}

}
