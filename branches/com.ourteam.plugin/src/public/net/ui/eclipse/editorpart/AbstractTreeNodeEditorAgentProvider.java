package net.ui.eclipse.editorpart;


abstract public class AbstractTreeNodeEditorAgentProvider<T> extends
		AbstractTreeNodeEditorProvider<T> {

	@Override
	final public String getEditorId() {
		return EditorPartAgent.EDITOR_ID;
	}	

}
