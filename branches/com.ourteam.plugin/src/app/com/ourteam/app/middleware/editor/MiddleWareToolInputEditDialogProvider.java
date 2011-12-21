package com.ourteam.app.middleware.editor;

import java.util.List;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.constlist.ListData;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.middleware.ui.MiddleWareTooInputOptionListComposite;
import com.ourteam.middleware.domain.MiddleWareToolInputBean;
import com.ourteam.middleware.domain.MiddleWareToolInputOptionBean;

public class MiddleWareToolInputEditDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private MiddleWareToolInputBean middleWareToolInputBean;

	private GridFormComposite<MiddleWareToolInputBean> gridFormComposite;

	private MiddleWareTooInputOptionListComposite tooInputOptionListComposite;

	public MiddleWareToolInputEditDialogProvider(
			MiddleWareToolInputBean middleWareToolInputBean) {
		super();
		this.middleWareToolInputBean = middleWareToolInputBean;
	}

	@Override
	public String getTitle() {
		if (this.middleWareToolInputBean.getId() == 0) {
			return "新增参数";
		} else {
			return "编辑参数'" + this.middleWareToolInputBean.getParameterName()
					+ "'";
		}
	}

	@Override
	public void createContentComposite(Composite parent) {
		super.createContentComposite(parent);
		onTabChanged(0);
	}

	@Override
	public boolean doOkPressed() throws Exception {

		try {

			this.middleWareToolInputBean = this.gridFormComposite
					.getFormDataModel();

			Combo defaultValueCombo = (Combo) gridFormComposite
					.getWidget("defaultValue");

			if (defaultValueCombo.getData(this.middleWareToolInputBean
					.getDefaultValue()) != null) {
				this.middleWareToolInputBean
						.setDefaultValue((String) defaultValueCombo
								.getData(this.middleWareToolInputBean
										.getDefaultValue()));
			}

			if (this.middleWareToolInputBean.getId() == 0) {
				IOurTeamServiceConst.MIDDLE_WARE_SERVICE
						.addMiddleWareToolInput(
								this.middleWareToolInputBean.getToolId(),
								this.middleWareToolInputBean);
			} else {
				IOurTeamServiceConst.MIDDLE_WARE_SERVICE
						.modifyMiddleWareToolInput(this.middleWareToolInputBean);
			}

			List<MiddleWareToolInputOptionBean> inputOptionBeans = tooInputOptionListComposite
					.getTableViewComposite().getDataList();

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.setMiddleWareToolInputOptions(
							this.middleWareToolInputBean.getId(),
							inputOptionBeans
									.toArray(new MiddleWareToolInputOptionBean[inputOptionBeans
											.size()]));

			return true;

		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}

	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "middleWareToolInputEditTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {

		if (aPanel instanceof GridFormComposite) {
			gridFormComposite = (GridFormComposite<MiddleWareToolInputBean>) aPanel;
			gridFormComposite.setFormDataModel(middleWareToolInputBean);
		} else if (aPanel instanceof MiddleWareTooInputOptionListComposite) {
			tooInputOptionListComposite = (MiddleWareTooInputOptionListComposite) aPanel;
			if (this.middleWareToolInputBean.getId() != 0) {
				MiddleWareToolInputOptionBean[] inputOptionBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
						.getMiddleWareToolInputOptions(this.middleWareToolInputBean
								.getId());

				tooInputOptionListComposite.getTableViewComposite()
						.setDataList(inputOptionBeans);

				tooInputOptionListComposite.getTableViewComposite()
						.getHeadToolBarComposite().update();
			}
		}
	}

	protected void onTabChanged(int tabIndex) {

		if (tabIndex == 0) {

			middleWareToolInputBean = gridFormComposite.getFormDataModel();

			Combo defaultValueCombo = (Combo) gridFormComposite
					.getWidget("defaultValue");

			defaultValueCombo.removeAll();

			final List<MiddleWareToolInputOptionBean> inputOptionBeans = tooInputOptionListComposite
					.getTableViewComposite().getDataList();

			ListData[] listDatas = new ListData[inputOptionBeans.size()];

			for (int i = 0; i < listDatas.length; i++) {
				listDatas[i] = new ListData();
				listDatas[i].setListData(
						inputOptionBeans.get(i).getRealValue(),
						inputOptionBeans.get(i).getDisplayLabel());
			}

			SWTUtils.fillCommboBox(listDatas, defaultValueCombo);

			SWTUtils.setCommboBoxSelection(
					middleWareToolInputBean.getDefaultValue(),
					defaultValueCombo);

		}
	}
}
