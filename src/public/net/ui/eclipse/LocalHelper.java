package net.ui.eclipse;

import java.util.Locale;

import org.apache.commons.lang.reflect.MethodUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.JFaceResources;

public class LocalHelper {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(LocalHelper.class);
	
	private static boolean useRWT;

	private static Class rwtClass;

	private static IDialogConstants dialogConstants;

	static {
		try {
			rwtClass = Class.forName("org.eclipse.rwt.RWT");
			useRWT = true;
			logger.debug("Use org.eclipse.rwt.RWT For User Local");
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public static Locale getLocale() {
		if (useRWT) {
			try {
				return (Locale) MethodUtils.invokeStaticMethod(rwtClass,
						"getLocale", null);
			} catch (Exception e) {
				logger.error("org.eclipse.rwt.RWT.getLocale() Error", e);
				return null;
			}
		} else {
			return Locale.getDefault();
		}
	}

	public static String getDialogConstants(String id) {
		return JFaceResources.getString(id);
	}

}
