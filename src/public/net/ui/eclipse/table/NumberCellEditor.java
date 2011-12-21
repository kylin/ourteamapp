package net.ui.eclipse.table;

import java.math.BigDecimal;

import org.apache.commons.lang.math.NumberUtils;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

public class NumberCellEditor extends TextCellEditor {

	public NumberCellEditor() {
		super();
	}

	public NumberCellEditor(Composite parent) {
		super(parent);
	}

	public NumberCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	protected Object doGetValue() {
		Object value = super.doGetValue();
		if(NumberUtils.isDigits( String.valueOf(value))){
			return new BigDecimal( String.valueOf(value) );
		}
		else{
			return BigDecimal.valueOf(0);
		}
		
	}

	protected void doSetValue(Object value) {
		if(NumberUtils.isDigits( String.valueOf(value))){
			super.doSetValue(String.valueOf(value));
		}
		else{
			super.doSetValue( "0" );
		}
		
	}
	
	
	

}
