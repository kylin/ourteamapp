package net.ui.eclipse.utils;

import net.ui.eclipse.ImageChache;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class SearchActionItemDropdownDialog extends
		ActionItemDropdownDialog {

	public SearchActionItemDropdownDialog(Shell parent,
			IDialogProvider dialogProvider) {
		super(parent, dialogProvider);
	}

	protected void createContent(Composite parent) {
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		Composite queryFormComposite = new Composite(parent, SWT.NONE);
		queryFormComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		queryFormComposite.setLayout(new FillLayout());
		
		super.createContent(queryFormComposite);
		
		Composite buttonBarComposite = new Composite(parent, SWT.NONE);
		
		buttonBarComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		buttonBarComposite.setLayout(new GridLayout());

		Button searchButton = new Button(buttonBarComposite, SWT.PUSH);

		searchButton.setLayoutData(new GridData(SWT.RIGHT,
				GridData.VERTICAL_ALIGN_CENTER, true, false));

		searchButton.setImage(ImageChache.getImage("search"));
		
		searchButton.setText("查询");

		searchButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					dialogProvider.setOkPressed(true);
					dialogProvider.beforeOkPressed();
					dialogProvider.doOkPressed();
					close();
				} catch (Exception ex) {
					MessageDialog.openError(getShell(), "异常",
							ex.getLocalizedMessage());
				}

			}

		});

		buttonBarComposite
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		parent.pack();
	}

}
