package net.ui.model.constlist;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.map.ListOrderedMap;
import org.apache.commons.digester.Digester;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ListDataFactory {

	private static Log logger = LogFactory.getLog(ListDataFactory.class);

	private Map<String, ListDataContainer> listMap = new ListOrderedMap();

	public ListDataFactory() {
	}

	public void initListData(InputStream aListData) throws Exception {
		Digester digester = new Digester();

		digester.setValidating(false);

		digester.addObjectCreate("listdata", ArrayList.class);

		digester.addObjectCreate("listdata/select", ListDataContainer.class);

		digester.addSetProperties("listdata/select");

		digester.addObjectCreate("listdata/select/option", ListData.class);

		digester.addCallMethod("listdata/select/option", "setListData", 2);

		digester.addCallParam("listdata/select/option", 0, "value");

		digester.addCallParam("listdata/select/option", 1);

		digester.addSetNext("listdata/select/option", "add");

		digester.addSetNext("listdata/select", "add");

		List<ListDataContainer> listDataCollection = (List) digester
				.parse(aListData);
		
		if(listDataCollection == null){
			listDataCollection = new ArrayList<ListDataContainer>();
		}

		listMap.clear();

		for (Iterator<ListDataContainer> iter = listDataCollection.iterator(); iter
				.hasNext();) {
			ListDataContainer item = iter.next();
			listMap.put(item.getName(), item);
		}

	}

	public ListDataContainer getListDataContainer(String aId) {
		return listMap.get(aId);
	}

	public Map<String, ListDataContainer> getListMap() {
		return listMap;
	}

	public ListDataContainer[] getListDataContainers() {

		Collection<ListDataContainer> dataContainers = listMap.values();

		return dataContainers.toArray(new ListDataContainer[dataContainers
				.size()]);
	}

	protected static List<ListData> getStaticDataList(
			ListDataContainer aListDataContainer) {
		if (StringUtils.isBlank(aListDataContainer.getDatatype())
				|| "java.lang.String".equals(aListDataContainer.getDatatype())) {
			return aListDataContainer;
		} else {

			try {

				for (Iterator<ListData> iterator = aListDataContainer
						.iterator(); iterator.hasNext();) {
					ListData listData = (ListData) iterator.next();
					listData.setData(ConvertUtils.convert(listData.getData()
							.toString(), Class.forName(aListDataContainer
							.getDatatype())));
				}

				return aListDataContainer;

			} catch (ClassNotFoundException e) {
				logger.error("ClassNotFoundException", e);
				return null;
			}

		}

	}

	public ListData[] getList(String aKey) {

		if (listMap.containsKey(aKey)) {

			ListDataContainer listContainer = (ListDataContainer) listMap
					.get(aKey);

			if ("static".equals(listContainer.getType())) {

				return (ListData[]) getStaticDataList(listContainer).toArray(
						new ListData[0]);

			} else if ("dynamic".equals(listContainer.getType())) {

			}

		}
		return new ListData[0];
	}

}