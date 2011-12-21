package com.ourteam.app.middleware.editor;

import java.util.HashMap;
import java.util.Map;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.IComboListProvider;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.DefaultGridFormWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.middleware.ui.MiddleWareProviderComboListProvider;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class AddMiddleWareWizardProvider extends AbstractReflectWizardProvider {

	private DefaultGridFormWizardPageControlHelper<MiddleWareBean> middleWareInfoPageHelper;

	private long parentGroupId;

	private MiddleWareTypeEnum middleWareTypeEnum;

	public AddMiddleWareWizardProvider(MiddleWareTypeEnum middleWareTypeEnum,
			long parentGroupId) {
		super();
		this.middleWareTypeEnum = middleWareTypeEnum;
		this.parentGroupId = parentGroupId;
	}

	protected String getWizardConfigId() {
		if (MiddleWareTypeEnum.DATABASE_SERVER.equals(this.middleWareTypeEnum)) {
			return "addDatabaseServerWizard";
		} else if (MiddleWareTypeEnum.CVS_SERVER
				.equals(this.middleWareTypeEnum)) {
			return "addCVSServerWizard";
		} else if (MiddleWareTypeEnum.SVN_SERVER
				.equals(this.middleWareTypeEnum)) {
			return "addSVNServerWizard";
		} else if (MiddleWareTypeEnum.APPLICATION_SERVER
				.equals(this.middleWareTypeEnum)) {
			return "addAppServerWizard";
		} else {
			return null;
		}

	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		MiddleWareBean middleWareBean = middleWareInfoPageHelper
				.getGridFormComposite().getFormDataModel();

		IOurTeamServiceConst.MIDDLE_WARE_SERVICE.addMiddleWare(
				this.middleWareTypeEnum, this.parentGroupId, middleWareBean);

		affterAddMiddleWare(middleWareBean);

	}

	protected void affterAddMiddleWare(MiddleWareBean middleWareBean)
			throws Exception {

	}

	public DefaultGridFormWizardPageControlHelper<MiddleWareBean> getMiddleWareInfoPageHelper() {
		return middleWareInfoPageHelper;
	}

	public MiddleWareTypeEnum getMiddleWareTypeEnum() {
		return middleWareTypeEnum;
	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof GridFormComposite) {
			MiddleWareBean middleWareBean = new MiddleWareBean();
			middleWareBean.setType(this.middleWareTypeEnum.getName());
			return middleWareInfoPageHelper = new DefaultGridFormWizardPageControlHelper<MiddleWareBean>(
					this, middleWareBean);
		} else {
			return this;
		}
	}

	protected Map<String, IComboListProvider<?>> getFormComboListProvider(
			GridFormComposite formComposite) {
		Map<String, IComboListProvider<?>> listDataProiverMap = new HashMap<String, IComboListProvider<?>>();

		listDataProiverMap.put("getMiddleWareProviderList",

		new MiddleWareProviderComboListProvider(middleWareTypeEnum));

		return listDataProiverMap;
	}

}
