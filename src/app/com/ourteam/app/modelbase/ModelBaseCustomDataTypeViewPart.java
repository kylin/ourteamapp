package com.ourteam.app.modelbase;

import java.util.List;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.viewpart.AbstractViewPart;
import net.ui.model.action.ActionBean;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.ourteam.app.modelbase.editor.EditCustomDataObjectDialogProvider;
import com.ourteam.app.modelbase.ui.CustomDataTypeSearchComposite;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.CustomDataObjectStatusEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ModelBaseCustomDataTypeViewPart extends AbstractViewPart {

	public static final String VIEW_ID = "com.ourteam.app.modelbase.ModelBaseCustomDataTypeViewPart";

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private IActionHandler actionHandler = new ActionHandler();

	private CustomDataTypeSearchComposite customDataTypeListComposite;

	public ModelBaseCustomDataTypeViewPart() {

	}
	
	@Override
	public void doCreatePartControl(Composite parent) {

		parent.setLayout(new FillLayout());

		customDataTypeListComposite = new CustomDataTypeSearchComposite(parent);

		customDataTypeListComposite.setActionHandler(actionHandler);

		customDataTypeListComposite
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						updateActionStatus();

					}
				});

	}

	@Override
	public void setFocus() {

	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("edit".equals(aAction.getId())
					|| "delete".equals(aAction.getId())) {
				return customDataTypeListComposite.getSelectedSearchResults()
						.size() > 0;
			} else {
				return true;
			}
		}

		@Override
		public boolean isActionVisible(ActionBean aAction) {
			return true;
		}

		public void addNew(ActionEvent actionEvent) throws Exception {

			if (SWTUtils.openDialog(getSite().getShell(),
					new EditCustomDataObjectDialogProvider(
							new BusinessObjectBean()))) {

				customDataTypeListComposite.refreshResults();
			}

		}

		public void edit(ActionEvent actionEvent) throws Exception {

			BusinessObjectBean businessObjectBean = customDataTypeListComposite
					.getSelectedSearchResults().get(0);

			if (SWTUtils.openDialog(getSite().getShell(),
					new EditCustomDataObjectDialogProvider(businessObjectBean))) {

				customDataTypeListComposite.refreshResults();
			}

		}

		public void delete(ActionEvent actionEvent) throws Exception {

			List<BusinessObjectBean> businessObjectBeans = customDataTypeListComposite
					.getSelectedSearchResults();

			long[] ids = new long[businessObjectBeans.size()];

			for (int i = 0; i < ids.length; i++) {
				ids[i] = businessObjectBeans.get(i).getBusinessObjectId();

			}

			BUSINESS_OBJECT_SERVICE.deleteCustomDataObjects(ids);

			customDataTypeListComposite.refreshResults();
		}

		public void active(ActionEvent actionEvent) throws Exception {

			List<BusinessObjectBean> businessObjectBeans = customDataTypeListComposite
					.getSelectedSearchResults();

			long[] ids = new long[businessObjectBeans.size()];

			for (int i = 0; i < ids.length; i++) {
				ids[i] = businessObjectBeans.get(i).getBusinessObjectId();

			}

			BUSINESS_OBJECT_SERVICE.changeCustomDataObjectStatus(ids,
					CustomDataObjectStatusEnum.ACTIVE);

			customDataTypeListComposite.refreshResults();

		}

		public void deActive(ActionEvent actionEvent) throws Exception {

			List<BusinessObjectBean> businessObjectBeans = customDataTypeListComposite
					.getSelectedSearchResults();

			long[] ids = new long[businessObjectBeans.size()];

			for (int i = 0; i < ids.length; i++) {
				ids[i] = businessObjectBeans.get(i).getBusinessObjectId();

			}

			BUSINESS_OBJECT_SERVICE.changeCustomDataObjectStatus(ids,
					CustomDataObjectStatusEnum.DEACTIVE);

			customDataTypeListComposite.refreshResults();
		}

	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return actionHandler;
	}

	@Override
	protected String[] getToolbarActionGrous() {
		return new String[] { "customDataTypeActionGroup" };
	}

	@Override
	protected String[] getMenuActionGrous() {
		return null;
	}

}
