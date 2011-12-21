package net.ui.eclipse.wizard;

public interface IReflectWizardPageControlHelper<Control> {

	void doNextWizardPageControl(Control control) throws Exception;

	boolean canFlipToNextPageControl(Control control) throws Exception;

	void onActiveWizardPageControlChanged(Control control) throws Exception;

	void initWizardPageControl(Control control) throws Exception;
}
