package com.ourteam.app.workspace.editor;

import java.awt.Graphics;
import java.text.DecimalFormat;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractEditorPart;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ScrollBar;

import com.ourteam.app.utils.ResourceDiffentInfomation;
import com.ourteam.app.utils.SCMUtils;
import com.ourteam.app.workspace.CVSJobListener;
import com.ourteam.app.workspace.ICMSJobListener;
import com.ourteam.app.workspace.SVNJobListener;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.ResourceDiffentInfoEditorInput;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;
import com.qarks.util.CancellableImpl;
import com.qarks.util.files.diff.Diff;
import com.qarks.util.files.diff.FileDiffResult;
import com.qarks.util.files.diff.FileLine;

public class FileResourceDiffentEditor
		extends
		AbstractEditorPart<ResourceDiffentInfomation, ResourceDiffentInfoEditorInput> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(FileResourceDiffentEditor.class);

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private ScrolledComposite leftScrolledComposite;

	private Composite leftOverViewComposite;

	private ScrolledComposite rightScrolledComposite;

	private Composite rightOverViewComposite;

	private ScrollBar horizontalBar;
	private ScrollBar verticalBar;

	public static Color MOVED_COLOR = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
	public static Color INSERTED_COLOR = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
	public static Color DELETED_COLOR = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
	public static Color MODIFIED_COLOR = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
	public static Color CONFLICT_COLOR = DELETED_COLOR;
	public static Color WARNING_COLOR = MODIFIED_COLOR;

	public FileResourceDiffentEditor() {
		super();
		this.setAutoReload(false);
	}

	@Override
	protected void saveDataModel(ResourceDiffentInfomation aDataModel)
			throws Exception {

	}

	@Override
	protected void reloadDataModel() throws Exception {

		final ResourceDiffentInfomation[] versionLogInformation = new ResourceDiffentInfomation[1];

		final ResourceDiffentInfomation diffentInfoBean = getDataModel();

		final long workspaceId = diffentInfoBean.getResourceFileObject()
				.getWorkspaceId();

		final WorkspaceBean workspaceBean = WORKSPACE_SERVICE
				.getWorkspaceById(workspaceId);

		Job job = new Job("取得差异信息") {
			protected IStatus run(final IProgressMonitor monitor) {

				try {

					ICMSJobListener jobListener = null;

					WorkspaceConfigPropertyBean[] configPropertyBeans = SCMUtils
							.getWorkspaceSCMConfig(workspaceId);

					MiddleWareBean scmServer = SCMUtils
							.getSCMServer(configPropertyBeans);

					if (MiddleWareTypeEnum.CVS_SERVER.getName().equals(
							scmServer.getType())) {
						jobListener = new CVSJobListener(monitor);
					} else if (MiddleWareTypeEnum.SVN_SERVER.getName().equals(
							scmServer.getType())) {
						jobListener = new SVNJobListener(monitor);
					}

					versionLogInformation[0] = SCMUtils.showResourceDiffent(
							WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
							diffentInfoBean.getResourceFileObject()
									.getResourceFile(), diffentInfoBean
									.getLeftVersion(), diffentInfoBean
									.getRightVersion(), SCMUtils
									.getWorkspaceSCMConfig(workspaceId),
							jobListener);
					return Status.OK_STATUS;
				} catch (Exception e) {
					logger.error(e);
					return Status.CANCEL_STATUS;
				}

			}
		};

		job.setPriority(Job.LONG);

		job.setUser(true);

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {

				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {

						FileDiffResult fileDiffResult = Diff.diff(
								versionLogInformation[0].getLeftContent(),
								versionLogInformation[0].getRightContent(),
								new CancellableImpl(), true);

						fileDiffResult = Diff.format(fileDiffResult);

						FileLine[] leftFileLines = fileDiffResult.getLeftFile()
								.getLines();

						setDiffContent(leftScrolledComposite,
								leftOverViewComposite, leftFileLines);

						FileLine[] rightFileLines = fileDiffResult
								.getRightFile().getLines();

						setDiffContent(rightScrolledComposite,
								rightOverViewComposite, rightFileLines);

					}
				});
			}
		});

		job.schedule();

	}

	@Override
	public void doCreatePartControl(Composite parent) {

		ScroolBarSelectionListener selectionListener = new ScroolBarSelectionListener();

		ResourceDiffentInfomation diffentInfoBean = getDataModel();

		String fileName = diffentInfoBean.getResourceFileObject()
				.getResourceFile().getName();

		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout(2, true));

		Group leftGroup = new Group(composite, SWT.NONE);

		leftGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		leftGroup.setText(fileName + " " + diffentInfoBean.getLeftVersion());

		leftGroup.setLayout(new GridLayout(2, false));

		leftScrolledComposite = new ScrolledComposite(leftGroup, SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL);

		leftScrolledComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		leftOverViewComposite = new Composite(leftGroup, SWT.NONE);

		GridData overViewgridData = new GridData(GridData.FILL_VERTICAL);

		overViewgridData.widthHint = 15;

		leftOverViewComposite.setLayoutData(overViewgridData);

		leftScrolledComposite.getHorizontalBar().addSelectionListener(
				selectionListener);

		leftScrolledComposite.getVerticalBar().addSelectionListener(
				selectionListener);

		Group rightGroup = new Group(composite, SWT.NONE);

		rightGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		rightGroup.setText(fileName + " " + diffentInfoBean.getRightVersion());

		rightGroup.setLayout(new GridLayout(2, false));

		rightScrolledComposite = new ScrolledComposite(rightGroup, SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL);

		rightScrolledComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		rightOverViewComposite = new Composite(rightGroup, SWT.NONE);

		rightOverViewComposite.getBounds().width = 5;

		rightOverViewComposite.setLayoutData(overViewgridData);

		rightScrolledComposite.getHorizontalBar().addSelectionListener(
				selectionListener);

		rightScrolledComposite.getVerticalBar().addSelectionListener(
				selectionListener);

		horizontalBar = rightScrolledComposite.getHorizontalBar();
		verticalBar = rightScrolledComposite.getVerticalBar();

	}

	protected void setDiffContent(final ScrolledComposite composite,
			final Composite overViewComposite, FileLine[] fileLines) {

		final Composite content = new Composite(composite, SWT.NONE);

		GridLayout gridLayout = new GridLayout();

		gridLayout.marginBottom = 0;

		gridLayout.marginHeight = 0;

		gridLayout.marginLeft = 0;

		gridLayout.marginRight = 0;

		gridLayout.marginTop = 0;

		gridLayout.marginWidth = 0;

		gridLayout.horizontalSpacing = 0;

		gridLayout.verticalSpacing = 0;

		content.setLayout(gridLayout);

		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);

		rowLayout.spacing = 0;

		rowLayout.fill = true;

		rowLayout.wrap = false;

		overViewComposite.setLayout(rowLayout);

		int count = String.valueOf(fileLines.length).length();

		DecimalFormat lineNumberFormat = new DecimalFormat(StringUtils.repeat(
				"0", count));

		int totalHeight = composite.getBounds().height;

		CLabel tempLabel = new CLabel(content, SWT.NONE | SWT.LEFT);

		int rowHeight = tempLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;

		int lineHeight = rowHeight;

		if (fileLines.length > totalHeight / rowHeight) {
			lineHeight = totalHeight / fileLines.length;
			if (lineHeight <= 0) {
				lineHeight = 1;
			}
		}

		tempLabel.dispose();

		RowData rowData = new RowData(10, lineHeight);

		for (int i = 0; i < fileLines.length; i++) {
			FileLine line = fileLines[i];
			CLabel label = new CLabel(content, SWT.NONE | SWT.LEFT);
			label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			Composite overViewLabel = new Composite(overViewComposite, SWT.NONE);

			overViewLabel.setLayoutData(rowData);

			int lineIndex = line.getIndex();
			if (lineIndex > -1) {
				switch (line.getStatus()) {
				case FileLine.NO_MATCH:
					label.setBackground(INSERTED_COLOR);
					overViewLabel.setBackground(INSERTED_COLOR);
					break;
				case FileLine.DELETED_ON_OTHER_SIDE:
					label.setBackground(DELETED_COLOR);
					overViewLabel.setBackground(DELETED_COLOR);
					break;
				case FileLine.INSERTED_ON_OTHER_SIDE:
					label.setBackground(INSERTED_COLOR);
					overViewLabel.setBackground(INSERTED_COLOR);
					break;
				case FileLine.MOVED:
					label.setBackground(MOVED_COLOR);
					overViewLabel.setBackground(MOVED_COLOR);
					break;
				case FileLine.MODIFIED:
					label.setBackground(MODIFIED_COLOR);
					overViewLabel.setBackground(MODIFIED_COLOR);
					break;
				default:
					break;
				}

				int idx = line.getIndex();
				String text = line.getContent().replaceAll("\t", " ");

				label.setText(lineNumberFormat.format(idx + 1) + "   " + text);
			} else if (line.getStatus() == FileLine.INSERTED_ON_OTHER_SIDE) {

				label.setBackground(DELETED_COLOR);
				overViewLabel.setBackground(DELETED_COLOR);

				label.setText("-");
			} else {

				label.setText("-");
			}

		}

		composite.setContent(content);

		composite.setExpandHorizontal(true);
		composite.setExpandVertical(true);

		composite.setMinSize(content.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		composite.addControlListener(new ControlAdapter() {

			public void controlResized(ControlEvent e) {
				composite.setMinSize(content.computeSize(SWT.DEFAULT,
						SWT.DEFAULT));
			}
		});

	}

	class ScroolBarSelectionListener extends SelectionAdapter {
		public void widgetSelected(final SelectionEvent event) {

			if (event.getSource().equals(horizontalBar)
					|| event.getSource().equals(verticalBar)) {
				leftScrolledComposite.setOrigin(rightScrolledComposite
						.getOrigin());
			} else {
				rightScrolledComposite.setOrigin(leftScrolledComposite
						.getOrigin());
			}

		}
	}

	@Override
	public String[] getActionGroupIds() {
		return null;
	}

	@Override
	public IActionHandler createActionHandler() {
		return null;
	}

}
