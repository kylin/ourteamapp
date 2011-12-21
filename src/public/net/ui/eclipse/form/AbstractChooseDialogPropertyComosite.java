package net.ui.eclipse.form;

import net.ui.model.form.FormPropertyBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public abstract class AbstractChooseDialogPropertyComosite<T> extends
		AbstractFormPropertyComosite<T> {

	private Text displayText;

	private Object displayValue;

	public AbstractChooseDialogPropertyComosite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void createContent(Composite parent) {

		GridLayoutFactory.fillDefaults().numColumns(3).equalWidth(false)
				.applyTo(parent);

		displayText = new Text(parent, SWT.BORDER | SWT.READ_ONLY);

		displayText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button clearButton = new Button(parent, SWT.PUSH);

		clearButton.setText(" X ");

		clearButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				displayText.setText("");
				displayValue = null;
			}

		});

		Button openDialogButton = new Button(parent, SWT.PUSH);

		openDialogButton.setText("...");

		openDialogButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				displayValue = openChooseDialog(getShell());
				if (displayValue != null) {
					setDisplayText(displayValue);
				}
			}
		});

	}

	abstract protected Object openChooseDialog(Shell shell);

	abstract protected String getDisplayDataProperty();

	abstract protected String getDisplayTextProperty();

	abstract protected Object convertToDisplayValue(
			FormPropertyBean propertyBean, Object aValue);

	protected Object convertToRealValue(FormPropertyBean propertyBean,
			Object aValue) {
		if (StringUtils.isNotBlank(getDisplayDataProperty())) {
			try {
				return PropertyUtils.getProperty(this.displayValue,
						getDisplayDataProperty());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		} else {
			return this.displayValue;
		}
	}

	@Override
	public void setValue(String aId, Object aValue) {

		FormPropertyBean propertyBean = getFormComposite()
				.getFormPropertyConfig(aId);

		displayValue = convertToDisplayValue(propertyBean, aValue);

		setDisplayText(displayValue);

	}

	protected void setDisplayText(Object displayValue) {
		if (displayValue != null) {
			if (displayValue instanceof String) {
				this.displayText.setText((String) displayValue);
			} else {
				if (StringUtils.isNotBlank(getDisplayTextProperty())) {
					try {
						this.displayText.setText(String.valueOf(PropertyUtils
								.getProperty(displayValue,
										getDisplayTextProperty())));
					} catch (Exception e) {
						throw new RuntimeException(e);
					}

				} else {
					this.displayText.setText(displayValue.toString());
				}
			}
		} else {
			this.displayText.setText("");
		}
	}

	@Override
	public Object getValue(String aId) {
		FormPropertyBean propertyBean = getFormComposite()
				.getFormPropertyConfig(aId);

		if (this.displayValue == null) {
			return null;
		} else {
			return convertToRealValue(propertyBean, this.displayValue);
		}

	}

	@Override
	public void addModifyListener(ModifyListener listener) {
		this.displayText.addModifyListener(listener);
	}

	@Override
	public void removeModifyListener(ModifyListener listener) {
		this.displayText.removeModifyListener(listener);

	}

}
