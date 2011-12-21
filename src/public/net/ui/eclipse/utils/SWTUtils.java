/*
 * �������� 2005-7-19
 *
 */
package net.ui.eclipse.utils;

import net.ui.eclipse.wizard.ConfigableWizard;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.constlist.ListData;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * @author qilin
 * 
 */
public class SWTUtils {

	public static final String CUSTOM_WIDGET_ID = "org.eclipse.rwt.UITests#customId";

	/**
     * 
     */
	public SWTUtils() {
		super();
	}

	public static void clearCompositeChilds(Composite composite) {
		Control[] controls = composite.getChildren();

		for (int i = 0; i < controls.length; i++) {
			controls[i].dispose();
		}
	}

	public static void fillCommboBox(ListData[] aListDatas, Combo aCombo) {
		for (int i = 0; i < aListDatas.length; i++) {
			ListData data = aListDatas[i];
			aCombo.add(data.getLabel());
			aCombo.setData(data.getLabel(), data.getData());
		}
	}

	public static void fillCommboBox(Combo aCombo,
			IComboListProvider<?> provider) throws Exception {

		aCombo.removeAll();

		appendCommboBox(aCombo, provider);

		if (provider.isAllowNull() == false) {
			aCombo.select(0);
		}
	}

	public static void appendCommboBox(Combo aCombo, IComboListProvider provider)
			throws Exception {

		if (provider.isAllowNull() == true) {
			aCombo.add("");
		}

		Object[] dataList = provider.getDataList();

		for (int i = 0; i < dataList.length; i++) {
			String label = provider.getDataLabel(dataList[i]);
			aCombo.add(label);
			aCombo.setData(label, dataList[i]);
		}
	}

	public static Object getCommboBoxSelectedData(Combo aCombo) {
		String text = aCombo.getText();

		if (StringUtils.isNotBlank(text)) {
			return aCombo.getData(text);
		} else {
			return null;
		}
	}

	public static void setCommboBoxSelection(final Object aData, Combo aCombo) {

		setCommboBoxSelection(aData, aCombo, new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				return aData.equals(o) ? 0 : -1;
			}

		});
	}

	public static void setCommboBoxSelection(Object aData, Combo aCombo,
			Comparable comparable) {

		if (aData == null) {
			aCombo.setText("");
			return;
		}

		String[] lables = aCombo.getItems();

		for (int i = 0; i < lables.length; i++) {
			String string = lables[i];
			Object data = aCombo.getData(string);
			if (comparable != null && comparable.compareTo(data) == 0) {
				aCombo.setText(string);
				break;
			} else if (data != null && aData.equals(data)) {
				aCombo.setText(string);
				break;
			}
		}
	}

	public static boolean openDialog(Shell shell,
			final IDialogProvider dialogProvider) {

		if (dialogProvider.getDialogStyle() == IDialogProvider.FORM_DIALOG_STYLE) {

			TrayDialog dialog = new DefaultFormDialog(shell, dialogProvider);

			dialog.create();

			dialog.getShell().setText(dialogProvider.getTitle());

			return dialog.open() == Window.OK;
		} else {
			return openTitleAreaDialog(shell, dialogProvider);
		}

	}

	private static boolean openTitleAreaDialog(Shell shell,
			final IDialogProvider dialogProvider) {

		TitleAreaDialog dialog = new DefaultTitleAreaDialog(shell,
				dialogProvider);

		dialog.create();

		dialog.getShell().setText(dialogProvider.getTitle());
		dialog.setTitle(dialogProvider.getTitle());
		dialog.setMessage(dialogProvider.getInfoMessage() == null ? dialogProvider
				.getTitle() : dialogProvider.getInfoMessage());

		return dialog.open() == Window.OK;
	}

	public static boolean openWizardDialog(Shell shell,
			final IWizardProvider wizardProvider) {

		WizardDialog dialog = new WizardDialog(shell, new ConfigableWizard(
				wizardProvider)) {
			protected Point getInitialSize() {

				Point pt = super.getInitialSize();

				pt.x = 700;

				pt.y = 600;

				return pt;
			}
		};

		return dialog.open() == Window.OK;
	}

}
