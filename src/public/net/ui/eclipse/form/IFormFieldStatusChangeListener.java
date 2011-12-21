package net.ui.eclipse.form;

import java.util.Map;

import org.eclipse.swt.widgets.Widget;

public interface IFormFieldStatusChangeListener {

	void fieldStatusChanged(String formPropertyId, Map<String, Widget> formWidgetMap);

}
