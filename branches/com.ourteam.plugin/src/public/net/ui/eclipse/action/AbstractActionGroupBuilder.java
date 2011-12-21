package net.ui.eclipse.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.internal.ActionSetSeparator;

abstract public class AbstractActionGroupBuilder<T extends IContributionManager>
		implements ISelectionChangedListener {

	private T contributionManager;

	private ActionGroupBean[] actionGroupBeans;

	private List<CommandAction> actionList = new ArrayList<CommandAction>();

	private IActionHandler actionHandler;

	private ICustomActionControl customActionable;

	private AbstractActionGroupBuilder<?> parentBuilder;

	public AbstractActionGroupBuilder(T contributionManager,
			Collection<ActionGroupBean> actionGroupBeans,
			IActionHandler actionHandler, ICustomActionControl customActionable) {
		this(null, contributionManager,
				actionGroupBeans != null ? actionGroupBeans
						.toArray(new ActionGroupBean[actionGroupBeans.size()])
						: new ActionGroupBean[0], actionHandler,
				customActionable);
	}

	public AbstractActionGroupBuilder(T contributionManager,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler,
			ICustomActionControl customActionable) {
		this(null, contributionManager, actionGroupBeans, actionHandler,
				customActionable);
	}

	public AbstractActionGroupBuilder(
			AbstractActionGroupBuilder<?> parentBuilder, T contributionManager,
			Collection<ActionGroupBean> actionGroupBeans,
			IActionHandler actionHandler, ICustomActionControl customActionable) {
		this(parentBuilder, contributionManager,
				actionGroupBeans != null ? actionGroupBeans
						.toArray(new ActionGroupBean[actionGroupBeans.size()])
						: new ActionGroupBean[0], actionHandler,
				customActionable);
	}

	public AbstractActionGroupBuilder(
			AbstractActionGroupBuilder<?> parentBuilder, T contributionManager,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler,
			ICustomActionControl customActionable) {
		super();
		this.parentBuilder = parentBuilder;
		this.customActionable = customActionable;
		this.contributionManager = contributionManager;
		if (actionGroupBeans != null) {
			this.actionGroupBeans = actionGroupBeans;
		} else {
			this.actionGroupBeans = new ActionGroupBean[0];
		}
		this.actionHandler = actionHandler;

		init(this.actionGroupBeans);
	}

	public void init(ActionGroupBean[] actionGroupBeans) {
		this.actionGroupBeans = actionGroupBeans;
		buildActionItems(this.contributionManager, actionGroupBeans,
				this.actionHandler);
	}

	public void reBuildActionItems(boolean removeAll) {
		reBuildActionItems(this.actionGroupBeans, true);
	}

	public void reBuildActionItems(ActionGroupBean[] actionGroupBeans,
			boolean removeAll) {
		if (removeAll) {
			this.contributionManager.removeAll();
		}
		init(actionGroupBeans);
	}

	protected void buildActionItems(T contributionManager,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler) {

		for (int i = 0; i < actionGroupBeans.length; i++) {
			ActionGroupBean actionGroupBean = actionGroupBeans[i];

			if (actionGroupBean == null) {
				continue;
			}

			ActionBean[] actionBeans = actionGroupBean.getActionBeans();

			for (int j = 0; j < actionBeans.length; j++) {
				final ActionBean actionBean = actionBeans[j];

				if (ArrayUtils.isNotEmpty(actionBean.getSubActionBeans())
						|| StringUtils.isNotBlank(actionBean
								.getSubActionBeansBuilder())) {
					buildSubActionItems(contributionManager, actionBean,
							actionHandler);
				} else if ("separator".equalsIgnoreCase(actionBean.getType())) {
					contributionManager.add(new ActionSetSeparator(
							actionGroupBean.getId(), actionGroupBean.getId()));
				} else if ("custom".equalsIgnoreCase(actionBean.getType())) {
					contributionManager
							.add(new CustomActionControlContributionItem(
									this.customActionable, actionBean));
				} else {
					CommandAction action = new CommandAction(actionBean);

					addActionItem(this.contributionManager, action);

				}

			}

			if (i < actionGroupBeans.length - 1) {
				contributionManager.add(new ActionSetSeparator(actionGroupBean
						.getId(), actionGroupBean.getId()));
			}
		}

	}

	public ICustomActionControl getCustomActionable() {
		return customActionable;
	}

	public void addActionItem(T contributionManager, final CommandAction action) {
		contributionManager.add(action);

		if (actionHandler != null) {
			action.setActionHandler(actionHandler);
		}

		if (this.parentBuilder != null) {
			this.parentBuilder.actionList.add(action);
		}

		actionList.add(action);

	}

	abstract protected void buildSubActionItems(T contributionManager,
			ActionBean actionBean, IActionHandler actionHandler);

	public void updateActionStatus() {

		CommandAction[] commandActions = getActionList();

		if (this.actionHandler != null) {
			for (int i = 0; i < commandActions.length; i++) {
				CommandAction commandAction = commandActions[i];
				commandAction.setActionHandler(this.actionHandler);
				ActionBean actionBean = commandAction.getActionConfig();
				commandAction.setEnabled(this.actionHandler
						.isActionEnable(actionBean));

				if (actionBean.getType() != null
						&& actionBean.getType().equals(ActionBean.CHECK_TYPE)
						|| actionBean.getType() != null
						&& actionBean.getType().equals(ActionBean.RADIO_TYPE)) {
					boolean isChecked = this.actionHandler
							.isActionSelected(actionBean);
					if (isChecked != commandAction.isChecked()) {
						commandAction.setChecked(isChecked);
					}

				}
			}
		}

		this.contributionManager.update(true);

	}

	public CommandAction[] getActionList() {
		return (CommandAction[]) actionList
				.toArray(new CommandAction[actionList.size()]);
	}

	public T getContributionManager() {
		return contributionManager;
	}

	public ActionGroupBean[] getActionGroupBeans() {
		return actionGroupBeans;
	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

	public void setActionHandler(IActionHandler actionHandler) {
		this.actionHandler = actionHandler;
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		updateActionStatus();
	}

	protected ActionBean[] getSubActionBeans(ActionBean parentActionBean) {
		ActionBean[] subActionBeans = parentActionBean.getSubActionBeans();

		try {
			if (StringUtils.isNotBlank(parentActionBean
					.getSubActionBeansBuilder())) {
				ISubActionBeansBuilder subActionBeansBuilder = (ISubActionBeansBuilder) ConstructorUtils
						.invokeConstructor(Class.forName(parentActionBean
								.getSubActionBeansBuilder()), this);

				ActionBean[] dySubActionBeans = subActionBeansBuilder
						.getSubActionBeans(parentActionBean);

				if (ArrayUtils.isNotEmpty(dySubActionBeans)) {
					subActionBeans = (ActionBean[]) ArrayUtils.addAll(
							subActionBeans, dySubActionBeans);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return subActionBeans;
	}

}
