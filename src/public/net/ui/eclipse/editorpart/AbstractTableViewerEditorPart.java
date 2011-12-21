package net.ui.eclipse.editorpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.table.ISortListener;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.widget.AbstractDataListTableComposite;
import net.ui.eclipse.widget.ISearchCallback;
import net.ui.eclipse.widget.ISearchFormProvider;
import net.ui.eclipse.widget.SearchDataModel;
import net.ui.model.table.TableBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.Section;

public abstract class AbstractTableViewerEditorPart<K, T extends IDataModelEditorInput<K>, M>
		extends AbstractViewerEditorPart<K, T> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractTableViewerEditorPart.class);

	private AbstractDataListTableComposite<M> dataListTableComposite;

	private String sortColumnProperty;

	private boolean sortUp;

	protected abstract String getTableConfigId();

	protected abstract M[] getDataList(K dataModel) throws Exception;

	protected boolean isEditable() {
		return false;
	}

	public boolean allowMultiSelection() {
		return true;
	}

	@Override
	public boolean showCheckBox() {
		return false;
	}

	protected ISearchFormProvider<? extends SearchDataModel> getSearchFormProvider() {
		return null;
	}

	protected TableBean getTableConfig() {
		TableBean tableBean = UIConfigFactory.getInstance().getTableConfig(
				getTableConfigId());

		return tableBean;
	}

	@Override
	public void doCreatePartControl(Composite parent) {

		parent.setLayout(new GridLayout());

		ISearchFormProvider<? extends SearchDataModel> searchFormProvider = getSearchFormProvider();

		if (searchFormProvider != null) {

			final Section section = toolkit.createSection(parent,
					Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);

			section.setText("查询条件");

			section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			section.addExpansionListener(new ExpansionAdapter() {
				public void expansionStateChanged(ExpansionEvent e) {
					section.layout(true);
					form.getBody().layout(true);
				}
			});

			Composite searchClient = toolkit.createComposite(section);

			searchFormProvider.createContent(searchClient);

			section.setClient(searchClient);

			searchFormProvider.addSearchCallback(new ISearchCallback() {
				@Override
				public void doSearch(SearchDataModel searchDataModel)
						throws Exception {
					section.setExpanded(false);
				}

			});

		}

		int style = SWT.NONE;

		if (allowMultiSelection()) {
			style = style | SWT.MULTI;
		}

		if (showCheckBox()) {
			style = style | SWT.CHECK;
		}

		Composite tableComposite = toolkit.createComposite(parent);

		tableComposite.setLayout(new FillLayout());

		tableComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		this.dataListTableComposite = new AbstractDataListTableComposite<M>(
				tableComposite, style) {

			@Override
			protected TableBean getTableConfig() {
				return AbstractTableViewerEditorPart.this.getTableConfig();
			}

			@Override
			protected String[] getActionGroupIds() {
				return null;
			}

			@Override
			protected void onSelectionChanged(IStructuredSelection selection) {
				updateActionStatus();
				AbstractTableViewerEditorPart.this
						.onSelectionChanged(selection);
			}

			@Override
			protected void onDoubleClick(IStructuredSelection selection) {
				AbstractTableViewerEditorPart.this.onDoubleClick(selection);
			}

			@Override
			protected boolean isEditable() {
				return AbstractTableViewerEditorPart.this.isEditable();
			}

			@Override
			protected String[] getSelectedItemActionGroupIds(
					List<M> selectedItems) {
				return AbstractTableViewerEditorPart.this
						.getSelectedItemActionGroupIds(selectedItems);
			}

		};

		this.dataListTableComposite.setActionHandler(this.getActionHandler());

		this.dataListTableComposite.getTableComposite().addSortListener(
				new ISortListener() {

					@Override
					public void onSort(String property, boolean isUp)
							throws Exception {
						sortColumnProperty = property;

						sortUp = isUp;

						loadDataList();

					}
				});

	}

	protected String[] getSelectedItemActionGroupIds(List<M> selectedItems) {
		return new String[0];
	}

	public String[] getSelectItemContextActionGroupIds() {
		return new String[0];
	}

	public String getSortColumnProperty() {
		return sortColumnProperty;
	}

	public boolean isSortUp() {
		return sortUp;
	}

	public void loadDataList() throws Exception {
		form.setBusy(true);

		final List<M> dataList = new ArrayList<M>();

		Job job = new Job("加载数据...") {

			protected IStatus run(final IProgressMonitor monitor) {
				try {
					M[] dataArray = getDataList(getDataModel());

					dataList.addAll(Arrays.asList(dataArray));

					return Status.OK_STATUS;

				} catch (Exception e) {
					return new Status(IStatus.ERROR, getSite().getPluginId(),
							"加载数据异常", e);
				}

			}
		};

		job.setUser(true);

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {
				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						form.setBusy(false);
						if (event.getResult().isOK()) {
							dataListTableComposite.getTableComposite()
									.setDataList(dataList);

							StringBuffer message = new StringBuffer();

							message.append("  ").append(" 共")
									.append(dataList.size()).append("条信息");

							getEditorSite().getActionBars()
									.getStatusLineManager()
									.setMessage(message.toString());

							updateActionStatus();

						} else {
							logger.error("loadDataList Error", event
									.getResult().getException());

							setErrorMessages(new String[] { "加载数据异常 ： "
									+ event.getResult().getException()
											.getLocalizedMessage() });
						}
					}
				});
			}
		});

		job.schedule();

	}

	public List<M> getSelectedItems() {
		if (this.dataListTableComposite.getTableComposite() == null) {
			return new ArrayList<M>();
		}
		return this.dataListTableComposite.getTableComposite()
				.getSelectedDataList();
	}

	@Override
	public void dispose() {
		this.dataListTableComposite.dispose();
		super.dispose();
	}

	public TableViewComposite<M> getTableComposite() {
		return this.dataListTableComposite.getTableComposite();
	}

	@Override
	protected void saveDataModel(K aDataModel) throws Exception {

	}

	@Override
	protected void reloadDataModel() throws Exception {
		loadDataList();
	}

	@Override
	public Viewer getViewer() {
		return this.dataListTableComposite.getTableComposite().getTableViewer();
	}

}
