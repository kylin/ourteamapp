package net.ui.eclipse.table;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

public class DateDialogCellEditor extends DialogCellEditor {

	/**
	 * The composite widget containing the color and RGB label widgets
	 */
	private Composite composite;

	/**
	 * The label widget showing the current color.
	 */
	private Label dateLabel;

	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public DateDialogCellEditor() {
		super();
	}

	public DateDialogCellEditor(Composite parent) {
		super(parent);
	}

	public DateDialogCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	protected Control createContents(Composite cell) {
		Color bg = cell.getBackground();
		composite = new Composite(cell, getStyle());
		composite.setBackground(bg);
		composite.setLayout(new FillLayout());
		dateLabel = new Label(composite, SWT.LEFT);
		dateLabel.setBackground(bg);

		if (getValue() != null) {
			dateLabel.setText(dateFormat.format(getValue()));
		} else {
			dateLabel.setText("");
		}

		return composite;
	}

	protected Object openDialogBox(Control cellEditorWindow) {
		DateDialog dialog = new DateDialog(cellEditorWindow.getShell());
		Object value = getValue();
		if (value != null) {
			dialog.setSelectedDate((Date) value);
		}

		int returnCode = dialog.open();

		if (Dialog.OK == returnCode) {
			Date tempValue = dialog.getSelectedDate();
			markDirty();
			doSetValue(tempValue);
			updateContents(tempValue);
			fireApplyEditorValue();
			return tempValue;
		} else if (DateDialog.CLEAR == returnCode) {
			markDirty();
			doSetValue(null);
			updateContents(null);
			fireApplyEditorValue();
			
			return null;
		} else {
			return value;
		}

	}

	protected void updateContents(Object value) {
		if (value != null) {
			dateLabel.setText(dateFormat.format(value));
		} else {
			dateLabel.setText("");
		}
	}

}
