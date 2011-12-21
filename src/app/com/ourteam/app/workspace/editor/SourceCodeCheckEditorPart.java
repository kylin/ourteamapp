package com.ourteam.app.workspace.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.SourceCodeCheckResult;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;
import com.ourteam.app.workspace.ui.PMDRuleSetSubNodeBuilder;

import de.java2html.Java2Html;
import de.java2html.options.JavaSourceConversionOptions;

public class SourceCodeCheckEditorPart
		extends
		AbstractEditorPart<WorkspaceResourceFileObject, FileResourceEditorInput> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(SourceCodeCheckEditorPart.class);

	private TreeViewComposite treeViewComposite;

	private Browser codeView;

	private Browser exampleCodeView;

	private CLabel messageLabel;

	private CLabel checkResultLabel;

	private Composite checkTreeComposite;

	private List<String> priorityList = new ArrayList<String>();

	public SourceCodeCheckEditorPart() {
		super();
		priorityList.clear();
		priorityList.add("High");
		priorityList.add("Medium High");
		priorityList.add("Medium");
		priorityList.add("Medium Low");
		priorityList.add("Low");
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

	}

	@Override
	protected void reloadDataModel() throws Exception {
		if (treeViewComposite == null) {

			ITreeViewProvider treeViewProvider = new AbstractTreeTableViewProvider() {

				@Override
				public TableBean getTableConfig() {
					return UIConfigFactory.getInstance().getTableConfig(
							"PMDCheckResultTreeTable");
				}

				@Override
				public TreeBean getTreeConfig() {
					return UIConfigFactory.getInstance().getTreeConfig(
							"ui/work/pmd_check_result.tree");
				}

				@Override
				public void initSubNodeBuilder(String id,
						ISubNodeBuilder builder) {
					super.initSubNodeBuilder(id, builder);
					if (builder instanceof PMDRuleSetSubNodeBuilder) {
						((PMDRuleSetSubNodeBuilder) builder)
								.setWorkspaceResourceFileObject(getDataModel());

						((PMDRuleSetSubNodeBuilder) builder)
								.setPriorityList(priorityList);
					}
				}

			};

			treeViewComposite = new TreeViewComposite(checkTreeComposite,
					treeViewProvider);

			treeViewComposite.getTreeViewer().addSelectionChangedListener(
					new ISelectionChangedListener() {

						@Override
						public void selectionChanged(SelectionChangedEvent event) {

							if (ArrayUtils.isEmpty(treeViewComposite
									.getSlectedUserObjects())) {
								return;
							}
							Object selectObject = treeViewComposite
									.getSlectedUserObjects()[0];

							if (selectObject instanceof SourceCodeCheckResult) {
								try {
									showSourceCode((SourceCodeCheckResult) selectObject);
								} catch (Exception e) {
									MessageDialog.openError(getSite()
											.getShell(), "打开文件异常", e
											.getLocalizedMessage());

									logger.error("open file error", e);
								}
							}
						}
					});

			checkTreeComposite.layout(true);

		}
	}

	@Override
	public void doCreatePartControl(Composite parent) {

		parent.setLayout(new GridLayout());

		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);

		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));

		checkTreeComposite = new Composite(sashForm, SWT.NONE);

		checkTreeComposite.setLayout(new FillLayout());

		SashForm codeSashForm = new SashForm(sashForm, SWT.VERTICAL);

		Composite codeComposite = new Composite(codeSashForm, SWT.NONE);

		codeComposite.setLayout(new GridLayout());

		checkResultLabel = new CLabel(codeComposite, SWT.LEFT | SWT.BORDER);

		checkResultLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		checkResultLabel.setImage(ImageChache
				.getImage("check_error_item"));

		codeView = new Browser(codeComposite, SWT.BORDER);

		codeView.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite exampleComposite = new Composite(codeSashForm, SWT.NONE);

		exampleComposite.setLayout(new GridLayout());

		messageLabel = new CLabel(exampleComposite, SWT.LEFT | SWT.BORDER);

		messageLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		messageLabel.setImage(ImageChache
				.getImage("example_code"));

		messageLabel.setText("样例代码");

		exampleCodeView = new Browser(exampleComposite, SWT.BORDER);

		exampleCodeView.setLayoutData(new GridData(GridData.FILL_BOTH));

	}

	protected void showSourceCode(SourceCodeCheckResult checkResult)
			throws Exception {
		JavaSourceConversionOptions settings = JavaSourceConversionOptions
				.getDefault();

		settings.setShowTableBorder(false);

		List<String> lines = FileUtils.readLines(getDataModel()
				.getResourceFile());

		StringBuffer text = new StringBuffer();

		for (int i = checkResult.getBeginLine(); i <= checkResult.getEndLine(); i++) {
			text.append(lines.get(i - 1)).append(SystemUtils.LINE_SEPARATOR);
		}

		String codePage = Java2Html
				.convertToHtmlPage(text.toString(), settings);

		codeView.setText(StringUtils.replaceOnce(codePage,
				"charset=iso-8859-1", "charset=utf-8"));

		String examplePage = Java2Html.convertToHtmlPage(
				checkResult.getExample(), settings);

		exampleCodeView.setText(StringUtils.replaceOnce(examplePage,
				"charset=iso-8859-1", "charset=utf-8"));

		checkResultLabel.setText(checkResult.getLabel());

		checkResultLabel.setToolTipText(checkResult.getLabel());

	}

	class ActionHndler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return true;
		}

		@Override
		public boolean isActionVisible(ActionBean aAction) {
			return true;
		}

		public void refresh(ActionEvent actionEvent) throws Exception {
			treeViewComposite.refreshTree();
			codeView.setText("");

			exampleCodeView.setText("");

			checkResultLabel.setText("");
		}

		public void setCheckPriority(ActionEvent actionEvent) throws Exception {
			String priority;

			ActionBean actionBean = actionEvent.getActionBean();

			if ("heightPriority".equalsIgnoreCase(actionBean.getId())) {
				priority = "High";
			} else if ("mediumHeightPriority".equalsIgnoreCase(actionBean
					.getId())) {
				priority = "Medium High";
			} else if ("middlePriority".equalsIgnoreCase(actionBean.getId())) {
				priority = "Medium";
			} else if ("mediumLowPriority".equalsIgnoreCase(actionBean.getId())) {
				priority = "Medium Low";
			} else {
				priority = "Low";
			}

			if (priorityList.contains(priority)) {
				priorityList.remove(priority);
			} else {
				priorityList.add(priority);
			}

			refresh(actionEvent);

		}

		@Override
		public boolean isActionSelected(ActionBean actionBean) {

			String priority;

			if ("heightPriority".equalsIgnoreCase(actionBean.getId())) {
				priority = "High";
			} else if ("mediumHeightPriority".equalsIgnoreCase(actionBean
					.getId())) {
				priority = "Medium High";
			} else if ("middlePriority".equalsIgnoreCase(actionBean.getId())) {
				priority = "Medium";
			} else if ("mediumLowPriority".equalsIgnoreCase(actionBean.getId())) {
				priority = "Medium Low";
			} else {
				priority = "Low";
			}

			return priorityList.contains(priority);

		}

	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "sourceCodeCheckActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHndler();
	}

}
