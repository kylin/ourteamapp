package net.ui.eclipse.table;


import org.apache.commons.lang.BooleanUtils;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class CheckboxStringValueCellEditor extends CellEditor {

	private Button checkboxButton;

	public CheckboxStringValueCellEditor() {
		super();
	}

	public CheckboxStringValueCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	public CheckboxStringValueCellEditor(Composite parent) {
		super(parent);
	}

	@Override
	public void deactivate() {
		super.deactivate();
		checkboxButton.setVisible(true);
	}
	
	public LayoutData getLayoutData() {
        LayoutData data = new LayoutData();
        data.minimumWidth= SWT.CENTER;
        return data;
    }

	protected Control createControl(Composite parent) { 
		Composite composite = new Composite(parent,SWT.NONE);
		composite.setLayout(new GridLayout());
		checkboxButton = new Button(composite, SWT.CHECK);
		checkboxButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		checkboxButton.setVisible(true);
		return composite;
	}

	@Override
	protected Object doGetValue() {

		return BooleanUtils.toStringTrueFalse(checkboxButton.getSelection());

	}

	@Override
	protected void doSetValue(Object value) {
		if (value == null) {
			value = "false";
		}
		checkboxButton.setSelection(BooleanUtils.toBoolean((String) value));
	}

	@Override
	protected void doSetFocus() {

	}

}
