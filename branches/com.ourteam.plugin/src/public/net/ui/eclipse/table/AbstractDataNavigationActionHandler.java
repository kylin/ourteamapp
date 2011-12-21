package net.ui.eclipse.table;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.model.action.ActionBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.Form;

abstract public class AbstractDataNavigationActionHandler<DataBean> extends
		AbstractDispatchActionHandler {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractDataNavigationActionHandler.class);

	private int pages;

	private int currentPage = 1;

	private int pageRowCount = 50;

	private int totalCount;

	private DataBean[] dataBeans;

	private IWorkbenchPart workbenchPart;

	public AbstractDataNavigationActionHandler(IWorkbenchPart workbenchPart) {
		super();
		this.workbenchPart = workbenchPart;
	}

	@Override
	public boolean isActionEnable(ActionBean aAction) {

		if ("goFirst".equals(aAction.getId())) {
			return this.currentPage > 1;
		} else if ("goPrevious".equals(aAction.getId())) {
			return this.currentPage > 1;
		} else if ("goNext".equals(aAction.getId())) {
			return this.currentPage < this.pages;
		} else if ("goLast".equals(aAction.getId())) {
			return this.currentPage < this.pages;
		} else {
			return true;
		}

	}

	@Override
	public boolean isActionSelected(ActionBean aAction) {
		if ("setRowCount".equals(aAction.getHandler())) {
			String rowCount = aAction.getId();

			return this.pageRowCount == Integer.parseInt(rowCount);
		} else {
			return super.isActionSelected(aAction);
		}

	}

	abstract public int getTotalDataCount() throws Exception;

	abstract public DataBean[] getDataList(int start, int count)
			throws Exception;

	abstract public TableViewComposite<DataBean> getTableViewComposite();

	public void refreshPage(ActionEvent actionEvent) throws Exception {
		retrievePageDataList();
	}

	public void goFirst(ActionEvent actionEvent) throws Exception {

		this.currentPage = 1;

		retrievePageDataList();
	}

	public void goPrevious(ActionEvent actionEvent) throws Exception {
		this.currentPage--;
		retrievePageDataList();
	}

	public void goNext(ActionEvent actionEvent) throws Exception {
		this.currentPage++;
		retrievePageDataList();
	}

	public void goLast(ActionEvent actionEvent) throws Exception {
		this.currentPage = this.pages;
		retrievePageDataList();
	}

	public void setRowCount(ActionEvent actionEvent) throws Exception {

		if (actionEvent.isChecked() == false) {
			return;
		}

		String rowCount = actionEvent.getActionBean().getId();

		this.pageRowCount = Integer.parseInt(rowCount);

		retrievePageDataList();

	}

	public void retrievePageDataList() throws Exception {
		final Form form = workbenchPart instanceof AbstractEditorPart ? ((AbstractEditorPart) workbenchPart)
				.getForm() : null;

		if (form != null) {
			form.setBusy(true);
		}

		Job job = new Job("加载数据...") {
			protected IStatus run(final IProgressMonitor monitor) {
				try {

					totalCount = getTotalDataCount();

					if (totalCount == 0) {
						pages = 1;
					} else if ((totalCount % pageRowCount) == 0) {
						pages = totalCount / pageRowCount;

					} else {
						pages = totalCount / pageRowCount + 1;
					}

					if (currentPage > pages) {
						currentPage = pages;
					}

					int start = (currentPage - 1) * pageRowCount;

					int limit = pageRowCount;

					if (totalCount < limit) {
						limit = totalCount;
					} else if ((totalCount - start) < limit) {
						limit = totalCount - start;
					}

					dataBeans = getDataList(start, limit);

					return Status.OK_STATUS;
				} catch (Exception e) {

					return new Status(IStatus.ERROR, workbenchPart.getSite()
							.getPluginId(), "加载数据异常", e);

				}

			}
		};

		job.setUser(true);

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {

				workbenchPart.getSite().getShell().getDisplay()
						.asyncExec(new Runnable() {
							public void run() {
								if (form != null) {
									form.setBusy(false);
								}
								if (event.getResult().isOK()
										&& getTableViewComposite().isDisposed() == false) {
									getTableViewComposite().setDataList(
											dataBeans);
									if (workbenchPart instanceof AbstractEditorPart) {
										((AbstractEditorPart) workbenchPart)
												.updateActionStatus();

										StringBuffer message = new StringBuffer();

										message.append("  ").append(" 共")
												.append(totalCount)
												.append("条信息");
										message.append("   第 ")
												.append(getCurrentPage())
												.append("/").append(getPages())
												.append(" 页");

										((AbstractEditorPart) workbenchPart)
												.getEditorSite()
												.getActionBars()
												.getStatusLineManager()
												.setMessage(message.toString());
									}

								} else {
									logger.error("加载数据异常", event.getResult()
											.getException());
									if (workbenchPart instanceof AbstractEditorPart) {
										((AbstractEditorPart) workbenchPart)
												.setErrorMessages(new String[] { "加载数据异常 ： "
														+ event.getResult()
																.getException()
																.getLocalizedMessage() });
									}

								}
							}
						});
			}
		});

		job.schedule();

	}

	public DataBean[] getDataBeans() {
		return dataBeans;
	}

	@Override
	public String getActionLabel(ActionBean aAction) {
		if ("showCurrentPageNum".equals(aAction.getId())) {
			return this.currentPage + "/" + this.pages;
		} else {
			return null;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPages() {
		return pages;
	}

	public int getPageRowCount() {
		return pageRowCount;
	}

}
