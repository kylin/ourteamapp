package net.ui.eclipse.action;

import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class ToolBarComposite extends Composite implements
		ISelectionChangedListener {
	
	private ActionGroupBean[] actionGroupBeans;

	private int style;

	private IActionHandler actionHandler;

	private ToolBarManager toolBarManager;

	private ToolBarBuilder toolBarBuilder;

	private ToolBar toolBar;

	public ToolBarComposite(Composite parent, ActionGroupBean actionGroupBean,
			IActionHandler actionHandler, int style) {
		this(parent, new ActionGroupBean[] { actionGroupBean }, actionHandler,
				style);
	}

	public ToolBarComposite(Composite parent,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler,
			int style) {
		super(parent, SWT.NONE);
		this.setLayout(new FillLayout());
		this.actionGroupBeans = actionGroupBeans;
		this.style = style;
		this.actionHandler = actionHandler;
		buildToolBar(this, this.actionGroupBeans, this.actionHandler);
		
	}

	protected void buildToolBar(Composite parent,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler) {

		this.toolBarManager = new ToolBarManager(this.style);

		this.toolBar = this.toolBarManager.createControl(parent);

		this.toolBarBuilder = new ToolBarBuilder(this.toolBarManager,
				actionGroupBeans, actionHandler, new ICustomActionControl() {

					@Override
					public Control customAction(ToolItem parent,
							ActionBean actionBean) {
						return ToolBarComposite.this.customAction(parent,
								actionBean);
					}
				});

		this.toolBarManager.add(new ShowTextContributionItem(null));

	}

	protected Control customAction(final ToolItem toolItem,
			ActionBean actionBean) {
		return null;
	}

	public void setActionHandler(IActionHandler actionHandler) {
		this.actionHandler = actionHandler;
		this.toolBarBuilder.setActionHandler(actionHandler);
	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

	public ToolBar getToolBar() {
		return toolBar;
	}

	public void update() {

		super.update();

		this.toolBarBuilder.updateActionStatus();

	}

	
	@Override
	public void dispose() {
		this.toolBarManager.dispose();
		super.dispose();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		this.update();
	}
}
