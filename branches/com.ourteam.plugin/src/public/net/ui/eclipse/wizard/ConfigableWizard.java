package net.ui.eclipse.wizard;

import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.ImageDataDescriptor;
import net.ui.eclipse.LocalHelper;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.wizard.Wizard;

public class ConfigableWizard extends Wizard {

	private IWizardProvider wizardProvider;

	public ConfigableWizard(IWizardProvider wizardProvider) {
		super();
		this.wizardProvider = wizardProvider;
		createWsizardPage();
		this.wizardProvider.setWizard(this);
		if (StringUtils.isNotBlank(this.wizardProvider.getWizardImage())) {
			setDefaultPageImageDescriptor(ImageDataDescriptor
					.createFromImage(ImageChache.getImage(this.wizardProvider
							.getWizardImage())));
		}
	}

	public IWizardProvider getWizardProvider() {
		return wizardProvider;
	}

	@Override
	public boolean performFinish() {
		getWizardProvider().onActiveWizardPageChanged(
				this.getContainer().getCurrentPage());
		return getWizardProvider().doPerformFinish(this);
	}

	protected void createWsizardPage() {
		TabbedPaneConfig tabbedPaneConfig = getWizardProvider()
				.getWizardConfig();

		if (StringUtils.isNotBlank(tabbedPaneConfig.getDesc())) {
			setWindowTitle(UIConfigFactory.getInstance().getLocalMessage(
					tabbedPaneConfig.getDesc(), tabbedPaneConfig.getDesc(),
					LocalHelper.getLocale()));
		}

		List wizardPageList = tabbedPaneConfig.getTabPageList();

		int step = 1;

		for (Iterator iter = wizardPageList.iterator(); iter.hasNext();) {
			TabConfig wizardPageConfig = (TabConfig) iter.next();

			AbstractWizardPage wizardPage = new AbstractWizardPage(
					wizardPageConfig, this.getWizardProvider()) {

			};

			if (StringUtils.isNotBlank(wizardPageConfig.getLabel())) {
				wizardPage.setTitle(UIConfigFactory.getInstance()
						.getLocalMessage("step", LocalHelper.getLocale())
						+ step++
						+ "/"
						+ wizardPageList.size()
						+ ":"
						+ UIConfigFactory.getInstance().getLocalMessage(
								wizardPageConfig.getLabelKey(),
								wizardPageConfig.getLabel(), LocalHelper.getLocale()));
			}

			if (iter.hasNext() == false) {
				wizardPage.setLastPage(true);
			} else {
				wizardPage.setLastPage(false);
			}
			
			addPage(wizardPage);
		}

	}

	@Override
	public boolean canFinish() {
		return ((AbstractWizardPage) getContainer().getCurrentPage())
				.isLastPage() && this.wizardProvider.canFinsh(this);
	}

}
