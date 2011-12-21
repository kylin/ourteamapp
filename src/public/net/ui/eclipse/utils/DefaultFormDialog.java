package net.ui.eclipse.utils;

import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogLabelKeys;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;

public class DefaultFormDialog extends TrayDialog {

	private FormToolkit toolkit;

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(DefaultFormDialog.class);

	private IDialogProvider dialogProvider;

	private Form managedForm;

	public DefaultFormDialog(Shell parentShell, IDialogProvider dialogProvider) {
		super(parentShell);
		this.dialogProvider = dialogProvider;
		this.setShellStyle(dialogProvider.getStyle());

	}

	@Override
	public void create() {
		super.create();
		Image image = dialogProvider.getDialogIcon();
		if (image != null && image.isDisposed() == false) {
			this.getShell().setImage(image);
		}

	}

	protected Point getInitialSize() {

		Point pt = super.getInitialSize();

		pt.x = dialogProvider.getInitialWidth();

		pt.y = dialogProvider.getInitialHeight();

		return pt;
	}

	protected void okPressed() {

		this.managedForm.getMessageManager().removeAllMessages();

		getButton(IDialogConstants.OK_ID).setEnabled(false);

		managedForm.setBusy(true);

		try {

			this.getButton(IDialogConstants.OK_ID).setEnabled(false);

			if (dialogProvider.doOkPressed()) {
				super.okPressed();
			} else {
				String[] errors = StringUtils.split(
						dialogProvider.getErrorMessage(),
						SystemUtils.LINE_SEPARATOR);
				setErrorMessages(errors);

			}
		} catch (Exception e) {
			logger.error("okPressed Error", e);
			String[] errors = StringUtils.split(e.getLocalizedMessage(),
					SystemUtils.LINE_SEPARATOR);
			setErrorMessages(errors);
		} finally {
			this.managedForm.setBusy(false);
			if (this.getButton(IDialogConstants.OK_ID) != null
					&& this.getButton(IDialogConstants.OK_ID).isDisposed() == false) {
				this.getButton(IDialogConstants.OK_ID).setEnabled(true);
			}

		}

	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		if (dialogProvider.canCancel()) {
			super.createButtonsForButtonBar(parent);
		} else {
			createButton(parent, IDialogConstants.OK_ID,
					LocalHelper.getDialogConstants(IDialogLabelKeys.OK_LABEL_KEY), true);
		}

	}

	protected Control createDialogArea(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		this.managedForm = toolkit.createForm(parent);
		this.managedForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		createFormContent(this.managedForm.getBody());
		applyDialogFont(this.managedForm.getBody());
		return this.managedForm;
	}

	protected Control createButtonBar(Composite parent) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Label sep = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		sep.setLayoutData(gd);
		Control bar = super.createButtonBar(parent);
		return bar;
	}

	protected void createFormContent(Composite mform) {

		if (StringUtils.isNotBlank(dialogProvider.getTitleImagePath())) {
			this.managedForm.setImage(ImageChache.getImage(dialogProvider
					.getTitleImagePath()));
		}

		if (StringUtils.isNotBlank(dialogProvider.getTitle())) {
			this.managedForm.setText(dialogProvider.getTitle());
			this.toolkit.decorateFormHeading(this.managedForm);
		}

		this.managedForm.addMessageHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				Object href = e.getHref();
				if (href instanceof IMessage[]) {

					String details = managedForm.getMessageManager()
							.createSummary((IMessage[]) href);
					((Hyperlink) e.widget).setToolTipText(details);
				}
			}
		});

		try {

			Composite contentPanel = mform;

			contentPanel.setLayout(new FillLayout());

			dialogProvider.createContentComposite(contentPanel);

			if (StringUtils.isNotBlank(dialogProvider.getInfoMessage())) {
				this.managedForm.getMessageManager().addMessage("infoMessage",
						dialogProvider.getInfoMessage(), null,
						IMessageProvider.INFORMATION);
			}

			contentPanel.layout(true);

		} catch (Exception ex) {
			logger.error("createDialogArea Error", ex);
		}

	}

	protected void setErrorMessage(String errorMessage) {
		setErrorMessages(new String[] { errorMessage });
	}

	protected void setErrorMessages(String[] details) {

		IMessageManager mmng = this.managedForm.getMessageManager();

		for (int i = 0; i < details.length; i++) {
			mmng.addMessage("message" + i, details[i], null,
					IMessageProvider.ERROR);
		}
	}

}
