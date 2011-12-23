package net.ui.eclipse.tree;

import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.common.AbstractContentViewerComposite;
import net.ui.eclipse.table.DateCellEditor;
import net.ui.eclipse.table.NumberCellEditor;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.table.ColumnBean;
import net.ui.model.table.ColumnDataBean;
import net.ui.model.table.TableBean;
import net.ui.model.tree.NodeBean;
import net.ui.model.tree.PropertyBean;
import net.ui.model.tree.SubNodeBuilderBean;
import net.ui.model.tree.TreeNodeBean;
import net.utils.CommonUtils;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeItem;

public class TreeViewComposite extends AbstractContentViewerComposite implements
		ICellModifier, TreeListener {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(TreeViewComposite.class);

	private TreeViewer treeViewer;

	private ITreeViewProvider treeViewProvider;

	private TreeNodeItem rootNodeItem;

	private ColumnBean[] columns;

	private List<String> canEditColumns = new ArrayList<String>();

	private List<String> showValueColumns = new ArrayList<String>();

	private List<String> columnProperties = new ArrayList<String>();

	private List<String> columnNames = new ArrayList<String>();

	private Map<String, ISubNodeBuilder> subNodeBuilderCach = new HashMap<String, ISubNodeBuilder>();

	private Map<String, ListData[]> listDataMap = new HashMap<String, ListData[]>();

	private boolean editable = false;

	private int treeViewStyle;

	public TreeViewComposite(Composite parent,
			ITreeViewProvider treeViewProvider) {
		this(parent, treeViewProvider, treeViewProvider.isEditable(),
				treeViewProvider.getStyle());
	}

	private TreeViewComposite(Composite parent,
			ITreeViewProvider treeViewProvider, boolean editable, int style) {
		super(parent, SWT.NONE);
		this.treeViewStyle = style;
		this.editable = editable;
		this.treeViewProvider = treeViewProvider;
		try {
			createTreeView(this);
		} catch (Exception e) {
			logger.error("constract error", e);
		}
	}

	public static TreeViewComposite createTreeViewComposite(Composite parent,
			ITreeViewProvider treeViewProvider) {
		return new TreeViewComposite(parent, treeViewProvider);
	}

	protected void createTreeView(Composite parent) throws Exception {

		FillLayout fillLayout = new FillLayout();

		fillLayout.marginHeight = 0;

		fillLayout.marginWidth = 0;

		parent.setLayout(fillLayout);

		this.treeViewer = new TreeViewer(parent, treeViewStyle | SWT.VIRTUAL
				| SWT.BORDER | SWT.FULL_SELECTION);

		this.treeViewer.getTree().setLinesVisible(false);

		Menu menu = getMenuManager().createContextMenu(
				this.treeViewer.getTree());

		this.treeViewer.getTree().setMenu(menu);

		TableBean tableBean = this.treeViewProvider.getTableConfig();

		if (tableBean != null) {

			columns = tableBean.getColumns();

			CellEditor[] cellEditors = new CellEditor[columns.length];

			for (int i = 0; i < columns.length; i++) {
				ColumnBean columnConfig = columns[i];
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

				TreeViewerColumn column = new TreeViewerColumn(this.treeViewer,
						align);

				column.getColumn().setMoveable(columnConfig.isCanReOrder());

				column.getColumn().setResizable(columnConfig.isCanResize());

				if (StringUtils.isNotBlank(columnConfig.getIcon())) {
					column.getColumn().setImage(
							ImageChache.getImage(columnConfig.getIcon()));
				}

				if (StringUtils.isNotEmpty(columnConfig.getWidth())
						&& StringUtils.isNumeric(columnConfig.getWidth())) {
					column.getColumn().setWidth(
							Integer.parseInt(columnConfig.getWidth()));
				}
				if (StringUtils.isNotEmpty(columnConfig.getLabel())) {
					column.getColumn().setText(
							UIConfigFactory.getInstance().getLocalMessage(
									columnConfig.getLabelKey(),
									columnConfig.getLabel(), LocalHelper.getLocale()));
				}

				if (StringUtils.isNotEmpty(columnConfig.getProperty())) {
					column.getColumn().setData("PROPERTY",
							columnConfig.getProperty());
				}

				if (StringUtils.isNotEmpty(columnConfig.getCellEditor())) {
					cellEditors[i] = (CellEditor) ConstructorUtils
							.invokeConstructor(
									Class.forName(columnConfig.getCellEditor()),
									new Object[] { this.treeViewer.getTree() });
				} else if (StringUtils.isNotBlank(columnConfig
						.getListDataSource())) {

					ListDataContainer listDataContainer = UIConfigFactory
							.getInstance().getListDataConfig(
									columnConfig.getListDataSource());

					if (listDataContainer != null
							&& "static".equalsIgnoreCase(listDataContainer
									.getType())) {
						ListData[] listDatas = UIConfigFactory.getInstance()
								.getListDatas(columnConfig.getListDataSource());

						String[] texts = new String[listDatas.length];

						for (int j = 0; j < texts.length; j++) {
							texts[j] = listDatas[j].getLabel();
						}

						listDataMap.put(columnConfig.getProperty(), listDatas);

						cellEditors[i] = new ComboBoxCellEditor(
								this.treeViewer.getTree(), texts, SWT.READ_ONLY);

					} else {
						cellEditors[i] = new ComboBoxCellEditor(
								this.treeViewer.getTree(), new String[0],
								SWT.READ_ONLY);
					}

				} else if (BigDecimal.class.getName().equals(
						columnConfig.getDataType())) {
					cellEditors[i] = new NumberCellEditor(
							this.treeViewer.getTree());
				} else if (Date.class.getName().equals(
						columnConfig.getDataType())) {
					cellEditors[i] = new DateCellEditor(
							this.treeViewer.getTree());
				} else {
					cellEditors[i] = new TextCellEditor(
							this.treeViewer.getTree());
				}

				if (StringUtils.isNotEmpty(columnConfig.getValidator())) {
					cellEditors[i]
							.setValidator((ICellEditorValidator) ConstructorUtils
									.invokeConstructor(Class
											.forName(columnConfig
													.getValidator()), null));

				}

				cellEditors[i].setStyle(align);

				if (BooleanUtils.toBoolean(columnConfig.getEditable())) {
					canEditColumns.add(columnConfig.getLabel());
				}

				if (BooleanUtils.toBoolean(columnConfig.getShowValue())) {
					showValueColumns.add(columnConfig.getLabel());
				}

				columnNames.add(columnConfig.getLabel());
				columnProperties.add(columnConfig.getProperty());

			}

			if (this.editable == true) {
				this.treeViewer.setCellEditors(cellEditors);
				this.treeViewer.setCellModifier(this);
			}

			this.treeViewer.getTree().setHeaderVisible(true);

		} else {
			this.treeViewer.getTree().setHeaderVisible(false);
		}

		this.treeViewer.getTree().setLinesVisible(true);

		this.treeViewer.setContentProvider(new TreeContentProvider());

		this.treeViewer.setLabelProvider(new TreeTableLabelProvider());

		this.treeViewer.setInput(getTreeRootNode());

		this.treeViewer.getTree().addTreeListener(this);

		this.treeViewer.expandToLevel(treeViewProvider
				.getDefaultExpandToLevel());

		this.treeViewer.getTree().layout(true);

	}

	public void rebuildTree() {
		this.treeViewer.setInput(getTreeRootNode());
	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	public ITreeViewProvider getTreeViewProvider() {
		return treeViewProvider;
	}

	public boolean canMoveUp(TreeNodeItem nodeItem) {

		TreeNodeItem parentNode = nodeItem.getParentNodeItem();

		if (parentNode == null) {
			return false;
		}

		return parentNode.getChildTreeNodeItems().indexOf(nodeItem) > 0;

	}

	public boolean canMoveDown(TreeNodeItem nodeItem) {

		TreeNodeItem parentNode = nodeItem.getParentNodeItem();

		if (parentNode == null) {
			return false;
		}

		int index = parentNode.getChildTreeNodeItems().indexOf(nodeItem);

		return index >= 0
				&& index < parentNode.getChildTreeNodeItems().size() - 1;
	}

	protected TreeNodeItem getTreeRootNode() {

		TreeNodeBean treeNodeBean = this.treeViewProvider.getTreeConfig()
				.getRootNode();

		if (treeNodeBean == null) {
			throw new RuntimeException(
					"Can Not Find Tree Root Node Define In '"
							+ this.treeViewProvider.getTreeConfig() + "'");
		}

		NodeBean nodeBean = this.treeViewProvider.getTreeConfig()
				.getNodeDefine(treeNodeBean.getId());

		rootNodeItem = new TreeNodeItem(null, nodeBean);

		rootNodeItem.setUserObject(this.treeViewProvider
				.getRootNodeUserObject());

		buildRootNode(rootNodeItem, treeNodeBean.getSubNodes());

		return rootNodeItem;
	}

	private void buildRootNode(TreeNodeItem parent, TreeNodeBean[] subNodeBeans) {

		if (ArrayUtils.isEmpty(subNodeBeans)) {
			return;
		}

		for (int i = 0; i < subNodeBeans.length; i++) {
			TreeNodeBean subTreeNodeBean = subNodeBeans[i];

			TreeNodeItem nodeItem = new TreeNodeItem(null,
					this.treeViewProvider.getTreeConfig().getNodeDefine(
							subTreeNodeBean.getId()));

			nodeItem.setUserObject(parent.getUserObject());

			parent.getStaticChildTreeNodeItems().add(nodeItem);

			buildRootNode(nodeItem, subTreeNodeBean.getSubNodes());

		}
	}

	protected TreeNodeItem[] getTreeNodeItems(TreeNodeItem parentNodeItem) {

		List<TreeNodeItem> childNodeItems = new ArrayList<TreeNodeItem>();

		for (Iterator<TreeNodeItem> iterator = parentNodeItem
				.getStaticChildTreeNodeItems().iterator(); iterator.hasNext();) {
			TreeNodeItem staticTreeNodeItem = iterator.next();
			staticTreeNodeItem.setDirty(parentNodeItem.isDirty());
		}

		childNodeItems.addAll(parentNodeItem.getStaticChildTreeNodeItems());

		if (parentNodeItem.isDirty() == false) {

			childNodeItems.addAll(parentNodeItem.getChildTreeNodeItems());

			return childNodeItems.toArray(new TreeNodeItem[childNodeItems
					.size()]);
		}

		try {
			ISubNodeBuilder<Object, Object>[] subNodeBuilders = getSubTreeNodeBuilders(parentNodeItem
					.getNodeConfig());

			for (int i = 0; i < subNodeBuilders.length; i++) {
				ISubNodeBuilder<Object, Object> subNodeBuilder = subNodeBuilders[i];

				Object[] childObjects = subNodeBuilder
						.getSubNodes(parentNodeItem.getUserObject());

				for (int j = 0; j < childObjects.length; j++) {

					Object userObject = childObjects[j];

					String subNodeId = subNodeBuilder
							.getSubNodeDefineId(userObject);

					String[] actionGroupIds = subNodeBuilder
							.getSubNodeActionGroupIds(userObject);

					NodeBean subNodeConfig = treeViewProvider.getTreeConfig()
							.getNodeDefine(subNodeId);

					if (subNodeConfig == null
							&& StringUtils.isNotBlank(treeViewProvider
									.getDefaultNodeDefineId())) {

						subNodeConfig = treeViewProvider.getTreeConfig()
								.getNodeDefine(
										treeViewProvider
												.getDefaultNodeDefineId());
					}

					TreeNodeItem chidTreeNodeItem = new TreeNodeItem(
							parentNodeItem, subNodeConfig);

					chidTreeNodeItem.setUserObject(userObject);

					chidTreeNodeItem.setActionGroupIds(actionGroupIds);

					childNodeItems.add(chidTreeNodeItem);
				}

			}

			parentNodeItem.setDirty(false);

			return childNodeItems.toArray(new TreeNodeItem[childNodeItems
					.size()]);

		} catch (Exception e) {

			logger.error("getTreeRootNode Error", e);

			return new TreeNodeItem[0];
		}
	}

	protected ISubNodeBuilder<Object, Object>[] getSubTreeNodeBuilders(
			NodeBean aNodeConfig) throws Exception {

		SubNodeBuilderBean[] subBuilderBean = aNodeConfig.getSubNodBuilders();

		List<ISubNodeBuilder<Object, Object>> builderList = new ArrayList<ISubNodeBuilder<Object, Object>>();

		for (int i = 0; i < subBuilderBean.length; i++) {
			SubNodeBuilderBean bean = subBuilderBean[i];
			if (subNodeBuilderCach.containsKey(bean.getId())) {

				List<PropertyBean> properties = bean.getProperties();

				for (Iterator<PropertyBean> iter = properties.iterator(); iter
						.hasNext();) {
					PropertyBean property = iter.next();
					if (PropertyUtils.isWriteable(
							subNodeBuilderCach.get(bean.getId()),
							property.getName())) {
						PropertyUtils.setProperty(
								subNodeBuilderCach.get(bean.getId()),
								property.getName(), property.getValue());
					}
				}

				builderList.add(subNodeBuilderCach.get(bean.getId()));

			} else {
				ISubNodeBuilder<Object, Object> builder = (ISubNodeBuilder<Object, Object>) ConstructorUtils
						.invokeConstructor(Class.forName(bean.getClassName()),
								null);

				initSubNodeBuilder(bean.getId(), builder);

				List<PropertyBean> properties = bean.getProperties();

				for (Iterator<PropertyBean> iter = properties.iterator(); iter
						.hasNext();) {
					PropertyBean property = iter.next();
					if (PropertyUtils.isWriteable(builder, property.getName())) {
						PropertyUtils.setProperty(builder, property.getName(),
								property.getValue());
					}
				}

				subNodeBuilderCach.put(bean.getId(), builder);
				builderList.add(builder);
			}
		}

		return (ISubNodeBuilder<Object, Object>[]) builderList
				.toArray(new ISubNodeBuilder[builderList.size()]);

	}

	private void initSubNodeBuilder(String id,
			ISubNodeBuilder<Object, Object> builder) {
		treeViewProvider.initSubNodeBuilder(id, builder);
	}

	protected class TreeContentProvider implements ITreeContentProvider {

		@Override
		public void dispose() {

		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

		}

		@Override
		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			TreeNodeItem parentNodeItem = (TreeNodeItem) parentElement;

			return getTreeNodeItems(parentNodeItem);
		}

		@Override
		public Object getParent(Object element) {
			TreeNodeItem nodeItem = (TreeNodeItem) element;
			return nodeItem.getParentNodeItem();
		}

		@Override
		public boolean hasChildren(Object element) {
			TreeNodeItem nodeItem = (TreeNodeItem) element;
			return BooleanUtils.isFalse(nodeItem.getNodeConfig().getLeaf());
		}

	}

	class TreeTableLabelProvider extends LabelProvider implements
			ITableLabelProvider, ITableColorProvider {

		@Override
		public Image getImage(Object element) {

			return getColumnImage(element, 0);
		}

		@Override
		public String getText(Object element) {
			return getColumnText(element, 0);
		}

		public Image getColumnImage(Object element, int columnIndex) {

			TreeNodeItem treeNodeItem = (TreeNodeItem) element;

			try {

				if (columnIndex == 0) {

					if (StringUtils.isBlank(treeNodeItem.getNodeConfig()
							.getImage())) {
						return null;
					}

					if (treeNodeItem.getUserObject() != null
							&& PropertyUtils.isReadable(treeNodeItem
									.getUserObject(), treeNodeItem
									.getNodeConfig().getImage())) {
						String value = null;

						try {
							value = String.valueOf(PropertyUtils.getProperty(
									treeNodeItem.getUserObject(), treeNodeItem
											.getNodeConfig().getImage()));
						} catch (Exception e) {
							value = treeNodeItem.getNodeConfig().getImage();
							logger.warn(e.getLocalizedMessage());
						}

						if (StringUtils.isEmpty(value)) {
							return null;
						}
						Image image = ImageChache.getImage(treeViewProvider
								.getTreeConfig().getImageBase() + value);

						treeNodeItem.setImage(image);

						return image;
					} else {

						Image image = ImageChache.getImage(treeViewProvider
								.getTreeConfig().getImageBase()
								+ treeNodeItem.getNodeConfig().getImage());

						treeNodeItem.setImage(image);

						return image;
					}
				}

				if (treeNodeItem.getUserObject() == null) {
					return null;
				}

				ColumnBean columnconfig = columns[columnIndex];

				try {
					if (PropertyUtils.getPropertyDescriptor(
							treeNodeItem.getUserObject(),
							columnconfig.getProperty()) == null) {
						return null;
					}
				} catch (Exception e) {
					return null;
				}

				String value = String.valueOf(PropertyUtils.getProperty(
						treeNodeItem.getUserObject(),
						columnconfig.getProperty()));

				String imageFile = columnconfig.getImage(value);

				if (StringUtils.isEmpty(imageFile)) {
					return null;
				}
				Image image = ImageChache.getImage(imageFile);

				return image;
			} catch (Exception ex) {
				logger.warn("get Image Error", ex);
				return null;
			}

		}

		public String getColumnText(Object element, int columnIndex) {

			TreeNodeItem treeNodeItem = (TreeNodeItem) element;

			if (treeNodeItem.getUserObject() == null) {
				return columnIndex == 0 ? treeNodeItem.getNodeConfig()
						.getLabel() : "";
			}

			if (ArrayUtils.isEmpty(columns)) {
				if (StringUtils.isNotBlank(treeNodeItem.getNodeConfig()
						.getLabel())) {

					try {

						if (PropertyUtils.getPropertyDescriptor(treeNodeItem
								.getUserObject(), treeNodeItem.getNodeConfig()
								.getLabel()) != null) {

							return String.valueOf(PropertyUtils.getProperty(
									treeNodeItem.getUserObject(), treeNodeItem
											.getNodeConfig().getLabel()));
						} else {
							return CommonUtils.getExpressionVaue(treeNodeItem
									.getNodeConfig().getLabel(), "${", "}",
									treeNodeItem.getUserObject());
						}
					} catch (Exception e) {
						logger.warn(
								"Row Object["
										+ treeNodeItem.getUserObject()
										+ "] Property["
										+ treeNodeItem.getNodeConfig()
												.getLabel() + "] not found", e);
					}

				} else {
					return treeNodeItem.getUserObject().toString();
				}
			}

			ColumnBean columnconfig = columns[columnIndex];

			if (showValueColumns.indexOf(columnconfig.getLabel()) == -1) {
				return "";
			}

			Object result = "";

			try {

				if (PropertyUtils.getPropertyDescriptor(
						treeNodeItem.getUserObject(),
						StringUtils.split(columnconfig.getProperty(), ".")[0]) == null) {

					if (PropertyUtils.getPropertyDescriptor(treeNodeItem
							.getUserObject(), treeNodeItem.getNodeConfig()
							.getLabel()) != null) {

						return String.valueOf(PropertyUtils.getProperty(
								treeNodeItem.getUserObject(), treeNodeItem
										.getNodeConfig().getLabel()));
					} else {
						return CommonUtils.getExpressionVaue(treeNodeItem
								.getNodeConfig().getLabel(), "${", "}",
								treeNodeItem.getUserObject());
					}

				}

				result = PropertyUtils.getProperty(
						treeNodeItem.getUserObject(),
						columnconfig.getProperty());

				ListData[] dataList = listDataMap.get(columnconfig
						.getProperty());

				if (ArrayUtils.isNotEmpty(dataList)) {

					for (int i = 0; i < dataList.length; i++) {
						ListData listData = dataList[i];
						if (listData.getData().equals(result)) {
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
				logger.warn("Row Object[" + treeNodeItem.getUserObject()
						+ "] Property[" + columnconfig.getProperty()
						+ "] not found");
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
			TreeNodeItem treeNodeItem = (TreeNodeItem) element;
			return getCellForeground(treeNodeItem, columnIndex);
		}

		@Override
		public Color getBackground(Object element, int columnIndex) {
			TreeNodeItem treeNodeItem = (TreeNodeItem) element;
			return getCellBackground(treeNodeItem, columnIndex);
		}

	}

	@Override
	public boolean canModify(Object element, String property) {
		if (this.editable == true) {

			if (canEditColumns.indexOf(property) != -1) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}

	public Color getCellBackground(TreeNodeItem treeNodeItem, int columnIndex) {
		return null;
	}

	public Color getCellForeground(TreeNodeItem treeNodeItem, int columnIndex) {
		return null;
	}

	@Override
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

	@Override
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

				ListData[] dataList = this.listDataMap.get(columnConfig
						.getProperty());

				value = dataList[((Integer) value).intValue()].getData();

			}
			Class dataType;
			if (StringUtils.isNotEmpty(columnConfig.getDataType())) {
				dataType = Class.forName(columnConfig.getDataType());
			} else {
				dataType = String.class;
			}

			if (value == null) {
				PropertyUtils.setProperty(
						((TreeNodeItem) element).getUserObject(),
						columnProperty, null);
			} else if (value.getClass().equals(dataType)
					|| ClassUtils.getAllSuperclasses(value.getClass())
							.contains(dataType)
					|| ClassUtils.getAllInterfaces(value.getClass()).contains(
							dataType)) {

				PropertyDescriptor propertyDesc = PropertyUtils
						.getPropertyDescriptor(
								((TreeNodeItem) element).getUserObject(),
								columnProperty);

				if (propertyDesc.getPropertyType().equals(dataType)) {
					PropertyUtils.setProperty(
							((TreeNodeItem) element).getUserObject(),
							columnProperty, value);
				} else if (propertyDesc.getPropertyType().equals(
						BigDecimal.class)) {
					if (StringUtils.isEmpty(String.valueOf(value))) {
						PropertyUtils.setProperty(
								((TreeNodeItem) element).getUserObject(),
								columnProperty, null);

					} else {
						PropertyUtils.setProperty(
								((TreeNodeItem) element).getUserObject(),
								columnProperty, new BigDecimal((String) value));

					}
				}

			} else {

				if (BigDecimal.class.equals(dataType)
						&& StringUtils.isEmpty(String.valueOf(value))) {

					PropertyUtils.setProperty(
							((TreeNodeItem) element).getUserObject(),
							columnProperty, new BigDecimal(0));

				} else {

					Object convertedValue = ConvertUtils.convert(
							StringUtils.isEmpty(String.valueOf(value)) ? null
									: String.valueOf(value), dataType);
					PropertyUtils.setProperty(
							((TreeNodeItem) element).getUserObject(),
							columnProperty, convertedValue);
				}
			}

			this.update((TreeNodeItem) element);
		} catch (Exception ex) {
			logger.error("Row Object[" + element + "] Property [" + property
					+ "] not found", ex);
		}
	}

	public Object[] getSlectedUserObjects() {
		IStructuredSelection selection = (IStructuredSelection) this.treeViewer
				.getSelection();

		Object[] objects = new Object[selection.size()];

		Object[] selectedItems = selection.toArray();

		for (int i = 0; i < selectedItems.length; i++) {
			TreeNodeItem treeNodeItem = (TreeNodeItem) selectedItems[i];

			objects[i] = treeNodeItem.getUserObject();
		}

		return objects;
	}

	public TreeNodeItem[] getSlectedTreeNodeItems() {
		IStructuredSelection selection = (IStructuredSelection) this.treeViewer
				.getSelection();

		TreeNodeItem[] objects = new TreeNodeItem[selection.size()];

		Object[] selectedItems = selection.toArray();

		for (int i = 0; i < selectedItems.length; i++) {
			TreeNodeItem treeNodeItem = (TreeNodeItem) selectedItems[i];

			objects[i] = treeNodeItem;
		}

		return objects;
	}

	public void refreshTree() {
		this.rootNodeItem.setDirty(true);
		this.treeViewer.refresh(this.rootNodeItem, true);
		this.treeViewer.expandToLevel(this.treeViewProvider
				.getDefaultExpandToLevel());
	}

	public void refresh() {

		Object[] objectse = this.treeViewer.getExpandedElements();

		if (ArrayUtils.isEmpty(objectse)) {
			this.rootNodeItem.setDirty(true);
			this.treeViewer.refresh(this.rootNodeItem, true);
		} else {

			for (int i = 0; i < objectse.length; i++) {
				TreeNodeItem treeNodeItem = (TreeNodeItem) objectse[i];
				treeNodeItem.setDirty(true);
				this.treeViewer.refresh(treeNodeItem, true);
			}
		}

	}

	public void refresh(TreeNodeItem treeNodeItem) {
		if (treeNodeItem == null) {
			refresh();
		} else {
			treeNodeItem.setDirty(true);
			this.treeViewer.refresh(treeNodeItem, true);
		}
	}

	public void update(TreeNodeItem treeNodeItem) {

		update(new TreeNodeItem[] { treeNodeItem });
	}

	public void update(TreeNodeItem[] treeNodeItems) {
		if (this.columnProperties.isEmpty() == false) {

			this.treeViewer.update(treeNodeItems, this.columnProperties
					.toArray(new String[this.columnProperties.size()]));
		} else if (StringUtils.isNotBlank(treeNodeItems[0].getNodeConfig()
				.getLabel())) {
			this.treeViewer
					.update(treeNodeItems, new String[] { treeNodeItems[0]
							.getNodeConfig().getLabel() });
		}

	}

	private ColumnBean getColumnConfig(String aPropertyName) {

		ColumnBean columnConfig = null;

		ColumnBean[] columnConfigs = this.treeViewProvider.getTableConfig()
				.getColumns();

		for (int i = 0; i < columnConfigs.length; i++) {
			ColumnBean bean = columnConfigs[i];
			if (bean.getProperty().equals(aPropertyName)) {
				columnConfig = bean;
				break;
			}
		}

		return columnConfig;

	}

	@Override
	protected void buildContextMenu(IMenuManager menuMgr) {
		try {
			this.treeViewProvider.buildContextMenu(menuMgr);
			super.buildContextMenu(menuMgr);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public String[] getSelectedItemActionGroupIds() {
		TreeNodeItem[] selectedItems = getSlectedTreeNodeItems();

		String[] actiongroupIds = new String[0];

		if (ArrayUtils.isNotEmpty(selectedItems)) {
			TreeNodeItem treeNodeItem = selectedItems[0];

			actiongroupIds = treeNodeItem.getActionGroupIds();
		}

		return actiongroupIds;
	}

	@Override
	public StructuredViewer getViewer() {
		return this.treeViewer;
	}

	@Override
	public void reLoadContent() {
		refreshTree();
	}

	protected void setSelection(TreeItem parentTreeItem, Object uerObject) {
		TreeItem[] treeItems = parentTreeItem != null ? parentTreeItem
				.getItems() : this.treeViewer.getTree().getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			if (treeItem.getData() != null
					&& uerObject.equals(((TreeNodeItem) treeItem.getData())
							.getUserObject())) {
				StructuredSelection selection = new StructuredSelection(
						new Object[] { treeItem.getData() });
				this.treeViewer.setSelection(selection);
			} else if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				setSelection(treeItem, uerObject);
			}
		}
	}

	public void setSelection(Object uerObject) {

		setSelection(null, uerObject);

	}

	public void clearCheckedItems() {

		TreeItem[] treeItems = this.treeViewer.getTree().getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			treeItem.setChecked(false);
			if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				clearCheckedItems(treeItem);
			}

		}

		this.treeViewer.setSelection(null);
	}

	private void clearCheckedItems(TreeItem parentTreeItem) {

		TreeItem[] treeItems = parentTreeItem.getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			treeItem.setChecked(false);
			if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				clearCheckedItems(treeItem);
			}

		}
	}

	public void setCheckedItems(Object[] objects) {

		TreeItem[] treeItems = this.treeViewer.getTree().getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			treeItem.setChecked(false);
			for (int j = 0; j < objects.length; j++) {
				if (((TreeNodeItem) treeItem.getData()).getUserObject().equals(
						objects[j])) {
					treeItem.setChecked(true);
				}
			}

			if (treeItem.getExpanded()
					&& ArrayUtils.isNotEmpty(treeItem.getItems())) {
				setCheckedItems(treeItem, objects);
			}

		}
	}

	private void setCheckedItems(TreeItem parentTreeItem, Object[] objects) {

		TreeItem[] treeItems = parentTreeItem.getItems();

		boolean allChecked = true;

		boolean atLastCheckeOn = false;

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			treeItem.setChecked(false);
			for (int j = 0; j < objects.length; j++) {
				if (((TreeNodeItem) treeItem.getData()).getUserObject().equals(
						objects[j])) {
					treeItem.setChecked(true);
					atLastCheckeOn = true;
				}
			}

			if (treeItem.getChecked() == false) {
				allChecked = false;
			}

			if (treeItem.getExpanded()
					&& ArrayUtils.isNotEmpty(treeItem.getItems())) {
				setCheckedItems(treeItem, objects);
			}

		}

		if (allChecked) {
			parentTreeItem.setChecked(true);
			parentTreeItem.setGrayed(false);
		} else if (atLastCheckeOn && allChecked == false) {
			parentTreeItem.setChecked(true);
			parentTreeItem.setGrayed(true);
		}
	}

	public List<TreeNodeItem> getCheckedTreeNodeItems() {

		List<TreeNodeItem> treeNodeItems = new ArrayList<TreeNodeItem>();

		TreeItem[] treeItems = this.treeViewer.getTree().getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			if (treeItem.getChecked() == true) {
				treeNodeItems.add((TreeNodeItem) treeItem.getData());
			}

			if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				getCheckedTreeNodeItems(treeItem, treeNodeItems);
			}
		}

		return treeNodeItems;
	}

	private void getCheckedTreeNodeItems(TreeItem parentTreeItem,
			List<TreeNodeItem> list) {

		TreeItem[] treeItems = parentTreeItem.getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			if (treeItem.getChecked() == true) {
				list.add((TreeNodeItem) treeItem.getData());
			}

			if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				getCheckedTreeNodeItems(treeItem, list);
			}
		}
	}

	public List<Object> getCheckedUserObjects() {

		List<Object> objects = new ArrayList<Object>();

		TreeItem[] treeItems = this.treeViewer.getTree().getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			if (treeItem.getChecked() == true) {
				objects.add(((TreeNodeItem) treeItem.getData()).getUserObject());
			}

			if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				getCheckedUserObjects(treeItem, objects);
			}
		}

		return objects;
	}

	private void getCheckedUserObjects(TreeItem parentTreeItem,
			List<Object> list) {

		TreeItem[] treeItems = parentTreeItem.getItems();

		for (int i = 0; i < treeItems.length; i++) {
			TreeItem treeItem = treeItems[i];
			if (treeItem.getChecked() == true) {
				list.add(((TreeNodeItem) treeItem.getData()).getUserObject());
			}

			if (ArrayUtils.isNotEmpty(treeItem.getItems())) {
				getCheckedUserObjects(treeItem, list);
			}
		}
	}

	@Override
	public void treeCollapsed(TreeEvent e) {

	}

	@Override
	public void treeExpanded(TreeEvent e) {

		//this.treeViewer.refresh(true);

	}

}
