package net.ui.model.form;

public interface DynamicForm {

	public Object getValue(String aId);
	
	public void setValue(String aId,Object aValue);
	
	public FormBean getFormConfig();
	
	public boolean isReadonly(String aPropertyId);
	
	public void validate() throws Exception;
}
