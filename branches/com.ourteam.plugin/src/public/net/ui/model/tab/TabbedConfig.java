package net.ui.model.tab;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.digester.Digester;

public class TabbedConfig implements Serializable {

	private List<TabbedPaneConfig> tabbedPaneList = new ArrayList<TabbedPaneConfig>();

	public TabbedConfig() {
	}

	public static TabbedConfig parse(InputStream aConfig) throws Exception {

		Digester digester = new Digester();

		digester.setValidating(false);

		digester.addObjectCreate("tabbed", TabbedConfig.class);

		digester.addObjectCreate("tabbed/tabbedpane", TabbedPaneConfig.class);

		digester.addSetProperties("tabbed/tabbedpane");

		digester.addObjectCreate("tabbed/tabbedpane/tab", TabConfig.class);

		digester.addSetProperties("tabbed/tabbedpane/tab");

		digester.addSetNext("tabbed/tabbedpane/tab", "addTab");

		digester.addObjectCreate("tabbed/tabbedpane/tab/property",
				TabProperty.class);

		digester.addSetProperties("tabbed/tabbedpane/tab/property");

		digester.addSetNext("tabbed/tabbedpane/tab/property", "addProperty");

		digester.addObjectCreate("tabbed/tabbedpane/tab/constructor_param",
				ConstructorParam.class);

		digester.addSetProperties("tabbed/tabbedpane/tab/constructor_param");

		digester.addSetNext("tabbed/tabbedpane/tab/constructor_param",
				"addConstructorParam");

		digester.addSetNext("tabbed/tabbedpane", "addTabbedPane");

		TabbedConfig tabbedConfig = (TabbedConfig) digester.parse(aConfig);

		return tabbedConfig;
	}

	public void addTabbedPane(TabbedPaneConfig aTabbedPaneConfig) {
		tabbedPaneList.add(aTabbedPaneConfig);
	}

	public void removeTabbedPane(TabbedPaneConfig aTabbedPaneConfig) {
		tabbedPaneList.remove(aTabbedPaneConfig);
	}

	public List<TabbedPaneConfig> getTabbedPaneList() {
		return tabbedPaneList;
	}

	public TabbedPaneConfig getTabbedPaneConfig(String aTabbedName) {
		TabbedPaneConfig config = null;
		for (Iterator<TabbedPaneConfig> iter = tabbedPaneList.iterator(); iter
				.hasNext();) {
			TabbedPaneConfig element = iter.next();
			if (element.getId().equals(aTabbedName)) {
				config = element;
				break;
			}
		}
		return config;
	}

}