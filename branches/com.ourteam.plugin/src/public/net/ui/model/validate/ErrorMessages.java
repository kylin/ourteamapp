package net.ui.model.validate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ErrorMessages {

	private List<Object> errorList = new ArrayList<Object>();

	public ErrorMessages() {
	}

	public void addError(Object anError) {
		if (anError instanceof ErrorMessages) {
			addErrors((ErrorMessages) anError);
		} else {
			this.errorList.add(anError);
		}
	}

	public void addErrors(ErrorMessages anErrors) {
		this.errorList.addAll(anErrors.errorList);
	}

	public boolean isEmpty() {
		return this.errorList.isEmpty();
	}

	public String getErrorMessages() {
		StringBuffer str = new StringBuffer();

		for (Iterator<Object> iter = errorList.iterator(); iter.hasNext();) {
			Object item = iter.next();
			str.append(item);
		}

		return str.toString();
	}

}