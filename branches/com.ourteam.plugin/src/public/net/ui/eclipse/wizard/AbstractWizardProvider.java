package net.ui.eclipse.wizard;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.ui.UIConfigFactory;
import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.utils.IComboListProvider;
import net.ui.model.constlist.ListData;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.IWizard;

public abstract class AbstractWizardProvider implements IWizardProvider,
		ISelectionChangedListener {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractWizardProvider.class);

	private IWizard wizard;

	public IWizard getWizard() {
		return wizard;
	}

	public void setWizard(IWizard wizard) {
		this.wizard = wizard;
	}

	@Override
	public void updateWizardButtons() {

		if (this.wizard != null && this.wizard.getContainer() != null) {
			this.wizard.getContainer().updateButtons();
			this.wizard.getContainer().updateMessage();
		}

	}

	public void setErrorMessage(String errorMessage) {
		if (this.wizard != null) {
			((DialogPage) this.wizard.getContainer().getCurrentPage())
					.setErrorMessage(errorMessage);
			this.wizard.getContainer().updateMessage();
		}
	}

	public void setMessage(String message) {
		if (this.wizard != null) {
			((DialogPage) this.wizard.getContainer().getCurrentPage())
					.setMessage(message);
			this.wizard.getContainer().updateMessage();
		}
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (this.wizard != null) {
			updateWizardButtons();
		}
	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return this.canFlipToNextPage(wizard.getContainer().getCurrentPage());
	}

	@Override
	public void initFormOptionListDataProviders(
			GridFormComposite formComposite,
			Map<String, IFormOptionListDataProvider<ListData>> listDataProiverMap) {
		Map<String, IComboListProvider<?>> map = getFormComboListProvider(formComposite);
		if (map != null) {
			Set<String> keySet = map.keySet();

			for (Iterator<String> iterator = keySet.iterator(); iterator
					.hasNext();) {
				String key = iterator.next();
				listDataProiverMap.put(key,
						new FormOptionListDataProviderAdapter(map.get(key)));
			}
		}
	}

	protected Map<String, IComboListProvider<?>> getFormComboListProvider(
			GridFormComposite formComposite) {
		return null;
	}

	@Override
	public String getWizardImage() {
		return null;
	}

	@Override
	public TabbedPaneConfig getWizardConfig() {
		return UIConfigFactory.getInstance().getTabConfig(getWizardConfigId());
	}

	abstract protected String getWizardConfigId();

	abstract protected void doFinish(IWizard wizard) throws Exception;

	@Override
	public boolean doPerformFinish(IWizard wizard) {
		try {
			doFinish(wizard);
			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			logger.error("Wizard DoPerformFinish error", e);
			return false;
		}
	}

}
