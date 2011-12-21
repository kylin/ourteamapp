package net.ui.eclipse.form;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.utils.IComboListProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.form.DynamicForm;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormPropertyBean;
import net.ui.model.form.LayoutDataBean;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

@SuppressWarnings("rawtypes")
public class GridFormComposite<T> extends Composite implements DynamicForm,
		SelectionListener, ModifyListener {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(GridFormComposite.class);

	private FormBean formConfig;

	private Map<String, Widget> widgetsMap = new WidgetMap();

	private Map<String, ControlDecoration> errorDecorationMap = new HashMap<String, ControlDecoration>();

	private Map<String, IFormOptionListDataProvider> listDataProiverMap = new HashMap<String, IFormOptionListDataProvider>();

	private List<ModifyListener> modifyListeners = new ArrayList<ModifyListener>();

	private List<SelectionListener> selectionListeners = new ArrayList<SelectionListener>();

	private List<IFormFieldStatusChangeListener> fieldStatusChangeListeners = new ArrayList<IFormFieldStatusChangeListener>();

	private Map<String, FormPropertyBean> formPropertyMap = new HashMap<String, FormPropertyBean>();

	private T formDataModel;

	private boolean modifyListenerEnable = true;

	private String formStatus;

	private int defaultStyle = SWT.NONE;

	public Class getFormDataModelType() {
		return formDataModel.getClass();
	}

	protected void initFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {
		listDataProiverMap.put("static",
				new DefaultFormStaticListDataProvider());
	}

	public void setFormDataModel(T dataModel) {
		this.formDataModel = dataModel;
		List formProperties = formConfig.getFormProperties();

		try {

			for (Iterator iter = formProperties.iterator(); iter.hasNext();) {
				FormPropertyBean property = (FormPropertyBean) iter.next();

				if (property.getType().equals(FormPropertyTypeConst.REF)) {
					FormBean refFormBean = getRefFormBean(property.getValue());

					List<FormPropertyBean> propertyBeans = refFormBean
							.getFormProperties();

					for (Iterator iterator = propertyBeans.iterator(); iterator
							.hasNext();) {
						FormPropertyBean formPropertyBean = (FormPropertyBean) iterator
								.next();
						if (dataModel instanceof Map
								|| PropertyUtils.isReadable(dataModel,
										formPropertyBean.getId())) {
							Object value = PropertyUtils.getProperty(dataModel,
									formPropertyBean.getId());
							this.setValue(formPropertyBean.getId(), value);

						}
						setSubPropertyData(this.formDataModel, formPropertyBean);
					}
				} else {

					if (dataModel instanceof Map
							|| PropertyUtils.isReadable(dataModel,
									property.getId())) {
						Object value = PropertyUtils.getProperty(dataModel,
								property.getId());
						this.setValue(property.getId(), value);

					}

					setSubPropertyData(this.formDataModel, property);
				}
			}

		} catch (Exception ex) {
			logger.error("setFormDataModel Error", ex);
		}
	}

	private void setSubPropertyData(T dataModel, FormPropertyBean property)
			throws Exception {

		if (property.getType().equals(FormPropertyTypeConst.REF)) {

			FormBean refFormBean = getRefFormBean(property.getValue());

			List<FormPropertyBean> propertyBeans = refFormBean
					.getFormProperties();

			for (Iterator propertyIterator = propertyBeans.iterator(); propertyIterator
					.hasNext();) {
				FormPropertyBean formPropertyBean = (FormPropertyBean) propertyIterator
						.next();

				if (dataModel instanceof Map
						|| PropertyUtils.isReadable(dataModel,
								formPropertyBean.getId())) {
					Object value = PropertyUtils.getProperty(dataModel,
							formPropertyBean.getId());
					this.setValue(formPropertyBean.getId(), value);

				}

				setSubPropertyData(dataModel, formPropertyBean);
			}
		} else {

			if (CollectionUtils.isNotEmpty(property.getSubProperties())) {
				for (Iterator iterator = property.getSubProperties().iterator(); iterator
						.hasNext();) {
					FormPropertyBean subProp = (FormPropertyBean) iterator
							.next();

					if (dataModel instanceof Map
							|| PropertyUtils.isReadable(dataModel,
									subProp.getId())) {

						Object value = PropertyUtils.getProperty(dataModel,
								subProp.getId());
						this.setValue(subProp.getId(), value);

					}

					setSubPropertyData(dataModel, subProp);
				}
			}
		}
	}

	public T getFormDataModel() {
		populdateDataToDataModel(formConfig.getFormProperties());
		return this.formDataModel;
	}

	public GridFormComposite(Composite parent, FormBean aFormConfig) {
		this(parent, aFormConfig, SWT.NONE);
	}

	public GridFormComposite(Composite parent, FormBean aFormConfig,
			int defaultStyle) {
		super(parent, SWT.NONE);
		try {
			this.defaultStyle = defaultStyle;
			initForm(aFormConfig);
		} catch (Exception e) {
			logger.error("GridFormComposite Error", e);
			throw new Error(e);
		}
	}

	protected void initFormLayout(Composite aParent, FormBean aFormConfig)
			throws Exception {
		GridLayout gridLayout = getFormLayoutSeting(aFormConfig);
		gridLayout.horizontalSpacing = 10;
		aParent.setLayout(gridLayout);
	}

	public void addFieldStatusChangeListener(
			IFormFieldStatusChangeListener fieldStatusChangeListener) {
		if (this.fieldStatusChangeListeners.contains(fieldStatusChangeListener) == false) {
			this.fieldStatusChangeListeners.add(fieldStatusChangeListener);
		}
	}

	public void removeFieldStatusChangeListener(
			IFormFieldStatusChangeListener fieldStatusChangeListener) {
		if (this.fieldStatusChangeListeners.contains(fieldStatusChangeListener) == true) {
			this.fieldStatusChangeListeners.remove(fieldStatusChangeListener);
		}
	}

	public void removeAllFieldStatusChangeListener() {
		this.fieldStatusChangeListeners.clear();
	}

	public void addModifyListener(ModifyListener aModifyListener) {
		if (this.modifyListeners.contains(aModifyListener) == false) {
			this.modifyListeners.add(aModifyListener);
		}
	}

	public void removeModifyListener(ModifyListener aModifyListener) {
		if (this.modifyListeners.contains(aModifyListener) == true) {
			this.modifyListeners.remove(aModifyListener);
		}
	}

	public void removeAllModifyListener() {
		this.modifyListeners.clear();
	}

	public void addSelectionListener(SelectionListener selectionListener) {
		if (this.selectionListeners.contains(selectionListener) == false) {
			this.selectionListeners.add(selectionListener);
		}
	}

	public void removeSelectionListener(SelectionListener selectionListener) {
		if (this.selectionListeners.contains(selectionListener) == true) {
			this.selectionListeners.remove(selectionListener);
		}
	}

	public void removeAllSelectionListener() {
		this.selectionListeners.clear();
	}

	protected void initForm(FormBean aFormConfig) throws Exception {

		this.formConfig = aFormConfig;

		initFormOptionListDataProviders(this.listDataProiverMap);

		this.setLayout(new GridLayout());

		Composite composite = new Composite(this, SWT.NONE);

		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		initFormLayout(composite, aFormConfig);

		List formProperties = aFormConfig.getFormProperties();

		for (Iterator iter = formProperties.iterator(); iter.hasNext();) {
			FormPropertyBean property = (FormPropertyBean) iter.next();
			createFormRow(composite, property);
		}

		this.layout();

	}

	public void update() {
		super.update();

		Control[] controls = this.getChildren();

		for (int i = 0; i < controls.length; i++) {
			controls[i].dispose();
		}

		try {
			initForm(this.formConfig);
			if (formDataModel != null) {
				setFormDataModel(formDataModel);
			}
		} catch (Exception e) {
			logger.error(e);
		}

	}

	protected void createFormRow(Composite aParent,
			FormPropertyBean aFormProperty) throws Exception {

		if (FormPropertyTypeConst.TEXT.equals(aFormProperty.getType())) {

			createText(aParent, aFormProperty);

		} else if (FormPropertyTypeConst.CHECKBOX.equals(aFormProperty
				.getType())) {

			createCheckBox(aParent, aFormProperty);

		} else if (FormPropertyTypeConst.HIDDEN.equals(aFormProperty.getType())) {

		} else if (FormPropertyTypeConst.PUSHBUTTON.equals(aFormProperty
				.getType())) {
			createPushBox(aParent, aFormProperty);
		} else if (FormPropertyTypeConst.RADIOBUTTON.equals(aFormProperty
				.getType())) {

			createRadioBox(aParent, aFormProperty);

		} else if (FormPropertyTypeConst.LIST.equals(aFormProperty.getType())) {

			createList(aParent, aFormProperty);

		} else if (FormPropertyTypeConst.COMBOLIST.equals(aFormProperty
				.getType())) {
			if (this.formConfig.getFormModel() == FormBean.VIEW_MODEL) {
				createText(aParent, aFormProperty);
			} else {
				createCombo(aParent, aFormProperty);
			}

		} else if (FormPropertyTypeConst.GROUP.equals(aFormProperty.getType())) {
			createGroup(aParent, aFormProperty);
		} else if (FormPropertyTypeConst.COMBODATE.equals(aFormProperty
				.getType())) {
			if (this.formConfig.getFormModel() == FormBean.VIEW_MODEL) {
				createText(aParent, aFormProperty);
			} else {
				createComboDate(aParent, aFormProperty);
			}
		} else if (FormPropertyTypeConst.REF.equals(aFormProperty.getType())) {
			createRefrenceForm(aParent, aFormProperty);
		} else {
			createOther(aParent, aFormProperty);
		}

		if (FormPropertyTypeConst.REF.equals(aFormProperty.getType()) == false
				&& FormPropertyTypeConst.GROUP.equals(aFormProperty.getType()) == false) {
			formPropertyMap.put(aFormProperty.getId(), aFormProperty);
		}

	}

	protected void createRefrenceForm(Composite aParent,
			FormPropertyBean formProperty) throws Exception {

		String formId = formProperty.getValue();

		FormBean formBean = getRefFormBean(formId);

		if (formBean == null) {
			Label label = new Label(aParent, new Integer(
					getSwtStyle(formProperty)));

			label.setBackground(Display.getCurrent().getSystemColor(
					SWT.COLOR_RED));

			label.setText(formProperty.getType() + ":"
					+ formProperty.getValue());
		} else {

			formBean.setFormModel(this.formConfig.getFormModel());

			List formProperties = formBean.getFormProperties();

			for (Iterator iter = formProperties.iterator(); iter.hasNext();) {
				FormPropertyBean property = (FormPropertyBean) iter.next();
				if (BooleanUtils.isTrue(formProperty.getReadOnly())) {
					property.setReadOnly(Boolean.TRUE);
				}
				createFormRow(aParent, property);
			}
		}

	}

	protected FormBean getRefFormBean(String formId) {
		return UIConfigFactory.getInstance().getFormConfig(formId);
	}

	protected Widget createOther(Composite aParent,
			FormPropertyBean formProperty) throws Exception {

		if (StringUtils.isNotEmpty(formProperty.getTitle())) {
			this.createLabel(aParent, formProperty);
		}

		if (StringUtils.isNotEmpty(formProperty.getType())) {
			try {
				Class beanClass = Thread.currentThread()
						.getContextClassLoader()
						.loadClass(formProperty.getType());

				Widget customerBean = (Widget) ConstructorUtils
						.invokeConstructor(beanClass, new Object[] { aParent,
								new Integer(getSwtStyle(formProperty)) });

				if (customerBean instanceof Control) {
					((Control) customerBean)
							.setLayoutData(getLayoutData(formProperty));
				}

				for (Iterator iter = formProperty.getSubProperties().iterator(); iter
						.hasNext();) {
					FormPropertyBean subProperty = (FormPropertyBean) iter
							.next();
					if (PropertyUtils.isWriteable(customerBean,
							subProperty.getId())) {
						PropertyUtils.setProperty(customerBean,
								subProperty.getId(), subProperty.getValue());
					}
				}

				((IFormPropertyComosite) customerBean).addModifyListener(this);

				this.widgetsMap.put(formProperty.getId(), customerBean);

				return customerBean;
			} catch (Exception e) {
				logger.error(e);
				Label label = new Label(aParent, new Integer(
						getSwtStyle(formProperty)));

				label.setBackground(Display.getCurrent().getSystemColor(
						SWT.COLOR_RED));

				label.setText(formProperty.getType());

				return label;
			}

		} else {
			return null;
		}
	}

	protected GridLayout getFormLayoutSeting(FormBean form) throws Exception {
		GridLayout gridData = new GridLayout();
		if (form.getLayoutDataList().size() == 0) {
			gridData.numColumns = 2;
		} else {

			for (Iterator iter = form.getLayoutDataList().iterator(); iter
					.hasNext();) {
				LayoutDataBean layoutData = (LayoutDataBean) iter.next();
				Field field = GridData.class.getField(layoutData.getName());
				Class fieldType = field.getType();

				try {
					if (fieldType.equals(int.class)) {
						if (StringUtils.isAlpha(layoutData.getValue())) {
							field.setInt(gridData,
									getSwtConst((String) layoutData.getValue()));
						} else if (StringUtils.isNumeric(layoutData.getValue())) {
							field.setInt(gridData,
									NumberUtils.toInt(layoutData.getValue()));
						}

					} else if (fieldType.equals(boolean.class)) {
						field.setBoolean(gridData,
								BooleanUtils.toBoolean(layoutData.getValue()));
					} else {
						field.set(gridData, layoutData.getValue());
					}
				} catch (Exception e) {
					logger.error(e);
				}

			}
		}

		return gridData;

	}

	protected Object getLayoutData(FormPropertyBean formProperty)
			throws Exception {
		GridData gridData = new GridData();

		List<LayoutDataBean> layoutDataBeans = new ArrayList<LayoutDataBean>();

		for (Iterator<LayoutDataBean> iter = formProperty.getLayoutDataList()
				.iterator(); iter.hasNext();) {
			LayoutDataBean layoutData = iter.next();

			if (layoutData.getName().startsWith("status.")) {
				continue;
			}

			layoutDataBeans.add(layoutData);
		}

		if (layoutDataBeans.size() == 0) {
			gridData.horizontalAlignment = GridData.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = GridData.CENTER;

		} else {

			for (Iterator<LayoutDataBean> iter = layoutDataBeans.iterator(); iter
					.hasNext();) {
				LayoutDataBean layoutData = iter.next();

				Field field = GridData.class.getField(layoutData.getName());
				Class fieldType = field.getType();

				if (fieldType.equals(int.class)) {
					if (StringUtils.isAlpha(layoutData.getValue())) {
						field.setInt(gridData,
								getSwtConst((String) layoutData.getValue()));
					} else if (StringUtils.isNumeric(layoutData.getValue())) {
						field.setInt(gridData,
								NumberUtils.toInt(layoutData.getValue()));
					}

				} else if (fieldType.equals(boolean.class)) {
					field.setBoolean(gridData,
							BooleanUtils.toBoolean(layoutData.getValue()));
				} else {
					field.set(gridData, layoutData.getValue());
				}

			}

		}

		return gridData;
	}

	protected void createComboDate(Composite aParent,
			FormPropertyBean formProperty) throws Exception {

		createLabel(aParent, formProperty);

		DateTime comboDate = new DateTime(aParent, SWT.BORDER
				| getSwtStyle(formProperty));
		comboDate.setLayoutData(getLayoutData(formProperty));
		comboDate.setData(formProperty);

		if (BooleanUtils.toBoolean(formProperty.getReadOnly()) == false) {
			comboDate.addSelectionListener(this);
		}

		comboDate.setEnabled(!formProperty.getReadOnly().booleanValue());

		widgetsMap.put(formProperty.getId(), comboDate);

	}

	protected void createCombo(Composite aParent,
			final FormPropertyBean formProperty) throws Exception {

		createLabel(aParent, formProperty);

		Combo combo = new Combo(aParent, getSwtStyle(formProperty));
		combo.setLayoutData(getLayoutData(formProperty));

		combo.addModifyListener(this);

		combo.setData(formProperty);

		if (StringUtils.isNotBlank(formProperty.getDataSrc())) {

			ListDataContainer listDataContainer = UIConfigFactory.getInstance()
					.getListDataConfig(formProperty.getDataSrc());

			final IFormOptionListDataProvider provider = listDataContainer != null ? this.listDataProiverMap
					.get(listDataContainer.getType()) : this.listDataProiverMap
					.get(formProperty.getDataSrc());

			if (provider != null) {

				IComboListProvider comboListProvider = new IComboListProvider() {

					@Override
					public Object[] getDataList() throws Exception {
						return provider
								.getOptionList(formProperty.getDataSrc());
					}

					@Override
					public String getDataLabel(Object dataItem) {
						return provider.getOptionLabel(dataItem);
					}

					@Override
					public boolean isAllowNull() {
						return formProperty.getAllowNull().booleanValue();
					}

					@Override
					public Object getNullValue() {
						return "";
					}

				};

				SWTUtils.fillCommboBox(combo, comboListProvider);
			}

		}

		widgetsMap.put(formProperty.getId(), combo);

	}

	protected void createList(Composite aParent, FormPropertyBean formProperty)
			throws Exception {

		createLabel(aParent, formProperty);

		org.eclipse.swt.widgets.List list = new org.eclipse.swt.widgets.List(
				this, SWT.BORDER | getSwtStyle(formProperty));

		if (BooleanUtils.toBoolean(formProperty.getReadOnly()) == false) {
			list.addSelectionListener(this);
		}

		list.setLayoutData(getLayoutData(formProperty));

		widgetsMap.put(formProperty.getId(), list);

	}

	protected void createGroup(Composite aParent, FormPropertyBean formProperty)
			throws Exception {

		Group group = new Group(aParent, getSwtStyle(formProperty));

		GridLayout gridLayout = new GridLayout();

		if (StringUtils.isNotBlank(formProperty.getValue())) {
			String[] styles = StringUtils.split(formProperty.getValue(), "|");
			for (int i = 0; i < styles.length; i++) {
				String style = styles[i];
				if (style.contains("numColumns")) {
					gridLayout.numColumns = Integer.parseInt(StringUtils.split(
							style, "=")[1]);
				}
			}
		} else {
			gridLayout.numColumns = 2;
		}

		group.setLayout(gridLayout);

		group.setLayoutData(getLayoutData(formProperty));

		if (StringUtils.isNotEmpty(formProperty.getTitle())) {
			group.setText(formProperty.getTitle());
		}

		if (StringUtils.isNotEmpty(formProperty.getTipInfo())) {
			group.setText(formProperty.getTitle() + "("
					+ formProperty.getTipInfo() + ")");
		}

		for (Iterator iter = formProperty.getSubProperties().iterator(); iter
				.hasNext();) {
			FormPropertyBean subProperty = (FormPropertyBean) iter.next();
			if (BooleanUtils.isTrue(formProperty.getReadOnly())) {
				subProperty.setReadOnly(Boolean.TRUE);
			}
			createFormRow(group, subProperty);
		}

	}

	protected void createCheckBox(Composite aParent,
			FormPropertyBean aFormProperty) throws Exception {

		Label label = createLabel(aParent, aFormProperty);

		final Button button = new Button(aParent, SWT.CHECK
				| getSwtStyle(aFormProperty));

		button.setLayoutData(getLayoutData(aFormProperty));

		if (BooleanUtils.toBoolean(aFormProperty.getReadOnly()) == false) {
			button.addSelectionListener(this);
		}

		widgetsMap.put(aFormProperty.getId(), button);
	}

	protected void createRadioBox(Composite aParent,
			FormPropertyBean aFormProperty) throws Exception {

		Button button = new Button(aParent, SWT.RADIO
				| getSwtStyle(aFormProperty));
		button.setText(aFormProperty.getTitle());
		button.setLayoutData(getLayoutData(aFormProperty));

		widgetsMap.put(aFormProperty.getId(), button);
	}

	protected void createHidden(Composite aParent,
			FormPropertyBean aFormProperty) throws Exception {

		this.setData(aFormProperty.getId(), aFormProperty.getValue());

	}

	protected void createPushBox(Composite aParent,
			FormPropertyBean aFormProperty) throws Exception {

		Button button = new Button(aParent, SWT.PUSH
				| getSwtStyle(aFormProperty));
		button.setText(aFormProperty.getTitle());
		button.setLayoutData(getLayoutData(aFormProperty));

		button.setData(aFormProperty);

		button.addSelectionListener(this);

		widgetsMap.put(aFormProperty.getId(), button);
	}

	protected Label createLabel(Composite aParent,
			FormPropertyBean aFormProperty) throws Exception {

		if (StringUtils.isBlank(aFormProperty.getTitle())
				&& StringUtils.isBlank(aFormProperty.getTitleKey())) {
			return null;
		}

		GridData gridData = new org.eclipse.swt.layout.GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		if ("textarea".equalsIgnoreCase(aFormProperty.getType())) {
			gridData.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		} else {
			gridData.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		}

		Label label = new Label(aParent, SWT.NONE);

		String labelText = UIConfigFactory.getInstance().getLocalMessage(
				aFormProperty.getTitleKey(), aFormProperty.getTitle(),
				LocalHelper.getLocale());

		label.setText(labelText);

		if (BooleanUtils.isFalse(aFormProperty.getAllowNull())) {

			ControlDecoration requireDecoration = new ControlDecoration(label,
					SWT.LEFT);

			requireDecoration.setImage(FieldDecorationRegistry.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_REQUIRED)
					.getImage());
		}

		if (StringUtils.isNotBlank(aFormProperty.getTipInfo())) {
			ControlDecoration tipDecoration = new ControlDecoration(label,
					SWT.RIGHT);

			tipDecoration
					.setImage(FieldDecorationRegistry
							.getDefault()
							.getFieldDecoration(
									FieldDecorationRegistry.DEC_INFORMATION)
							.getImage());

			String tipText = UIConfigFactory.getInstance().getLocalMessage(
					aFormProperty.getTipInfo(), aFormProperty.getTipInfo(),
					LocalHelper.getLocale());

			tipDecoration.setDescriptionText(tipText);
		}

		label.setLayoutData(gridData);

		return label;
	}

	protected void createText(Composite aParent,
			final FormPropertyBean aFormProperty) throws Exception {

		createLabel(aParent, aFormProperty);

		int style = getSwtStyle(aFormProperty);

		style = style | SWT.BORDER;

		Text text = new Text(aParent, style);

		text.setLayoutData(getLayoutData(aFormProperty));

		if (StringUtils.isNotBlank(aFormProperty.getDataSrc())) {

			ListDataContainer listDataContainer = UIConfigFactory.getInstance()
					.getListDataConfig(aFormProperty.getDataSrc());

			final IFormOptionListDataProvider provider = listDataContainer != null ? this.listDataProiverMap
					.get(listDataContainer.getType()) : this.listDataProiverMap
					.get(aFormProperty.getDataSrc());

			if (provider != null) {

				Object[] dataList = provider.getOptionList(aFormProperty
						.getDataSrc());

				for (int i = 0; i < dataList.length; i++) {
					String label = provider.getOptionLabel(dataList[i]);
					Object data = provider.getOptionData(dataList[i]);
					text.setData(String.valueOf(data), label);
				}
			}

		}

		if (BooleanUtils.toBoolean(aFormProperty.getReadOnly()) == false) {

			text.addModifyListener(this);
		}

		text.setData(SWTUtils.CUSTOM_WIDGET_ID, aFormProperty.getId());

		widgetsMap.put(aFormProperty.getId(), text);
	}

	protected int getSwtConst(String aField) throws Exception {
		if (StringUtils.isBlank(aField)) {
			return SWT.NONE;
		} else {
			Field field = SWT.class.getDeclaredField(StringUtils
					.trimToEmpty(aField));
			return field.getInt(new SWT());
		}

	}

	protected int getSwtStyle(FormPropertyBean formProperty) throws Exception {

		String[] styles = StringUtils.split(formProperty.getStyleDesc(), "|");

		int swtStyle = this.defaultStyle;

		if (styles == null) {
			return swtStyle;
		}

		for (int i = 0; i < styles.length; i++) {
			String style = styles[i];

			swtStyle = swtStyle | getSwtConst(style);
		}

		if (formProperty.getReadOnly().booleanValue()) {
			swtStyle = swtStyle | SWT.READ_ONLY;
		}

		return swtStyle;
	}

	public Widget getWidget(String aId) {
		return (Widget) this.widgetsMap.get(aId);
	}

	public boolean isReadonly(String aId) {
		List properties = formConfig.getFormProperties();

		boolean flag = false;

		for (Iterator iter = properties.iterator(); iter.hasNext();) {
			FormPropertyBean property = (FormPropertyBean) iter.next();
			if (property.getId().equals(aId)
					&& property.getReadOnly().booleanValue()) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	public void setValue(String aId, Object aValue) {

		Widget widget = getWidget(aId);

		if (widget != null) {
			if (widget instanceof Text) {

				if (aValue != null) {
					Object data = widget.getData(String.valueOf(aValue));

					if (data == null) {
						if (aValue instanceof Date) {
							if ((widget.getStyle() & SWT.DATE) != 0) {
								((Text) widget).setText(DateFormatUtils.format(
										(Date) aValue, "yyyy-MM-dd"));
							} else if ((widget.getStyle() & SWT.TIME) != 0) {
								((Text) widget).setText(DateFormatUtils.format(
										(Date) aValue, "HH:mm:ss"));
							}
						} else {
							((Text) widget).setText(String.valueOf(aValue));
						}

					} else {
						((Text) widget).setText(String.valueOf(data));
					}

				} else {
					((Text) widget).setText("");
				}

			} else if (widget instanceof Label) {
				if (aValue != null) {
					Object data = widget.getData(String.valueOf(aValue));

					if (data == null) {
						((Label) widget).setText(String.valueOf(aValue));
					} else {
						((Label) widget).setText(String.valueOf(data));
					}

				} else {
					((Label) widget).setText("");
				}
			} else if (widget instanceof Button) {
				if (aValue != null && aValue instanceof Boolean) {
					((Button) widget).setSelection(BooleanUtils
							.toBoolean((Boolean) aValue));
				} else if (aValue != null && aValue instanceof String) {
					((Button) widget).setSelection(BooleanUtils
							.toBoolean((String) aValue));
				} else {
					((Button) widget).setSelection(false);
				}

			} else if (widget instanceof Combo) {

				Combo combo = (Combo) widget;

				if (aValue != null) {

					String[] items = combo.getItems();

					boolean founded = false;

					for (int i = 0; i < items.length; i++) {
						String string = items[i];

						if (combo.getData(string) != null) {

							Object data = combo.getData(string);

							if (data instanceof ListData) {
								data = ((ListData) data).getData();
							}

							FormPropertyBean propertyConfig = getFormPropertyConfig(aId);

							if (StringUtils.isNotEmpty(propertyConfig
									.getDataType())) {
								try {
									data = ConvertUtils.convert(data, Class
											.forName(propertyConfig
													.getDataType()));
									if (data == null) {
										combo.select(0);
									} else if (data.equals(aValue)) {
										combo.setText(string);
										founded = true;
									}
								} catch (ClassNotFoundException e) {
									logger.error("ClassNotFoundException", e);
								}
							} else if (data.equals(aValue)) {
								combo.setText(string);
								founded = true;
							}

						}
					}

					if (founded == false) {
						combo.setText(String.valueOf(aValue));
					}

				} else {
					((Combo) widget).select(0);
				}

			} else if (widget instanceof DateTime && aValue != null) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime((Date) aValue);
				((DateTime) widget).setDate(calendar.get(Calendar.YEAR),
						calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DATE));

				((DateTime) widget).setTime(calendar.get(Calendar.HOUR_OF_DAY),
						calendar.get(Calendar.MINUTE),
						calendar.get(Calendar.SECOND));

			} else if (widget instanceof IFormPropertyComosite) {
				((IFormPropertyComosite<T>) widget)
						.setFormDataModel(this.formDataModel);
				((IFormPropertyComosite<T>) widget).setValue(aId, aValue);
			}

			fireFormFieldStatusChanged(new TypedEvent(widget));
		}
	}

	public Object getValue(String aId) {
		Widget widget = getWidget(aId);
		Object value = null;
		if (widget != null) {
			if (widget instanceof Text) {

				Object data = widget.getData(((Text) widget).getText());

				if (data != null) {
					value = ((Text) widget).getText();
				} else {
					value = ((Text) widget).getText();
				}

			} else if (widget instanceof Label) {

				Object data = widget.getData(((Label) widget).getText());

				if (data != null) {
					value = ((Label) widget).getText();
				} else {
					value = ((Label) widget).getText();
				}
			} else if (widget instanceof Button) {

				value = BooleanUtils.toBooleanObject(((Button) widget)
						.getSelection());

			} else if (widget instanceof Combo) {
				Combo combo = (Combo) widget;

				value = combo.getText();

				FormPropertyBean formPropertyBean = (FormPropertyBean) combo
						.getData();

				if (combo.getData(String.valueOf(value)) != null) {
					value = combo.getData(String.valueOf(value));

					if (value instanceof ListData) {
						value = ((ListData) value).getData();
					} else if (StringUtils.isNotBlank(formPropertyBean
							.getDataSrc())) {
						ListDataContainer listDataContainer = UIConfigFactory
								.getInstance().getListDataConfig(
										formPropertyBean.getDataSrc());

						try {
							value = PropertyUtils.getProperty(value,
									listDataContainer.getDataProperty());
						} catch (Exception e) {
							logger.error("get data value error", e);
							return null;
						}

					}
				}
			} else if (widget instanceof DateTime) {
				Calendar calendar = Calendar.getInstance();
				calendar.set(((DateTime) widget).getYear(),
						((DateTime) widget).getMonth(),
						((DateTime) widget).getDay(),
						((DateTime) widget).getHours(),
						((DateTime) widget).getMinutes(),
						((DateTime) widget).getSeconds());
				value = calendar.getTime();
			} else if (widget instanceof IFormPropertyComosite) {
				value = ((IFormPropertyComosite) widget).getValue(aId);
			}
		}

		FormPropertyBean propertyConfig = getFormPropertyConfig(aId);

		if (StringUtils.isNotEmpty(propertyConfig.getDataType())) {
			try {

				if (BigDecimal.class.equals(Class.forName(propertyConfig
						.getDataType()))
						&& StringUtils.isEmpty(String.valueOf(value))) {

					return null;

				} else {

					return ConvertUtils.convert(String.valueOf(value),
							Class.forName(propertyConfig.getDataType()));
				}

			} catch (ClassNotFoundException e) {
				logger.error("ClassNotFoundException", e);
				return null;
			} catch (java.lang.NumberFormatException e) {
				logger.warn("NumberFormatException", e);
				return null;
			}
		} else {
			return value;
		}

	}

	public FormBean getFormConfig() {
		return this.formConfig;
	}

	public FormPropertyBean getFormPropertyConfig(String aPropertyId) {
		FormPropertyBean property = this.formPropertyMap.get(aPropertyId);
		return property;
	}

	public void dispose() {
		this.widgetsMap.clear();
		super.dispose();
	}

	public void widgetSelected(SelectionEvent e) {

		for (Iterator iter = this.selectionListeners.iterator(); iter.hasNext();) {
			SelectionListener element = (SelectionListener) iter.next();
			element.widgetSelected(e);
		}
		fireFormFieldStatusChanged(e);

	}

	protected void fireFormFieldStatusChanged(TypedEvent e) {
		for (Iterator<IFormFieldStatusChangeListener> iterator = this.fieldStatusChangeListeners
				.iterator(); iterator.hasNext();) {
			IFormFieldStatusChangeListener fieldStatusChangeListener = iterator
					.next();

			fieldStatusChangeListener.fieldStatusChanged(
					(String) e.widget.getData(SWTUtils.CUSTOM_WIDGET_ID),
					this.widgetsMap);

		}
	}

	public void widgetDefaultSelected(SelectionEvent e) {
		for (Iterator iter = this.selectionListeners.iterator(); iter.hasNext();) {
			SelectionListener element = (SelectionListener) iter.next();
			element.widgetDefaultSelected(e);
		}
		fireFormFieldStatusChanged(e);
	}

	public void modifyText(ModifyEvent e) {
		if (this.isModifyListenerEnable()) {
			for (Iterator iter = this.modifyListeners.iterator(); iter
					.hasNext();) {
				ModifyListener element = (ModifyListener) iter.next();
				element.modifyText(e);
			}
		}
		fireFormFieldStatusChanged(e);
	}

	public void validate() throws Exception {
		List properties = this.formConfig.getFormProperties();

		StringBuffer errorMsg = new StringBuffer();

		for (Iterator iter = properties.iterator(); iter.hasNext();) {
			FormPropertyBean property = (FormPropertyBean) iter.next();
			if (BooleanUtils.isFalse(property.getAllowNull())) {

				if (errorDecorationMap.containsKey(property.getId())) {
					errorDecorationMap.get(property.getId()).dispose();
					errorDecorationMap.remove(property.getId());
				}

				if (this.getValue(property.getId()) == null
						|| StringUtils.isBlank(this.getValue(property.getId())
								.toString())) {
					if (StringUtils.isNotBlank(errorMsg.toString())) {
						errorMsg.append("\n");
					}
					errorMsg.append("'").append(property.getTitle())
							.append("'不能为空");

					ControlDecoration errorDecoration = new ControlDecoration(
							(Control) getWidget(property.getId()), SWT.LEFT);

					errorDecoration.setImage(FieldDecorationRegistry
							.getDefault()
							.getFieldDecoration(
									FieldDecorationRegistry.DEC_ERROR)
							.getImage());

					errorDecoration.setDescriptionText("不能为空");

					errorDecorationMap.put(property.getId(), errorDecoration);

				}
			}
		}
		if (StringUtils.isNotBlank(errorMsg.toString())) {
			throw new Exception(errorMsg.toString());
		}

	}

	protected void populdateDataToDataModel(
			List<FormPropertyBean> formProperties) {

		T dataModel = this.formDataModel;

		try {

			for (Iterator iter = formProperties.iterator(); iter.hasNext();) {
				FormPropertyBean property = (FormPropertyBean) iter.next();

				if (property.getType().equals(FormPropertyTypeConst.GROUP) == false
						&& property.getType().equals(FormPropertyTypeConst.REF) == false) {

					if (dataModel instanceof Map
							|| PropertyUtils.isWriteable(dataModel,
									property.getId())) {
						Object value = this.getValue(property.getId());

						if (dataModel instanceof Map) {
							PropertyUtils.setProperty(dataModel,
									property.getId(), value);
						} else {
							PropertyUtils.setProperty(dataModel, property
									.getId(), ConvertUtils.convert(value,
									PropertyUtils.getPropertyType(dataModel,
											property.getId())));
						}

					}

				} else if (property.getType().equals(FormPropertyTypeConst.REF)) {
					FormBean refFormBean = getRefFormBean(property.getValue());
					populdateDataToDataModel(refFormBean.getFormProperties());
				}

				if (property.getSubProperties() != null) {
					populdateDataToDataModel(property.getSubProperties());
				}
			}

		} catch (Exception ex) {
			logger.error("populdate data error", ex);
			IStatus status = new Status(IStatus.ERROR, "UI Form", 10,
					"populdate data error", ex);
			ErrorDialog.openError(this.getShell(), "populdate data error",
					ex.getLocalizedMessage(), status);
		}
	}

	public boolean isModifyListenerEnable() {
		return modifyListenerEnable;
	}

	public void setModifyListenerEnable(boolean modifyListenerEnable) {
		this.modifyListenerEnable = modifyListenerEnable;
	}

	public void setReadOnly(boolean falg) {
		Collection<Widget> widgets = this.widgetsMap.values();

		for (Iterator<Widget> iterator = widgets.iterator(); iterator.hasNext();) {
			Widget widget = iterator.next();
			if (widget.isDisposed() == false && widget instanceof Control) {
				((Control) widget).setEnabled(!falg);
			}
		}
	}

	public String getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(String formStatus) {

		this.formStatus = formStatus;

		for (Iterator<String> iterator = this.widgetsMap.keySet().iterator(); iterator
				.hasNext();) {
			String formPropertyId = iterator.next();

			FormPropertyBean propertyBean = this.formConfig
					.getFormProperty(formPropertyId);

			if (propertyBean == null) {
				continue;
			}

			LayoutDataBean readOnlyStatus = propertyBean
					.getLayoutData("status.readOnly");

			if (readOnlyStatus != null) {
				((Control) this.widgetsMap.get(formPropertyId))
						.setEnabled(!readOnlyStatus.getValue().equals(
								this.formStatus));
			}

		}
	}

	protected class WidgetMap extends HashMap<String, Widget> {

		@Override
		public Widget put(String key, Widget value) {
			value.setData(SWTUtils.CUSTOM_WIDGET_ID, key);
			return super.put(key, value);
		}

	}

}
