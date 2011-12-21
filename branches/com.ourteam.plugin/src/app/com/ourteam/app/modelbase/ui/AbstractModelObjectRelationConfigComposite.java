package com.ourteam.app.modelbase.ui;

import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.table.TableBean;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.ourteam.app.modelbase.editor.BusinessPropertyComboListProvider;
import com.ourteam.app.modelbase.editor.ObjectPropertyRelationDataModel;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;

abstract public class AbstractModelObjectRelationConfigComposite extends
		AbstractComposite implements ISelectionChangedListener {

	private Combo propertyCombo;

	private Combo relatedPropertyCombo;

	private TableViewComposite<ObjectPropertyRelationDataModel> relationTableComposite;

	private ToolBarComposite toolBarComposite;

	private boolean canMultiEstablishRelation = true;

	abstract protected ObjectRelationAttrTypeEnum getObjectRelationAttrTypeEnum();

	public AbstractModelObjectRelationConfigComposite(Composite parent,
			int style) {
		super(parent, style);
	}

	protected void createContent(Composite parent) {
		parent.setLayout(new GridLayout());

		Composite propertiyListPanel = new Composite(this, SWT.NONE);

		propertiyListPanel
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		propertiyListPanel.setLayout(new FillLayout());

		Group propertiyListGroup = new Group(propertiyListPanel, SWT.NONE);
		propertiyListGroup.setLayout(new GridLayout(3, false));

		if (ObjectRelationAttrTypeEnum.MAPPED
				.equals(getObjectRelationAttrTypeEnum())) {
			propertiyListGroup.setText("选择映射属性");
		} else if (ObjectRelationAttrTypeEnum.RELATED
				.equals(getObjectRelationAttrTypeEnum())) {
			propertiyListGroup.setText("选择关联属性");
		}

		Label propertyComboLabel = new Label(propertiyListGroup, SWT.NONE);

		propertyComboLabel.setText("对象属性");

		new Label(propertiyListGroup, SWT.NONE);

		Label relatedPropertyComboLabel = new Label(propertiyListGroup,
				SWT.NONE);

		if (ObjectRelationAttrTypeEnum.MAPPED
				.equals(getObjectRelationAttrTypeEnum())) {
			relatedPropertyComboLabel.setText("映射对象属性");
		} else if (ObjectRelationAttrTypeEnum.RELATED
				.equals(getObjectRelationAttrTypeEnum())) {
			relatedPropertyComboLabel.setText("关联对象属性");
		}

		propertyCombo = new Combo(propertiyListGroup, SWT.READ_ONLY);

		propertyCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button addRelationBut = new Button(propertiyListGroup, SWT.PUSH);

		addRelationBut.setText(" = ");

		addRelationBut.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addPropertyRelation();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				addPropertyRelation();
			}
		});

		relatedPropertyCombo = new Combo(propertiyListGroup, SWT.READ_ONLY);

		relatedPropertyCombo.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));

		Composite relationListPanel = new Composite(this, SWT.NONE);

		relationListPanel.setLayoutData(new GridData(GridData.FILL_BOTH));

		relationListPanel.setLayout(new FillLayout());

		Group relationListGroup = new Group(relationListPanel, SWT.NONE);

		relationListGroup.setLayout(new GridLayout());

		if (ObjectRelationAttrTypeEnum.MAPPED
				.equals(getObjectRelationAttrTypeEnum())) {
			relationListGroup.setText("属性映射列表");
		} else if (ObjectRelationAttrTypeEnum.RELATED
				.equals(getObjectRelationAttrTypeEnum())) {
			relationListGroup.setText("属性关联列表");
		}

		Composite toolBarPanel = new Composite(relationListGroup, SWT.NONE);

		toolBarPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		toolBarPanel.setLayout(new FillLayout());

		TableBean tableBean = UIConfigFactory.getInstance().getTableConfig(
				"propertyRelatedTable");

		relationTableComposite = new TableViewComposite<ObjectPropertyRelationDataModel>(
				relationListGroup, tableBean, SWT.MULTI | SWT.BORDER);

		relationTableComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		relationTableComposite.getTableViewer().addSelectionChangedListener(
				this);

		ActionGroupBean[] actionGroupBeans = new ActionGroupBean[] { UIConfigFactory
				.getInstance().getActionGroupConfig(
						"defaultRemoveRelationActionGroup") };

		toolBarComposite = new ToolBarComposite(toolBarPanel, actionGroupBeans,
				new AbstractDispatchActionHandler() {

					@Override
					public boolean isActionEnable(ActionBean aAction) {
						boolean flag = true;
						if (relationTableComposite.getSelectedDataList()
								.isEmpty()) {
							return false;
						} else {
							return true && flag;
						}
					}

					@Override
					public void doAction(ActionEvent actionEvent) throws Exception {
						removePropertyRelation();
					}

				}, SWT.FLAT | SWT.HORIZONTAL);
		
		toolBarComposite.update();

	}

	public Combo getPropertyCombo() {
		return propertyCombo;
	}

	public Combo getRelatedPropertyCombo() {
		return relatedPropertyCombo;
	}

	protected void addPropertyRelation() {
		ObjectPropertyBean propertyBean = (ObjectPropertyBean) SWTUtils
				.getCommboBoxSelectedData(this.propertyCombo);

		if (propertyBean == null) {
			return;
		}

		ObjectPropertyBean relatedPropertyBean = (ObjectPropertyBean) SWTUtils
				.getCommboBoxSelectedData(this.relatedPropertyCombo);

		ObjectPropertyRelationDataModel propertyRelationDataModel = new ObjectPropertyRelationDataModel(
				propertyBean, relatedPropertyBean);

		propertyRelationDataModel
				.setRelationAttrTypeEnum(getObjectRelationAttrTypeEnum());

		this.relationTableComposite.addRow(propertyRelationDataModel);

		if (isCanMultiEstablishRelation() == false) {
			this.propertyCombo.remove(this.propertyCombo.getSelectionIndex());
			if (this.propertyCombo.getItemCount() > 0) {
				this.propertyCombo.select(0);
			}
		}

	}

	protected void removePropertyRelation() throws Exception{
		if (isCanMultiEstablishRelation() == false) {

			List<ObjectPropertyRelationDataModel> selectedList = this.relationTableComposite
					.getSelectedDataList();

			ObjectPropertyBean[] propertiesBeans = new ObjectPropertyBean[selectedList
					.size()];

			int index = 0;

			for (Iterator<ObjectPropertyRelationDataModel> iterator = selectedList
					.iterator(); iterator.hasNext();) {
				ObjectPropertyRelationDataModel object = iterator.next();

				propertiesBeans[index++] = object.getObjectPropertyBean();
			}

			SWTUtils.appendCommboBox(this.propertyCombo,
					new BusinessPropertyComboListProvider(propertiesBeans));

		}
		this.relationTableComposite.removeSelectedRows();
	}

	public void clearPropertyRelation() {
		this.relationTableComposite.removeAllRows();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (this.toolBarComposite != null) {
			this.toolBarComposite.update();
		}
	}

	public ObjectPropertyRelationDataModel[] getObjectPropertyRelations() {
		List<ObjectPropertyRelationDataModel> list = this.relationTableComposite
				.getDataList();

		return list.toArray(new ObjectPropertyRelationDataModel[list.size()]);
	}

	public TableViewComposite<ObjectPropertyRelationDataModel> getRelationTableComposite() {
		return relationTableComposite;
	}

	public boolean isCanMultiEstablishRelation() {
		return canMultiEstablishRelation;
	}

	public void setCanMultiEstablishRelation(boolean canMultiEstablishRelation) {
		this.canMultiEstablishRelation = canMultiEstablishRelation;
	}

}
