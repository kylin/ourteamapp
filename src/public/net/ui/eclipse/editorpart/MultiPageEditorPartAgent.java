package net.ui.eclipse.editorpart;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

import net.ui.model.tab.TabbedPaneConfig;

public class MultiPageEditorPartAgent extends AbstractMultiPageEditorPart {

	public static final String EDITOR_ID = "net.ui.eclipse.editorpart.MultiPageEditorPartAgent";

	private TabbedPaneConfig tabbedPaneConfig;

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		this.tabbedPaneConfig = ((IMultiPageEditorAgentInput) input)
				.getTabbedPaneConfig();
	}

	@Override
	protected TabbedPaneConfig getTabbedPaneConfig() {
		return tabbedPaneConfig;
	}

	

}
