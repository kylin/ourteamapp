package net.ui.eclipse.editorpart;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;

public interface IDataModelEditorInput<T> extends IEditorInput {

	T getDataModel();

	boolean isDataModelEquals(T dataModel);

	void reloadDataModel() throws Exception;

	void setImageDescriptor(ImageDescriptor imageDescriptor);

}
