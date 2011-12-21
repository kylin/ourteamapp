package net.ui.eclipse;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class CheckboxCellEditor extends org.eclipse.jface.viewers.CheckboxCellEditor {
	
	private Button checkBox = null;
	protected Control createControl(Composite parent) {
		checkBox = new Button(parent,SWT.CHECK);
		return checkBox;
	}

	protected Object doGetValue() {
		
		Boolean value = (Boolean)super.doGetValue();
		
		checkBox.setSelection(value.booleanValue());
		
		return value;
	}

	protected void doSetValue(Object value) {
		
		super.doSetValue(value);
	}

	public CheckboxCellEditor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckboxCellEditor(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	public CheckboxCellEditor(Composite parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}
	
	

	
}
