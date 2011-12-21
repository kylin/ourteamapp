package net.ui.eclipse.table;

import java.util.Calendar;
import java.util.Date;

import net.ui.eclipse.LocalHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogLabelKeys;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Shell;

public class DateDialog extends Dialog {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(DateDialog.class);

	private DateTime datePicker;

	private Date selectedDate;

	public static final int CLEAR = 30;

	public DateDialog(Shell parentShell) {
		super(parentShell);
	}

	public DateDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	protected void okPressed() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(datePicker.getYear(), datePicker.getMonth(),
				datePicker.getDay());
		selectedDate = calendar.getTime();
		super.okPressed();
	}

	protected Control createDialogArea(Composite parent) {

		Composite composite = (Composite) super.createDialogArea(parent);

		try {
			datePicker = new DateTime(composite, SWT.NONE | SWT.DATE
					| SWT.DROP_DOWN);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;

			datePicker.setLayoutData(data);
			if (this.selectedDate != null) {
				Calendar calendar = Calendar.getInstance();

				calendar.setTime(this.selectedDate);

				datePicker.setDate(calendar.get(Calendar.YEAR),
						calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DATE));
			}

		} catch (Exception ex) {
			logger.error("����UI�쳣", ex);
		}

		return composite;
	}

	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID,
				LocalHelper.getDialogConstants(IDialogLabelKeys.OK_LABEL_KEY),
				true);

		((GridLayout) parent.getLayout()).numColumns++;

		Button button = new Button(parent, SWT.PUSH);
		button.setText("���");
		button.setFont(JFaceResources.getDialogFont());

		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				selectedDate = null;
				setReturnCode(CLEAR);
				close();
			}
		});

		setButtonLayoutData(button);

		createButton(parent, IDialogConstants.CANCEL_ID,
				LocalHelper
						.getDialogConstants(IDialogLabelKeys.CANCEL_LABEL_KEY),
				false);

	}

}
