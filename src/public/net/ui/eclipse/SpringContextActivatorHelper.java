package net.ui.eclipse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SpringContextActivatorHelper {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(SpringContextActivatorHelper.class);

	protected AbstractApplicationContext applictionContext;

	private String[] applictionContexts;

	private Class resourceClass;

	public SpringContextActivatorHelper(String[] applictionContexts) {
		this(applictionContexts, null);
	}

	public SpringContextActivatorHelper(String[] applictionContexts,
			Class resourceClass) {
		super();
		this.applictionContexts = applictionContexts;
		this.resourceClass = resourceClass;
	}

	/**
	 * The constructor
	 */
	public SpringContextActivatorHelper() {
	}

	public void startApp(BundleContext context) throws Exception {
		try {

			if (this.resourceClass == null) {
				applictionContext = new ClassPathXmlApplicationContext(
						this.applictionContexts);
			} else {
				applictionContext = new ClassPathXmlApplicationContext(
						this.applictionContexts, this.resourceClass);
			}

			logger.info("Application Context Started");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stopApp(BundleContext context) throws Exception {
		applictionContext.stop();
	}

}
