package net.ui.eclipse.utils;

import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogLabelKeys;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class DefaultTitleAreaDialog extends TitleAreaDialog {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(DefaultTitleAreaDialog.class);

	private IDialogProvider dialogProvider;

	public DefaultTitleAreaDialog(Shell parentShell,
			IDialogProvider dialogProvider) {
		super(parentShell);
		this.dialogProvider = dialogProvider;
		this.setShellStyle(dialogProvider.getStyle());
		if (StringUtils.isNotBlank(this.dialogProvider.getTitleImagePath())) {
			this.setTitleImage(ImageChache.getImage(this.dialogProvider
					.getTitleImagePath()));
		}

	}

	@Override
	public void create() {
		super.create();
		Image image = dialogProvider.getDialogIcon();
		if (image != null && image.isDisposed() == false) {
			this.getShell().setImage(image);
		}

	}

	protected Control createDialogArea(Composite parent) {

		this.setShellStyle(dialogProvider.getStyle());

		Composite composite = (Composite) super.createDialogArea(parent);

		try {

			Composite contentPanel = new Composite(composite, SWT.NONE);

			contentPanel.setLayout(new FillLayout());

			GridData gd = new GridData(GridData.FILL_BOTH);

			contentPanel.setLayoutData(gd);
			contentPanel.setFont(parent.getFont());

			dialogProvider.createContentComposite(contentPanel);

			contentPanel.layout(true);

		} catch (Exception ex) {
			logger.error("createDialogArea Error", ex);
		}

		return composite;
	}

	protected Point getInitialSize() {

		Point pt = super.getInitialSize();

		pt.x = dialogProvider.getInitialWidth();

		pt.y = dialogProvider.getInitialHeight();

		return pt;
	}

	protected void okPressed() {
		try {

			this.getButton(IDialogConstants.OK_ID).setEnabled(false);

			dialogProvider.setOkPressed(true);

			dialogProvider.beforeOkPressed();

			if (dialogProvider.doOkPressed()) {
				super.okPressed();
			} else {
				setErrorMessage(dialogProvider.getErrorMessage());
				this.getButton(IDialogConstants.OK_ID).setEnabled(true);
			}
		} catch (Exception e) {
			logger.error("okPressed Error", e);
			setErrorMessage(e.getLocalizedMessage());
			this.getButton(IDialogConstants.OK_ID).setEnabled(true);
		}

	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		if (dialogProvider.canCancel()) {
			super.createButtonsForButtonBar(parent);
		} else {
			createButton(parent, IDialogConstants.OK_ID,
					LocalHelper
							.getDialogConstants(IDialogLabelKeys.OK_LABEL_KEY),
					true);
		}

	}

}
