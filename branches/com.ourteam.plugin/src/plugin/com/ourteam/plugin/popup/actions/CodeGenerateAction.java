package com.ourteam.plugin.popup.actions;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IActionDelegate;

import com.ourteam.app.modelbase.utils.BusinessCodeGenerateContext;
import com.ourteam.app.modelbase.utils.BusinessCodeGenerateUtils;
import com.ourteam.app.modelbase.utils.IBusinessCodeGenerateListener;
import com.ourteam.plugin.modelbase.ModelBaseContext;

public class CodeGenerateAction extends AbstractJavaProjectAction {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(CodeGenerateAction.class);

	private PropertiesConfiguration configuration;

	/**
	 * Constructor for Action1.
	 */
	public CodeGenerateAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(final IAction action) {

		
		File projectDir = this.javaProject.getProject().getLocation().toFile();

		File configFile = new File(projectDir, ".ourteam");

		try {
			configuration = new PropertiesConfiguration(configFile);
		} catch (Exception e) {
			logger.error("", e);
		}

		final File sourceDir = new File(projectDir, StringUtils.remove(
				this.packageFragmentRoot.getPath().toOSString(),
				this.javaProject.getPath().toOSString()));

		Job job = new Job(action.getText()) {
			protected IStatus run(final IProgressMonitor monitor) {
				try {

					final BusinessCodeGenerateContext generateContext = BusinessCodeGenerateUtils
							.startGeneration();

					generateContext.setBaseDirectory(sourceDir);

					Configuration daoConfiguration = configuration
							.subset("generator.DAO");

					for (Iterator<String> iterator = daoConfiguration.getKeys(); iterator
							.hasNext();) {
						String key = iterator.next();
						generateContext.getDaoGenerateConfig().put(key,
								daoConfiguration.getString(key));
					}

					Configuration serviceConfiguration = configuration
							.subset("generator.Service");

					for (Iterator<String> iterator = serviceConfiguration
							.getKeys(); iterator.hasNext();) {
						String key = iterator.next();
						generateContext.getDaoGenerateConfig().put(key,
								serviceConfiguration.getString(key));
					}

					List<String> modelIds = configuration.getList("generator."
							+ packageFragmentRoot.getPath().toString());

					final long[] packageIds = new long[modelIds.size()];

					for (int i = 0; i < packageIds.length; i++) {
						packageIds[i] = Long.parseLong(modelIds.get(i));
					}

					generateContext
							.addGenerateListener(new IBusinessCodeGenerateListener() {

								@Override
								public void fireBeginGeneration(int totalCount) {
									monitor.beginTask(action.getText(),
											totalCount);
								}

								@Override
								public void fireBusinessCodeGenerated(
										int index, Object businessObjectBean) {

									monitor.subTask("完成量 ("
											+ index
											+ "/"
											+ generateContext
													.getTotalBusinessObjectCount()
											+ ")");

									monitor.worked(1);

								}

								@Override
								public void fireBusinessCodeGenerateError(
										int index, Object businessObjectBean,
										final Exception e) {

									shell.getDisplay().asyncExec(
											new Runnable() {
												public void run() {
													MessageDialog.openError(
															shell,
															"Error",
															e.getLocalizedMessage());
												}
											});
									logger.error("BusinessObjectGenerateError",
											e);

								}
							});

					BusinessCodeGenerateUtils.generateBusinessFileObjects(
							generateContext, packageIds);

					monitor.done();

					return Status.OK_STATUS;

				} catch (Exception e) {
					logger.error("gen code error", e);
					return Status.CANCEL_STATUS;
				}

			}
		};

		job.setPriority(Job.SHORT);

		job.setUser(true);

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {

				shell.getDisplay().asyncExec(new Runnable() {
					public void run() {
						try {
							javaProject.getProject().refreshLocal(
									IResource.DEPTH_INFINITE, null);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		job.schedule();
	}
}
