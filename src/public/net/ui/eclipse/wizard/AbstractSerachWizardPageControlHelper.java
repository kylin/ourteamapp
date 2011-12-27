package net.ui.eclipse.wizard;

import java.util.List;

import net.ui.eclipse.widget.AbstractSearchComposite;

abstract public class AbstractSerachWizardPageControlHelper<T, Control extends AbstractSearchComposite<T>>
		extends AbstractReflectWizardPageControlHelper<Control> {
	
	private AbstractSearchComposite<T> searchComposite;

	public AbstractSerachWizardPageControlHelper(
			AbstractWizardProvider wizardProvider) {
		super(wizardProvider);
	}

	@Override
	public void doNextWizardPageControl(Control control) {
		
	}

	@Override
	public boolean canFlipToNextPageControl(Control control) {
		return control.getSelectedSearchResults().isEmpty() == false;
	}

	@Override
	public void onActiveWizardPageControlChanged(Control control)throws Exception {
		
	}

	public List<T> getSelectedItems() {
		return this.searchComposite.getSelectedSearchResults();
	}

	@Override
	public void initWizardPageControl(Control control) throws Exception {
		this.searchComposite = control;
		doInitSearchConfig(control);

		control.addSelectionChangedListener(getWizardProvider());
	}

	abstract protected void doInitSearchConfig(Control control)
			throws Exception;

}
