package net.ui.eclipse.utils;

import net.ui.eclipse.action.ActionEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolItem;

public class ActionItemDropdownDialog extends Shell {

	protected IDialogProvider dialogProvider;

	public ActionItemDropdownDialog(Shell parent, IDialogProvider dialogProvider) {
		super(parent, SWT.BORDER);
		this.dialogProvider = dialogProvider;
		this.addShellListener(new ShellListener() {

			@Override
			public void shellDeactivated(ShellEvent e) {
				ActionItemDropdownDialog.this.close();
				ActionItemDropdownDialog.this.dispose();
			}

			@Override
			public void shellClosed(ShellEvent e) {
				
			}

			@Override
			public void shellActivated(ShellEvent e) {

			}

			public void shellDeiconified(ShellEvent arg0) {
				
			}

			public void shellIconified(ShellEvent arg0) {
				
			}
		});
		this.setLayout(new FillLayout());
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new FillLayout());
		createContent(composite);
		this.pack();
		this.setSize(dialogProvider.getInitialWidth(),
				this.getBounds().height);
	}

	protected void onClosed() {

	}

	protected void createContent(Composite parent) {
		try {
			dialogProvider.createContentComposite(parent);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void close() {
		super.close();
		onClosed();
	}

	public void open(ActionEvent actionEvent) {
		ToolItem toolItem = (ToolItem) actionEvent.getEventSource();

		Rectangle rect = toolItem.getBounds();
		Point pt = new Point(rect.x, rect.y + rect.height);
		pt = toolItem.getParent().toDisplay(pt);
		this.setLocation(pt.x, pt.y);
		this.open();
	}
}
