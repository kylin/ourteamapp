package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.FileFilter;

import net.ui.eclipse.utils.AbstractDialogProvider;
import net.ui.eclipse.widget.filesystem.AbstractCreateFileComposite;

import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

abstract public class AbstractCreateConfigFileDialogProvider extends
		AbstractDialogProvider {

	private File baseDir;

	private String fileExtention;

	private AbstractCreateFileComposite createFileComposite;

	public AbstractCreateConfigFileDialogProvider(File baseDir,
			String fileExtention) {
		super();
		this.baseDir = baseDir;
		this.fileExtention = fileExtention;
	}

	@Override
	public void createContentComposite(Composite parent) {
		createFileComposite = new AbstractCreateFileComposite(parent, SWT.NONE) {

			@Override
			protected File getBaseDir() {
				return baseDir;
			}

			@Override
			protected FileFilter getFileFilter() {

				FileFilter fileFilter = FileFilterUtils.andFileFilter(
						FileFilterUtils
								.makeCVSAware(DirectoryFileFilter.INSTANCE),
						FileFilterUtils
								.makeSVNAware(DirectoryFileFilter.INSTANCE));

				return fileFilter;
			}

		};

		setInfoMessage("提示：文件名以 '" + this.fileExtention + "' 结尾");

	}

	abstract protected void initFileContent(File file) throws Exception;

	@Override
	public boolean doOkPressed() throws Exception {
		try {

			if (createFileComposite.getSelectedDir() == null) {
				this.setErrorMessage("请选择父目录");
				return false;
			}

			if (StringUtils.isBlank(createFileComposite.getFileName())) {
				this.setErrorMessage("请输入文件名");
				return false;
			}

			if (StringUtils.endsWithIgnoreCase(
					createFileComposite.getFileName(), this.fileExtention) == false) {
				createFileComposite.setFileName(createFileComposite
						.getFileName() + "." + this.fileExtention);
			}

			File file = createFileComposite.createFile();

			initFileContent(file);

			return true;
		} catch (Exception e) {
			this.setErrorMessage(e.getLocalizedMessage());
			return false;
		}

	}

}
