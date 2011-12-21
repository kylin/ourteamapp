package net.ui.eclipse.utils;

public abstract class AbstractComboListProvider<T> implements
		IComboListProvider<T> {

	private boolean allowNull;
	
	public AbstractComboListProvider() {
		this(true);
	}
	
	public AbstractComboListProvider(boolean allowNull) {
		super();
		this.allowNull = allowNull;
	}



	@Override
	public Object getNullValue() {
		return "";
	}

	@Override
	public boolean isAllowNull() {
		return allowNull;
	}

}
