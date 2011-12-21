package net.ui.eclipse.wizard;

import java.util.Map;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.model.constlist.ListData;
import net.ui.model.tab.TabbedPaneConfig;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;

public interface IWizardProvider {
	
	String getWizardImage();

	TabbedPaneConfig getWizardConfig();

	boolean doPerformFinish(IWizard wizard);

	boolean canFlipToNextPage(IWizardPage wizardPage);

	boolean canFinsh(IWizard wizard);

	void initWizardPage(IWizardPage wizardPage);

	void doNextWizardPage(IWizardPage wizardPage);

	void onActiveWizardPageChanged(IWizardPage wizardPage);

	void setWizard(IWizard wizard);

	void updateWizardButtons();

	void initFormOptionListDataProviders(
			GridFormComposite formComposite,
			Map<String, IFormOptionListDataProvider<ListData>> listDataProiverMap);
}
