package net.ui.eclipse.table;

import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.common.AbstractContentViewerComposite;
import net.ui.eclipse.utils.IComboListProvider;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.table.ColumnBean;
import net.ui.model.table.ColumnDataBean;
import net.ui.model.table.TableBean;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class TableViewComposite<T> extends AbstractContentViewerComposite
		implements ICellModifier {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(TableViewComposite.class);

	private Table table = null;

	private TableBean tableConfig;

	private TableViewer tableViewer;

	private List<String> canEditColumns = new ArrayList<String>();

	private List<String> showValueColumns = new ArrayList<String>();

	private List<String> columnProperties = new ArrayList<String>();

	private List<String> columnNames = new ArrayList<String>();

	private Map<String, ListData[]> listDataMap = new HashMap<String, ListData[]>();

	private ColumnBean[] columns = null;

	private int tableStyle = SWT.NONE;

	private List<TableCompositeListener> listener = new ArrayList<TableCompositeListener>();

	private List<TableCompositInputChangListener> tableCompositInputChangListeners = new ArrayList<TableCompositInputChangListener>();

	private List<ISortListener> sortListeners = new ArrayList<ISortListener>();

	private List<ITableCellListener<T>> tableCellListeners = new ArrayList<ITableCellListener<T>>();

	private ToolBarComposite headToolBarComposite;

	private ToolBarComposite footToolBarComposite;

	private boolean editable = false;

	public TableViewComposite(Composite parent, TableBean aTableConfig,
			int style) {
		this(parent, aTableConfig, style, false);
	}

	public TableViewComposite(Composite parent, TableBean aTableConfig,
			int style, boolean editable) {
		super(parent, SWT.NONE);
		tableStyle = style;
		tableConfig = aTableConfig;
		this.editable = editable;
		ColumnBean[] extendColumns = null;

		if (StringUtils.isNotEmpty(tableConfig.getExtend())) {
			TableBean extendTableConfig = tableConfig.getTableConfig()
					.getTable(tableConfig.getExtend());
			extendColumns = extendTableConfig.getColumns();
		} else {
			extendColumns = new ColumnBean[0];
		}

		columns = (ColumnBean[]) ArrayUtils.addAll(extendColumns,
				this.tableConfig.getColumns());

		try {
			initialize();
		} catch (Exception e) {
			logger.error("initialize Table Error", e);
			throw new Error(e);
		}
	}

	private void initialize() throws Exception {
		createTable();

	}

	public void addTableListener(TableCompositeListener aListener) {
		this.listener.add(aListener);
	}

	public void removeTableListener(TableCompositeListener aListener) {
		this.listener.remove(aListener);
	}

	public void addSortListener(ISortListener aListener) {
		this.sortListeners.add(aListener);
	}

	public void removeSortListener(ISortListener aListener) {
		this.sortListeners.remove(aListener);
	}

	public void addTableCellListener(ITableCellListener<T> aListener) {
		this.tableCellListeners.add(aListener);
	}

	public void removeTableCellListener(ITableCellListener<T> aListener) {
		this.tableCellListeners.remove(aListener);
	}

	public void addTableCompositInputChangListener(
			TableCompositInputChangListener listener) {
		this.tableCompositInputChangListeners.add(listener);
	}

	public void removeTableCompositInputChangListener(
			TableCompositInputChangListener listener) {
		this.tableCompositInputChangListeners.remove(listener);
	}

	protected ToolBarComposite createHeadToolBar(Composite composite) {
		return null;
	}

	protected ToolBarComposite createFootToolBar(Composite composite) {
		return null;
	}

	/**
	 * This method initializes table
	 * 
	 */
	private void createTable() throws Exception {

		GridLayout gridLayout = new GridLayout();

		gridLayout.horizontalSpacing = 1;

		gridLayout.verticalSpacing = 1;

		gridLayout.marginWidth = 0;

		gridLayout.marginHeight = 0;

		this.setLayout(gridLayout);

		headToolBarComposite = createHeadToolBar(this);

		if (headToolBarComposite != null) {
			headToolBarComposite.setLayoutData(new GridData(
					GridData.FILL_HORIZONTAL));
		}

		table = new Table(this, this.tableStyle | SWT.VIRTUAL);

		table.setLayoutData(new GridData(GridData.FILL_BOTH));

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		Menu menu = getMenuManager().createContextMenu(this.table);

		this.table.setMenu(menu);

		for (int i = 0; i < columns.length; i++) {
			ColumnBean columnConfig = columns[i];
			if (BooleanUtils.toBoolean(columnConfig.getEditable())) {
				canEditColumns.add(columnConfig.getLabel());
			}

			if (BooleanUtils.toBoolean(columnConfig.getShowValue())) {
				showValueColumns.add(columnConfig.getLabel());
			}

			columnNames.add(columnConfig.getLabel());
			columnProperties.add(columnConfig.getProperty());
		}

		CellEditor[] cellEditors = new CellEditor[columns.length];

		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties((String[]) columnNames
				.toArray(new String[0]));

		tableViewer.setCellEditors(cellEditors);

		tableViewer.setCellModifier(this);

		for (int i = 0; i < columns.length; i++) {

			final ColumnBean columnConfig = columns[i];

			int align = SWT.NONE;

			if (StringUtils.isNotEmpty(columnConfig.getAlign())
					&& StringUtils.isNumeric(columnConfig.getAlign())) {
				align = Integer.parseInt(columnConfig.getAlign());
			}

			switch (align) {
			case 0:
				align = SWT.LEFT;
				break;
			case 1:
				align = SWT.RIGHT;
				break;
			case 2:
				align = SWT.CENTER;
				break;
			default:
				align = SWT.NONE;
				break;
			}

			TableColumn column = new TableColumn(this.table, align);

			column.setMoveable(columnConfig.isCanReOrder());

			column.setResizable(columnConfig.isCanResize());

			if (columnConfig.isCanSort()) {
				column.addSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						TableColumn sortColumn = table.getSortColumn();
						TableColumn currentColumn = (TableColumn) e.widget;
						int dir = table.getSortDirection();
						if (sortColumn == currentColumn) {
							dir = dir == SWT.UP ? SWT.DOWN : SWT.UP;
						} else {
							table.setSortColumn(currentColumn);
							dir = SWT.UP;
						}

						try {
							for (Iterator<ISortListener> iterator = sortListeners
									.iterator(); iterator.hasNext();) {
								ISortListener sortListener = iterator.next();
								sortListener.onSort(columnConfig.getProperty(),
										dir == SWT.UP);
							}
						} catch (Exception e2) {
							throw new RuntimeException(e2);
						}

						table.setSortDirection(dir);
					}

				});
			}

			if (StringUtils.isNotBlank(columnConfig.getIcon())) {
				column.setImage(ImageChache.getImage(columnConfig.getIcon()));
			}

			if (StringUtils.isNotEmpty(columnConfig.getWidth())
					&& StringUtils.isNumeric(columnConfig.getWidth())) {

				column.setWidth(Integer.parseInt(columnConfig.getWidth()));
			}
			if (StringUtils.isNotEmpty(columnConfig.getLabel())) {
				column.setText(UIConfigFactory.getInstance().getLocalMessage(
						columnConfig.getLabelKey(), columnConfig.getLabel(),
						LocalHelper.getLocale()));
			}

			if (StringUtils.isNotEmpty(columnConfig.getProperty())) {
				column.setData("PROPERTY", columnConfig.getProperty());
			}

			if (StringUtils.isNotEmpty(columnConfig.getCellEditor())) {
				cellEditors[i] = (CellEditor) ConstructorUtils
						.invokeConstructor(
								Class.forName(columnConfig.getCellEditor()),
								new Object[] { this.table });
			} else if (StringUtils.isNotBlank(columnConfig.getListDataSource())) {

				cellEditors[i] = new ComboBoxCellEditor(this.table,
						new String[0], SWT.READ_ONLY);

				ListDataContainer listDataContainer = UIConfigFactory
						.getInstance().getListDataConfig(
								columnConfig.getListDataSource());

				IComboListProvider comboListProvider = listDataContainer != null ? getComboListProviderByType(listDataContainer
						.getType()) : null;

				setListData(columnConfig.getProperty(), comboListProvider);

			} else if (Integer.class.getName().equals(
					columnConfig.getDataType())
					|| Long.class.getName().equals(columnConfig.getDataType())
					|| Short.class.getName().equals(columnConfig.getDataType())
					|| "int".equals(columnConfig.getDataType())
					|| "short".equals(columnConfig.getDataType())
					|| "long".equals(columnConfig.getDataType())) {
				cellEditors[i] = new IntCellEditor(this.table);
			} else if (BigDecimal.class.getName().equals(
					columnConfig.getDataType())) {
				cellEditors[i] = new NumberCellEditor(this.table);
			} else if (Date.class.getName().equals(columnConfig.getDataType())) {
				cellEditors[i] = new DateCellEditor(this.table);
			} else {
				cellEditors[i] = new TextCellEditor(this.table);
			}

			if (StringUtils.isNotEmpty(columnConfig.getValidator())) {
				cellEditors[i]
						.setValidator((ICellEditorValidator) ConstructorUtils
								.invokeConstructor(Class.forName(columnConfig
										.getValidator()), null));

			}

			cellEditors[i].setStyle(align);

		}

		this.tableViewer.setContentProvider(new DataListContentProvider());
		this.tableViewer.setLabelProvider(new TableLabelProvider());

		footToolBarComposite = createFootToolBar(this);

		if (footToolBarComposite != null) {
			footToolBarComposite.setLayoutData(new GridData(
					GridData.FILL_HORIZONTAL));
			this.tableViewer.addSelectionChangedListener(footToolBarComposite);
		}

		if (headToolBarComposite != null) {
			this.tableViewer.addSelectionChangedListener(headToolBarComposite);
		}

		table.addListener(SWT.MouseDown, new Listener() {
			public void handleEvent(Event event) {
				Rectangle clientArea = table.getClientArea();
				Point pt = new Point(event.x, event.y);
				int index = table.getTopIndex();
				while (index < table.getItemCount()) {
					boolean visible = false;
					TableItem item = table.getItem(index);
					for (int i = 0; i < columns.length; i++) {
						Rectangle rect = item.getBounds(i);
						if (rect.contains(pt)) {
							onTableCellClick(
									(T) tableViewer.getElementAt(index),
									columns[i].getProperty());
							for (Iterator<ITableCellListener<T>> iterator = tableCellListeners
									.iterator(); iterator.hasNext();) {
								iterator.next().onTableCellClick(
										(T) tableViewer.getElementAt(index),
										columns[i].getProperty(), event.x,
										event.y);

							}
						}
						if (!visible && rect.intersects(clientArea)) {
							visible = true;
						}
					}
					if (!visible)
						return;
					index++;
				}
			}
		});

	}

	protected void onTableCellClick(T row, String property) {

	}

	protected void onValueModified(T row, String property) {

	}

	protected IComboListProvider<?> getComboListProviderByType(String type) {

		return null;
	}

	public void setDataList(List<T> aDataList) {
		if (this.table.isDisposed()) {
			return;
		}
		this.table.deselectAll();

		this.tableViewer.setInput(aDataList);
		this.table.layout(true);
	}

	public List<T> getDataList() {
		Object input = this.tableViewer.getInput();
		if (input instanceof List) {
			return (List<T>) input;
		} else if (input instanceof Object[]) {
			List<T> list = new ArrayList<T>();
			CollectionUtils.addAll(list, (Object[]) input);
			return list;
		} else {
			return new ArrayList<T>(0);
		}

	}

	public void addDataList(List<T> aDataList) {
		List<T> dataList = getDataList();
		if (aDataList != null) {
			dataList.addAll(aDataList);
		}
		this.tableViewer.setInput(dataList);
		this.table.layout(true);
	}

	public void setDataList(T[] aDataList) {
		List<T> list = new ArrayList<T>();
		if (aDataList != null) {
			CollectionUtils.addAll(list, aDataList);
		}
		this.tableViewer.setInput(list);
		this.table.layout(true);
	}

	public boolean canModify(Object element, String property) {

		if (this.tableViewer.getCellEditors()[this.columnNames
				.indexOf(property)] instanceof ICellRender) {
			return true;
		} else {

			if (this.editable == true) {

				if (canEditColumns.indexOf(property) != -1) {
					return true;
				}
				return false;
			} else {
				return false;
			}
		}
	}

	private ColumnBean getColumnConfig(String aPropertyName) {

		ColumnBean columnConfig = null;

		ColumnBean[] columnConfigs = this.tableConfig.getColumns();

		for (int i = 0; i < columnConfigs.length; i++) {
			ColumnBean bean = columnConfigs[i];
			if (bean.getProperty().equals(aPropertyName)) {
				columnConfig = bean;
				break;
			}
		}

		return columnConfig;

	}

	public Object getValue(Object element, String property) {
		int index = canEditColumns.indexOf(property);
		if (index == -1) {
			return "";
		}
		try {

			String columnProperty = (String) this.columnProperties
					.get(this.columnNames.indexOf(property));

			ColumnBean columnConfig = getColumnConfig(columnProperty);

			Object value = PropertyUtils.getProperty(element, columnProperty);

			if (this.listDataMap.get(columnConfig.getProperty()) != null) {
				ListData[] dataList = this.listDataMap.get(columnConfig
						.getProperty());

				for (int i = 0; i < dataList.length; i++) {
					ListData listData = dataList[i];
					if (listData.getData().equals(value)) {
						value = new Integer(i);
						break;
					}
				}
			}

			return value;

		} catch (Exception ex) {
			logger.error("Row Object[" + element + "] Property [" + property
					+ "] not found", ex);
			return "";
		}
	}

	public void modify(Object element, String property, Object value) {
		int index = canEditColumns.indexOf(property);
		if (index == -1) {
			return;
		}
		try {

			String columnProperty = (String) this.columnProperties
					.get(this.columnNames.indexOf(property));

			ColumnBean columnConfig = getColumnConfig(columnProperty);

			if (this.listDataMap.get(columnConfig.getProperty()) != null) {

				ListData[] dataList = this.getListData(
						(T) ((TableItem) element).getData(),
						columnConfig.getProperty());

				if (ArrayUtils.isNotEmpty(dataList)
						&& ((Integer) value).intValue() != -1) {
					value = dataList[((Integer) value).intValue()].getData();
				} else {
					value = "";
				}

			}
			Class dataType;
			if (StringUtils.isNotEmpty(columnConfig.getDataType())) {
				dataType = Class.forName(columnConfig.getDataType());
			} else {
				dataType = String.class;
			}

			if (value == null) {
				PropertyUtils.setProperty(((TableItem) element).getData(),
						columnProperty, null);
			} else if (value.getClass().equals(dataType)
					|| ClassUtils.getAllSuperclasses(value.getClass())
							.contains(dataType)
					|| ClassUtils.getAllInterfaces(value.getClass()).contains(
							dataType)) {

				PropertyDescriptor propertyDesc = PropertyUtils
						.getPropertyDescriptor(((TableItem) element).getData(),
								columnProperty);

				if (propertyDesc != null
						&& propertyDesc.getPropertyType().equals(dataType)) {
					PropertyUtils.setProperty(((TableItem) element).getData(),
							columnProperty, value);
				} else if (propertyDesc != null
						&& propertyDesc.getPropertyType().equals(
								BigDecimal.class)) {
					if (StringUtils.isEmpty(String.valueOf(value))) {
						PropertyUtils.setProperty(
								((TableItem) element).getData(),
								columnProperty, null);

					} else {
						PropertyUtils.setProperty(
								((TableItem) element).getData(),
								columnProperty, new BigDecimal((String) value));

					}
				} else {
					Object convertedValue = ConvertUtils.convert(
							StringUtils.isEmpty(String.valueOf(value)) ? null
									: String.valueOf(value), dataType);
					PropertyUtils.setProperty(((TableItem) element).getData(),
							columnProperty, convertedValue);
				}

			} else {

				if (BigDecimal.class.equals(dataType)
						&& StringUtils.isEmpty(String.valueOf(value))) {

					PropertyUtils.setProperty(((TableItem) element).getData(),
							columnProperty, new BigDecimal(0));

				} else {

					Object convertedValue = ConvertUtils.convert(
							StringUtils.isEmpty(String.valueOf(value)) ? null
									: String.valueOf(value), dataType);
					PropertyUtils.setProperty(((TableItem) element).getData(),
							columnProperty, convertedValue);
				}
			}

			this.getTableViewer().update(((TableItem) element).getData(), null);

			onValueModified((T) ((TableItem) element).getData(), columnProperty);

		} catch (Exception ex) {
			logger.error("Row Object [" + element + "] has no [" + property
					+ "] ", ex);
		}

	}

	public Table getTable() {
		return this.table;
	}

	public TableViewer getTableViewer() {
		return this.tableViewer;
	}

	public void packColumns() {
		TableColumn[] columns = getTable().getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].pack();
		}
	}

	public void addRow(T aRowData) {
		List<T> input = (List) this.tableViewer.getInput();
		if (input == null) {
			input = new ArrayList<T>();
		}
		input.add(aRowData);
		this.tableViewer.setInput(input);
	}

	public void addRows(List<T> aRows) {
		List<T> input = (List) this.tableViewer.getInput();
		if (input == null) {
			input = new ArrayList<T>();
		}
		input.addAll(aRows);
		this.tableViewer.setInput(input);
	}

	public void removeAllRows() {
		this.tableViewer.setInput(new ArrayList<T>());
	}

	public void removeRow(T aRowData) {
		List<T> input = (List) this.tableViewer.getInput();
		input.remove(aRowData);
		this.tableViewer.setInput(input);
	}

	public void removeSelectedRows() {

		IStructuredSelection selection = (IStructuredSelection) this.tableViewer
				.getSelection();

		List<T> input = (List) this.tableViewer.getInput();

		for (Iterator<T> iterator = selection.iterator(); iterator.hasNext();) {
			input.remove(iterator.next());
		}

		this.tableViewer.setInput(input);

	}

	public void refresh() {
		this.tableViewer.refresh(true);
	}

	public void removeRows(List<T> aRows) {
		List<T> input = (List) this.tableViewer.getInput();
		input.removeAll(aRows);
		this.tableViewer.setInput(input);
	}

	public void removeRow(int aRowIndex) {
		List<T> input = (List) this.tableViewer.getInput();
		input.remove(this.tableViewer.getElementAt(aRowIndex));
		this.tableViewer.setInput(input);
	}

	public void removeRows(int[] aRowIndexs) {
		List<T> input = (List) this.tableViewer.getInput();
		for (int i = 0; i < aRowIndexs.length; i++) {
			int j = aRowIndexs[i];
			input.remove(this.tableViewer.getElementAt(j));
		}
		this.tableViewer.setInput(input);
	}

	public List<T> getSelectedDataList() {
		return getSelectedDataList(true);
	}

	public List<T> getSelectedDataList(boolean useCheck) {
		List<T> selectedDatas = new ArrayList<T>();
		if (useCheck && (SWT.CHECK & this.table.getStyle()) > 0) {

			TableItem[] rowItems = this.table.getItems();

			for (int i = 0; i < rowItems.length; i++) {
				TableItem item = rowItems[i];
				if (item.getChecked()) {
					selectedDatas.add((T) this.tableViewer.getElementAt(i));
				}
			}
		} else {
			int[] selectedIndex = this.table.getSelectionIndices();

			for (int i = 0; i < selectedIndex.length; i++) {
				int j = selectedIndex[i];
				selectedDatas.add((T) this.tableViewer.getElementAt(j));
			}
		}

		return selectedDatas;
	}

	public void setSelection(T t) {

		StructuredSelection selection = new StructuredSelection(t);

		this.tableViewer.setSelection(selection);

	}

	public void setSelection(T[] ts) {

		StructuredSelection selection = new StructuredSelection(ts);

		this.tableViewer.setSelection(selection);

	}

	public void setSelection(List<T> ts) {

		StructuredSelection selection = new StructuredSelection(ts);

		this.tableViewer.setSelection(selection);

	}

	public void clearAllSelection() {

		if ((SWT.CHECK & this.table.getStyle()) > 0) {

			TableItem[] rowItems = this.table.getItems();

			for (int i = 0; i < rowItems.length; i++) {
				TableItem item = rowItems[i];
				item.setChecked(false);
			}
		} else {
			this.table.deselectAll();
		}

	}

	public void selectAll() {
		if ((SWT.CHECK & this.table.getStyle()) > 0) {

			TableItem[] rowItems = this.table.getItems();

			for (int i = 0; i < rowItems.length; i++) {
				TableItem item = rowItems[i];
				item.setChecked(true);
			}
		} else {
			this.table.selectAll();
		}
	}

	public boolean canMoveUp(T data) {
		return this.getDataList().indexOf(data) > 0;
	}

	public boolean canMoveDown(T data) {
		int index = this.getDataList().indexOf(data);
		return index >= 0 && index < this.getDataList().size() - 1;
	}

	/**
	 * 
	 * 
	 * @param aRowIndex
	 */
	public void moveUpRow(int aRowIndex) {
		if (aRowIndex <= 0) {
			return;
		}
		swapRows(aRowIndex, aRowIndex - 1);
	}

	public void moveDownRow(int aRowIndex) {
		if (aRowIndex >= this.table.getItemCount() - 1) {
			return;
		}
		swapRows(aRowIndex, aRowIndex + 1);
	}

	public void swapRows(int i, int j) {
		List<T> dataList = this.getDataList();
		Collections.swap(dataList, i, j);
		this.setDataList(dataList);
		this.setSelection(dataList.get(j));
	}

	protected ListData[] getListData(T rowData, String property)
			throws Exception {
		return listDataMap.get(property);
	}

	public void setListData(String property,
			IComboListProvider comboListProvider) throws Exception {

		int index = this.columnProperties.indexOf(property);

		if (index != -1) {

			ColumnBean columnBean = this.columns[index];

			ListDataContainer listDataContainer = UIConfigFactory.getInstance()
					.getListDataConfig(columnBean.getListDataSource());

			List<String> items = new ArrayList<String>();

			if ("static".equalsIgnoreCase(listDataContainer.getType())) {

				ListData[] listDatas = UIConfigFactory.getInstance()
						.getListDatas(columnBean.getListDataSource());

				for (int j = 0; j < listDatas.length; j++) {
					items.add(listDatas[j].getLabel());
				}

				listDataMap.put(columnBean.getProperty(), listDatas);

			}

			if (comboListProvider != null) {

				Object[] objects = comboListProvider.getDataList();

				ListData[] listDatas = new ListData[objects.length];

				for (int j = 0; j < listDatas.length; j++) {
					items.add(comboListProvider.getDataLabel(objects[j]));
					listDatas[j] = new ListData();

					listDatas[j].setLabel(comboListProvider
							.getDataLabel(objects[j]));

					listDatas[j].setData(PropertyUtils.getProperty(objects[j],
							listDataContainer.getDataProperty()));
				}

				listDataMap.put(property, listDatas);
			}

			if (this.editable == true) {

				CellEditor cellEditor = this.tableViewer.getCellEditors()[index];

				if (cellEditor instanceof ComboBoxCellEditor) {
					((ComboBoxCellEditor) cellEditor).setItems(items
							.toArray(new String[items.size()]));
				}
			}
		}

	}

	public boolean isEditable() {
		return editable;
	}

	protected Color getCellBackground(T t, int colIndex) {
		return null;
	}

	protected Color getCellForeground(T t, int colIndex) {
		return null;
	}

	public Image getColumnImage(T element, int columnIndex) {
		return ((ITableLabelProvider) this.getTableViewer().getLabelProvider())
				.getColumnImage(element, columnIndex);
	}

	/**
	 * 
	 * @author qilin
	 * 
	 */
	class TableLabelProvider extends LabelProvider implements
			ITableLabelProvider, ITableColorProvider {

		public Image getColumnImage(Object element, int columnIndex) {
			ColumnBean columnconfig = columns[columnIndex];
			try {
				String value = String.valueOf(PropertyUtils.getProperty(
						element, columnconfig.getProperty()));
				String imageFile = columnconfig.getImage(value);

				if (StringUtils.contains(imageFile, "${")
						&& StringUtils.contains(imageFile, "}")) {
					String property = StringUtils.substringBetween(imageFile,
							"${", "}");

					String tmpValue = String.valueOf(PropertyUtils.getProperty(
							element, property));

					imageFile = StringUtils.replace(imageFile, "${" + property
							+ "}", tmpValue);

				}

				if (StringUtils.isEmpty(imageFile)) {
					return null;
				}
				Image image = ImageChache.getImage(imageFile);

				return image;
			} catch (Exception ex) {
				logger.error("Row Object[" + element + "] Property["
						+ columnconfig.getProperty() + "] not found", ex);
				return null;
			}

		}

		public String getColumnText(Object element, int columnIndex) {
			ColumnBean columnconfig = columns[columnIndex];
			if (showValueColumns.indexOf(columnconfig.getLabel()) == -1) {
				return "";
			}

			Object result = "";

			try {
				result = PropertyUtils.getProperty(element,
						columnconfig.getProperty());

				ListData[] dataList = getListData((T) element,
						columnconfig.getProperty());

				if (ArrayUtils.isNotEmpty(dataList)) {

					for (int i = 0; i < dataList.length; i++) {
						ListData listData = dataList[i];
						if (StringUtils.equals(
								String.valueOf(listData.getData()),
								String.valueOf(result))) {
							result = listData.getLabel();
							break;
						}

					}

				}

				if (result == null) {
					Class dataType = String.class;
					if (StringUtils.isNotEmpty(columnconfig.getDataType())) {
						dataType = Class.forName(columnconfig.getDataType());
					}
					if (dataType.equals(Date.class)) {
						return "";
					} else if (dataType.equals(BigDecimal.class)) {
						return "";
					} else {
						return dataType.newInstance().toString();
					}
				}

			} catch (Exception ex) {
				logger.error("Row Object[" + element + "] Property["
						+ columnconfig.getProperty() + "] not found", ex);
			}
			if (result instanceof Date) {

				String dateFormat = null;

				List<ColumnDataBean> columnDataBeans = columnconfig
						.getColumnDataList();

				for (Iterator<ColumnDataBean> iterator = columnDataBeans
						.iterator(); iterator.hasNext();) {
					ColumnDataBean columnDataBean = iterator.next();

					if (columnDataBean.getLabel().startsWith("dateFormat")) {
						dateFormat = columnDataBean.getData();
						break;
					}

				}

				if (dateFormat == null) {
					return DateFormat.getDateInstance().format((Date) result);
				} else {
					SimpleDateFormat format = new SimpleDateFormat(dateFormat);
					return format.format((Date) result);
				}

			} else {
				return result.toString();
			}

		}

		@Override
		public Color getForeground(Object element, int columnIndex) {
			return getCellForeground((T) element, columnIndex);
		}

		@Override
		public Color getBackground(Object element, int columnIndex) {
			return getCellBackground((T) element, columnIndex);
		}

	}

	/**
	 * 
	 * @author qilin
	 * 
	 */
	class DataListContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof List) {
				return ((List) inputElement).toArray();
			} else if (inputElement instanceof Object[]) {
				return (Object[]) inputElement;
			}
			return null;
		}

		public void dispose() {

		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

			for (Iterator iterator = tableCompositInputChangListeners
					.iterator(); iterator.hasNext();) {
				TableCompositInputChangListener listener = (TableCompositInputChangListener) iterator
						.next();
				listener.inputChanged(viewer, oldInput, newInput);
			}
		}

	}

	@Override
	public String[] getSelectedItemActionGroupIds() {
		return null;
	}

	@Override
	public StructuredViewer getViewer() {
		return this.tableViewer;
	}

	public List<String> getColumnProperties() {
		return columnProperties;
	}

	@Override
	public void reLoadContent() {
		refresh();
	}

	public ToolBarComposite getHeadToolBarComposite() {
		return headToolBarComposite;
	}

	public ToolBarComposite getFootToolBarComposite() {
		return footToolBarComposite;
	}

}
