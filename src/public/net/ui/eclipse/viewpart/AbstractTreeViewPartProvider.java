package net.ui.eclipse.viewpart;

import net.ui.UIConfigFactory;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.table.TableBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractTreeViewPartProvider extends
		AbstractViewPartProvider implements ITreeViewPartProvider {

	abstract protected String getTreeConfigId();

	abstract protected String getTableConfigId();

	@Override
	public TreeBean getTreeConfig() {

		return UIConfigFactory.getInstance().getTreeConfig(getTreeConfigId());
	}

	@Override
	public TableBean getTableConfig() {
		if (StringUtils.isNotEmpty(getTableConfigId())) {
			return UIConfigFactory.getInstance().getTableConfig(
					getTableConfigId());
		} else {
			return null;
		}
	}

	@Override
	public Object getRootNodeUserObject() {
		return null;
	}

	@Override
	public String getDefaultNodeDefineId() {
		return null;
	}

	@Override
	public int getTreeViewStyle() {
		return SWT.SINGLE;
	}

	@Override
	public Composite createPartControl(Composite parent) {
		return null;
	}

	@Override
	public void initSubNodeBuilder(String id, ISubNodeBuilder builder) {

	}

	@Override
	public boolean isEditable() {
		return false;
	}

	@Override
	public int getStyle() {
		return getTreeViewStyle();
	}

}
