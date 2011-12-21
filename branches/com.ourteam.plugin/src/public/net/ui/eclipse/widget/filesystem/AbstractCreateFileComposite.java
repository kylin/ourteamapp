package net.ui.eclipse.widget.filesystem;

import java.io.File;
import java.io.FileFilter;

import net.ui.eclipse.AbstractComposite;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public abstract class AbstractCreateFileComposite extends AbstractComposite {

	private AbstractFileChooserComposite fileChooserComposite;

	private Text fileNameText;

	public AbstractCreateFileComposite(Composite parent, int style) {
		super(parent, style);

	}

	abstract protected File getBaseDir();

	abstract protected FileFilter getFileFilter();

	@Override
	protected void createContent(Composite parent) {
		this.setLayout(new GridLayout());

		fileChooserComposite = new AbstractFileChooserComposite(this, SWT.NONE) {

			@Override
			protected void initFileSubNodeBuilder(FileSubNodeBuilder nodeBuilder) {
				nodeBuilder.setBaseDir(getBaseDir());
				FileFilter fileFilter = getFileFilter();
				if (fileFilter != null) {
					nodeBuilder.setFileFilter(fileFilter);
				}
			}
		};

		fileChooserComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label label = new Label(this, SWT.NONE);

		label.setText("文件名：");

		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		fileNameText = new Text(this, SWT.BORDER);

		fileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	}

	public File getSelectedDir() {
		return fileChooserComposite.getSelectedFile();
	}

	public String getFileName() {

		return fileNameText.getText();
	}
	
	public void setFileName(String fileName){
		fileNameText.setText(fileName);
	}

	public File createFile() throws Exception {
		File file = fileChooserComposite.getSelectedFile();

		File newFile = new File(file, StringUtils.trim(fileNameText.getText()));

		newFile.createNewFile();

		return newFile;
	}

}
