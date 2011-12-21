package net.ui.eclipse.form;

import org.eclipse.swt.events.ModifyListener;

public interface IFormPropertyComosite<T> {

	public Object getValue(String aId);

	public void setValue(String aId, Object aValue);
	
	public T getFormDataModel();
	
	public void setFormDataModel(T formDataModel);
	
	public void addModifyListener( final ModifyListener listener );
	
	public void removeModifyListener( final ModifyListener listener );
}
