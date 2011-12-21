package net.ui.eclipse.table;

import org.apache.commons.lang.math.NumberUtils;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

public class IntCellEditor extends TextCellEditor {

	public IntCellEditor() {
		super();
	}

	public IntCellEditor(Composite parent) {
		super(parent);
	}

	public IntCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	protected Object doGetValue() {
		Object value = super.doGetValue();
		if(NumberUtils.isDigits( String.valueOf(value))){
			return new Integer( String.valueOf(value) );
		}
		else{
			return Integer.valueOf(0);
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
