package net.ui.model.action;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CustomActionBean<T> extends ActionBean {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(CustomActionBean.class);

	private T userObject;

	public T getUserObject() {
		return userObject;
	}

	public void setUserObject(T userObject) {
		this.userObject = userObject;
	}

	public CustomActionBean(T userObject) {
		super();
		this.userObject = userObject;
	}

	public CustomActionBean() {
		super();
	}

	@Override
	public String getLabel() {
		if (StringUtils.startsWith(super.getLabel(), "${")
				&& StringUtils.endsWith(super.getLabel(), "}")) {
			String property = StringUtils.substringBetween(super.getLabel(),
					"${", "}");

			try {
				return String.valueOf(PropertyUtils.getProperty(
						this.userObject, property));
			} catch (Exception e) {
				logger.error("getLabel Error",e);
				return null;
			}

		} else {
			return super.getLabel();
		}

	}

}
