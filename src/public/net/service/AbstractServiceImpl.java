package net.service;

import java.io.Serializable;

import net.ui.model.validate.ErrorMessages;
import net.ui.model.validate.ValidateService;

public abstract class AbstractServiceImpl implements Serializable {

	private static final ValidateService validateService = null;

	// (ValidateService) SpringContextAgent
	// .getBean("validateService");

	public static ValidateService getValidateService() {
		return validateService;
	}

	protected void validator(String aId, Object aObj) throws Exception {

		if (aObj == null) {
			throw new IllegalArgumentException("The parameter can not be null");
		}

		ErrorMessages errorMessages = new ErrorMessages();

		if (aObj.getClass().isArray()) {

			Object[] objects = (Object[]) aObj;
			for (int i = 0; i < objects.length; i++) {
				ErrorMessages errors = getValidateService().validator(aId,
						objects[i]);

				errorMessages.addErrors(errors);
			}

		} else {

			errorMessages.addErrors(getValidateService().validator(aId, aObj));

		}

		if (errorMessages.isEmpty() == false) {
			processValidateError(aId, aObj, errorMessages);
		}
	}

	abstract protected void processValidateError(String aId, Object aObj,
			ErrorMessages aErrorMessages) throws Exception;

}
