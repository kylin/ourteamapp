package com.ourteam.app.middleware.editor;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.FormPropertyTypeConst;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormPropertyBean;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.Section;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.middleware.ui.MiddleWareProviderComboListProvider;
import com.ourteam.app.middleware.utils.IMiddleWareToolExecutor;
import com.ourteam.app.middleware.utils.MiddleWareToolExecuteUtils;
import com.ourteam.hr.domain.EmployeeBean;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolInputBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareManageEditorPart
		extends
		AbstractEditorPart<MiddleWareManageToolExecuteBean, MiddleWareManageToolExecuteEditorInput> {

	private Browser consoleOutputText;

	private String outputBuffer = "";

	private String errorBuffer = "";

	private Browser consoleErrorText;

	private Text commandIutputText;

	private IMiddleWareToolExecutor toolExecutor;

	private String refreshId;

	private Timer timerFresh;

	private boolean isToolExecuted = false;

	private CLabel showExecuteStatus;

	private TabFolder tabFolder;

	private Map<String, Object> inputMap = new HashMap<String, Object>();

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "middleWareToolEditorActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected void reloadDataModel() throws Exception {

	}

	@Override
	protected void doCreatePartControl(Composite parent) {

		parent.setLayout(new GridLayout());

		final Section section = toolkit.createSection(parent,
				Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);

		section.setText("服务器信息");

		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				if (section.isExpanded()) {
					section.setLayoutData(new GridData(GridData.FILL_BOTH));
				} else {
					section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}
				form.getBody().layout(true);
			}
		});

		Composite middleWareInfoClient = toolkit.createComposite(section);

		createMiddleWareInfoForm(middleWareInfoClient);

		section.setClient(middleWareInfoClient);

		final Section scriptSection = toolkit.createSection(parent,
				Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);

		scriptSection.setText("工具脚本信息");

		scriptSection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		scriptSection.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				if (scriptSection.isExpanded()) {
					scriptSection
							.setLayoutData(new GridData(GridData.FILL_BOTH));
				} else {
					scriptSection.setLayoutData(new GridData(
							GridData.FILL_HORIZONTAL));
				}
				form.getBody().layout(true);
			}
		});

		Composite middleWareToolInfoClient = toolkit
				.createComposite(scriptSection);

		createMiddleWareToolInfoForm(middleWareToolInfoClient);

		scriptSection.setClient(middleWareToolInfoClient);

		Composite composite = toolkit.createComposite(parent);

		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		createToolComposite(composite);

		updateActionStatus();

	}

	private void createMiddleWareToolInfoForm(Composite composite) {

		composite.setLayout(new FillLayout());

		FormBean middleWareToolForm = UIConfigFactory.getInstance()
				.getFormConfig("middleWareTooScritpForm");

		middleWareToolForm.setFormModel(FormBean.VIEW_MODEL);

		GridFormComposite<MiddleWareToolBean> middleWareToolInfo = new GridFormComposite<MiddleWareToolBean>(
				composite, middleWareToolForm, SWT.READ_ONLY);

		middleWareToolInfo.setFormDataModel(getDataModel()
				.getMiddleWareToolBean());
	}

	private void createMiddleWareInfoForm(Composite composite) {

		composite.setLayout(new FillLayout());

		FormBean middleWareForm = null;

		final MiddleWareTypeEnum middleWareTypeEnum = MiddleWareTypeEnum
				.getEnum(getDataModel().getMiddleWareBean().getType());

		if (MiddleWareTypeEnum.DATABASE_SERVER.equals(middleWareTypeEnum)) {
			middleWareForm = UIConfigFactory.getInstance().getFormConfig(
					"databaseInfoForm");
		} else if (MiddleWareTypeEnum.APPLICATION_SERVER
				.equals(middleWareTypeEnum)) {
			middleWareForm = UIConfigFactory.getInstance().getFormConfig(
					"databaseInfoForm");
		} else if (MiddleWareTypeEnum.CVS_SERVER.equals(middleWareTypeEnum)) {
			middleWareForm = UIConfigFactory.getInstance().getFormConfig(
					"cvsServerInfoForm");
		} else if (MiddleWareTypeEnum.SVN_SERVER.equals(middleWareTypeEnum)) {
			middleWareForm = UIConfigFactory.getInstance().getFormConfig(
					"svnServerInfoForm");
		}

		middleWareForm.setFormModel(FormBean.VIEW_MODEL);

		GridFormComposite<MiddleWareBean> middleWareInfo = new GridFormComposite<MiddleWareBean>(
				composite, middleWareForm, SWT.READ_ONLY) {

			@Override
			protected void initFormOptionListDataProviders(
					Map<String, IFormOptionListDataProvider> listDataProiverMap) {

				super.initFormOptionListDataProviders(listDataProiverMap);

				listDataProiverMap.put("getMiddleWareProviderList",
						new FormOptionListDataProviderAdapter(
								new MiddleWareProviderComboListProvider(
										middleWareTypeEnum)));

			}

		};

		middleWareInfo.setFormDataModel(getDataModel().getMiddleWareBean());

	}

	public void createToolComposite(Composite composite) {

		composite.setLayout(new FillLayout());

		Group consoleGroup = new Group(composite, SWT.NONE);

		consoleGroup.setText("输出控制台");

		consoleGroup.setLayout(new GridLayout(2, false));

		tabFolder = new TabFolder(consoleGroup, SWT.NONE);

		GridData consoleOutputLatoutData = new GridData(GridData.FILL_BOTH);

		consoleOutputLatoutData.horizontalSpan = 2;

		tabFolder.setLayoutData(consoleOutputLatoutData);

		TabItem outputTabItem = new TabItem(tabFolder, SWT.NONE);

		consoleOutputText = new Browser(tabFolder, SWT.NONE);

		outputTabItem.setControl(consoleOutputText);

		outputTabItem.setText("输出信息");

		TabItem errorTabItem = new TabItem(tabFolder, SWT.NONE);

		consoleErrorText = new Browser(tabFolder, SWT.NONE);

		errorTabItem.setControl(consoleErrorText);

		errorTabItem.setText("错误信息");

		new Label(consoleGroup, SWT.NONE).setText("命令输入");

		commandIutputText = new Text(consoleGroup, SWT.BORDER);

		commandIutputText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		commandIutputText.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					if (toolExecutor != null) {
						try {
							toolExecutor.writeInput(commandIutputText.getText());
							commandIutputText.setText("");
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});

	}

	@Override
	protected void saveDataModel(MiddleWareManageToolExecuteBean aDataModel)
			throws Exception {

	}

	public ICustomActionControl getCustomActionControl() {
		return new ICustomActionControl() {

			@Override
			public Control customAction(final ToolItem toolItem,
					ActionBean actionBean) {
				if ("showExecuteStatus".equals(actionBean.getId())) {
					showExecuteStatus = new CLabel(toolItem.getParent(),
							SWT.RIGHT);
					toolItem.setWidth(150);
					return showExecuteStatus;

				} else {
					return null;
				}

			}
		};
	}

	public class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("executeMiddleWareTool".equals(aAction.getId())) {
				return !isToolExecuted;
			} else if ("stopMiddleWareTool".equals(aAction.getId())) {
				return isToolExecuted;
			} else {
				return true;
			}
		}

		public void stopMiddleWareTool(ActionEvent actionEvent)
				throws Exception {

			if (toolExecutor != null) {
				resetExecutor();
			}

		}

		public void cleanMiddleWareToolOutput(ActionEvent actionEvent)
				throws Exception {

			toolExecutor.clear();

			consoleOutputText.setText("");

			consoleErrorText.setText("");
		}

		public void executeMiddleWareTool(ActionEvent actionEvent)
				throws Exception {

			final MiddleWareToolBean toolBean = getDataModel()
					.getMiddleWareToolBean();

			MiddleWareToolInputBean[] inputBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.getMiddleWareToolInputs(toolBean.getId());

			final FormBean inputForm = new FormBean();

			for (int i = 0; i < inputBeans.length; i++) {
				MiddleWareToolInputBean inputBean = inputBeans[i];
				FormPropertyBean formPropertyBean = new FormPropertyBean();

				formPropertyBean.setTitle(inputBean.getParameterName());
				formPropertyBean.setId(inputBean.getParameterCode());
				formPropertyBean.setTipInfo(inputBean.getRemarks());
				formPropertyBean.setAllowNull(new Boolean(!BooleanUtils
						.toBooleanObject(inputBean.getIsRequired())
						.booleanValue()));
				if ("text".equals(inputBean.getParameterType())) {
					formPropertyBean.setType(FormPropertyTypeConst.TEXT);
				} else if ("single".equals(inputBean.getParameterType())) {
					formPropertyBean.setType(FormPropertyTypeConst.COMBOLIST);
				} else if ("multi".equals(inputBean.getParameterType())) {
					formPropertyBean.setType(FormPropertyTypeConst.COMBOLIST);
				} else if ("boolean".equals(inputBean.getParameterType())) {
					formPropertyBean.setType(FormPropertyTypeConst.CHECKBOX);
				}

				inputForm.addFormProperty(formPropertyBean);
			}

			FormPropertyBean remarksFormPropertyBean = new FormPropertyBean();

			remarksFormPropertyBean.setId("executeRemarks");

			remarksFormPropertyBean.setType("ref");

			remarksFormPropertyBean.setValue("middleWareToolExecuteForm");

			inputForm.addFormProperty(remarksFormPropertyBean);

			AbstractFormDialogProvider<Map<String, Object>> dialogProvider = new AbstractFormDialogProvider<Map<String, Object>>(
					inputMap) {

				@Override
				public String getTitle() {
					return "执行'" + toolBean.getToolName() + "'";
				}

				@Override
				protected String getFormConfigId() {
					return null;
				}

				@Override
				protected FormBean getFormBean() {
					return inputForm;
				}

			};

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {

				toolExecutor = MiddleWareToolExecuteUtils
						.getMiddleWareToolExecutor(toolBean);

				toolExecutor.setShell(getShell());

				final EmployeeBean executor = null;

				isToolExecuted = true;

				updateActionStatus();
				
				form.setBusy(true);

				try {

					toolExecutor.setExecuteInput(inputMap);

					if ("shell".equals(toolBean.getToolScriptType())) {

						Map<String, String> hostInfo = new HashMap<String, String>();

						hostInfo.put("host", getDataModel().getMiddleWareBean()
								.getHostName());

						AbstractFormDialogProvider<Map<String, String>> loginDialogProvider = new AbstractFormDialogProvider<Map<String, String>>(
								hostInfo) {

							@Override
							public String getTitle() {
								return "登录主机";
							}

							@Override
							protected String getFormConfigId() {
								return "middleWareHostLoginForm";
							}

						};

						if (SWTUtils
								.openDialog(getShell(), loginDialogProvider)) {
							toolExecutor.setHost(hostInfo.get("host"));
							toolExecutor.setLoginId(hostInfo.get("loginId"));
							toolExecutor.setLoginPassword(hostInfo
									.get("loginPassword"));

							try {
								if (StringUtils
										.isNotBlank(hostInfo.get("port"))) {
									toolExecutor.setPort(MapUtils.getIntValue(
											hostInfo, "loginPassword"));
								} else {
									toolExecutor.setPort(0);
								}

							} catch (Exception e) {

							}
						}
					}

					new Thread() {

						@Override
						public void run() {
							try {
								toolExecutor.execute(getDataModel()
										.getMiddleWareBean().getId(),
										getDataModel().getMiddleWareToolBean()
												.getId(), executor);

							} catch (final Exception e) {
								getShell().getDisplay().asyncExec(
										new Runnable() {

											@Override
											public void run() {
												consoleErrorText.setText(StringUtils.replace(
														StringEscapeUtils
																.escapeHtml(e
																		.getLocalizedMessage()),
														SystemUtils.LINE_SEPARATOR,
														"<br/>"));

												tabFolder.setSelection(1);
											}
										});

							}
						}

					}.start();

					refreshId = toolBean.getToolName()
							+ System.currentTimeMillis();

					consoleOutputText.setText("");

					timerFresh = new Timer();

					timerFresh.schedule(new TimerTask() {

						@Override
						public void run() {

							getShell().getDisplay().asyncExec(new Runnable() {
								public void run() {

									try {

										updateActionStatus();

										String output = toolExecutor
												.readOutput();

										if (output != null
												&& outputBuffer != null
												&& output.length() != outputBuffer
														.length()) {

											outputBuffer = output;

											consoleOutputText.setText(StringUtils.replace(
													StringEscapeUtils
															.escapeHtml(outputBuffer),
													SystemUtils.LINE_SEPARATOR,
													"<br/>"));
										}

										String error = toolExecutor.readError();

										if (error != null
												&& errorBuffer != null
												&& error.length() != errorBuffer
														.length()) {

											errorBuffer = error;

											consoleErrorText.setText(StringUtils.replace(
													StringEscapeUtils
															.escapeHtml(errorBuffer),
													SystemUtils.LINE_SEPARATOR,
													"<br/>"));
										}

										if (toolExecutor.isFinished()
												&& isLogEnd(output)) {

											resetExecutor();

										} else {

											showExecuteStatus.setImage(ImageChache
													.getImage("lightbulb"));

											showExecuteStatus.setText(FileUtils
													.byteCountToDisplaySize(output
															.getBytes().length));

										}

									} catch (Exception e) {
										e.printStackTrace();
										resetExecutor();

										showExecuteStatus.setImage(ImageChache
												.getImage("lightbulb_off"));

										showExecuteStatus.setText("执行异常:"
												+ e.getLocalizedMessage());

									}

								}

							});
						}

					}, 0, 1500);

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	protected boolean isLogEnd(String output) {
		if (StringUtils.isNotBlank(getDataModel().getMiddleWareToolBean()
				.getCompleteKeyWork())) {
			return StringUtils.contains(output, getDataModel()
					.getMiddleWareToolBean().getCompleteKeyWork());
		} else {
			return true;
		}
	}

	protected void resetExecutor() {

		form.setBusy(false);

		if (timerFresh != null) {
			timerFresh.cancel();
			timerFresh = null;
		}

		if (this.toolExecutor != null) {
			this.toolExecutor.destroy();
		}

		outputBuffer = "";

		errorBuffer = "";

		showExecuteStatus.setImage(ImageChache.getImage("lightbulb_off"));

		showExecuteStatus.setText("执行结束");

		isToolExecuted = false;

		updateActionStatus();

	}

	@Override
	public void onClosed() {

		resetExecutor();

		super.onClosed();
	}

}
