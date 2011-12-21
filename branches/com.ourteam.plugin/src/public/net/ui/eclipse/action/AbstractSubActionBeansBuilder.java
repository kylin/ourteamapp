package net.ui.eclipse.action;

import org.eclipse.jface.action.IContributionManager;

public abstract class AbstractSubActionBeansBuilder implements
		ISubActionBeansBuilder {

	private AbstractActionGroupBuilder<? extends IContributionManager> actionGroupBuilder;

	public AbstractSubActionBeansBuilder(
			AbstractActionGroupBuilder<? extends IContributionManager> actionGroupBuilder) {
		super();
		this.actionGroupBuilder = actionGroupBuilder;
	}

	public AbstractActionGroupBuilder<? extends IContributionManager> getActionGroupBuilder() {
		return actionGroupBuilder;
	}

}
