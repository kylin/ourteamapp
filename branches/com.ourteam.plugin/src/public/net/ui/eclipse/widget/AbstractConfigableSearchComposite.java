package net.ui.eclipse.widget;

import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.model.form.FormBean;
import net.ui.model.table.TableBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractConfigableSearchComposite<T extends SearchDataModel, K>
		extends AbstractSearchComposite<K> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractConfigableSearchComposite.class);

	private GridFormComposite<T> queryFormComposite;

	private AbstractDataListTableComposite<K> resultTableComposite;

	abstract protected T createSearchDataModel();

	abstract protected String getQueryFormConfigId();

	protected FormBean getQueryFormConfig() {
		return UIConfigFactory.getInstance().getFormConfig(
				getQueryFormConfigId());
	}

	abstract protected String getQueryResultConfigId();

	protected TableBean getQueryResultConfig() {
		return UIConfigFactory.getInstance().getTableConfig(
				getQueryResultConfigId());
	}

	abstract protected K[] doSearch(T searchDataModel) throws Exception;

	protected String[] getActionGroupIds() {
		return null;
	}

	protected IActionHandler getActionHandler() {
		return null;
	}

	public AbstractConfigableSearchComposite(Composite parent, int style) {
		super(parent, style);
		setQueryDataModel(createSearchDataModel());
	}

	protected void doInitFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

	}

	@Override
	protected void createQueryArea(Composite parent) {
		FormBean formBean = getQueryFormConfig();
		parent.setLayout(new FillLayout());
		queryFormComposite = new GridFormComposite<T>(parent, formBean) {

			@Override
			protected void initFormOptionListDataProviders(
					Map<String, IFormOptionListDataProvider> listDataProiverMap) {
				super.initFormOptionListDataProviders(listDataProiverMap);
				doInitFormOptionListDataProviders(listDataProiverMap);
			}

		};
	}

	protected int getResultTableStyle() {
		return SWT.BORDER | SWT.FULL_SELECTION | SWT.SINGLE;
	}

	@Override
	protected void createResultArea(Composite parent) {
		final TableBean tableBean = getQueryResultConfig();
		parent.setLayout(new FillLayout());
		resultTableComposite = new AbstractDataListTableComposite<K>(parent,
				SWT.NONE) {

			@Override
			protected TableBean getTableConfig() {
				return tableBean;
			}

			@Override
			protected String[] getActionGroupIds() {
				return AbstractConfigableSearchComposite.this
						.getActionGroupIds();
			}

			@Override
			protected int getTableStyle() {
				return getResultTableStyle();
			}

		};

	}

	public void setActionHandler(IActionHandler actionHandler) {
		this.resultTableComposite.setActionHandler(actionHandler);
	}

	public void setQueryDataModel(T querDataModel) {
		this.queryFormComposite.setFormDataModel(querDataModel);
	}

	public T getQueryDataModel() {
		return this.queryFormComposite.getFormDataModel();
	}

	@Override
	protected K[] searchResults() {
		T queryDataModel = getQueryDataModel();

		try {
			return doSearch(queryDataModel);
		} catch (Exception e) {
			logger.error("search error", e);
			throw new RuntimeException(e);
		}

	}

	public void refreshResults() {
		updateResultArea(searchResults());
	}

	@Override
	protected void updateResultArea(K[] results) {
		this.resultTableComposite.getTableComposite().setDataList(results);
	}

	@Override
	public List<K> getSelectedSearchResults() {
		List<K> list = this.resultTableComposite.getTableComposite()
				.getSelectedDataList();
		return list;
	}

	public void addSelectionListener(SelectionListener listener) {
		this.resultTableComposite.getTableComposite().getTable()
				.addSelectionListener(listener);
	}

	public void removeSelectionListener(SelectionListener listener) {
		this.resultTableComposite.getTableComposite().getTable()
				.removeSelectionListener(listener);
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		this.resultTableComposite.getTableComposite().getTableViewer()
				.addSelectionChangedListener(listener);
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		this.resultTableComposite.getTableComposite().getTableViewer()
				.removeSelectionChangedListener(listener);
	}

}
