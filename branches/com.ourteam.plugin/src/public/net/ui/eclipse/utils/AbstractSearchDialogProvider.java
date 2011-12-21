package net.ui.eclipse.utils;

import java.util.List;

import net.ui.eclipse.widget.AbstractSearchComposite;

import org.eclipse.swt.widgets.Composite;

public abstract class AbstractSearchDialogProvider<K> extends
		AbstractDialogProvider {

	private AbstractSearchComposite<K> searchComposite;

	private List<K> chooseResults;

	abstract protected AbstractSearchComposite<K> createSearchComposite(
			Composite parent) throws Exception;

	@Override
	public void createContentComposite(Composite parent) throws Exception {
		searchComposite = createSearchComposite(parent);
	}

	@Override
	public boolean doOkPressed() throws Exception {

		this.chooseResults = this.searchComposite.getSelectedSearchResults();

		return true;
	}

	public List<K> getChooseResults() {
		return chooseResults;
	}

}
