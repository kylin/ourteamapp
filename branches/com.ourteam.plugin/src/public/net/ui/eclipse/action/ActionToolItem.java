package net.ui.eclipse.action;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;
import net.ui.model.action.ActionBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class ActionToolItem extends ToolItem {

	private ActionBean actionBean;

	public ActionToolItem(ToolBar parent, ActionBean actionBean) {
		super(parent, getActionStyle(actionBean));
		this.actionBean = actionBean;
		this.setData("ACTION_BEAN", actionBean);

		if (StringUtils.isNotBlank(actionBean.getLabel())
				|| StringUtils.isNotBlank(actionBean.getLabelKey())) {
			String label = UIConfigFactory.getInstance().getLocalMessage(
					actionBean.getLabelKey(), actionBean.getLabel(),
					LocalHelper.getLocale());
			String desc = UIConfigFactory.getInstance().getLocalMessage(
					actionBean.getDescKey(), actionBean.getDesc(),
					LocalHelper.getLocale());

			if (StringUtils.isNotBlank(label)) {
				this.setText(label);
			}

			if (StringUtils.isNotBlank(desc)) {
				this.setToolTipText(label);
			}

		}

		if (StringUtils.isNotBlank(actionBean.getIcon())) {
			this.setImage(ImageChache.getImage(actionBean.getIcon()));
		}

	}

	public ActionBean getActionBean() {
		return actionBean;
	}

	public static int getActionStyle(final ActionBean actionBean) {

		int itemStyle = SWT.PUSH;

		if ("check".equalsIgnoreCase(actionBean.getType())) {
			itemStyle = SWT.CHECK;
		} else if ("separator".equalsIgnoreCase(actionBean.getType())) {
			itemStyle = SWT.SEPARATOR;
		} else if ("radio".equalsIgnoreCase(actionBean.getType())) {
			itemStyle = SWT.RADIO;
		} else if (ArrayUtils.isNotEmpty(actionBean.getSubActionBeans())) {
			itemStyle = SWT.DROP_DOWN;
		} else {
			itemStyle = SWT.PUSH;
		}

		return itemStyle;
	}

}
