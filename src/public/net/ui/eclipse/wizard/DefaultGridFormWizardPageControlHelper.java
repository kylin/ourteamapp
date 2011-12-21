package net.ui.eclipse.wizard;

public class DefaultGridFormWizardPageControlHelper<T> extends
		AbstractGridFormWizardPageControlHelper<T> {

	private T formBeam;

	public DefaultGridFormWizardPageControlHelper(
			AbstractWizardProvider wizardProvider, T formBeam) {
		super(wizardProvider);
		this.formBeam = formBeam;
	}

	@Override
	protected T newFormBeean() {
		return this.formBeam;
	}

}
