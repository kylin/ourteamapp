package net.ui.eclipse.form;

import net.ui.eclipse.ImageChache;
import net.ui.model.form.FormPropertyBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

abstract public class AbstractColorChooserPropertyComosite<T> extends
		AbstractFormPropertyComosite<T> {

	private Text colorText;

	private RGB selectedRGB;

	public AbstractColorChooserPropertyComosite(Composite parent, int style) {
		super(parent, style);
	}

	abstract protected String rgbToString(RGB rgb);

	abstract protected RGB stringToRgb(String rgbStr);

	@Override
	public void setValue(String aId, Object aValue) {

		FormPropertyBean propertyBean = getFormComposite()
				.getFormPropertyConfig(aId);

		if (StringUtils.isEmpty(propertyBean.getDataType())
				|| "java.lang.String".equals(propertyBean.getDataType())) {

			selectedRGB = stringToRgb(aValue != null ? (String) aValue : "");

		} else {
			selectedRGB = (RGB) aValue;
		}

		if (selectedRGB != null) {
			Color color = new Color(getDisplay(), selectedRGB);
			colorText.setBackground(color);
			colorText.setForeground(color);
			colorText.setText(selectedRGB.toString());
		}
	}

	@Override
	public Object getValue(String aId) {
		FormPropertyBean propertyBean = getFormComposite()
				.getFormPropertyConfig(aId);

		if (StringUtils.isEmpty(propertyBean.getDataType())
				|| "java.lang.String".equals(propertyBean.getDataType())) {

			return rgbToString(selectedRGB);
		} else {
			return selectedRGB;
		}
	}

	@Override
	public void addModifyListener(ModifyListener listener) {
		colorText.addModifyListener(listener);
	}

	@Override
	public void removeModifyListener(ModifyListener listener) {
		colorText.removeModifyListener(listener);
	}

	@Override
	protected void createContent(Composite parent) {

		GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false)
				.applyTo(parent);

		colorText = new Text(parent, SWT.BORDER | SWT.READ_ONLY | SWT.SEARCH
				| SWT.ICON_SEARCH);

		colorText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button button = new Button(parent, SWT.PUSH);

		button.setImage(ImageChache.getImage("/16X16/select_by_color.png"));

		button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				widgetDefaultSelected(e);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				selectedRGB = openColorDialog();
				if (selectedRGB != null) {
					Color color = new Color(getDisplay(), selectedRGB);
					colorText.setBackground(color);
					colorText.setForeground(color);
					colorText.setText(selectedRGB.toString());
				}

			}
		});

	}

	protected RGB openColorDialog() {

		ColorDialog colorDialog = new ColorDialog(getShell());

		if (this.selectedRGB != null) {
			colorDialog.setRGB(selectedRGB);
		}

		RGB result = colorDialog.open();

		return result;
	}

}
