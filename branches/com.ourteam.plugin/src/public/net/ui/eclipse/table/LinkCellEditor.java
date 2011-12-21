package net.ui.eclipse.table;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;

public class LinkCellEditor extends CellEditor implements ICellRender {
	
	private Link link;
	
	private Object data;
	
	public LinkCellEditor() {
		super();
	}

	public LinkCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	public LinkCellEditor(Composite parent) {
		super(parent);
	}

	@Override
	protected Control createControl(Composite parent) {
		link = new Link(parent, SWT.NONE);
		link.setVisible(true);
		return link;
	}

	@Override
	protected Object doGetValue() {
		return data;
	}

	@Override
	protected void doSetFocus() {
		
	}

	@Override
	protected void doSetValue(Object value) {
		this.data = value;
		link.setText("<a>" + String.valueOf(value) + "</a>");

	}

	@Override
	public void deactivate() {
		
	}

}
