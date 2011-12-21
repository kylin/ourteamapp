package net.ui.eclipse.table;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.table.TableBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolItem;

@Deprecated
public abstract class AbstractDataNavigationTableViewComposite<T> extends
		TableViewComposite<T> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractDataNavigationTableViewComposite.class);

	private AbstractDataNavigationActionHandler<T> dataNavigationActionHandler;

	private ToolBarComposite dataNavigationToolBarComposite;

	public AbstractDataNavigationTableViewComposite(Composite parent,
			TableBean aTableConfig, int style) {
		super(parent, aTableConfig, style);
	}

	public AbstractDataNavigationTableViewComposite(Composite parent,
			TableBean aTableConfig, int style, boolean editable) {
		super(parent, aTableConfig, style, editable);
	}

	protected String getDataNavigationActionGroupId() {
		return "dataNavigationActionActionGroup";
	}

	abstract protected int doGetTotalDataCount() throws Exception;

	abstract protected T[] doGetDataList(int start, int count) throws Exception;

	@Override
	protected ToolBarComposite createFootToolBar(Composite composite) {
		ActionGroupBean actionGroupBean = UIConfigFactory.getInstance()
				.getActionGroupConfig(getDataNavigationActionGroupId());

		dataNavigationActionHandler = new AbstractDataNavigationActionHandler<T>(null) {

			@Override
			public int getTotalDataCount() throws Exception {
				return doGetTotalDataCount();
			}

			@Override
			public T[] getDataList(int start, int count) throws Exception {
				return doGetDataList(start, count);
			}

			@Override
			public TableViewComposite<T> getTableViewComposite() {
				return AbstractDataNavigationTableViewComposite.this;
			}

		};

		dataNavigationToolBarComposite = new ToolBarComposite(composite,
				new ActionGroupBean[] { actionGroupBean },
				dataNavigationActionHandler, SWT.FLAT | SWT.WRAP) {

			@Override
			protected Control customAction(final ToolItem toolItem,
					ActionBean actionBean) {
				if ("showCurrentPage".equals(actionBean.getId())) {
					Label text = new Label(toolItem.getParent(), SWT.CENTER
							| SWT.BORDER);
					toolItem.setWidth(80);
					return text;

				}
				
				return super.customAction(toolItem, actionBean);
			}

		};

		try {
			dataNavigationActionHandler.retrievePageDataList();

			dataNavigationToolBarComposite.update();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return dataNavigationToolBarComposite;
	}

	public AbstractDataNavigationActionHandler<T> getDataNavigationActionHandler() {
		return dataNavigationActionHandler;
	}

	public void refresh() {
		try {
			this.dataNavigationActionHandler.retrievePageDataList();
		} catch (Exception e) {
			logger.error("retrievePageDataList error", e);
			throw new RuntimeException(e);
		}
	}

}
