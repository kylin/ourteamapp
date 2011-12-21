package net.ui.eclipse.editorpart;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.table.AbstractDataNavigationActionHandler;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IWorkbenchPart;

abstract public class AbstractPagebleTableViewerEditorPart<K, T extends IDataModelEditorInput<K>, M>
		extends AbstractTableViewerEditorPart<K, T, M> {

	private Label currentPageLabel;

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "dataNavigationEditorActionGroup" };
	}

	abstract protected int getTotalDataCount() throws Exception;

	abstract protected M[] getDataList(int start, int count) throws Exception;

	@Override
	public IActionHandler createActionHandler() {
		return new PagebleTableViewActionHandler(this);
	}

	public void loadDataList() throws Exception {
		PagebleTableViewActionHandler actionHandler = ((PagebleTableViewActionHandler) this
				.getActionHandler());

		actionHandler.retrievePageDataList();

	}

	@Override
	public ICustomActionControl getCustomActionControl() {
		return new ICustomActionControl() {

			@Override
			public Control customAction(final ToolItem toolItem,
					ActionBean actionBean) {
				if ("showCurrentPageNum".equals(actionBean.getId())) {
					currentPageLabel = new Label(toolItem.getParent(),
							SWT.CENTER | SWT.BORDER);
					toolItem.setWidth(60);
					currentPageLabel.setFont(new Font(currentPageLabel
							.getFont().getDevice(), "", 16, SWT.BOLD));
					return currentPageLabel;

				} else {
					return null;
				}

			}
		};
	}

	@Override
	final protected M[] getDataList(K dataModel) throws Exception {

		return null;
	}

	public class PagebleTableViewActionHandler extends
			AbstractDataNavigationActionHandler<M> {

		public PagebleTableViewActionHandler(IWorkbenchPart partSite) {
			super(partSite);
		}

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			boolean flag = super.isActionEnable(aAction);

			if (flag == true) {

				if ("delete".equalsIgnoreCase(aAction.getId())) {
					if (getSelectedItems().isEmpty()) {
						flag = false;
					}
				}

			}

			if (currentPageLabel != null
					&& currentPageLabel.isDisposed() == false) {
				currentPageLabel.setText(getActionLabel(UIConfigFactory
						.getInstance().getActionBean("showCurrentPageNum")));
			}

			return flag;
		}

		@Override
		public int getTotalDataCount() throws Exception {

			return AbstractPagebleTableViewerEditorPart.this
					.getTotalDataCount();
		}

		@Override
		public M[] getDataList(int start, int count) throws Exception {

			M[] result = AbstractPagebleTableViewerEditorPart.this.getDataList(
					start, count);

			return result;
		}

		@Override
		public TableViewComposite<M> getTableViewComposite() {

			return AbstractPagebleTableViewerEditorPart.this
					.getTableComposite();
		}
	}

}
