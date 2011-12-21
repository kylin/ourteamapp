package com.ourteam.app.modelbase.ui;

import java.util.List;

import net.ui.eclipse.form.AbstractFormPropertyComosite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.eclipse.utils.SWTUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import com.ourteam.app.SharedImage;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ServiceParameterBean;

public class BusinessPropertyDataTypeSelector extends
		AbstractFormPropertyComosite {

	private Text text;

	private ModelObjectSearchComposite objectSearchComposite;

	private CustomDataTypeSearchComposite customDataTypeSearchComposite;

	private BusinessPropertyDataTypeDataModel propertyDataTypeDataModel;

	public BusinessPropertyDataTypeSelector(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public Object getValue(String aId) {
		return text.getText();
	}

	@Override
	public void setValue(String aId, Object aValue) {
		if (aValue != null) {
			text.setText(String.valueOf(aValue));
		} else {
			text.setText("");
		}

	}

	@Override
	protected void createContent(Composite parent) {

		GridLayout gridLayout = new GridLayout(3, false);

		gridLayout.marginBottom = 0;

		gridLayout.marginHeight = 0;

		gridLayout.marginLeft = 0;

		gridLayout.marginRight = 0;

		gridLayout.marginTop = 0;

		gridLayout.marginWidth = 0;

		parent.setLayout(gridLayout);

		text = new Text(parent, SWT.READ_ONLY | SWT.BORDER);

		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button button = new Button(parent, SWT.PUSH);

		button.setImage(SharedImage.getSearchImage());

		propertyDataTypeDataModel = new BusinessPropertyDataTypeDataModel();

		button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				openDataTypeDailog(propertyDataTypeDataModel);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				openDataTypeDailog(propertyDataTypeDataModel);
			}
		});

		Button clearButton = new Button(parent, SWT.PUSH);

		clearButton.setImage(SharedImage.getClearImage());

		clearButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText("");

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				text.setText("");
			}
		});

	}

	protected void openDataTypeDailog(
			BusinessPropertyDataTypeDataModel dataTypeDataModel) {

		DialogProvider dialogProvider = new DialogProvider(dataTypeDataModel);

		if (SWTUtils.openDialog(getShell(), dialogProvider)) {
			this.text.setText(propertyDataTypeDataModel.getDataType());

			Object dataObject = this.getFormComposite().getFormDataModel();

			if (dataObject instanceof ObjectPropertyBean) {
				if (propertyDataTypeDataModel.getReferencedObjectId() != 0) {
					((ObjectPropertyBean) dataObject).setReferenceObjectId(Long
							.valueOf(propertyDataTypeDataModel
									.getReferencedObjectId()));
				} else {
					((ObjectPropertyBean) dataObject)
							.setReferenceObjectId(null);
				}
			}

			if (dataObject instanceof ServiceParameterBean) {
				if (propertyDataTypeDataModel.getReferencedObjectId() != 0) {
					((ServiceParameterBean) dataObject)
							.setReferenceObjectId(Long
									.valueOf(propertyDataTypeDataModel
											.getReferencedObjectId()));
				} else {
					((ServiceParameterBean) dataObject)
							.setReferenceObjectId(null);
				}

			}
		}

	}

	class DialogProvider extends AbstractTabbedPanelDialogProvider {

		private BusinessPropertyDataTypeDataModel propertyDataTypeDataModel;

		public DialogProvider(
				BusinessPropertyDataTypeDataModel propertyDataTypeDataModel) {
			super();
			this.propertyDataTypeDataModel = propertyDataTypeDataModel;
		}

		@Override
		public String getTitle() {
			return "选择数据类型";
		}

		@Override
		public boolean doOkPressed() throws Exception {
			int selectIndex = this.getTabbedComposite().getTabFolder()
					.getSelectionIndex();

			Control control = (Control) this.getTabbedComposite()
					.getEditorList().get(selectIndex);

			if (control instanceof CustomDataTypeSearchComposite) {

				List<BusinessObjectBean> selectedObject = customDataTypeSearchComposite
						.getSelectedSearchResults();

				BusinessObjectBean customDataObjectBean = selectedObject.get(0);

				this.propertyDataTypeDataModel.setDataType(customDataObjectBean
						.getName());

				this.propertyDataTypeDataModel
						.setReferencedObjectId(customDataObjectBean
								.getBusinessObjectId());

				return true;

			} else if (control instanceof ModelObjectSearchComposite) {
				List<BusinessObjectBean> selectedObject = objectSearchComposite
						.getSelectedSearchResults();

				if (selectedObject.isEmpty() == false) {

					BusinessObjectBean businessObjectBean = selectedObject
							.get(0);

					this.propertyDataTypeDataModel
							.setDataType(businessObjectBean.getPackageName()
									+ "." + businessObjectBean.getName());
					this.propertyDataTypeDataModel
							.setReferencedObjectId(businessObjectBean
									.getBusinessObjectId());

					return true;
				} else {
					setErrorMessage("请选择数据类型");
					return false;
				}
			} else {
				setErrorMessage("请选择数据类型");
				return false;
			}

		}

		@Override
		protected String getTabbedPaneConfigId() {
			return "selectBusinessObjectDataTypeTab";
		}

		@Override
		protected void initTabPanel(Control aPanel) throws Exception {

			if (aPanel instanceof ModelObjectSearchComposite) {
				objectSearchComposite = (ModelObjectSearchComposite) aPanel;

				objectSearchComposite
						.setBusinessObjectTypeEnums(new BusinessObjectTypeEnum[] {
								BusinessObjectTypeEnum.JAVA_CLASS,
								BusinessObjectTypeEnum.DAO_QUERY_BEAN,
								BusinessObjectTypeEnum.ENUM });

			} else if (aPanel instanceof CustomDataTypeSearchComposite) {
				customDataTypeSearchComposite = (CustomDataTypeSearchComposite) aPanel;

			}

		}

	}

	@Override
	public void addModifyListener(ModifyListener listener) {
		text.addModifyListener(listener);

	}

	@Override
	public void removeModifyListener(ModifyListener listener) {
		text.removeModifyListener(listener);
	}

}
