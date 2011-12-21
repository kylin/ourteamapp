package net.ui.eclipse.widget;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.LocalHelper;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractSearchComposite<K> extends AbstractComposite {

	private Image searchImage;

	public AbstractSearchComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void createContent(Composite parent) {

		GridLayout mainGridLayout = new GridLayout();

		mainGridLayout.horizontalSpacing = 1;

		mainGridLayout.verticalSpacing = 1;

		mainGridLayout.marginHeight = 0;

		mainGridLayout.marginWidth = 0;

		parent.setLayout(mainGridLayout);

		Composite queryPanel = new Composite(parent, SWT.NONE);

		queryPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		GridLayout gridLayout = new GridLayout(2, false);

		gridLayout.marginHeight = 0;

		gridLayout.marginWidth = 0;

		queryPanel.setLayout(gridLayout);

		Composite queryFromPanel = new Composite(queryPanel, SWT.NONE);

		queryFromPanel.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite composite = new Composite(queryPanel, SWT.NONE);

		composite.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		composite.setLayout(new FillLayout());

		Composite queryButtonPanel = new Composite(composite, SWT.NONE);

		queryButtonPanel.setLayout(new GridLayout());

		Button searchButton = new Button(queryButtonPanel, SWT.PUSH);

		searchButton.setLayoutData(new GridData(GridData.FILL_BOTH));

		searchButton.setText(UIConfigFactory.getInstance().getLocalMessage(
				"search", LocalHelper.getLocale()));

		Image image = getSearchImage();

		if (image != null) {
			searchButton.setImage(getSearchImage());
		}

		searchButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateResultArea(searchResults());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateResultArea(searchResults());
			}
		});

		createQueryArea(queryFromPanel);

		Composite resultPanel = new Composite(parent, SWT.NONE);

		resultPanel.setLayoutData(new GridData(GridData.FILL_BOTH));

		createResultArea(resultPanel);
	}

	abstract protected void updateResultArea(K[] results);

	abstract protected void createQueryArea(Composite parent);

	abstract protected void createResultArea(Composite parent);

	protected Image getSearchImage() {

		if (searchImage == null) {
			ImageDescriptor searchImageDescriptor = ImageDescriptor
					.createFromFile(AbstractSearchComposite.class, "search.png");

			if (searchImageDescriptor != null) {
				return searchImage = searchImageDescriptor.createImage();
			} else {
				return null;
			}
		} else {
			return searchImage;
		}
	}

	abstract protected K[] searchResults();

	abstract public List<K> getSelectedSearchResults();

	abstract public void addSelectionChangedListener(
			ISelectionChangedListener listener);

	abstract public void removeSelectionChangedListener(
			ISelectionChangedListener listener);

}
