package net.ui.eclipse.wizard;

import java.lang.reflect.Constructor;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.tabfloder.TabFolderComposite;
import net.ui.model.form.FormBean;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabProperty;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class AbstractWizardPage extends WizardPage {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(TabFolderComposite.class);

	private TabConfig tabConfig;

	private IWizardProvider wizardProvider;

	private boolean lastPage;

	protected AbstractWizardPage(TabConfig tabConfig,
			IWizardProvider wizardProvider) {
		super(tabConfig.getName());

		this.tabConfig = tabConfig;
		this.wizardProvider = wizardProvider;
	}

	@Override
	public void createControl(Composite parent) {

		String pageClass = this.tabConfig.getCompentclass();

		if (StringUtils.isNotBlank(pageClass)) {
			try {

				boolean needStyle = false;

				Class pageClazz = Class.forName(pageClass);

				Constructor constructor = ConstructorUtils
						.getAccessibleConstructor(pageClazz,
								new Class[] { Composite.class });

				if (constructor == null) {
					constructor = ConstructorUtils.getAccessibleConstructor(
							pageClazz,
							new Class[] { Composite.class, int.class });

					needStyle = true;
				}

				Object[] params = null;

				if (needStyle) {
					params = new Object[] { parent, SWT.NONE };
				} else {
					params = new Object[] { parent };
				}

				Control panel = (Control) ConstructorUtils.invokeConstructor(
						pageClazz, params);

				this.setControl(panel);

				this.wizardProvider.initWizardPage(this);

			} catch (Exception ex) {
				this.setErrorMessage("error:" + ex.toString());
				logger.error("error", ex);
			}
		} else {
			TabProperty formId = this.tabConfig.getProperty("formId");

			if (formId != null && StringUtils.isNotBlank(formId.getValue())) {
				FormBean formBean = UIConfigFactory.getInstance()
						.getFormConfig(formId.getValue());

				this.setControl(new GridFormComposite(parent, formBean) {

					@Override
					protected void initFormOptionListDataProviders(
							Map listDataProiverMap) {
						super.initFormOptionListDataProviders(listDataProiverMap);
						wizardProvider.initFormOptionListDataProviders(this,listDataProiverMap);
					}

				});

				this.wizardProvider.initWizardPage(this);
			}
		}

	}

	public boolean canFlipToNextPage() {
		if (this.lastPage) {
			return false;
		} else {
			return this.wizardProvider.canFlipToNextPage(this);
		}

	}

	@Override
	public IWizardPage getNextPage() {
		IWizardPage nextPage = super.getNextPage();
		this.wizardProvider.onActiveWizardPageChanged(this);
		if (nextPage != null) {
			this.wizardProvider.doNextWizardPage(nextPage);
		}
		return nextPage;
	}

	public boolean isLastPage() {
		return lastPage;
	}

	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}

}
