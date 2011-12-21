package com.ourteam.app.modelbase.editor;

import java.util.List;

import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.AbstractSerachWizardPageControlHelper;
import net.ui.eclipse.wizard.AbstractWizardProvider;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ddlutils.model.Table;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.middleware.ui.DatabaseSearchComposite;
import com.ourteam.app.middleware.ui.DatabaseTableSearchComposite;
import com.ourteam.app.middleware.ui.DatabaseTableSearchDataModel;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ImportPersistentObjectWizardProvider extends
		AbstractReflectWizardProvider {

	private long packageId;

	private DatabaseSearchWizardPageHelper databaseSearchWizardPageHelper;

	private DatabaseTableSearchWizardPageHelper databaseTableSearchWizardPageHelper;

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	public ImportPersistentObjectWizardProvider(long packageId) {
		super();
		this.packageId = packageId;
	}

	protected String getWizardConfigId() {
		return "importPersistentObjectWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		List<Table> tables = this.databaseTableSearchWizardPageHelper
				.getSelectedItems();

		BUSINESS_OBJECT_SERVICE.importPersistentObjects(this.packageId,
				(Table[]) tables.toArray(new Table[tables.size()]));

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return CollectionUtils
				.isNotEmpty(this.databaseTableSearchWizardPageHelper
						.getSelectedItems());
	}

	@Override
	protected Object getReflectObject(Control control) {

		if (control instanceof DatabaseSearchComposite) {
			return databaseSearchWizardPageHelper = new DatabaseSearchWizardPageHelper(
					this);
		} else if (control instanceof DatabaseTableSearchComposite) {
			return databaseTableSearchWizardPageHelper = new DatabaseTableSearchWizardPageHelper(
					this);
		} else {
			return this;
		}

	}

	public class DatabaseTableSearchWizardPageHelper
			extends
			AbstractSerachWizardPageControlHelper<Table, DatabaseTableSearchComposite> {

		public DatabaseTableSearchWizardPageHelper(
				AbstractWizardProvider wizardProvider) {
			super(wizardProvider);
		}

		@Override
		public void doNextWizardPageControl(DatabaseTableSearchComposite control) {
			List<MiddleWareBean> selectedMiddleWareBeans = databaseSearchWizardPageHelper
					.getSelectedItems();

			if (CollectionUtils.isEmpty(selectedMiddleWareBeans)) {
				return;
			}

			DatabaseTableSearchDataModel databaseTableSearchDataModel = new DatabaseTableSearchDataModel();

			databaseTableSearchDataModel
					.setDatabaseServerId(selectedMiddleWareBeans.get(0).getId());

			control.setQueryDataModel(databaseTableSearchDataModel);
		}

		@Override
		protected void doInitSearchConfig(DatabaseTableSearchComposite control)
				throws Exception {

		}

	}

}
