package com.ourteam.app.modelbase;

import java.util.ArrayList;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.CommandAction;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;
import net.ui.model.action.ActionBean;
import net.ui.model.action.CustomActionBean;
import net.ui.model.table.TableBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.part.ViewPart;

import com.ourteam.app.modelbase.editor.BusinessDomainEditorProvider;
import com.ourteam.app.modelbase.editor.BusinessObjectEditorProvider;
import com.ourteam.app.modelbase.editor.BusinessPackageEditorProvider;
import com.ourteam.app.modelbase.editor.ObjectPropertyEditorProvider;
import com.ourteam.app.modelbase.editor.PersistentPackageEditorProvider;
import com.ourteam.app.modelbase.editor.ServiceMethodEditorProvider;
import com.ourteam.app.modelbase.editor.ServicePackageEditorProvider;
import com.ourteam.app.modelbase.ui.BusinessDomainNoderBuilder;
import com.ourteam.modelbase.domain.BusinessDomainGroupBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class ModelBaseCatelogViewPart extends AbstractTreeViewPart {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(ModelBaseCatelogViewPart.class);

	public static final String VIEW_ID = "com.ourteam.app.modelbase.ModelBaseCatelogViewPart";

	private final static IBusinessDomainService BUSINESS_DOMAIN_SERVICE = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private static List<IEditorProvider<TreeNodeItem>> editorProviderList = new ArrayList<IEditorProvider<TreeNodeItem>>();

	private List<BusinessDomainGroupBean> selectedDomainGroups = new ArrayList<BusinessDomainGroupBean>();

	static {
		editorProviderList.add(new BusinessDomainEditorProvider());
		editorProviderList.add(new BusinessPackageEditorProvider());
		editorProviderList.add(new ServicePackageEditorProvider());
		editorProviderList.add(new PersistentPackageEditorProvider());
		editorProviderList.add(new BusinessObjectEditorProvider(
				BusinessObjectTypeEnum.DAO));
		editorProviderList.add(new BusinessObjectEditorProvider(
				BusinessObjectTypeEnum.ENUM));
		editorProviderList.add(new BusinessObjectEditorProvider(
				BusinessObjectTypeEnum.JAVA_CLASS));
		editorProviderList.add(new BusinessObjectEditorProvider(
				BusinessObjectTypeEnum.PERSISTENT));
		editorProviderList.add(new BusinessObjectEditorProvider(
				BusinessObjectTypeEnum.SERVICE));
		editorProviderList.add(new ObjectPropertyEditorProvider(
				ObjectPropertyTypeEnum.BUSINESS_PROPERTY));
		editorProviderList.add(new ObjectPropertyEditorProvider(
				ObjectPropertyTypeEnum.BUSINESS_PROPERTY, true));
		editorProviderList.add(new ObjectPropertyEditorProvider(
				ObjectPropertyTypeEnum.PERSISTENT_PROPERTY));
		editorProviderList.add(new ObjectPropertyEditorProvider(
				ObjectPropertyTypeEnum.PERSISTENT_PROPERTY, true));
		editorProviderList.add(new ObjectPropertyEditorProvider(
				ObjectPropertyTypeEnum.BEAN_PROPERTY));
		editorProviderList.add(new ServiceMethodEditorProvider());
		editorProviderList.add(new ObjectPropertyEditorProvider(
				ObjectPropertyTypeEnum.ENUM_PROPERTY));

	}

	public ModelBaseCatelogViewPart() {

	}

	@Override
	protected ITreeViewProvider getTreeViewProvider() {

		return new ModelObjectTreeViewProvider();
	}

	@Override
	protected List<IEditorProvider<TreeNodeItem>> getEditorProviderList(TreeNodeItem item) {
		return editorProviderList;
	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new ModelBaseCatelogActionHandler(this);
	}

	@Override
	protected String[] getToolbarActionGrous() {
		return new String[] { "modelBaseViewActionGroup" };
	}

	@Override
	protected String[] getMenuActionGrous() {
		return new String[] { "modelBaseViewMenuActionGroup" };
	}

	@Override
	protected void createMenus(IMenuManager menuManager) {
		super.createMenus(menuManager);

		try {
			BusinessDomainGroupBean[] domainGroupBeans = BUSINESS_DOMAIN_SERVICE
					.getAllBusinessDomainGroups();

			ActionBean actionBean = UIConfigFactory.getInstance()
					.getActionBean("showBusinessDomainGroup");

			boolean isNeedClearSelectedBusinessDomainGroupIds = true;

			for (int i = 0; i < domainGroupBeans.length; i++) {
				final BusinessDomainGroupBean domainGroupBean = domainGroupBeans[i];

				if (this.selectedDomainGroups.contains(domainGroupBean)) {
					isNeedClearSelectedBusinessDomainGroupIds = false;
				}

				CustomActionBean<BusinessDomainGroupBean> showDomainActionBean = new CustomActionBean<BusinessDomainGroupBean>(
						domainGroupBean);

				BeanUtils.copyProperties(showDomainActionBean, actionBean);

				this.getMenuBuilder().addActionItem(menuManager,
						new CommandAction(showDomainActionBean));

			}

			if (isNeedClearSelectedBusinessDomainGroupIds) {
				this.selectedDomainGroups.clear();
			}

		} catch (Exception e) {
			logger.error("createMenus Error", e);
		}

	}

	public List<BusinessDomainGroupBean> getSelectedDomainGroups() {
		return selectedDomainGroups;
	}

	public void showAllBusinessDomain() {
		this.selectedDomainGroups.clear();
		getTreeComposite().getTreeViewer().getTree().deselectAll();

		getTreeComposite().refreshTree();

	}

	public void showBusinessDomain(BusinessDomainGroupBean domainGroupBean) {
		selectedDomainGroups.clear();
		selectedDomainGroups.add(domainGroupBean);

		getTreeComposite().getTreeViewer().getTree().deselectAll();

		getTreeComposite().refreshTree();

	}

	class ModelObjectTreeViewProvider extends AbstractTreeTableViewProvider {

		@Override
		public TreeBean getTreeConfig() {
			return UIConfigFactory.getInstance().getTreeConfig(
					"/ui/model/business_object.tree");
		}

		@Override
		public TableBean getTableConfig() {
			return UIConfigFactory.getInstance().getTableConfig(
					"modelObjectTreeTable");
		}

		@Override
		public void initSubNodeBuilder(String id, ISubNodeBuilder builder) {
			if (builder instanceof BusinessDomainNoderBuilder) {
				((BusinessDomainNoderBuilder) builder)
						.setBusinessDomainGroupBeans(selectedDomainGroups);
			}
		}

	}

}
