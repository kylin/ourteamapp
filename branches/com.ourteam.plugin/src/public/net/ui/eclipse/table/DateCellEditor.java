package net.ui.eclipse.table;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

public class DateCellEditor extends CellEditor {

	private Date value = null;

	private DateTime datePicker;

	public DateCellEditor() {
		super();
	}

	public DateCellEditor(Composite parent) {
		super(parent);
	}

	public DateCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	protected Control createControl(Composite parent) {

		datePicker = new DateTime(parent, SWT.NONE | SWT.DATE | SWT.DROP_DOWN);

		if (value != null) {

			Calendar calendar = Calendar.getInstance();

			calendar.setTime(value);

			datePicker.setDate(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
			
		}
//		datePicker.addSelectionListener(new SelectionListener() {
//
//			public void widgetSelected(final SelectionEvent event) {
//				value = e.date;
//			}
//
//		});

		return datePicker;
	}

	protected Object doGetValue() {
		if (value instanceof java.sql.Date) {
			value = new Date(((java.sql.Date) value).getTime());
		}
		return value;

	}

	protected void doSetFocus() {
		datePicker.setFocus();
	}

	protected void doSetValue(Object aValue) {
		if (aValue instanceof Date) {
			value = (Date) aValue;
			Calendar calendar = Calendar.getInstance();

			calendar.setTime(value);

			datePicker.setDate(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
		} else {
			value = null;
			//datePicker.
			// datePicker.update();
		}

	}

}
