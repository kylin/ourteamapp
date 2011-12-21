package net.ui.eclipse.wizard;

import java.util.Map;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.IComboListProvider;

import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

abstract public class AbstractGridFormWizardPageControlHelper<T> extends
		AbstractReflectWizardPageControlHelper<GridFormComposite<T>> {

	private GridFormComposite<T> gridFormComposite;

	public AbstractGridFormWizardPageControlHelper(
			AbstractWizardProvider wizardProvider) {
		super(wizardProvider);
	}

	@Override
	public boolean canFlipToNextPageControl(GridFormComposite<T> control) {
		try {
			control.validate();
			getWizardProvider().setErrorMessage(null);
			return true;
		} catch (Exception e) {
			getWizardProvider().setErrorMessage(e.getLocalizedMessage());
			return false;
		}
	}

	abstract protected T newFormBeean();

	public GridFormComposite<T> getGridFormComposite() {
		return gridFormComposite;
	}

	@Override
	public void initWizardPageControl(final GridFormComposite<T> control)
			throws Exception {

		gridFormComposite = control;

		control.setFormDataModel(newFormBeean());

		control.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				control.getFormDataModel();
				getWizardProvider().updateWizardButtons();
			}
		});

	}

	public Map<String, IComboListProvider<?>> getFormComboListProvider(
			GridFormComposite<T> formComposite) {
		return null;
	}

	@Override
	public void doNextWizardPageControl(GridFormComposite<T> control) {
		
	}

	@Override
	public void onActiveWizardPageControlChanged(GridFormComposite<T> control) {
		
	}

}
