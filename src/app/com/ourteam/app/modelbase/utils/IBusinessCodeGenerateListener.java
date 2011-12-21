package com.ourteam.app.modelbase.utils;


public interface IBusinessCodeGenerateListener {

	void fireBeginGeneration(int totalCount);

	void fireBusinessCodeGenerated(int index,
			Object businessObjectBean);

	void fireBusinessCodeGenerateError(int index,
			Object businessObjectBean, Exception e);

}
