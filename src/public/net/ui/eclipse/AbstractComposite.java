package net.ui.eclipse;

import net.ui.UIConfigFactory;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

abstract public class AbstractComposite<T extends ICompositeInitHelper> extends
		Composite {

	private T initHelper;

	public AbstractComposite(Composite parent, int style, T initHelper) {
		super(parent, style);
		if (initHelper != null) {
			this.initHelper = initHelper;
			this.initHelper.onConstructor(this);
		}
		createContent(this);
	}

	public AbstractComposite(Composite parent, int style) {
		this(parent, style, null);
	}

	public T getInitHelper() {
		return initHelper;
	}

	abstract protected void createContent(Composite parent);

	protected Image getImage(String aImage) {
		return ImageChache.getImage(aImage);
	}

	protected String getLocalMessage(String key, Object[] paramtetrs,
			String defaultMessage) {
		return UIConfigFactory.getInstance().getLocalMessage(key, paramtetrs,
				defaultMessage, LocalHelper.getLocale());
	}

	protected String getLocalMessage(String key, Object[] paramtetrs) {
		return getLocalMessage(key, paramtetrs, null);
	}

	protected String getLocalMessage(String key) {
		return getLocalMessage(key, new Object[0], null);
	}

	protected String getLocalMessage(String key, String defaultMessage) {
		return getLocalMessage(key, new Object[0], defaultMessage);
	}

}
