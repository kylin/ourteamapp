package net.ui.eclipse.widget.filesystem;

import java.io.File;
import java.io.FileFilter;

import net.ui.eclipse.tree.ISubNodeBuilder;

public class FileSubNodeBuilder implements ISubNodeBuilder<File, File> {

	private File baseDir;

	private FileFilter fileFilter;

	public FileFilter getFileFilter() {
		return fileFilter;
	}

	public void setFileFilter(FileFilter fileFilter) {
		this.fileFilter = fileFilter;
	}

	public File getBaseDir() {
		return baseDir;
	}

	public void setBaseDir(File baseDir) {
		this.baseDir = baseDir;
	}

	@Override
	public File[] getSubNodes(File aParentObject) throws Exception {

		if (aParentObject == null) {
			aParentObject = new File(baseDir, "");
		}

		File[] files;

		if (this.fileFilter != null) {
			files = aParentObject.listFiles(this.fileFilter);
		} else {
			files = aParentObject.listFiles();
		}

		return files;

	}

	@Override
	public String getSubNodeDefineId(File nodeObject) {
		if (nodeObject.isDirectory()) {
			return "DIR";
		} else {
			return "FILE";
		}

	}

	@Override
	public String[] getSubNodeActionGroupIds(File nodeObject) {
		return null;
	}

}
