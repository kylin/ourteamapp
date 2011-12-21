package com.ourteam.app.modelbase;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;
import net.ui.eclipse.viewpart.AbstractTreeViewPart.TreeViewActionHandler;
import net.ui.model.action.ActionBean;
import net.ui.model.action.CustomActionBean;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorReference;

import com.ourteam.app.modelbase.editor.AddBusinessBeanPropertyWizardProvider;
import com.ourteam.app.modelbase.editor.AddBusinessBeanWizardProvider;
import com.ourteam.app.modelbase.editor.AddBusinessDomainWizardProvider;
import com.ourteam.app.modelbase.editor.AddDaoObjectWizardProvider;
import com.ourteam.app.modelbase.editor.AddDaoPackageWizardProvider;
import com.ourteam.app.modelbase.editor.AddDaoPropertyWizardProvider;
import com.ourteam.app.modelbase.editor.AddEnumObjectWizardProvider;
import com.ourteam.app.modelbase.editor.AddEnumPropertyWizardProvider;
import com.ourteam.app.modelbase.editor.AddPersistentObjectWizardProvider;
import com.ourteam.app.modelbase.editor.AddPersistentPackageWizardProvider;
import com.ourteam.app.modelbase.editor.AddPersistentPropertyWizardProvider;
import com.ourteam.app.modelbase.editor.AddServiceMethodWizardProvider;
import com.ourteam.app.modelbase.editor.AddServiceObjectWizardProvider;
import com.ourteam.app.modelbase.editor.AddServicePackageWizardProvider;
import com.ourteam.app.modelbase.editor.EditBusinessDomainGroupDialogProvider;
import com.ourteam.app.modelbase.editor.GenDaoObjectWizardProvider;
import com.ourteam.app.modelbase.editor.GenDtoObjectWizardProvider;
import com.ourteam.app.modelbase.editor.ImportPersistentObjectWizardProvider;
import com.ourteam.app.modelbase.editor.MoveBusinessObjectWizardProvider;
import com.ourteam.app.modelbase.editor.MoveObjectPackageWizardProvider;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessDomainGroupBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class ModelBaseCatelogActionHandler extends TreeViewActionHandler {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private static final IBusinessDomainService BUSINESSD_DOMAIN_SERVICE = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private static final IBusinessPackageService BUSINESS_PACKAGE_SERVICE = BusinessPackageServiceFactory
			.getBusinessPackageService();

	private ModelBaseCatelogViewPart modelBaseCatelogViewPart;

	private Shell shell;

	public ModelBaseCatelogActionHandler(AbstractTreeViewPart catelogViewPart) {
		super(catelogViewPart);
		this.modelBaseCatelogViewPart = (ModelBaseCatelogViewPart) getTreeViewPart();
		this.shell = catelogViewPart.getSite().getShell();
	}

	@Override
	public boolean isActionSelected(ActionBean aAction) {
		if ("showAllBusinessDomainGroup".equals(aAction.getId())) {
			return this.modelBaseCatelogViewPart.getSelectedDomainGroups()
					.isEmpty();
		} else if (aAction instanceof CustomActionBean<?>) {
			return this.modelBaseCatelogViewPart
					.getSelectedDomainGroups()
					.contains(
							((CustomActionBean<BusinessDomainGroupBean>) aAction)
									.getUserObject());
		} else {
			return super.isActionSelected(aAction);
		}

	}

	protected TreeNodeItem getSelectedParentNodeItem() {
		ISelection selection = modelBaseCatelogViewPart.getSelection();

		if (selection.isEmpty() == false) {
			TreeNodeItem treeItem = (TreeNodeItem) ((IStructuredSelection) selection)
					.getFirstElement();

			return treeItem.getParentNodeItem();
		} else {
			return null;
		}
	}

	protected void refreshSelectedModelBaseCatelog() throws Exception {
		ISelection selection = modelBaseCatelogViewPart.getSelection();

		if (selection.isEmpty() == false) {
			TreeNodeItem treeItem = (TreeNodeItem) ((IStructuredSelection) selection)
					.getFirstElement();

			refreshModelBaseCatelog(treeItem);
		}
	}

	protected void refreshModelBaseCatelog(TreeNodeItem treeNodeItem)
			throws Exception {

		modelBaseCatelogViewPart.refreshTreeNode(treeNodeItem);

	}

	protected void refreshAllModelBaseCatelog() throws Exception {

		modelBaseCatelogViewPart.refreshTree();

	}

	// protected void refreshParentTreeNode() throws Exception {
	// ISelection selection = modelBaseCatelogViewPart.getSelection();
	//
	// if (selection.isEmpty() == false) {
	// TreeNodeItem treeItem = (TreeNodeItem) ((IStructuredSelection) selection)
	// .getFirstElement();
	//
	// modelBaseCatelogViewPart.refreshTreeNode(treeItem
	// .getParentNodeItem());
	// }
	// }

	protected Object getSelectedModelObject() {
		return modelBaseCatelogViewPart.getSelectedUserObject();
	}

	protected void closeEditor() {
		ISelection selection = modelBaseCatelogViewPart.getSelection();

		if (selection.isEmpty() == false) {
			TreeNodeItem treeItem = (TreeNodeItem) ((IStructuredSelection) selection)
					.getFirstElement();

			IEditorReference[] editorReferences = modelBaseCatelogViewPart
					.findEditorReferences(treeItem);

			modelBaseCatelogViewPart.getSite().getWorkbenchWindow()
					.getActivePage().closeEditors(editorReferences, false);
		}
	}

	protected BusinessDomainBean getSelectedBusinessDomain() {
		return (BusinessDomainBean) getSelectedModelObject();

	}

	/**
	 * 刷新
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void refreshModelBase(ActionEvent actionEvent) throws Exception {
		refreshSelectedModelBaseCatelog();
	}

	/**
	 * 添加业务域
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addBusinessDomain(ActionEvent actionEvent) throws Exception {

		long businessDomainGroupId = 0;

		if (this.modelBaseCatelogViewPart.getSelectedDomainGroups().isEmpty() == false) {
			businessDomainGroupId = this.modelBaseCatelogViewPart
					.getSelectedDomainGroups().get(0).getId();
		}

		if (SWTUtils.openWizardDialog(shell,
				new AddBusinessDomainWizardProvider(businessDomainGroupId))) {
			refreshAllModelBaseCatelog();
		}
	}

	public void deleteBusinessDoamin(ActionEvent actionEvent) throws Exception {

		TreeNodeItem parentNodeItem = getSelectedParentNodeItem();

		BusinessDomainBean businessDomainBean = getSelectedBusinessDomain();

		BUSINESSD_DOMAIN_SERVICE.deleteBusinessDomain(businessDomainBean
				.getBusinessDomainId());

		closeEditor();

		refreshModelBaseCatelog(parentNodeItem);
	}

	public void deleteBusinessPackage(ActionEvent actionEvent) throws Exception {

		TreeNodeItem parentNodeItem = getSelectedParentNodeItem();

		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		BUSINESS_PACKAGE_SERVICE.deleteBusinessPackage(businessPackageBean
				.getBusinessPackageId());

		closeEditor();

		refreshModelBaseCatelog(parentNodeItem);
	}

	public void deleteBusinessObject(ActionEvent actionEvent) throws Exception {

		TreeNodeItem parentNodeItem = getSelectedParentNodeItem();

		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		BUSINESS_OBJECT_SERVICE.deleteBusinessObject(businessObjectBean
				.getBusinessObjectId());

		closeEditor();

		refreshModelBaseCatelog(parentNodeItem);
	}

	public void deleteObjectProperty(ActionEvent actionEvent) throws Exception {

		TreeNodeItem parentNodeItem = getSelectedParentNodeItem();

		ObjectPropertyBean objectPropertyBean = getSelectedObjectProperty();

		BUSINESS_OBJECT_SERVICE.deleteBusinessObjectProperty(objectPropertyBean
				.getObjectPropertyId());

		closeEditor();

		refreshModelBaseCatelog(parentNodeItem);

	}

	public void deleteServiceMethod(ActionEvent actionEvent) throws Exception {

		TreeNodeItem parentNodeItem = getSelectedParentNodeItem();

		ServiceFunctionBean serviceFunctionBean = getSelectedServiceMethod();

		BUSINESS_OBJECT_SERVICE.deleteServiceFunction(serviceFunctionBean
				.getObjectFunctionId());

		closeEditor();

		refreshModelBaseCatelog(parentNodeItem);
	}

	/**
	 * 添加DAO对象包
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addDaoPackage(ActionEvent actionEvent) throws Exception {

		BusinessDomainBean businessDomainBean = getSelectedBusinessDomain();

		if (businessDomainBean != null) {
			if (SWTUtils.openWizardDialog(
					shell,
					new AddDaoPackageWizardProvider(businessDomainBean
							.getBusinessDomainId()))) {
				refreshSelectedModelBaseCatelog();
			}
		}
	}

	/**
	 * 添加服务对象包
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addServicePackage(ActionEvent actionEvent) throws Exception {

		BusinessDomainBean businessDomainBean = getSelectedBusinessDomain();

		if (businessDomainBean != null) {
			if (SWTUtils.openWizardDialog(
					shell,
					new AddServicePackageWizardProvider(businessDomainBean
							.getBusinessDomainId()))) {
				refreshSelectedModelBaseCatelog();
			}
		}
	}

	protected BusinessObjectBean getSelectedBusinessObject() {
		return (BusinessObjectBean) getSelectedModelObject();

	}

	protected ObjectPropertyBean getSelectedObjectProperty() {
		return (ObjectPropertyBean) getSelectedModelObject();

	}

	protected ServiceFunctionBean getSelectedServiceMethod() {
		return (ServiceFunctionBean) getSelectedModelObject();

	}

	/**
	 * 添加数据对象包
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addPersistentPackage(ActionEvent actionEvent) throws Exception {

		BusinessDomainBean businessDomainBean = getSelectedBusinessDomain();

		if (businessDomainBean != null) {
			if (SWTUtils.openWizardDialog(
					shell,
					new AddPersistentPackageWizardProvider(businessDomainBean
							.getBusinessDomainId()))) {
				refreshSelectedModelBaseCatelog();
			}
		}
	}

	/**
	 * 从数据对象生成DAO对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void genDaoObject(ActionEvent actionEvent) throws Exception {

		BusinessObjectBean persistentBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(shell, new GenDaoObjectWizardProvider(
				persistentBean))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	public void genDtoObject(ActionEvent actionEvent) throws Exception {

		BusinessObjectBean daoBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(shell, new GenDtoObjectWizardProvider(
				daoBean))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	protected BusinessPackageBean getSelectedBusinessPackage() {
		return (BusinessPackageBean) getSelectedModelObject();

	}

	/**
	 * 添加DAO对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addDaoObject(ActionEvent actionEvent) throws Exception {

		BusinessPackageBean packageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(shell, new AddDaoObjectWizardProvider(
				packageBean.getBusinessPackageId()))) {
			refreshSelectedModelBaseCatelog();
		}

	}

	/**
	 * 添加DAO属性对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addDaoProperty(ActionEvent actionEvent) throws Exception {

		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(shell, new AddDaoPropertyWizardProvider(
				businessObjectBean.getBusinessObjectId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 导入数据对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void importPersistentObject(ActionEvent actionEvent)
			throws Exception {
		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(
				shell,
				new ImportPersistentObjectWizardProvider(businessPackageBean
						.getBusinessPackageId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 添加枚举对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addEnumObject(ActionEvent actionEvent) throws Exception {
		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(shell, new AddEnumObjectWizardProvider(
				businessPackageBean.getBusinessPackageId()))) {
			refreshSelectedModelBaseCatelog();
		}

	}

	/**
	 * 添加枚举对象属性
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addEnumProperty(ActionEvent actionEvent) throws Exception {
		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(shell, new AddEnumPropertyWizardProvider(
				businessObjectBean.getBusinessObjectId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 添加业务数据对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addBsinessBeanObject(ActionEvent actionEvent) throws Exception {

		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(shell, new AddBusinessBeanWizardProvider(
				businessPackageBean.getBusinessPackageId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 添加数据对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addPersistentObject(ActionEvent actionEvent) throws Exception {
		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(
				shell,
				new AddPersistentObjectWizardProvider(businessPackageBean
						.getBusinessPackageId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 添加数据对象属性
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addPersistentProperty(ActionEvent actionEvent) throws Exception {
		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(
				shell,
				new AddPersistentPropertyWizardProvider(businessObjectBean
						.getBusinessObjectId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 添加服务对象
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addServiceObject(ActionEvent actionEvent) throws Exception {
		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(
				shell,
				new AddServiceObjectWizardProvider(businessPackageBean
						.getBusinessPackageId()))) {
			refreshSelectedModelBaseCatelog();
		}
	}

	/**
	 * 添加业务数据对象属性
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addBusinessBeanProperty(ActionEvent actionEvent)
			throws Exception {

		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(
				shell,
				new AddBusinessBeanPropertyWizardProvider(businessObjectBean
						.getBusinessObjectId()))) {
			refreshSelectedModelBaseCatelog();
		}

	}

	/**
	 * 添加服务对象方法
	 * 
	 * @param actionBean
	 * @throws Exception
	 */
	public void addServiceMessthod(ActionEvent actionEvent) throws Exception {
		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(
				shell,
				new AddServiceMethodWizardProvider(businessObjectBean
						.getBusinessObjectId()))) {
			refreshSelectedModelBaseCatelog();
		}

	}

	public void genBusinessBean(ActionEvent actionEvent) throws Exception {

		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();
	}

	public void moveObjectPackage(ActionEvent actionEvent) throws Exception {

		BusinessPackageBean businessPackageBean = getSelectedBusinessPackage();

		if (SWTUtils.openWizardDialog(shell,
				new MoveObjectPackageWizardProvider(businessPackageBean))) {
			refreshAllModelBaseCatelog();
		}

	}

	public void moveObject(ActionEvent actionEvent) throws Exception {

		BusinessObjectBean businessObjectBean = getSelectedBusinessObject();

		if (SWTUtils.openWizardDialog(shell,
				new MoveBusinessObjectWizardProvider(businessObjectBean))) {
			refreshAllModelBaseCatelog();
		}

	}

	public void showAllBusinessDomainGroup(ActionEvent actionEvent)
			throws Exception {
		this.modelBaseCatelogViewPart.showAllBusinessDomain();
	}

	public void showBusinessDomainGroup(ActionEvent actionEvent)
			throws Exception {
		CustomActionBean<BusinessDomainGroupBean> actionBean = (CustomActionBean<BusinessDomainGroupBean>) actionEvent
				.getActionBean();
		this.modelBaseCatelogViewPart.showBusinessDomain(actionBean
				.getUserObject());
	}

	public void editBusinessDomainGroup(ActionEvent actionEvent)
			throws Exception {

		if (SWTUtils.openDialog(shell,
				new EditBusinessDomainGroupDialogProvider())) {
			this.modelBaseCatelogViewPart.updatePartMenus();
			refreshAllModelBaseCatelog();
		}

	}
}
