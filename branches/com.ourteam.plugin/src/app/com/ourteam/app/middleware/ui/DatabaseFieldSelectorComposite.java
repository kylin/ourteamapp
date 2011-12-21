package com.ourteam.app.middleware.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.table.TableViewComposite;

import org.apache.commons.lang.ArrayUtils;
import org.apache.ddlutils.model.Column;
import org.apache.ddlutils.model.Table;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class DatabaseFieldSelectorComposite extends Composite {
	// databaseColumnListTable
	private Table[] tables;

	private Map<String, List<String>> excludeColumns = new HashMap<String, List<String>>();

	private Map<String, List<Column>> selectedColumns = new HashMap<String, List<Column>>();

	private TableViewComposite<Column> availableColumnTableViewComposite;

	private TableViewComposite<Column> selectedColumnTableViewComposite;

	private Combo tableComboList;

	private Button addButton;

	private Button removeButton;

	public DatabaseFieldSelectorComposite(Composite parent) {
		super(parent, SWT.NONE);
		createUI();
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		this.selectedColumnTableViewComposite.getTableViewer()
				.addSelectionChangedListener(listener);
		this.availableColumnTableViewComposite.getTableViewer()
				.addSelectionChangedListener(listener);
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		this.selectedColumnTableViewComposite.getTableViewer()
				.removeSelectionChangedListener(listener);
		this.availableColumnTableViewComposite.getTableViewer()
				.removeSelectionChangedListener(listener);
	}

	public void addExcludeColumns(String tableName, List<String> columnNames) {
		excludeColumns.put(tableName, columnNames);
	}

	protected void createUI() {

		setLayout(new GridLayout());

		Composite tableSelectComposite = new Composite(this, SWT.NONE);

		tableSelectComposite.setLayout(new GridLayout(2, false));

		tableSelectComposite.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));

		Label label = new Label(tableSelectComposite, SWT.NONE);

		label.setText("选择数据表");

		tableComboList = new Combo(tableSelectComposite, SWT.READ_ONLY
				| SWT.BORDER);

		tableComboList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		tableComboList.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateAvailableColumns(tables[tableComboList
						.getSelectionIndex()]);
			}

		});

		Composite fieldSelectComposite = new Composite(this, SWT.NONE);

		fieldSelectComposite.setLayout(new GridLayout(3, false));

		fieldSelectComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Group leftGroup = new Group(fieldSelectComposite, SWT.NONE);

		leftGroup.setText("可选字段");

		leftGroup.setLayout(new FillLayout());

		leftGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite leftComposite = new Composite(leftGroup, SWT.NONE);

		Composite toolbarComposite = new Composite(fieldSelectComposite,
				SWT.NONE);

		toolbarComposite.setLayout(new GridLayout());

		toolbarComposite.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		GridData gridData = new GridData(GridData.FILL_VERTICAL);

		gridData.widthHint = 10;

		new Composite(toolbarComposite, SWT.NONE).setLayoutData(gridData);

		addButton = new Button(toolbarComposite, SWT.NONE);

		addButton.setText("添加");

		addButton.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER
				| GridData.HORIZONTAL_ALIGN_CENTER));

		addButton.setEnabled(false);

		addButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addSelectedColumns();
			}

		});

		removeButton = new Button(toolbarComposite, SWT.NONE);

		removeButton.setText("删除");

		removeButton.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER
				| GridData.HORIZONTAL_ALIGN_CENTER));

		removeButton.setEnabled(false);

		removeButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSelectedColumns();
			}

		});

		new Composite(toolbarComposite, SWT.NONE).setLayoutData(gridData);

		Group rightGroup = new Group(fieldSelectComposite, SWT.NONE);

		rightGroup.setText("已选字段");

		rightGroup.setLayout(new FillLayout());

		rightGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite rightComposite = new Composite(rightGroup, SWT.NONE);

		createLeftArea(leftComposite);

		createRightArea(rightComposite);

	}

	private void createLeftArea(Composite leftComposite) {

		leftComposite.setLayout(new GridLayout());

		availableColumnTableViewComposite = new TableViewComposite<Column>(
				leftComposite, UIConfigFactory.getInstance().getTableConfig(
						"databaseColumnListTable"), SWT.BORDER | SWT.MULTI);

		availableColumnTableViewComposite.setLayoutData(new GridData(
				GridData.FILL_BOTH));

		availableColumnTableViewComposite.getTableViewer()
				.addDoubleClickListener(new IDoubleClickListener() {

					@Override
					public void doubleClick(DoubleClickEvent event) {
						addSelectedColumns();
					}
				});

		availableColumnTableViewComposite.getTableViewer()
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						addButton.setEnabled(availableColumnTableViewComposite
								.getSelectedDataList().isEmpty() == false);
					}
				});

	}

	private void createRightArea(Composite rightComposite) {

		rightComposite.setLayout(new GridLayout());

		selectedColumnTableViewComposite = new TableViewComposite<Column>(
				rightComposite, UIConfigFactory.getInstance().getTableConfig(
						"databaseColumnListTable"), SWT.BORDER | SWT.MULTI);

		selectedColumnTableViewComposite.setLayoutData(new GridData(
				GridData.FILL_BOTH));

		selectedColumnTableViewComposite.getTableViewer()
				.addDoubleClickListener(new IDoubleClickListener() {

					@Override
					public void doubleClick(DoubleClickEvent event) {
						removeSelectedColumns();
					}
				});

		selectedColumnTableViewComposite.getTableViewer()
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						removeButton
								.setEnabled(selectedColumnTableViewComposite
										.getSelectedDataList().isEmpty() == false);
					}
				});
	}

	private void addSelectedColumns() {
		List<Column> columns = this.availableColumnTableViewComposite
				.getSelectedDataList();

		List<Column> tempColumns = this.selectedColumnTableViewComposite
				.getDataList();

		for (Iterator<Column> iterator = columns.iterator(); iterator.hasNext();) {
			Column column = iterator.next();
			if (tempColumns.contains(column) == false) {
				tempColumns.add(column);
			}
		}

		this.selectedColumns.put(this.tableComboList.getText(), tempColumns);

		this.selectedColumnTableViewComposite.setDataList(tempColumns);

		this.selectedColumnTableViewComposite.setSelection(tempColumns);
	}

	private void removeSelectedColumns() {

		this.selectedColumnTableViewComposite.removeSelectedRows();

		this.selectedColumns.put(this.tableComboList.getText(),
				this.selectedColumnTableViewComposite.getDataList());
	}

	public void setTables(Table[] tables) {
		this.tables = tables;

		this.tableComboList.removeAll();

		this.availableColumnTableViewComposite.removeAllRows();

		if (ArrayUtils.isNotEmpty(tables)) {

			for (int i = 0; i < tables.length; i++) {
				Table table = tables[i];
				tableComboList.add(table.getName());
			}

			this.tableComboList.select(0);

			updateAvailableColumns(tables[0]);

		}

	}

	protected void updateAvailableColumns(Table table) {

		Column[] columns = table.getColumns();

		List<String> excludeColumnNames = this.excludeColumns.get(table
				.getName());

		List<Column> availableColumns = new ArrayList<Column>();

		for (int i = 0; i < columns.length; i++) {
			Column column = columns[i];
			if (excludeColumnNames.contains(column.getName()) == false) {
				availableColumns.add(column);
			}
		}

		this.availableColumnTableViewComposite.setDataList(availableColumns);

		if (this.selectedColumns.containsKey(table.getName())) {
			this.selectedColumnTableViewComposite
					.setDataList(this.selectedColumns.get(table.getName()));
		} else {
			this.selectedColumnTableViewComposite.setDataList(new Column[0]);
		}
	}

	public Map<String, List<Column>> getSelectedColumns() {

		return this.selectedColumns;
	}

}
