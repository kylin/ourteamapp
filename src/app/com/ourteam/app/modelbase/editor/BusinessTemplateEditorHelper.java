package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.editorpart.AbstractDataModelMultiPageEditorInput;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.model.tree.NodeBean;

import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessTemplateEditorHelper {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	private static List<IEditorProvider<TreeNodeItem>> businessTemplateEditorProviderList = new ArrayList<IEditorProvider<TreeNodeItem>>();

	static {
		businessTemplateEditorProviderList
				.add(new BusinessTemplateEditorProvider());
	}

	public static List<IEditorProvider<TreeNodeItem>> getBusinessTemplateEditorProviderList() {
		return businessTemplateEditorProviderList;
	}

	static public class BusinessTemplateEditorInput extends
			AbstractDataModelMultiPageEditorInput<BusinessTemplateBean> {

		public BusinessTemplateEditorInput(BusinessTemplateBean dataModel) {
			super(dataModel);
		}

		@Override
		public boolean exists() {
			return getDataModel().getId() != 0;
		}

		@Override
		public String getName() {
			return getDataModel().getName();
		}

		@Override
		public String getToolTipText() {
			return getDataModel().getName();
		}

		@Override
		protected BusinessTemplateBean doReloadDataModel() throws Exception {
			return BUSINESS_TEMPLATE_SERVICE
					.getBusinessTemplateById(getDataModel().getId());
		}

		@Override
		protected String getTabbedPaneConfigId() {
			return "businessTemplateEditorTab";
		}

	}

	static public class BusinessTemplateEditorProvider extends
			AbstractModelObjectEditorProvider<BusinessTemplateBean> {

		@Override
		public String getEditorId() {
			return MultiPageEditorPartAgent.EDITOR_ID;
		}

		@Override
		protected String getModelObjectType() {
			return "TEMPLATE";
		}

		@Override
		protected IDataModelEditorInput<BusinessTemplateBean> getModelObjectEditorInput(
				BusinessTemplateBean editObject, NodeBean nodeBean) {
			return new BusinessTemplateEditorInput(editObject);
		}

	}
}
