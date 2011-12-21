package net.ui.eclipse.editorpart;

import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.model.tree.NodeBean;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;

public abstract class AbstractTreeNodeEditorProvider<T> implements
		IEditorProvider<TreeNodeItem> {

	abstract protected String getTreeNodeType();

	abstract protected IDataModelEditorInput<T> getModelObjectEditorInput(
			T editObject, NodeBean nodeBean);

	private NodeBean nodeBean;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public IEditorInput getEditorInput(TreeNodeItem editObject) {
		Object userObject = editObject.getUserObject();
		this.nodeBean = editObject.getNodeConfig();
		IDataModelEditorInput editorInput = getModelObjectEditorInput(
				(T) userObject, nodeBean);

		editorInput.setImageDescriptor(ImageDescriptor
				.createFromImage(editObject.getImage()));

		return editorInput;
	}

	@Override
	public boolean isMatched(TreeNodeItem modelObj) {
		Object userObject = modelObj != null ? modelObj.getUserObject() : null;
		if (modelObj != null
				&& getTreeNodeType().equals(modelObj.getNodeConfig().getId())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean canSave() throws Exception {
		return true;
	}

}
