package com.ourteam.app.utils.ant;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tools.ant.BuildListener;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

public class AntRunUtils {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(AntRunUtils.class);

	public static void runAnt(File baseDir, URL buildFile,
			Properties properties, BuildListener buildListener)
			throws Exception {

		Project antProject = new Project();

		antProject.init();

		if (properties != null) {
			Set<String> propertyNames = properties.stringPropertyNames();

			for (Iterator<String> iterator = propertyNames.iterator(); iterator
					.hasNext();) {
				String property = (String) iterator.next();
				antProject.setProperty(property,
						properties.getProperty(property));
			}
		}

		antProject.setBaseDir(baseDir);

		if (buildListener != null) {
			antProject.addBuildListener(buildListener);
		}

		antProject.fireBuildStarted();

		ProjectHelper projectHelper = ProjectHelper.getProjectHelper();

		try {
			projectHelper.parse(antProject, buildFile);
			antProject.addReference("ant.projectHelper", projectHelper);
			antProject.executeTarget(antProject.getDefaultTarget());
			antProject.fireBuildFinished(null);
		} catch (Exception e) {
			logger.debug(antProject.getProperties());
			logger.error("Ant Run Error", e);
			antProject.fireBuildFinished(e);
		}
	}
}
