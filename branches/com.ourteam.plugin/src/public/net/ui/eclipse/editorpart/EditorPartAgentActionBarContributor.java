package net.ui.eclipse.editorpart;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.CommandAction;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.EditorActionBarContributor;

public class EditorPartAgentActionBarContributor extends
		EditorActionBarContributor implements ISelectionChangedListener {

	private IEditor activeEditor;

	private IToolBarManager toolBarManager;

	private ICoolBarManager coolBarManager;
	
	public EditorPartAgentActionBarContributor() {

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

		toolBarManager = new ToolBarManager(coolBarManager.getStyle());

		coolBarManager.add(toolBarManager);
	}
	

	public void setActiveEditor(IEditorPart targetEditor) {
		this.activeEditor = (IEditor) targetEditor;

		this.activeEditor = (IEditor) activeEditor;
		
		EditorHelper
				.buildEditorToolbar(this.activeEditor, toolBarManager, this);

		this.coolBarManager.update(true);
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		this.activeEditor.getToolBarBuilder().updateActionStatus();
	}

}
