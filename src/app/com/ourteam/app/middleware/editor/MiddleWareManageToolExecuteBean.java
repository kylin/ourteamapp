package com.ourteam.app.middleware.editor;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;

public class MiddleWareManageToolExecuteBean {

	private MiddleWareBean middleWareBean;

	private MiddleWareToolBean middleWareToolBean;

	public MiddleWareManageToolExecuteBean(MiddleWareBean middleWareBean,
			MiddleWareToolBean middleWareToolBean) {
		super();
		this.middleWareBean = middleWareBean;
		this.middleWareToolBean = middleWareToolBean;
	}

	public MiddleWareBean getMiddleWareBean() {
		return middleWareBean;
	}

	public MiddleWareToolBean getMiddleWareToolBean() {
		return middleWareToolBean;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((middleWareBean == null) ? 0 : middleWareBean.hashCode());
		result = prime
				* result
				+ ((middleWareToolBean == null) ? 0 : middleWareToolBean
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiddleWareManageToolExecuteBean other = (MiddleWareManageToolExecuteBean) obj;
		if (middleWareBean == null) {
			if (other.middleWareBean != null)
				return false;
		} else if (!middleWareBean.equals(other.middleWareBean))
			return false;
		if (middleWareToolBean == null) {
			if (other.middleWareToolBean != null)
				return false;
		} else if (!middleWareToolBean.equals(other.middleWareToolBean))
			return false;
		return true;
	}

	public void reload() throws Exception {
		this.middleWareBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareById(this.middleWareBean.getId());

		this.middleWareToolBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolById(this.middleWareToolBean.getId());
	}

}
