package net.ui.model.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.ListOrderedMap;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ActionSetBean implements Serializable {

	public static final String GLOBAL_DOMAIN_KEY = "global";

	private Map<String, List<ActionBean>> actions = new ListOrderedMap();

	private ActionGroupBean[] actionGroups = new ActionGroupBean[] {};

	public ActionSetBean() {
		super();
		actions.put(GLOBAL_DOMAIN_KEY, new ArrayList<ActionBean>());
	}

	public String[] getActionDomains() {
		return actions.keySet().toArray(new String[actions.size()]);
	}

	public ActionBean[] getActions(String domain) {
		if (actions.containsKey(domain)) {
			return actions.get(domain).toArray(new ActionBean[0]);
		} else {
			return new ActionBean[0];
		}
	}
	
	

	public ActionBean[] getActions() {

		List<ActionBean> actionList = new ArrayList<ActionBean>();

		Iterator<String> keyIterator = actions.keySet().iterator();

		for (Iterator<String> iterator = keyIterator; iterator.hasNext();) {
			actionList.addAll(actions.get(iterator.next()));

		}
		return (ActionBean[]) actionList.toArray(new ActionBean[0]);
	}

	public void setActions(ActionBean[] aActions) {
		if (aActions == null) {
			return;
		}

		actions.clear();
		actions.put(GLOBAL_DOMAIN_KEY, new ArrayList<ActionBean>());

		for (int i = 0; i < aActions.length; i++) {
			ActionBean actionBean = aActions[i];
			if (StringUtils.isBlank(actionBean.getDomain())) {
				actions.get(GLOBAL_DOMAIN_KEY).add(actionBean);
			} else {
				if (actions.containsKey(actionBean.getDomain())) {
					actions.get(actionBean.getDomain()).add(actionBean);
				} else {
					List<ActionBean> actionList = new ArrayList<ActionBean>();
					actionList.add(actionBean);
					actions.put(actionBean.getDomain(), actionList);
				}

			}

		}
	}

	public ActionGroupBean[] getActionGroups() {
		return actionGroups;
	}

	public void setActionGroups(ActionGroupBean[] actionGroups) {
		this.actionGroups = actionGroups;
	}

	public void addAction(ActionBean aActionBean) {
		if (StringUtils.isBlank(aActionBean.getDomain())) {
			actions.get(GLOBAL_DOMAIN_KEY).add(aActionBean);
		} else {
			if (actions.containsKey(aActionBean.getDomain())) {
				actions.get(aActionBean.getDomain()).add(aActionBean);
			} else {
				List<ActionBean> actionList = new ArrayList<ActionBean>();
				actionList.add(aActionBean);
				actions.put(aActionBean.getDomain(), actionList);
			}

		}
	}

	public void addActionGroup(ActionGroupBean aActionGroupBean) {
		this.actionGroups = (ActionGroupBean[]) ArrayUtils.add(
				this.actionGroups, aActionGroupBean);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public ActionBean getActionBean(String aId) {
		ActionBean action = null;

		String domian = GLOBAL_DOMAIN_KEY;

		String actionId = aId;

		int index = StringUtils.lastIndexOf(aId, ".");

		if (index > 0) {
			domian = StringUtils.substring(aId, 0, index);
			actionId = StringUtils.substring(aId, index + 1);
		}

		List<ActionBean> actionList = this.actions.get(domian);

		for (Iterator<ActionBean> iterator = actionList.iterator(); iterator
				.hasNext();) {
			ActionBean actionBean = iterator.next();
			if (StringUtils.isNotBlank(actionBean.getId())
					&& actionBean.getId().equals(actionId)) {
				action = actionBean;
				if (action != null) {
					break;
				}
			} else if (actionBean.getSubActionBeans() != null
					&& actionBean.getSubActionBeans().length > 0) {
				action = getActionBean(actionId, actionBean.getSubActionBeans());
				if (action != null) {
					break;
				}
			}
		}

		return action;
	}

	protected ActionBean getActionBean(String aId, ActionBean[] aActions) {
		ActionBean action = null;
		for (int i = 0; i < aActions.length; i++) {
			if (StringUtils.isNotBlank(aActions[i].getId())
					&& aActions[i].getId().equals(aId)) {
				action = aActions[i];
				if (action != null) {
					break;
				}
			} else if (aActions[i].getSubActionBeans() != null
					&& aActions[i].getSubActionBeans().length > 0) {
				action = getActionBean(aId, aActions[i].getSubActionBeans());
				if (action != null) {
					break;
				}
			}
		}

		return action;
	}

	public ActionGroupBean getActiongroupBean(String aId) {
		ActionGroupBean actionGroupBean = null;

		for (int i = 0; i < this.actionGroups.length; i++) {
			if (this.actionGroups[i].getId().equals(aId)) {
				actionGroupBean = this.actionGroups[i];
				break;
			}
		}
		return actionGroupBean;
	}
}
