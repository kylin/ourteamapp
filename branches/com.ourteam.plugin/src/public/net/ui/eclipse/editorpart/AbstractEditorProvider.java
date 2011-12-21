package net.ui.eclipse.editorpart;

import org.eclipse.ui.IEditorInput;

public abstract class AbstractEditorProvider<T> implements IEditorProvider<T> {

	abstract protected IDataModelEditorInput<T> getModelObjectEditorInput(
			T editObject);

	@Override
	public IEditorInput getEditorInput(T editObject) {
		IDataModelEditorInput<T> editorInput = getModelObjectEditorInput(editObject);
		return editorInput;
	}

	@Override
	public boolean canSave() throws Exception {
		return true;
	}
	
	

}
