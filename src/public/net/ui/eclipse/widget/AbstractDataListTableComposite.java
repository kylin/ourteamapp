package net.ui.eclipse.widget;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.table.TableBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractDataListTableComposite<K> extends
		AbstractComposite implements ISelectionChangedListener,
		IDoubleClickListener, FocusListener {

	public AbstractDataListTableComposite(Composite parent, int style) {
		super(parent, style);
	}

	private TableViewComposite<K> tableComposite;

	private ToolBarComposite toolBarComposite;

	private IActionHandler actionHandler;

	protected abstract String[] getActionGroupIds();

	protected boolean isEditable() {
		return false;
	}

	protected int getTableStyle() {
		return SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI | getStyle();
	}

	protected abstract TableBean getTableConfig();

	@Override
	protected void createContent(Composite parent) {

		TableBean tableBean = getTableConfig();

		parent.setLayout(new FillLayout());

		final String[] actionGroupIds = getActionGroupIds();

		tableComposite = new TableViewComposite<K>(parent, tableBean,
				getTableStyle(), isEditable()) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {
				if (ArrayUtils.isNotEmpty(actionGroupIds)) {
					ActionGroupBean[] actionGroupBeans = new ActionGroupBean[actionGroupIds.length];

					for (int i = 0; i < actionGroupIds.length; i++) {
						String actionGroupId = actionGroupIds[i];
						actionGroupBeans[i] = UIConfigFactory.getInstance()
								.getActionGroupConfig(actionGroupId);
					}

					toolBarComposite = new ToolBarComposite(composite,
							actionGroupBeans, actionHandler, SWT.FLAT
									| SWT.HORIZONTAL);

					return toolBarComposite;

				} else {
					return null;
				}
			}

			@Override
			public String[] getSelectedItemActionGroupIds() {
				return AbstractDataListTableComposite.this
						.getSelectedItemActionGroupIds(tableComposite
								.getSelectedDataList());
			}

		};

		tableComposite.getTableViewer().addSelectionChangedListener(this);

		tableComposite.getTableViewer().addDoubleClickListener(this);

		tableComposite.getTable().addFocusListener(this);

	}

	protected String[] getSelectedItemActionGroupIds(List<K> selectedItems) {
		return new String[0];
	}

	public TableViewComposite<K> getTableComposite() {
		return tableComposite;
	}

	public ToolBarComposite getToolBarComposite() {
		return toolBarComposite;
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (this.toolBarComposite != null) {
			this.toolBarComposite.update();
		}

		onSelectionChanged((IStructuredSelection) event.getSelection());
	}

	protected void onSelectionChanged(IStructuredSelection selection) {

	}

	@Override
	public void doubleClick(DoubleClickEvent event) {
		if (event.getSelection().isEmpty() == false) {
			onDoubleClick((IStructuredSelection) event.getSelection());
		}
	}

	protected void onDoubleClick(IStructuredSelection selection) {

	}

	@Override
	public void focusGained(FocusEvent event) {
		if (this.toolBarComposite != null) {
			this.toolBarComposite.update();
		}
	}

	@Override
	public void focusLost(FocusEvent event) {

	}

	@Override
	public void dispose() {
		this.tableComposite.dispose();
		if (this.toolBarComposite != null) {
			this.toolBarComposite.dispose();
		}
		super.dispose();
	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

	public void setActionHandler(IActionHandler actionHandler) {
		this.actionHandler = actionHandler;
		if(this.tableComposite != null){
			this.tableComposite.setActionHandler(this.actionHandler);
		}
		if (this.toolBarComposite != null) {
			this.toolBarComposite.setActionHandler(this.actionHandler);
			this.toolBarComposite.update();
		}
	}

}
