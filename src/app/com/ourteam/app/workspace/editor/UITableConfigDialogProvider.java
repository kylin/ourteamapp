package com.ourteam.app.workspace.editor;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.utils.AbstractDialogProvider;
import net.ui.model.table.ColumnBean;
import net.ui.model.table.ColumnDataBean;
import net.ui.model.table.ColumnImageBean;
import net.ui.model.table.TableBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.ui.UITableDesignComposite;

public class UITableConfigDialogProvider extends AbstractDialogProvider {

	private TableBean tableBean;

	private UITableDesignComposite tableDesignComposite;

	public UITableConfigDialogProvider(TableBean tableBean) {
		super();
		this.tableBean = tableBean;
	}

	@Override
	public String getTitle() {
		return "编辑列表配置信息";
	}

	@Override
	public boolean doOkPressed() throws Exception {

		tableDesignComposite.applyChange();

		this.tableBean.getColumnList().clear();

		copyTableBean(tableBean, tableDesignComposite.getInitHelper()
				.getTableBean());
		return true;
	}

	@Override
	public void createContentComposite(Composite parent) throws Exception {
		parent.setLayout(new FillLayout());

		TableBean tempTableBean = new TableBean();

		copyTableBean(tempTableBean, tableBean);

		tableDesignComposite = new UITableDesignComposite(parent, tempTableBean);
	}

	protected void copyTableBean(TableBean tempTableBean, TableBean tableBean)
			throws Exception {

		PropertyUtils.copyProperties(tempTableBean, tableBean);

		List<ColumnBean> columnBeans = tableBean.getColumnList();

		for (Iterator<ColumnBean> iterator = columnBeans.iterator(); iterator
				.hasNext();) {
			ColumnBean columnBean = iterator.next();

			ColumnBean tmpColumnBean = new ColumnBean();

			PropertyUtils.copyProperties(tmpColumnBean, columnBean);

			List<ColumnImageBean> imageList = columnBean.getImageList();

			for (Iterator<ColumnImageBean> iterator2 = imageList.iterator(); iterator2
					.hasNext();) {
				ColumnImageBean columnImageBean = iterator2.next();

				ColumnImageBean tmpColumnImageBean = new ColumnImageBean();

				PropertyUtils.copyProperties(tmpColumnImageBean,
						columnImageBean);

				tmpColumnBean.addColumnImage(tmpColumnImageBean);

			}

			List<ColumnDataBean> columnDataBeans = columnBean
					.getColumnDataList();

			for (Iterator<ColumnDataBean> iterator2 = columnDataBeans
					.iterator(); iterator2.hasNext();) {
				ColumnDataBean columnDataBean = iterator2.next();

				ColumnDataBean tmpColumnDataBean = new ColumnDataBean();

				PropertyUtils.copyProperties(tmpColumnDataBean, columnDataBean);

				tmpColumnBean.addColumnData(tmpColumnDataBean);

			}

			tempTableBean.addColumn(tmpColumnBean);

		}

	}

}
