package net.ui.model.validate;

import java.io.InputStream;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.Form;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.ValidatorResources;
import org.apache.commons.validator.ValidatorResult;
import org.apache.commons.validator.ValidatorResults;

public class ValidatorAgent {

	private static transient Log log = LogFactory.getLog(ValidatorAgent.class);

	private static ValidatorResources resources = null;

	private static ResourceBundle applicationResource;

	public ValidatorAgent() {
	}

	public static void init(InputStream aValidatorRule, ResourceBundle anApplicationResource) throws Exception {

		resources = new ValidatorResources(aValidatorRule);

		applicationResource = anApplicationResource;
	}

	public static void init(URL aValidatorRule, ResourceBundle anApplicationResource) throws Exception {
		resources = new ValidatorResources(aValidatorRule.openStream());
		applicationResource = anApplicationResource;
	}

	public static void initialize(InputStream in, ResourceBundle anApplicationResource) throws Exception {
		applicationResource = anApplicationResource;
		resources = new ValidatorResources(in);

	}

	public static ErrorMessages validator(String aFormKey, Object aBean) throws Exception {
		ErrorMessages errorMessages = new ErrorMessages();

		Validator validator = new Validator(resources, aFormKey);

		validator.setParameter(Validator.BEAN_PARAM, aBean);

		ValidatorResults results = null;

		results = validator.validate();

		Form form = resources.getForm(Locale.getDefault(), aFormKey);

		Iterator<String> propertyNames = results.getPropertyNames().iterator();

		while (propertyNames.hasNext()) {

			String propertyName = (String) propertyNames.next();

			// Get the Field associated with that property in the Form
			Field field = (Field) form.getField(propertyName);

			String prettyFieldName = applicationResource.getString(field.getArg(0).getKey());

			List arrayList = new ArrayList();

			Map map = field.getVars();
			for (Iterator iter = map.keySet().iterator(); iter.hasNext();) {
				String item = (String) iter.next();
				if (item != null && field.getVarValue(item) != null)
					arrayList.add(field.getVarValue(item));
			}

			ValidatorResult result = results.getValidatorResult(propertyName);

			// Map actionMap = result.getActionMap();

			Iterator keys = result.getActions();

			while (keys.hasNext()) {
				String actName = (String) keys.next();

				ValidatorAction action = resources.getValidatorAction(actName);

				log.debug(propertyName + "[" + actName + "] (" + (result.isValid(actName) ? "ͨ��" : "ʧ��") + ")");

				if (!result.isValid(actName)) {

					String message = applicationResource.getString(action.getMsg());

					Object[] args = { prettyFieldName };

					errorMessages.addError(MessageFormat.format(message, arrayList.toArray()));

					log.debug("У�������Ϣ: " + MessageFormat.format(message, args));

				}
			}

		}

		return errorMessages;

	}

}