package com.ourteam.app.modelbase.ui;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.table.TableViewComposite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.modelbase.editor.BusinessPropertyMappingDataModel;

abstract public class AbstractBusinessObjectPropertyMappingConfigComposite
		extends AbstractComposite {

	private TableViewComposite<BusinessPropertyMappingDataModel> tableComposite;

	abstract protected String getTableConfigId();

	public AbstractBusinessObjectPropertyMappingConfigComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	protected void createContent(Composite parent) {
		parent.setLayout(new GridLayout());

		tableComposite = new TableViewComposite<BusinessPropertyMappingDataModel>(
				parent, UIConfigFactory.getInstance().getTableConfig(
						getTableConfigId()), SWT.BORDER | SWT.CHECK, true);

		tableComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

	}

	public TableViewComposite<BusinessPropertyMappingDataModel> getTableComposite() {
		return tableComposite;
	}

}
