package net.ui.eclipse.widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormFieldStatusChangeListener;
import net.ui.eclipse.form.IFormOptionListDataProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

abstract public class AbstractSearchFormProvider<T extends SearchDataModel>
		implements ISearchFormProvider<T> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractSearchFormProvider.class);

	private GridFormComposite<T> queryForm;

	private T searcDataModel;

	private String formStatus;

	private List<ISearchCallback<T>> searchCallbacks = new ArrayList<ISearchCallback<T>>();

	public AbstractSearchFormProvider(T searcDataModel, String formStatus) {
		super();
		this.searcDataModel = searcDataModel;
		this.formStatus = formStatus;
	}

	public AbstractSearchFormProvider(T searcDataModel) {
		this(searcDataModel, null);
	}

	@Override
	public void initFormOptionListDataProviders(Map listDataProiverMap) {

	}

	public void createContent(Composite parent) {
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		Composite queryFormComposite = new Composite(parent, SWT.NONE);
		queryFormComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		queryFormComposite.setLayout(new FillLayout());

		queryForm = new GridFormComposite<T>(queryFormComposite,
				UIConfigFactory.getInstance().getFormConfig(
						getSearchFormConfigId())) {

			@Override
			protected void initFormOptionListDataProviders(
					Map<String, IFormOptionListDataProvider> listDataProiverMap) {
				AbstractSearchFormProvider.this
						.initFormOptionListDataProviders(listDataProiverMap);
			}

		};

		

		IFormFieldStatusChangeListener fieldStatusChangeListener = getFormFieldStatusChangeListener();

		if (fieldStatusChangeListener != null) {
			queryForm.addFieldStatusChangeListener(fieldStatusChangeListener);
		}

		queryForm.setFormDataModel(searcDataModel);

		Composite buttonBarComposite = new Composite(parent, SWT.NONE);

		buttonBarComposite
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		buttonBarComposite.setLayout(new GridLayout());

		Button searchButton = new Button(buttonBarComposite, SWT.PUSH);

		searchButton.setLayoutData(new GridData(SWT.RIGHT,
				GridData.VERTICAL_ALIGN_CENTER, true, false));

		searchButton.setImage(ImageChache.getImage("search"));

		searchButton.setText("查询");

		searchButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					searcDataModel = queryForm.getFormDataModel();
					for (Iterator<ISearchCallback<T>> iterator = searchCallbacks
							.iterator(); iterator.hasNext();) {
						iterator.next().doSearch(searcDataModel);

					}
				} catch (Exception ex) {
					logger.error("get search data model error ", ex);
				}

			}

		});
		
		if (this.formStatus != null) {
			queryForm.setFormStatus(this.formStatus);

		}
		
		queryForm.layout(true);

		buttonBarComposite
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label spLabel = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);

		spLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	}

	@Override
	public void addSearchCallback(ISearchCallback<T> searchCallback) {
		if (this.searchCallbacks.contains(searchCallback) == false) {
			this.searchCallbacks.add(searchCallback);
		}

	}

	@Override
	public void removeSearchCallback(ISearchCallback<T> searchCallback) {
		this.searchCallbacks.remove(searchCallback);
	}

}
