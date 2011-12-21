package net.ui.eclipse.viewpart;

import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.table.AbstractDataNavigationActionHandler;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IWorkbenchPart;

abstract public class AbstractPagebleTableViewPart<T> extends
		AbstractTableViewPart<T> {

	public AbstractPagebleTableViewPart() {
		super();

	}

	abstract protected int getTotalDataCount() throws Exception;

	abstract protected T[] getDataList(int start, int count) throws Exception;

	@Override
	protected String[] getToolbarActionGrous() {

		return new String[] { "dataNavigationActionActionGroup" };
	}

	protected ICustomActionControl getCustomActionControl() {
		return new ICustomActionControl() {

			@Override
			public Control customAction(final ToolItem toolItem,
					ActionBean actionBean) {
				if ("showCurrentPageNum".equals(actionBean.getId())) {
					Label text = new Label(toolItem.getParent(), SWT.CENTER
							| SWT.BORDER);
					toolItem.setWidth(80);
					return text;

				} else {
					return null;
				}

			}
		};

	}

	@Override
	protected String[] getMenuActionGrous() {

		return null;
	}

	@Override
	public void refresh() {
		try {
			((PagebleTableViewActionHandler) this.getActionHandler())
					.retrievePageDataList();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public class PagebleTableViewActionHandler extends
			AbstractDataNavigationActionHandler<T> {

		public PagebleTableViewActionHandler(IWorkbenchPart workbenchPart) {
			super(workbenchPart);
		}

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			boolean flag = super.isActionEnable(aAction);

			if (flag == true) {

				if ("delete".equalsIgnoreCase(aAction.getId())) {
					if (getSelectedData().isEmpty()) {
						flag = false;
					}
				}

			}
			return flag;
		}

		@Override
		public int getTotalDataCount() throws Exception {

			return AbstractPagebleTableViewPart.this.getTotalDataCount();
		}

		@Override
		public T[] getDataList(int start, int count) throws Exception {

			return AbstractPagebleTableViewPart.this.getDataList(start, count);
		}

		@Override
		public TableViewComposite<T> getTableViewComposite() {

			return AbstractPagebleTableViewPart.this.getTableViewComposite();
		}
	}

}
