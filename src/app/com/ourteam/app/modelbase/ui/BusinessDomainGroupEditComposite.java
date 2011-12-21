package com.ourteam.app.modelbase.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessDomainGroupBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class BusinessDomainGroupEditComposite extends AbstractComposite {

	private static final Log logger = LogFactory
			.getLog(BusinessDomainGroupEditComposite.class);

	private static final IBusinessDomainService BUSINESS_DOMAIN_SERVICE = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private IActionHandler actionHandler;

	private TableViewComposite<BusinessDomainGroupBean> businessDomainGroupList;

	private TableViewComposite<BusinessDomainBean> leftBusinessDomainList;

	private TableViewComposite<BusinessDomainBean> rightBusinessDomainList;

	private ToolBarComposite businessDomainGroupToolBarComposite;

	private ToolBarComposite businessDomainToolBarComposite;

	private Map<BusinessDomainGroupBean, BusinessDomainBean[][]> businessDomainGroupMap = new HashMap<BusinessDomainGroupBean, BusinessDomainBean[][]>();

	private List<BusinessDomainGroupBean> removedDomainGroupBeans = new ArrayList<BusinessDomainGroupBean>();

	public BusinessDomainGroupEditComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void createContent(Composite parent) {

		this.actionHandler = new ActionHandler();

		parent.setLayout(new FillLayout());

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL | SWT.SMOOTH);

		createDomainGroupEditComposite(sashForm);

		createDomainSelectComposite(sashForm);

	}

	protected void createDomainGroupEditComposite(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		composite.setLayout(new GridLayout());

		ActionGroupBean[] actionGroupBeans = new ActionGroupBean[] { UIConfigFactory
				.getInstance().getActionGroupConfig(
						"defaultRelationActionGroup_16")

		};

		businessDomainGroupToolBarComposite = new ToolBarComposite(composite,
				actionGroupBeans, this.actionHandler, SWT.NONE);

		businessDomainGroupToolBarComposite.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));

		businessDomainGroupList = new TableViewComposite<BusinessDomainGroupBean>(
				composite, UIConfigFactory.getInstance().getTableConfig(
						"businessDomainGroupTable"), SWT.SINGLE | SWT.BORDER);

		businessDomainGroupList.setLayoutData(new GridData(GridData.FILL_BOTH));

		try {
			BusinessDomainGroupBean[] domainGroupBeans = BUSINESS_DOMAIN_SERVICE
					.getAllBusinessDomainGroups();

			businessDomainGroupList.setDataList(domainGroupBeans);

			businessDomainGroupList.getTableViewer()
					.addSelectionChangedListener(
							new ISelectionChangedListener() {

								@Override
								public void selectionChanged(
										SelectionChangedEvent event) {

									List<BusinessDomainGroupBean> selectedlist = businessDomainGroupList
											.getSelectedDataList();

									if (selectedlist.isEmpty() == false) {

										try {

											if (businessDomainGroupMap
													.containsKey(selectedlist
															.get(0)) == false) {

												BusinessDomainBean[] leftBusinessDomainBeans = BUSINESS_DOMAIN_SERVICE
														.getAllBusinessDomains();

												BusinessDomainBean[] rightBusinessDomainBeans = BUSINESS_DOMAIN_SERVICE
														.getBusinessDomainsByGroupId(selectedlist
																.get(0).getId());

												for (int i = 0; i < rightBusinessDomainBeans.length; i++) {
													leftBusinessDomainBeans = (BusinessDomainBean[]) ArrayUtils
															.removeElement(
																	leftBusinessDomainBeans,
																	rightBusinessDomainBeans[i]);

												}

												businessDomainGroupMap.put(
														selectedlist.get(0),
														new BusinessDomainBean[][] {

																leftBusinessDomainBeans,
																rightBusinessDomainBeans });

											}

											BusinessDomainBean[][] businessDomainBeans = businessDomainGroupMap
													.get(selectedlist.get(0));

											leftBusinessDomainList
													.setDataList(businessDomainBeans[0]);

											rightBusinessDomainList
													.setDataList(businessDomainBeans[1]);

											businessDomainGroupToolBarComposite
													.update();

											businessDomainToolBarComposite
													.update();

										} catch (Exception e) {
											logger.error(
													"getBusinessDomains error",
													e);
											throw new RuntimeException(e);
										}

									}

								}
							});

			businessDomainGroupToolBarComposite.update();

		} catch (Exception e) {
			logger.error("getAllBusinessDomainGroups error", e);
			throw new RuntimeException(e);
		}

	}

	protected void createDomainSelectComposite(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		composite.setLayout(new GridLayout(3, false));

		leftBusinessDomainList = new TableViewComposite<BusinessDomainBean>(
				composite, UIConfigFactory.getInstance().getTableConfig(
						"businessDomainTable"), SWT.MULTI | SWT.BORDER);

		leftBusinessDomainList.setLayoutData(new GridData(GridData.FILL_BOTH));

		ActionGroupBean[] actionGroupBeans = new ActionGroupBean[] {

		UIConfigFactory.getInstance().getActionGroupConfig(
				"towListEditActionActionGroup") };

		businessDomainToolBarComposite = new ToolBarComposite(composite,
				actionGroupBeans, this.actionHandler, SWT.VERTICAL);

		rightBusinessDomainList = new TableViewComposite<BusinessDomainBean>(
				composite, UIConfigFactory.getInstance().getTableConfig(
						"businessDomainTable"), SWT.MULTI | SWT.BORDER);

		rightBusinessDomainList.setLayoutData(new GridData(GridData.FILL_BOTH));

		businessDomainToolBarComposite.update();

		leftBusinessDomainList.getTableViewer().addSelectionChangedListener(
				new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						businessDomainToolBarComposite.update();

					}
				});

		leftBusinessDomainList.getTableViewer().addDoubleClickListener(
				new IDoubleClickListener() {

					@Override
					public void doubleClick(DoubleClickEvent event) {
						try {

							actionHandler.fireAction("moveToRight");

						} catch (Exception e) {
							logger.error(e);
						}
					}
				});

		rightBusinessDomainList.getTableViewer().addSelectionChangedListener(
				new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						businessDomainToolBarComposite.update();

					}
				});

		rightBusinessDomainList.getTableViewer().addDoubleClickListener(
				new IDoubleClickListener() {

					@Override
					public void doubleClick(DoubleClickEvent event) {
						try {

							actionHandler.fireAction("moveToLeft");
						} catch (Exception e) {
							logger.error(e);
						}
					}
				});

	}

	protected void moveBusinessDomainTo(
			BusinessDomainGroupBean domainGroupBean,
			List<BusinessDomainBean> selectedBusinessDomainBeans,
			boolean toRight) {

		if (domainGroupBean == null) {
			return;
		}

		BusinessDomainBean[][] businessDomainBeans = businessDomainGroupMap
				.get(domainGroupBean);

		List<BusinessDomainBean> rightList = new ArrayList<BusinessDomainBean>();

		CollectionUtils.addAll(rightList, businessDomainBeans[1]);

		List<BusinessDomainBean> leftList = new ArrayList<BusinessDomainBean>();

		CollectionUtils.addAll(leftList, businessDomainBeans[0]);

		if (toRight) {

			rightList.addAll(selectedBusinessDomainBeans);

			leftList.removeAll(selectedBusinessDomainBeans);
		} else {
			rightList.removeAll(selectedBusinessDomainBeans);

			leftList.addAll(selectedBusinessDomainBeans);
		}

		leftBusinessDomainList.setDataList(leftList);

		rightBusinessDomainList.setDataList(rightList);

		businessDomainGroupMap.put(domainGroupBean, new BusinessDomainBean[][] {
				leftList.toArray(new BusinessDomainBean[leftList.size()]),
				rightList.toArray(new BusinessDomainBean[rightList.size()]) });

	}

	public Map<BusinessDomainGroupBean, BusinessDomainBean[][]> getBusinessDomainGroupMap() {
		return businessDomainGroupMap;
	}

	public List<BusinessDomainGroupBean> getRemovedDomainGroupBeans() {
		return removedDomainGroupBeans;
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			if ("moveToRight".equals(aAction.getId())) {
				if (leftBusinessDomainList.getSelectedDataList().isEmpty()) {
					return false;
				} else {
					return true;
				}
			} else if ("moveAllToRight".equals(aAction.getId())) {
				if (leftBusinessDomainList.getDataList().isEmpty()) {
					return false;
				} else {
					return true;
				}
			} else if ("moveToLeft".equals(aAction.getId())) {
				if (rightBusinessDomainList.getSelectedDataList().isEmpty()) {
					return false;
				} else {
					return true;
				}
			} else if ("moveAllToLeft".equals(aAction.getId())) {
				if (rightBusinessDomainList.getDataList().isEmpty()) {
					return false;
				} else {
					return true;
				}
			} else if ("removeRelation".equals(aAction.getId())
					|| "editRelation".equals(aAction.getId())) {

				if (businessDomainGroupList.getSelectedDataList().isEmpty()) {
					return false;
				} else {
					return true;
				}

			} else {
				return true;
			}

		}

		public void moveToRight(ActionEvent actionEvent) {

			List<BusinessDomainGroupBean> selectedDomainGroupBeans = businessDomainGroupList
					.getSelectedDataList();

			if (selectedDomainGroupBeans.isEmpty()) {
				return;
			}

			List<BusinessDomainBean> selectedDomainBeans = leftBusinessDomainList
					.getSelectedDataList();

			moveBusinessDomainTo(selectedDomainGroupBeans.get(0),
					selectedDomainBeans, true);

		}

		public void moveAllToRight(ActionEvent actionEvent) {

			List<BusinessDomainGroupBean> selectedDomainGroupBeans = businessDomainGroupList
					.getSelectedDataList();

			if (selectedDomainGroupBeans.isEmpty()) {
				return;
			}

			List<BusinessDomainBean> selectedDomainBeans = leftBusinessDomainList
					.getDataList();

			moveBusinessDomainTo(selectedDomainGroupBeans.get(0),
					selectedDomainBeans, true);

		}

		public void moveToLeft(ActionEvent actionEvent) {

			List<BusinessDomainGroupBean> selectedDomainGroupBeans = businessDomainGroupList
					.getSelectedDataList();

			if (selectedDomainGroupBeans.isEmpty()) {
				return;
			}

			List<BusinessDomainBean> selectedDomainBeans = rightBusinessDomainList
					.getSelectedDataList();

			moveBusinessDomainTo(selectedDomainGroupBeans.get(0),
					selectedDomainBeans, false);

		}

		public void moveAllToLeft(ActionEvent actionEvent) {

			List<BusinessDomainGroupBean> selectedDomainGroupBeans = businessDomainGroupList
					.getSelectedDataList();

			if (selectedDomainGroupBeans.isEmpty()) {
				return;
			}

			List<BusinessDomainBean> selectedDomainBeans = rightBusinessDomainList
					.getDataList();

			moveBusinessDomainTo(selectedDomainGroupBeans.get(0),
					selectedDomainBeans, false);

		}

		public void addRelation(ActionEvent actionEvent) throws Exception {

			BusinessDomainGroupFormDialogProvider dialogProvider = new BusinessDomainGroupFormDialogProvider(
					new BusinessDomainGroupBean());

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				BusinessDomainBean[] leftBusinessDomainBeans = BUSINESS_DOMAIN_SERVICE
						.getAllBusinessDomains();
				businessDomainGroupMap.put(dialogProvider.getFormDataModel(),
						new BusinessDomainBean[][] { leftBusinessDomainBeans,
								new BusinessDomainBean[0] });
				businessDomainGroupList.addRow(dialogProvider
						.getFormDataModel());

				businessDomainToolBarComposite.update();
			}
		}

		public void editRelation(ActionEvent actionEvent) {

			List<BusinessDomainGroupBean> selectedDomainGroupBeans = businessDomainGroupList
					.getSelectedDataList();

			if (selectedDomainGroupBeans.isEmpty()) {
				return;
			}

			BusinessDomainGroupFormDialogProvider dialogProvider = new BusinessDomainGroupFormDialogProvider(
					selectedDomainGroupBeans.get(0));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				dialogProvider.getFormDataModel();
				businessDomainGroupList.refresh();
			}
		}

		public void removeRelation(ActionEvent actionEvent) {
			List<BusinessDomainGroupBean> selectedDomainGroupBeans = businessDomainGroupList
					.getSelectedDataList();

			if (selectedDomainGroupBeans.isEmpty()) {
				return;
			}

			businessDomainGroupMap.remove(selectedDomainGroupBeans.get(0));

			removedDomainGroupBeans.add(selectedDomainGroupBeans.get(0));

			businessDomainGroupList.removeRow(selectedDomainGroupBeans.get(0));

			leftBusinessDomainList.setDataList(new BusinessDomainBean[0]);

			rightBusinessDomainList.setDataList(new BusinessDomainBean[0]);
		}

		public void refresh(ActionEvent actionEvent) throws Exception {

			businessDomainGroupMap.clear();

			removedDomainGroupBeans.clear();

			BusinessDomainGroupBean[] domainGroupBeans = BUSINESS_DOMAIN_SERVICE
					.getAllBusinessDomainGroups();

			businessDomainGroupList.setDataList(domainGroupBeans);

			leftBusinessDomainList.setDataList(new BusinessDomainBean[0]);

			rightBusinessDomainList.setDataList(new BusinessDomainBean[0]);

		}

	}

	class BusinessDomainGroupFormDialogProvider extends
			AbstractFormDialogProvider<BusinessDomainGroupBean> {

		public BusinessDomainGroupFormDialogProvider(
				BusinessDomainGroupBean formDataModel) {
			super(formDataModel);
		}

		@Override
		public String getTitle() {

			return "业务域分组";
		}

		@Override
		protected String getFormConfigId() {
			return "businessDomainGroupForm";
		}

		@Override
		public int getInitialHeight() {
			return 300;
		}

		@Override
		public int getInitialWidth() {
			return 400;
		}

	}

}
