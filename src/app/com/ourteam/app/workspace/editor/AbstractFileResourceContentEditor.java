package com.ourteam.app.workspace.editor;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractEditorPart;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;

import de.java2html.Java2Html;
import de.java2html.options.JavaSourceConversionOptions;

abstract public class AbstractFileResourceContentEditor
		extends
		AbstractEditorPart<WorkspaceResourceFileObject, FileResourceEditorInput> {

	private Browser editor;

	abstract protected boolean canEdit(
			WorkspaceResourceFileObject resourceFileObject);

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

	}

	@Override
	protected void reloadDataModel() throws Exception {
		if (this.isDirty() == false) {

			String content = FileUtils.readFileToString(getDataModel()
					.getResourceFile());

			this.editor.setText(syntaxJavaToHtml(content, "UTF-8"));

		}
	}

	@Override
	public void doCreatePartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		editor = new Browser(parent, SWT.BORDER);
	}

	protected String syntaxJavaToHtml(String text, String encoding) {
		JavaSourceConversionOptions settings = JavaSourceConversionOptions
				.getDefault();

		settings.setAddLineAnchors(true);

		settings.setShowLineNumbers(true);

		settings.setShowTableBorder(false);

		// settings.setLineAnchorPrefix("line");

		String page = Java2Html.convertToHtmlPage(text, settings);

		return StringUtils.replaceOnce(page, "charset=iso-8859-1", "charset="
				+ encoding);
	}

	@Override
	public String[] getActionGroupIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IActionHandler createActionHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
