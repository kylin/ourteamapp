package com.ourteam.plugin.modelbase;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ModelBaseContext {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(ModelBaseContext.class);

	private static final String[] applictionContexts = new String[] {
			"applicationContext-plugin.xml", "applicationContext-api.xml" };

	private static AbstractApplicationContext applictionContext;

	private static boolean started = false;

	public static void start(Shell shell) {

		if (started) {
			return;
		}

		IRunnableWithProgress op = new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				try {
					
					monitor.beginTask("连接配置库", 100);

					applictionContext = new ClassPathXmlApplicationContext(
							applictionContexts);
					
					monitor.worked(50);
					
					monitor.setTaskName("连接完成");

					started = true;

					logger.info("Application Context Started");
					
					monitor.worked(100);

				} catch (Exception e) {
					applictionContext = null;
					e.printStackTrace();
				}
			}

		};
		try {
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
			
			dialog.run(true, false, op);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void stop() {
		started = false;
	}

	public static boolean isStarted() {
		return started;
	}

}
