package net.ui.eclipse.editorpart;

import org.eclipse.ui.IEditorInput;

public interface IEditorProvider<T> {

	String getEditorId();

	IEditorInput getEditorInput(T editObject);

	boolean isMatched(T editObject);
	
	boolean canSave() throws Exception;
	
}
