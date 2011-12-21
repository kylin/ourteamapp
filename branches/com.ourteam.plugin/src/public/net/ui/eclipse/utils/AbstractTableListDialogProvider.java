package net.ui.eclipse.utils;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.table.TableBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractTableListDialogProvider<T> extends
		AbstractDialogProvider {

	private TableViewComposite<T> tableViewComposite;

	private List<T> selectedDataList;

	private ToolBarComposite toolBarComposite;

	private IActionHandler actionHandler;

	abstract protected String getTableConfigId();

	abstract protected List<T> getDataList() throws Exception;

	protected String getActionGroupId() {
		return null;
	}
	
	protected IActionHandler createActionHandler() {
		return null;
	}

	protected boolean isShowCheckBox() {
		return false;
	}

	@Override
	public void createContentComposite(Composite parent) throws Exception {

		TableBean tableBean = UIConfigFactory.getInstance().getTableConfig(
				getTableConfigId());

		int style = SWT.BORDER;

		if (isShowCheckBox()) {
			style = style | SWT.CHECK;
		}
		
		this.actionHandler = createActionHandler();

		tableViewComposite = new TableViewComposite<T>(parent, tableBean, style) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {
				String actionGroupId = getActionGroupId();
				if (StringUtils.isNotBlank(actionGroupId)) {
					toolBarComposite = new ToolBarComposite(composite,
							UIConfigFactory.getInstance().getActionGroupConfig(
									actionGroupId), actionHandler, SWT.NONE);

					return toolBarComposite;
				} else {
					return super.createHeadToolBar(composite);
				}

			}

		};

		tableViewComposite.setDataList(getDataList());

		if (this.toolBarComposite != null) {
			this.toolBarComposite.update();
		}

	}

	@Override
	public boolean doOkPressed() throws Exception {

		selectedDataList = tableViewComposite.getSelectedDataList();

		return true;
	}

	public List<T> getSelectedDataList() {
		return selectedDataList;
	}

	public TableViewComposite<T> getTableViewComposite() {
		return tableViewComposite;
	}

}
