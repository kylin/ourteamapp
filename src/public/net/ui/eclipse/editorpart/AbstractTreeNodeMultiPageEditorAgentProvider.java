package net.ui.eclipse.editorpart;

abstract public class AbstractTreeNodeMultiPageEditorAgentProvider<T> extends
		AbstractTreeNodeEditorProvider<T> {

	@Override
	final public String getEditorId() {
		return MultiPageEditorPartAgent.EDITOR_ID;
	}

}
