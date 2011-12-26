package com.ourteam.plugin.modelbase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

	public static void start() {

		if (started) {
			return;
		}

		try {

			applictionContext = new ClassPathXmlApplicationContext(
					applictionContexts);

			started = true;

			logger.info("Application Context Started");

		} catch (Exception e) {
			applictionContext = null;
			e.printStackTrace();
		}
	}

	public static void stop() {
		applictionContext.stop();
		applictionContext = null;
		started = false;
	}

	public static boolean isStarted() {
		return started;
	}

}
