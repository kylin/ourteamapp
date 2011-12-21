package net.ui.eclipse.table;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.viewers.ICellEditorValidator;

public class NoneEmptyCellEditorValidator implements ICellEditorValidator {

	public String isValid(Object value) {
		if(value == null){
			return "����Ϊ��";
		}
		if(value instanceof String){
			if(StringUtils.isEmpty(((String)value).trim())){
				return "����Ϊ��";
			}
		}
		
		return null;
		
	}

}
