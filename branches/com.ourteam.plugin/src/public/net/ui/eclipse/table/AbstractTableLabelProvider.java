package net.ui.eclipse.table;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractTableLabelProvider extends LabelProvider implements ITableLabelProvider {

	private Shell shell;

	public AbstractTableLabelProvider(Shell aShell) {
		super();
		this.shell = aShell;
	}


	abstract protected String getCheckedImage();

	abstract protected String getUnCheckedImage();

	public Image getImage(Object element) {
		if (element instanceof Boolean) {
			if (((Boolean) element).booleanValue()) {
				return new Image(shell.getDisplay(), getClass().getResourceAsStream(getCheckedImage()));
			}

			return new Image(shell.getDisplay(), getClass().getResourceAsStream(getUnCheckedImage()));
		}
		return new Image(shell.getDisplay(), getClass().getResourceAsStream(String.valueOf(element)));
	}
	
	public Shell getShell(){
		return this.shell;
	}

}
