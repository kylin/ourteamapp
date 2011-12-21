package net.ui.eclipse.form;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

import net.ui.UIConfigFactory;
import net.ui.eclipse.utils.IComboListProvider;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.constlist.ListDataFactory;

public class FormOptionListDataProviderAdapter implements
		IFormOptionListDataProvider<ListData> {

	private IComboListProvider comboListProvider;

	public FormOptionListDataProviderAdapter(
			IComboListProvider comboListProvider) {
		super();
		this.comboListProvider = comboListProvider;
	}

	@Override
	public ListData[] getOptionList(String aDataSrc) throws Exception{
		ListDataContainer listDataContainer = UIConfigFactory.getInstance()
				.getListDataConfig(aDataSrc);

		Object[] objects = this.comboListProvider.getDataList();

		ListData[] listDatas = new ListData[objects.length];

		try {
			for (int i = 0; i < listDatas.length; i++) {
				listDatas[i] = new ListData();
				if (StringUtils
						.isNotBlank(listDataContainer.getLabelProperty())) {
					listDatas[i].setLabel(String.valueOf(PropertyUtils
							.getProperty(objects[i],
									listDataContainer.getLabelProperty())));
				} else {
					listDatas[i].setLabel(this.comboListProvider
							.getDataLabel(objects[i]));
				}

				if (StringUtils.isNotBlank(listDataContainer.getDataProperty())) {
					listDatas[i].setData(PropertyUtils.getProperty(objects[i],
							listDataContainer.getDataProperty()));
				} else {
					listDatas[i].setData(objects[i]);
				}

			}

			return listDatas;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public String getOptionLabel(ListData dataItem) {
		return dataItem.getLabel();
	}

	@Override
	public Object getOptionData(ListData dataItem) {
		return dataItem.getData();
	}

}
