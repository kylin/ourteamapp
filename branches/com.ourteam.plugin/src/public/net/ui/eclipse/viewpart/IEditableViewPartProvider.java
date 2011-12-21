package net.ui.eclipse.viewpart;

import java.util.List;

import net.ui.eclipse.editorpart.IEditorProvider;

public interface IEditableViewPartProvider<EditDataObject> {

	public List<IEditorProvider<EditDataObject>> getEditorProviderList();
}
