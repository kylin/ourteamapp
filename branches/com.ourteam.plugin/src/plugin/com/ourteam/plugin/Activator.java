package com.ourteam.plugin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(Activator.class);

	// The plug-in ID
	public static final String PLUGIN_ID = "DeveloperAssistant"; //$NON-NLS-1$

	private static final String[] applictionContexts = new String[] {
			"applicationContext-plugin.xml", "applicationContext-api.xml" };

	// The shared instance
	private static Activator plugin;

	protected AbstractApplicationContext applictionContext;

	/**
	 * The constructor
	 */
	public Activator() {
		this.plugin = this;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		try {

			applictionContext = new ClassPathXmlApplicationContext(
					applictionContexts);

			logger.info("Application Context Started");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		applictionContext.stop();
	}
}
