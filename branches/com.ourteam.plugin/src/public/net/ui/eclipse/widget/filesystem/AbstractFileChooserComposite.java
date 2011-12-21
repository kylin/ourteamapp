package net.ui.eclipse.widget.filesystem;

import java.io.File;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;


abstract public class AbstractFileChooserComposite extends AbstractComposite {

	private TreeViewComposite treeViewComposite;

	public AbstractFileChooserComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void createContent(Composite parent) {

		this.setLayout(new FillLayout());

		treeViewComposite = new TreeViewComposite(this, new FileTreeProvider());

	}

	abstract protected void initFileSubNodeBuilder(
			FileSubNodeBuilder nodeBuilder);

	public File getSelectedFile() {
		Object[] objects = treeViewComposite.getSlectedUserObjects();

		if (ArrayUtils.isNotEmpty(objects)) {
			return (File) objects[0];
		} else {
			return null;
		}
	}

	class FileTreeProvider extends AbstractTreeTableViewProvider {

		@Override
		public TreeBean getTreeConfig() {

			return UIConfigFactory.getInstance().getTreeConfig(
					"/ui/filesystem_path.tree");
		}

		@Override
		public void initSubNodeBuilder(String id, ISubNodeBuilder builder) {
			if (builder instanceof FileSubNodeBuilder) {

				initFileSubNodeBuilder(((FileSubNodeBuilder) builder));

			}
		}

	}

}
