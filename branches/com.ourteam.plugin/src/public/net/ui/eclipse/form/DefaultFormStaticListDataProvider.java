package net.ui.eclipse.form;

import net.ui.UIConfigFactory;
import net.ui.model.constlist.ListData;

public class DefaultFormStaticListDataProvider implements
		IFormOptionListDataProvider<ListData> {

	@Override
	public ListData[] getOptionList(String aDataSrc) {
		return UIConfigFactory.getInstance().getListDatas(aDataSrc);
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
