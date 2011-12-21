package net.ui.eclipse.editorpart;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;

public abstract class AbstractDataModelEditorInput<T> implements
		IDataModelEditorInput<T> {

	private T dataModel;

	private ImageDescriptor imageDescriptor;

	abstract protected T doReloadDataModel() throws Exception;

	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	public AbstractDataModelEditorInput(T dataModel) {
		super();
		this.dataModel = dataModel;
	}

	public T getDataModel() {
		return dataModel;
	}

	public void setDataModel(T dataModel) {
		this.dataModel = dataModel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataModel == null) ? 0 : dataModel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AbstractDataModelEditorInput<?> other = (AbstractDataModelEditorInput<?>) obj;
		if (dataModel == null) {
			if (other.dataModel != null) {
				return false;
			}
		} else if (!isDataModelEquals((T) other.dataModel)) {
			return false;
		}
		return true;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	public void setImageDescriptor(ImageDescriptor imageDescriptor) {
		this.imageDescriptor = imageDescriptor;
	}

	public ImageDescriptor getImageDescriptor() {
		return imageDescriptor;
	}

	@Override
	public void reloadDataModel() throws Exception {
		setDataModel(this.doReloadDataModel());
	}

	@Override
	public boolean isDataModelEquals(T dataModel) {
		
		return this.getDataModel().equals(dataModel);
	}

}
