package net.ui.model.validate;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.util.ValidatorUtils;

public class CommonValidator {
	/**
	 * Checks if the field is required.
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field isn't <code>null</code> and has a length
	 *         greater than zero, <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateRequired(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return !GenericValidator.isBlankOrNull(value);
	}

	/**
	 * Checks if the field can be successfully converted to a <code>byte</code>.
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field can be successfully converted to a
	 *         <code>byte</code> <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateByte(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isByte(value);
	}

	/**
	 * Checks if the field can be successfully converted to a <code>short</code>
	 * .
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field can be successfully converted to a
	 *         <code>short</code> <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateShort(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isShort(value);
	}

	/**
	 * Checks if the field can be successfully converted to a <code>int</code>.
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field can be successfully converted to a
	 *         <code>int</code> <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateInt(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isInt(value);
	}

	/**
	 * Checks if the field can be successfully converted to a <code>long</code>.
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field can be successfully converted to a
	 *         <code>long</code> <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateLong(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isLong(value);
	}

	/**
	 * Checks if the field can be successfully converted to a <code>float</code>
	 * .
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field can be successfully converted to a
	 *         <code>float</code> <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateFloat(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isFloat(value);
	}

	/**
	 * <p>
	 * Checks if the value's length is greater than or equal to the min.
	 * </p>
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @param min
	 *            The minimum length.
	 */
	public static boolean validateIntRange(Object bean, Field field) {
		String value = null;
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (!GenericValidator.isBlankOrNull(value)) {
			try {
				int intValue = Integer.parseInt(value);
				int min = Integer.parseInt(field.getVarValue("min"));
				int max = Integer.parseInt(field.getVarValue("max"));

				if (!GenericValidator.isInRange(intValue, min, max)) {

					return false;

				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;

	}

	public static boolean validateFloatRange(Object bean, Field field) {
		String value = null;
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (!GenericValidator.isBlankOrNull(value)) {
			try {
				float intValue = Float.parseFloat(value);
				float min = Float.parseFloat(field.getVarValue("min"));
				float max = Float.parseFloat(field.getVarValue("max"));

				if (!GenericValidator.isInRange(intValue, min, max)) {

					return false;

				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;

	}

	public static boolean validateGreateThenEqual(Object bean, Field field) {
		String value = null;
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (!GenericValidator.isBlankOrNull(value)) {
			try {
				int intValue = Integer.parseInt(value);
				int greateThen = Integer.parseInt(field
						.getVarValue("greateThen"));

				if (!(intValue >= greateThen)) {

					return false;

				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;

	}

	public static boolean validateGreateThen(Object bean, Field field) {
		String value = null;
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (!GenericValidator.isBlankOrNull(value)) {
			try {
				int intValue = Integer.parseInt(value);
				int greateThen = Integer.parseInt(field
						.getVarValue("greateThen"));

				if (!(intValue > greateThen)) {

					return false;

				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;

	}

	public static boolean validateFloatGreateThen(Object bean, Field field) {
		String value = null;
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (!GenericValidator.isBlankOrNull(value)) {
			try {
				float intValue = Float.parseFloat(value);
				float greateThen = Float.parseFloat(field
						.getVarValue("greateThen"));

				if (!(intValue > greateThen)) {

					return false;

				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;

	}

	public static boolean validateFloatGreateThenEqual(Object bean, Field field) {
		String value = null;
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (!GenericValidator.isBlankOrNull(value)) {
			try {
				float intValue = Float.parseFloat(value);
				float greateThen = Float.parseFloat(field
						.getVarValue("greateThen"));

				if (!(intValue >= greateThen)) {

					return false;

				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;

	}

	/**
	 * Checks if the field can be successfully converted to a
	 * <code>double</code>.
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field can be successfully converted to a
	 *         <code>double</code> <code>true</code> is returned. Otherwise
	 *         <code>false</code>.
	 */
	public static boolean validateDouble(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isDouble(value);
	}

	/**
	 * Checks if the field is an e-mail address.
	 * 
	 * @param value
	 *            The value validation is being performed on.
	 * @return boolean If the field is an e-mail address <code>true</code> is
	 *         returned. Otherwise <code>false</code>.
	 */
	public static boolean validateEmail(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		return GenericValidator.isEmail(value);
	}

	public final static String FIELD_TEST_NULL = "NULL";

	public final static String FIELD_TEST_NOTNULL = "NOTNULL";

	public final static String FIELD_TEST_EQUAL = "EQUAL";

	protected static boolean validateIf(Object bean, Field field,
			Validator validator) {
		Object form = validator.getParameterValue(Validator.BEAN_PARAM);

		boolean required = false;

		int i = 0;
		String fieldJoin = "AND";
		if (!GenericValidator.isBlankOrNull(field.getVarValue("fieldJoin"))) {
			fieldJoin = field.getVarValue("fieldJoin");
		}
		if (fieldJoin.equalsIgnoreCase("AND")) {
			required = true;
		}
		while (!GenericValidator.isBlankOrNull(field.getVarValue("field[" + i
				+ "]"))) {
			String dependProp = field.getVarValue("field[" + i + "]");
			String dependTest = field.getVarValue("fieldTest[" + i + "]");
			String dependTestValue = field.getVarValue("fieldValue[" + i + "]");
			String dependIndexed = field.getVarValue("fieldIndexed[" + i + "]");
			if (dependIndexed == null)
				dependIndexed = "false";
			String dependVal = null;
			boolean this_required = false;
			if (field.isIndexed() && dependIndexed.equalsIgnoreCase("true")) {
				String key = field.getKey();
				if ((key.indexOf("[") > -1) && (key.indexOf("]") > -1)) {
					String ind = key.substring(0, key.indexOf(".") + 1);
					dependProp = ind + dependProp;
				}
			}
			dependVal = ValidatorUtils.getValueAsString(form, dependProp);
			if (dependTest.equals(FIELD_TEST_NULL)) {
				if ((dependVal != null) && (dependVal.length() > 0)) {
					this_required = false;
				} else {
					this_required = true;
				}
			}
			if (dependTest.equals(FIELD_TEST_NOTNULL)) {
				if ((dependVal != null) && (dependVal.length() > 0)) {
					this_required = true;
				} else {
					this_required = false;
				}
			}
			if (dependTest.equals(FIELD_TEST_EQUAL)) {
				this_required = dependTestValue.equalsIgnoreCase(dependVal);
			}
			if (fieldJoin.equalsIgnoreCase("AND")) {
				required = required && this_required;
			} else {
				required = required || this_required;
			}
			i++;
		}

		return required;
	}

	public static boolean validateRequiredIf(Object bean, Field field,
			Validator validator) {

		String value = null;

		boolean required = validateIf(bean, field, validator);

		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (required) {
			if ((value != null) && (value.length() > 0)) {
				return true;
			}
			return false;
		}
		return true;
	}

	public static boolean validateEmailIf(Object bean, Field field,
			Validator validator) {

		String value = null;
		boolean required = validateIf(bean, field, validator);
		if (isString(bean)) {
			value = (String) bean;
		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}

		if (required) {
			if (GenericValidator.isEmail(value)) {
				return true;
			}
			return false;
		}
		return true;
	}
	
	public static boolean validateIntRangeIf(Object bean, Field field,
			Validator validator) {

		
		boolean required = validateIf(bean, field, validator);
		
		if (required) {
			if (validateIntRange(bean,field)) {
				return true;
			}
			return false;
		}
		return true;
	}

	public static boolean validateMaxLength(Object bean, Field field) {
		String value = ValidatorUtils.getValueAsString(bean, field
				.getProperty());

		if (!GenericValidator.isBlankOrNull(value)) {
			try {

				int maxLength = Integer.parseInt(field.getVarValue("maxLength"));

				if (!GenericValidator.maxLength(value, maxLength)) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;
	}

	private static Class stringClass = new String().getClass();

	private static boolean isString(Object o) {
		if (o == null)
			return true;
		return (stringClass.isInstance(o));
	}

}