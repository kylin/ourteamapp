package com.ourteam.app.modelbase.ui;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.widget.AbstractDataListTableComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.domain.ServiceParameterBean;

public class ServiceMethodInputParameterListComposite extends
		AbstractDataListTableComposite<ServiceParameterBean> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(ServiceMethodInputParameterListComposite.class);

	public ServiceMethodInputParameterListComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	@Override
	protected String[] getActionGroupIds() {
		return new String[] { "serviceMethodParameterActionGroup" };
	}

	@Override
	protected void onDoubleClick(IStructuredSelection selection) {
		if (selection.isEmpty() == false) {
			ActionBean editActionBean = UIConfigFactory.getInstance()
					.getActionBean("editRelation");

			if (getActionHandler().isActionEnable(editActionBean)) {
				try {

					ActionEvent actionEvent = new ActionEvent();

					actionEvent.setActionBean(editActionBean);

					this.getToolBarComposite().getActionHandler()
							.doAction(actionEvent);
				} catch (Exception ex) {
					MessageDialog.openError(this.getShell(),
							"Do Edit Action Error", ex.getLocalizedMessage());

					logger.error("Do Edit Action Error", ex);
				}
			}
		}
	}

	@Override
	protected TableBean getTableConfig() {
		return UIConfigFactory.getInstance().getTableConfig(
				"serviceInputParameterList");
	}

}
