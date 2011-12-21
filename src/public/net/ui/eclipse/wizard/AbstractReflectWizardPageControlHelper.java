package net.ui.eclipse.wizard;

public abstract class AbstractReflectWizardPageControlHelper<Control>
		implements IReflectWizardPageControlHelper<Control> {

	private AbstractWizardProvider wizardProvider;
	
	private Control wizardPageControl;

	public AbstractReflectWizardPageControlHelper(
			AbstractWizardProvider wizardProvider) {
		super();
		this.wizardProvider = wizardProvider;
	}

	public AbstractWizardProvider getWizardProvider() {
		return wizardProvider;
	}

	public Control getWizardPageControl() {
		return wizardPageControl;
	}

	public void setWizardPageControl(Control wizardPageControl) {
		this.wizardPageControl = wizardPageControl;
	}

	
}
