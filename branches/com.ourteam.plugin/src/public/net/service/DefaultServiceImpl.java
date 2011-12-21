package net.service;

import net.ui.model.validate.ErrorMessages;
import net.ui.model.validate.ValidateException;

public class DefaultServiceImpl extends AbstractServiceImpl {

	protected void processValidateError(String aId, Object aObj,
			ErrorMessages aErrorMessages) throws Exception {
		if (aErrorMessages.isEmpty() == false) {
			throw new ValidateException(aErrorMessages);
		}

	}

}
