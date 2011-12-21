package net.ui.eclipse.wizard;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.reflect.MethodUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Control;

public abstract class AbstractReflectWizardProvider extends
		AbstractWizardProvider {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractReflectWizardProvider.class);

	private Map<Control, Object> pageHelperChace = new HashMap<Control, Object>();

	abstract protected Object getReflectObject(Control control);

	@Override
	public boolean canFlipToNextPage(IWizardPage wizardPage) {
		Object result = invokeMethod("canFlipToNextPageControl",
				wizardPage.getControl());
		if (result instanceof Boolean) {
			return ((Boolean) result).booleanValue();
		} else {
			return BooleanUtils.toBoolean(result.toString());
		}

	}

	@Override
	public void doNextWizardPage(IWizardPage wizardPage) {
		invokeMethod("doNextWizardPageControl", wizardPage.getControl());

	}

	@Override
	public void onActiveWizardPageChanged(IWizardPage wizardPage) {
		invokeMethod("onActiveWizardPageControlChanged",
				wizardPage.getControl());

	}

	@Override
	public void initWizardPage(IWizardPage wizardPage) {

		invokeMethod("initWizardPageControl", wizardPage.getControl());

	}

	// protected Map<String, IComboListProvider<?>> getFormComboListProvider(
	// GridFormComposite formComposite) {
	//
	// return (Map<String, IComboListProvider<?>>) invokeMethod(
	// "getFormComboListProvider", formComposite);
	// }

	protected Object invokeMethod(String methodName, Control control) {

		Object reflectObject = pageHelperChace.get(control);

		if (reflectObject == null) {
			reflectObject = getReflectObject(control);

			if (reflectObject instanceof AbstractReflectWizardPageControlHelper) {
				((AbstractReflectWizardPageControlHelper<Control>) reflectObject)
						.setWizardPageControl(control);
			}

			pageHelperChace.put(control, reflectObject);
		}

		List<Class> allClassList = new ArrayList<Class>();

		allClassList.add(control.getClass());

		allClassList.addAll(ClassUtils.getAllSuperclasses(control.getClass()));

		Method method = null;

		for (Iterator<Class> iterator = allClassList.iterator(); iterator
				.hasNext();) {
			Class clazz = (Class) iterator.next();
			method = MethodUtils.getAccessibleMethod(reflectObject.getClass(),
					methodName, clazz);

			if (method != null) {
				break;
			}
		}

		if (method != null) {
			try {
				return MethodUtils.invokeMethod(reflectObject, methodName,
						control);
			} catch (Exception e) {
				logger.error("invoke " + methodName + " Error", e);
				return null;
			}
		} else {
			logger.warn("No Method '" + methodName + "' found in Class "
					+ reflectObject.getClass());
			return null;
		}
	}

}
