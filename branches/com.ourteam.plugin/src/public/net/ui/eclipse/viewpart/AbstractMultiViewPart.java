package net.ui.eclipse.viewpart;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ExpandEvent;
import org.eclipse.swt.events.ExpandListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.ui.part.ViewPart;

abstract public class AbstractMultiViewPart extends ViewPart {

	private static final String VIEW_INSTANCE_ID = "VIEW_INSTANCE_ID";

	private ExpandBar viewExpandBar;

	private AbstractViewPart currentViewPart;

	private Composite contComposite;

	private Map<String, AbstractViewPart> viewObjectMap = new HashMap<String, AbstractViewPart>();

	private Map<Object, Boolean> viewObjectStatusMap = new HashMap<Object, Boolean>();

	private Map<Object, Control> viewControlCahce = new HashMap<Object, Control>();

	abstract protected AbstractViewPart[] getViewParts();

	protected void createMultiViewWidget(ExpandBar viewExpandBar) {

		viewObjectMap.clear();

		ExpandItem[] expandItems = viewExpandBar.getItems();

		for (int i = 0; i < expandItems.length; i++) {
			if (expandItems[i].getControl() != null) {
				expandItems[i].getControl().setVisible(false);
				viewControlCahce.put(expandItems[i].getData(VIEW_INSTANCE_ID),
						expandItems[i].getControl());
			}
			expandItems[i].setControl(null);
			expandItems[i].dispose();
		}

		AbstractViewPart[] viewParts = getViewParts();

		ExpandItem initExpandItem = null;

		for (int i = 0; i < viewParts.length; i++) {
			AbstractViewPart viewPart = viewParts[i];
			if (viewPart == null) {
				continue;
			}
			ExpandItem item = new ExpandItem(viewExpandBar, SWT.NONE);
			item.setText(viewPart.getPartName());
			if (viewPart.getTitleImage() != null) {
				item.setImage(viewPart.getTitleImage());
			}
			item.setData(VIEW_INSTANCE_ID, viewPart.toString());

			viewObjectMap.put(viewPart.toString(), viewPart);

			if (viewObjectStatusMap.containsKey(viewPart.toString())
					&& viewObjectStatusMap.get(viewPart.toString())) {
				initExpandItem = item;
			}
		}

		if (ArrayUtils.isNotEmpty(viewParts) && initExpandItem == null) {
			initExpandItem = viewExpandBar.getItem(0);
		}

		if (initExpandItem != null) {
			initExpandItem.setExpanded(true);
			showViewpart(initExpandItem);
		}

	}

	public void update() {
		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();

		toolBarManager.removeAll();

		toolBarManager.update(true);

		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();

		menuManager.removeAll();

		menuManager.update(true);

		createMultiViewWidget(this.viewExpandBar);

		this.contComposite.layout(true);
	}

	@Override
	public void createPartControl(final Composite parent) {

		contComposite = parent;

		parent.setLayout(new FillLayout());

		viewExpandBar = new ExpandBar(parent, SWT.NONE);

		parent.addControlListener(new ControlAdapter() {

			public void controlResized(ControlEvent e) {
				ExpandItem[] expandItems = viewExpandBar.getItems();

				for (int i = 0; i < expandItems.length; i++) {
					ExpandItem expandItem = expandItems[i];
					if (expandItem.getExpanded()) {
						expandItem.setHeight(getViewHeight());
					}
				}
			}
		});

		viewExpandBar.setSpacing(1);

		createMultiViewWidget(viewExpandBar);

		viewExpandBar.addExpandListener(new ExpandListener() {

			@Override
			public void itemExpanded(ExpandEvent e) {
				showViewpart((ExpandItem) e.item);
			}

			@Override
			public void itemCollapsed(ExpandEvent e) {

				IToolBarManager toolBarManager = getViewSite().getActionBars()
						.getToolBarManager();

				toolBarManager.removeAll();

				toolBarManager.update(true);

				IMenuManager menuManager = getViewSite().getActionBars()
						.getMenuManager();

				menuManager.removeAll();

				menuManager.update(true);

			}
		});

	}

	protected int getViewHeight() {
		if (viewExpandBar.getItemCount() > 0) {
			return contComposite.getClientArea().height
					- (viewExpandBar.getItem(0).getHeaderHeight()
							+ viewExpandBar.getSpacing() + viewExpandBar
							.getBorderWidth() * 2)
					* viewExpandBar.getItemCount();
		} else {
			return 0;
		}
	}

	public void showViewpart(ExpandItem item) {

		ExpandItem[] expandItems = viewExpandBar.getItems();
		for (int i = 0; i < expandItems.length; i++) {
			if (expandItems[i] != item) {
				expandItems[i].setExpanded(false);
				viewObjectStatusMap.put(
						(String) expandItems[i].getData(VIEW_INSTANCE_ID),
						Boolean.FALSE);
			} else {
				viewObjectStatusMap.put(
						(String) expandItems[i].getData(VIEW_INSTANCE_ID),
						Boolean.TRUE);
			}

		}

		currentViewPart = this.viewObjectMap
				.get(item.getData(VIEW_INSTANCE_ID));

		if (item.getControl() == null) {

			if (viewControlCahce.containsKey(item.getData(VIEW_INSTANCE_ID))) {
				item.setControl(viewControlCahce.get(item
						.getData(VIEW_INSTANCE_ID)));
				currentViewPart.updatePartActions();
				currentViewPart.updatePartMenus();
				currentViewPart.updateActionStatus();
			} else {
				Composite composite = new Composite(viewExpandBar, SWT.NONE);

				composite.setLayout(new FillLayout());

				currentViewPart.createPartControl(composite);

				item.setControl(composite);

				viewControlCahce.put(item.getData(VIEW_INSTANCE_ID), composite);
			}

		} else {
			currentViewPart.updatePartActions();
			currentViewPart.updatePartMenus();
			currentViewPart.updateActionStatus();
		}

		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();

		toolBarManager.update(true);

		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();

		menuManager.update(true);
		
		item.setHeight(getViewHeight());

	}

	@Override
	public void setFocus() {
		if (currentViewPart != null) {
			currentViewPart.setFocus();
		}

	}

	public AbstractViewPart getCurrentViewPart() {
		return currentViewPart;
	}

}
