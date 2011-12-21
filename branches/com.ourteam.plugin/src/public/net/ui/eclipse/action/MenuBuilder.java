package net.ui.eclipse.action;

import java.util.Collection;

import net.ui.eclipse.ImageChache;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;

public class MenuBuilder extends AbstractActionGroupBuilder<IMenuManager> {



	public MenuBuilder(AbstractActionGroupBuilder<?> parentBuilder,
			IMenuManager contributionManager,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler,
			ICustomActionControl customActionable) {
		super(parentBuilder, contributionManager, actionGroupBeans, actionHandler,
				customActionable);
	
	}

	public MenuBuilder(AbstractActionGroupBuilder<?> parentBuilder,
			IMenuManager contributionManager,
			Collection<ActionGroupBean> actionGroupBeans,
			IActionHandler actionHandler, ICustomActionControl customActionable) {
		super(parentBuilder, contributionManager, actionGroupBeans, actionHandler,
				customActionable);
		
	}

	public MenuBuilder(IMenuManager contributionManager,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler,
			ICustomActionControl customActionable) {
		super(contributionManager, actionGroupBeans, actionHandler, customActionable);
		
	}

	public MenuBuilder(IMenuManager contributionManager,
			Collection<ActionGroupBean> actionGroupBeans,
			IActionHandler actionHandler, ICustomActionControl customActionable) {
		super(contributionManager, actionGroupBeans, actionHandler, customActionable);
		
	}

	@Override
	protected void buildSubActionItems(IMenuManager contributionManager,
			ActionBean actionBean, IActionHandler actionHandler) {

		ImageDescriptor imageDescriptor = null;

		if (StringUtils.isNotBlank(actionBean.getIcon())) {
			imageDescriptor = ImageDescriptor.createFromImage((ImageChache
					.getImage(actionBean.getIcon())));
		}

		MenuManager subMenuManager = new MenuManager(actionBean.getLabel(),
				imageDescriptor, actionBean.getId());

		contributionManager.add(subMenuManager);

		ActionBean[] actionBeans = getSubActionBeans(actionBean);

		for (int i = 0; i < actionBeans.length; i++) {
			final ActionBean subActionBean = actionBeans[i];

			if (ArrayUtils.isNotEmpty(subActionBean.getSubActionBeans())) {

				buildSubActionItems(subMenuManager, subActionBean,
						actionHandler);

			} else {

				CommandAction action = new CommandAction(subActionBean);

				addActionItem(subMenuManager, action);
			}

		}

	}
}
