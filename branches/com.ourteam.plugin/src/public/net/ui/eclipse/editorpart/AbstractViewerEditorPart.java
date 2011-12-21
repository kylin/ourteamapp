package net.ui.eclipse.editorpart;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;

public abstract class AbstractViewerEditorPart<K, T extends IDataModelEditorInput<K>>
		extends AbstractEditorPart<K, T> implements ISelectionProvider,
		IDoubleClickListener {

	abstract public Viewer getViewer();

	abstract public boolean allowMultiSelection();

	abstract public boolean showCheckBox();

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		getViewer().addSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		return getViewer().getSelection();
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		getViewer().removeSelectionChangedListener(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		getViewer().setSelection(selection);
	}

	@Override
	public void doubleClick(DoubleClickEvent event) {

	}

	protected void onSelectionChanged(IStructuredSelection selection) {

	}

	protected void onDoubleClick(IStructuredSelection selection) {

	}

	protected void openEditor(IEditorProvider editorProvider)
			throws Exception {
		IStructuredSelection selection = (IStructuredSelection) getSelection();
		if (selection.isEmpty() == false) {
			getSite().getPage().openEditor(
					editorProvider.getEditorInput(selection.getFirstElement()),
					editorProvider.getEditorId());
		}

	}

}
