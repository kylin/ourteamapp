package com.ourteam.app.modelbase.editor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.eclipse.utils.AbstractDialogProvider;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.modelbase.ui.BusinessDomainGroupEditComposite;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessDomainGroupBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class EditBusinessDomainGroupDialogProvider extends
		AbstractDialogProvider {

	private static final IBusinessDomainService BUSINESS_DOMAIN_SERVICE = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private BusinessDomainGroupEditComposite domainGroupEditComposite;

	@Override
	public void createContentComposite(Composite parent) {

		domainGroupEditComposite = new BusinessDomainGroupEditComposite(
				parent, SWT.NONE);
	}

	@Override
	public String getTitle() {

		return "编辑业务域分组";
	}

	@Override
	public boolean doOkPressed() throws Exception {

		try {

			Map<BusinessDomainGroupBean, BusinessDomainBean[][]> businessDomainGroupMap = domainGroupEditComposite
					.getBusinessDomainGroupMap();

			for (Iterator<BusinessDomainGroupBean> iterator = businessDomainGroupMap
					.keySet().iterator(); iterator.hasNext();) {
				BusinessDomainGroupBean businessDomainGroupBean = iterator
						.next();

				BusinessDomainBean[] businessDomainBeans = businessDomainGroupMap
						.get(businessDomainGroupBean)[1];

				long[] businessDomainIds = new long[businessDomainBeans.length];

				for (int i = 0; i < businessDomainIds.length; i++) {
					businessDomainIds[i] = businessDomainBeans[i]
							.getBusinessDomainId();

				}

				if (businessDomainGroupBean.getId() == 0) {
					BUSINESS_DOMAIN_SERVICE.addNewBusinessDomainGroup(
							businessDomainGroupBean, businessDomainIds);
				} else {

					BUSINESS_DOMAIN_SERVICE
							.modifyBusinessDomainGroup(businessDomainGroupBean);

					BUSINESS_DOMAIN_SERVICE.setBusinessDomainGroupRelate(
							businessDomainGroupBean.getId(), businessDomainIds);
				}

			}

			List<BusinessDomainGroupBean> removedList = domainGroupEditComposite
					.getRemovedDomainGroupBeans();

			long[] removedBusinessDomainGroupIds = new long[removedList.size()];

			for (int i = 0; i < removedBusinessDomainGroupIds.length; i++) {
				removedBusinessDomainGroupIds[i] = removedList.get(i).getId();
			}

			BUSINESS_DOMAIN_SERVICE
					.removeBusinessDomainGroups(removedBusinessDomainGroupIds);

			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}

	}

}
