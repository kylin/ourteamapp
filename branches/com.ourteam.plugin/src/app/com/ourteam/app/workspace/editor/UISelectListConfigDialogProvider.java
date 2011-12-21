package com.ourteam.app.workspace.editor;

import java.util.Map;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormFieldStatusChangeListener;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.model.constlist.ListDataContainer;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

import com.ourteam.app.workspace.ui.UISelectOptionListConfigComposite;

public class UISelectListConfigDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private ListDataContainer listDataContainer;

	private GridFormComposite<ListDataContainerFormBean> formComposite;

	private UISelectOptionListConfigComposite optionListConfigComposite;

	private ListDataContainerFormBean listDataContainerFormBean;

	public UISelectListConfigDialogProvider(ListDataContainer listDataContainer) {
		super();
		this.listDataContainer = listDataContainer;
	}

	@Override
	public String getTitle() {
		return "编辑选择信息";
	}

	@Override
	public boolean doOkPressed() throws Exception {

		listDataContainerFormBean = formComposite.getFormDataModel();

		PropertyUtils.copyProperties(listDataContainer,
				listDataContainerFormBean);

		listDataContainer.clear();

		listDataContainer.addAll(optionListConfigComposite.getSelectOptions());

		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "uiSelectListConfigTab";
	}

	@Override
	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) {
		if (panelClass.equals(UISelectOptionListConfigComposite.class)) {

			UISelectOptionListConfigComposite.CompositeInitor initor = new UISelectOptionListConfigComposite.CompositeInitor(
					listDataContainer);

			return optionListConfigComposite = new UISelectOptionListConfigComposite(
					tabFolder, initor);

		} else {
			return super.constructTabPanel(panelClass, tabFolder);
		}
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof GridFormComposite<?>) {

			listDataContainerFormBean = new ListDataContainerFormBean();

			PropertyUtils.copyProperties(listDataContainerFormBean,
					listDataContainer);

			formComposite = ((GridFormComposite) aPanel);

			formComposite
					.addFieldStatusChangeListener(new IFormFieldStatusChangeListener() {

						@Override
						public void fieldStatusChanged(String widgetId,
								Map<String, Widget> formWidgetMap) {
							if ("staticList".equals(widgetId)) {
								Button staticListCheckButton = (Button) formWidgetMap
										.get("staticList");

								((Control) formWidgetMap.get("type"))
										.setEnabled(!staticListCheckButton
												.getSelection());

								((Control) formWidgetMap.get("dataProperty"))
										.setEnabled(!staticListCheckButton
												.getSelection());
								((Control) formWidgetMap.get("labelProperty"))
										.setEnabled(!staticListCheckButton
												.getSelection());

								if (staticListCheckButton.getSelection()) {
									((Text) formWidgetMap.get("type"))
											.setText("static");
								}

							}
						}
					});

			formComposite.setFormDataModel(listDataContainerFormBean);

		}
	}

}
