package com.ourteam.app.modelbase;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.enums.Enum;
import org.eclipse.ui.part.ViewPart;

import com.ourteam.app.modelbase.editor.AddBusinessTemplateWizardProvider;
import com.ourteam.app.modelbase.editor.BusinessTemplateEditorHelper;
import com.ourteam.app.modelbase.editor.EditBusinessTemplateProviderTypeDialogProvider;
import com.ourteam.modelbase.dao.BusinessTemplateProviderType;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;

public class BusinessTemplateListViewPart extends AbstractTreeViewPart {

	public static final String VIEW_ID = "com.ourteam.app.modelbase.BusinessTemplateListViewPart";

	@Override
	protected ITreeViewProvider getTreeViewProvider() {

		return new AbstractTreeTableViewProvider() {

			@Override
			public TreeBean getTreeConfig() {
				return UIConfigFactory.getInstance().getTreeConfig(
						"/ui/model/business_template.tree");
			}
		};
	}

	@Override
	protected List<IEditorProvider<TreeNodeItem>> getEditorProviderList(
			TreeNodeItem item) {
		return BusinessTemplateEditorHelper
				.getBusinessTemplateEditorProviderList();
	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new BusinessTemplateActionHandler(this);
	}

	@Override
	protected String[] getMenuActionGrous() {
		return null;
	}

	class BusinessTemplateActionHandler extends TreeViewActionHandler {

		public BusinessTemplateActionHandler(AbstractTreeViewPart treeViewPart) {
			super(treeViewPart);
		}

		public void editBusinessTemplateProviderType(ActionEvent actionEvent)
				throws Exception {

			BusinessTemplateProviderTypeBean businessTemplateProviderTypeBean = (BusinessTemplateProviderTypeBean) getSelectedUserObject();

			if (SWTUtils.openDialog(getSite().getShell(),
					new EditBusinessTemplateProviderTypeDialogProvider(
							businessTemplateProviderTypeBean))) {

				refreshSelectedTreeNode();
			}

		}

		public void addNewBusinessTemplateProviderType(ActionEvent actionEvent)
				throws Exception {

			Object selectObject = getSelectedUserObject();

			BusinessTemplateProviderTypeBean providerTypeBean = new BusinessTemplateProviderTypeBean();

			if (selectObject instanceof Enum) {
				providerTypeBean.setBusinessObjectType(((Enum) selectObject)
						.getName());
			}

			if (selectObject instanceof BusinessTemplateProviderType) {
				providerTypeBean
						.setBusinessObjectType(((BusinessTemplateProviderType) selectObject)
								.getBusinessObjectType());

			}

			if (SWTUtils.openDialog(getSite().getShell(),
					new EditBusinessTemplateProviderTypeDialogProvider(
							providerTypeBean))) {

				refreshSelectedTreeNode();
			}
		}

		public void addNewBusinessTemplate(ActionEvent actionEvent)
				throws Exception {

			Object selectObject = getSelectedUserObject();

			BusinessTemplateBean businessTemplateBean = new BusinessTemplateBean();

			if (selectObject instanceof Enum) {

				businessTemplateBean
						.setBusinessObjectType(((Enum) selectObject).getName());

				businessTemplateBean.setProviderTypeId(0);

			}

			if (selectObject instanceof BusinessTemplateProviderType) {
				businessTemplateBean
						.setBusinessObjectType(((BusinessTemplateProviderType) selectObject)
								.getBusinessObjectType());

				businessTemplateBean
						.setProviderTypeId(((BusinessTemplateProviderType) selectObject)
								.getId());
			}

			if (SWTUtils
					.openWizardDialog(getSite().getShell(),
							new AddBusinessTemplateWizardProvider(
									businessTemplateBean))) {

				refreshSelectedTreeNode();

			}

		}

	}

}
