package com.ourteam.app.modelbase.ui;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.modelbase.editor.BusinessPropertyMappingDataModel;

abstract public class AbstractBusinessObjectPropertyMappingConfigComposite
		extends AbstractComposite {

	private TableViewComposite<BusinessPropertyMappingDataModel> tableComposite;

	private IActionHandler actionHandler;

	abstract protected String getTableConfigId();

	public AbstractBusinessObjectPropertyMappingConfigComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	protected void createContent(Composite parent) {

		this.actionHandler = new ActionHandler();

		parent.setLayout(new GridLayout());

		tableComposite = new TableViewComposite<BusinessPropertyMappingDataModel>(
				parent, UIConfigFactory.getInstance().getTableConfig(
						getTableConfigId()), SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION, true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				return new ToolBarComposite(composite, UIConfigFactory
						.getInstance().getActionGroupConfig(
								"genPropertyListActionGroup"), actionHandler,
						SWT.FLAT);
			}

		};

		tableComposite.getHeadToolBarComposite().update();

		tableComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

	}

	public TableViewComposite<BusinessPropertyMappingDataModel> getTableComposite() {
		return tableComposite;
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return true;
		}

		public void selectAll(ActionEvent actionEvent) throws Exception {
			tableComposite.selectAll();
		}

		public void unSelectAll(ActionEvent actionEvent) throws Exception {
			tableComposite.clearAllSelection();
		}

	}

}
