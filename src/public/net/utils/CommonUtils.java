package net.utils;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class CommonUtils {

	public static String getExpressionVaue(String expression, String startTage,
			String endTag, Object bean) throws Exception {

		String[] properties = StringUtils.substringsBetween(expression,
				startTage, endTag);

		if (ArrayUtils.isNotEmpty(properties)) {

			for (int i = 0; i < properties.length; i++) {
				Object value = PropertyUtils.getProperty(bean, properties[i]);
				if (value != null) {
					expression = StringUtils.replace(expression, startTage
							+ properties[i] + endTag, String.valueOf(value));
				}
			}
		}
		
		return expression;
	}
}
