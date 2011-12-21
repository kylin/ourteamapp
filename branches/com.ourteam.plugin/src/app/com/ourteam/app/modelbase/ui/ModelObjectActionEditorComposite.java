package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.AbstractComposite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ModelObjectActionEditorComposite extends AbstractComposite {

	private Combo actionCombo;

	private Combo operationCombo;

	private Combo propertyCombo;

	private Combo actionValueText;

	public ModelObjectActionEditorComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	protected void createContent(Composite parent) {

		parent.setLayout(new GridLayout(2, false));

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);

		Label actionLabel = new Label(parent, SWT.NONE);

		actionLabel.setText("动作");

		actionCombo = new Combo(parent, SWT.READ_ONLY);

		actionCombo.setLayoutData(gridData);

		actionCombo.add("query");
		actionCombo.add("create");
		actionCombo.add("update");
		actionCombo.add("delete");

		actionCombo.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				if ("query".equals(actionCombo.getText())) {
					operationCombo.setEnabled(true);
				} else {
					operationCombo.setEnabled(false);
				}
			}
		});

		Label propertyLabel = new Label(parent, SWT.NONE);

		propertyLabel.setText("属性");

		propertyCombo = new Combo(parent, SWT.READ_ONLY);

		propertyCombo.setLayoutData(gridData);

		Label operationLabel = new Label(parent, SWT.NONE);

		operationLabel.setText("操作");

		operationCombo = new Combo(parent, SWT.READ_ONLY);

		operationCombo.setLayoutData(gridData);

		operationCombo.add("=");
		operationCombo.add("!=");
		operationCombo.add(">");
		operationCombo.add(">=");
		operationCombo.add("<");
		operationCombo.add("<=");

		Label valueLabel = new Label(parent, SWT.NONE);

		valueLabel.setText("赋值");

		actionValueText = new Combo(parent, SWT.NONE);

		actionValueText.setLayoutData(gridData);

		actionValueText.add("#sysDate");

		actionCombo.select(0);

	}

	public Combo getActionCombo() {
		return actionCombo;
	}

	public Combo getOperationCombo() {
		return operationCombo;
	}

	public Combo getPropertyCombo() {
		return propertyCombo;
	}

	public Combo getActionValueText() {
		return actionValueText;
	}

}
