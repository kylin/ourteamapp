package net.ui.eclipse.editorpart;

import net.ui.UIConfigFactory;
import net.ui.model.tab.TabbedPaneConfig;

abstract public class AbstractDataModelMultiPageEditorInput<T> extends
		AbstractDataModelEditorInput<T> implements IMultiPageEditorAgentInput {

	public AbstractDataModelMultiPageEditorInput(T dataModel) {
		super(dataModel);
	}

	abstract protected String getTabbedPaneConfigId();

	@Override
	public TabbedPaneConfig getTabbedPaneConfig() {
		return UIConfigFactory.getInstance().getTabConfig(
				getTabbedPaneConfigId());
	}
}
