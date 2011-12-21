package net.ui.eclipse.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.tabfloder.TabbedComposite;
import net.ui.model.tab.TabbedPaneConfig;

import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class AbstractTabbedPanelDialogProvider extends
		AbstractDialogProvider {

	private TabbedComposite tabbedComposite;

	abstract protected String getTabbedPaneConfigId();

	abstract protected void initTabPanel(Control aPanel) throws Exception;

	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) {
		return null;
	}

	@Override
	public void createContentComposite(Composite parent) {
		TabbedPaneConfig tabbedPaneConfig = UIConfigFactory.getInstance()
				.getTabConfig(getTabbedPaneConfigId());

		tabbedComposite = new TabbedComposite(parent, tabbedPaneConfig) {

			@Override
			protected void initTabPanel(Control aPanel) throws Exception {
				AbstractTabbedPanelDialogProvider.this.initTabPanel(aPanel);
			}

			@Override
			protected Control constructTabPanel(Class<?> panelClass,
					CTabFolder tabFolder) throws Exception {
				Control panel = AbstractTabbedPanelDialogProvider.this
						.constructTabPanel(panelClass, tabFolder);

				if (panel == null) {
					return super.constructTabPanel(panelClass, tabFolder);
				} else {
					return panel;
				}

			}

			@Override
			protected void doInitFormOptionListDataProviders(
					Map<String, IFormOptionListDataProvider> listDataProiverMap) {

				AbstractTabbedPanelDialogProvider.this
						.doInitFormOptionListDataProviders(listDataProiverMap);
			}

		};

		tabbedComposite.getTabFolder().addSelectionListener(
				new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						onTabChanged(tabbedComposite.getTabFolder()
								.getSelectionIndex());
					}

				});

	}

	protected void onTabChanged(int tabIndex) {

	}

	protected void doInitFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

	}

	public TabbedComposite getTabbedComposite() {
		return tabbedComposite;
	}

	@Override
	public void beforeOkPressed() throws Exception {
		List<Object> objects = tabbedComposite.getEditorList();

		for (Iterator<Object> iterator = objects.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof GridFormComposite<?>) {
				((GridFormComposite<?>) object).validate();
				((GridFormComposite<?>) object).getFormDataModel();
			}
		}

		super.beforeOkPressed();
	}

}
