package net.ui.eclipse.editorpart;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;

public class MultiPageEditorPartAgentActionBarContributor extends
		MultiPageEditorActionBarContributor implements
		ISelectionChangedListener {

	private IEditor activeEditor;

	private IToolBarManager toolBarManager;

	private ICoolBarManager coolBarManager;

	public MultiPageEditorPartAgentActionBarContributor() {

	}

	@Override
	public void contributeToMenu(IMenuManager menuManager) {

	}

	@Override
	public void contributeToStatusLine(IStatusLineManager statusLineManager) {

	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {

	}

	@Override
	public void contributeToCoolBar(ICoolBarManager coolBarManager) {

		this.coolBarManager = coolBarManager;

		toolBarManager = new ToolBarManager(SWT.FLAT | SWT.LEFT);

		coolBarManager.add(toolBarManager);

	}

	@Override
	public void setActivePage(IEditorPart activeEditor) {

		this.activeEditor = (IEditor) activeEditor;

		EditorHelper
				.buildEditorToolbar(this.activeEditor, toolBarManager, this);

		this.coolBarManager.update(true);
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (this.activeEditor != null
				&& this.activeEditor.getToolBarBuilder() != null) {
			this.activeEditor.getToolBarBuilder().updateActionStatus();
		}
	}

}
