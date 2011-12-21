package net.ui.eclipse.form;

import net.ui.eclipse.AbstractComposite;

import org.eclipse.swt.widgets.Composite;

public abstract class AbstractFormPropertyComosite<T> extends AbstractComposite
		implements IFormPropertyComosite<T> {

	private T formDataModel;

	private GridFormComposite<T> formComposite;

	public AbstractFormPropertyComosite(Composite parent, int style) {
		super(parent, style);
		this.formComposite = (GridFormComposite<T>) parent.getParent();
	}

	public T getFormDataModel() {
		return formDataModel;
	}

	public void setFormDataModel(T formDataModel) {
		this.formDataModel = formDataModel;
	}

	public GridFormComposite<T> getFormComposite() {
		return formComposite;
	}

}
