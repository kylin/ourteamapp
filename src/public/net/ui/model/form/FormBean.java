package net.ui.model.form;

public class FormBean extends AbstractFormBean {
	
	public static int EDIT_MODEL = 0;
	
	public static int VIEW_MODEL = 1;

	private String group;
	
	private int formModel = EDIT_MODEL;

	public FormBean() {
		super();
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getFormModel() {
		return formModel;
	}

	public void setFormModel(int formModel) {
		this.formModel = formModel;
	}

}
