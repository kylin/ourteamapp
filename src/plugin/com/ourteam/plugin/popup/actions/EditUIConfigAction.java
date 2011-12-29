package com.ourteam.plugin.popup.actions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.ui.eclipse.ImageChache;
import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;

public class EditUIConfigAction extends AbstractJavaProjectAction {

	private static Map<String, String[]> UI_CONFIG_NODE_MAP = new HashMap<String, String[]>();

	static {
		UI_CONFIG_NODE_MAP.put("<actions>", new String[] {
				"uiActionConfigEditorTab", "ui_action_config" });
		UI_CONFIG_NODE_MAP.put("<actions/>", new String[] {
				"uiActionConfigEditorTab", "ui_action_config" });
		
		UI_CONFIG_NODE_MAP.put("<listdata>", new String[] {
				"uiSelectListConfigEditorTab", "ui_combox_config" });
		UI_CONFIG_NODE_MAP.put("<listdata/>", new String[] {
				"uiSelectListConfigEditorTab", "ui_combox_config" });
		
		UI_CONFIG_NODE_MAP.put("<formSet>", new String[] {
				"uiFormConfigEditorTab", "ui_form_config" });
		UI_CONFIG_NODE_MAP.put("<formSet/>", new String[] {
				"uiFormConfigEditorTab", "ui_form_config" });
		
		UI_CONFIG_NODE_MAP.put("<tableList>", new String[] {
				"uiTableConfigEditorTab", "ui_table_config" });
		UI_CONFIG_NODE_MAP.put("<tableList/>", new String[] {
				"uiTableConfigEditorTab", "ui_table_config" });
		
		UI_CONFIG_NODE_MAP.put("<tabbed>", new String[] {
				"uiTabConfigListEditorTab", "ui_tab_config" });
		UI_CONFIG_NODE_MAP.put("<tabbed/>", new String[] {
				"uiTabConfigListEditorTab", "ui_tab_config" });
		
		UI_CONFIG_NODE_MAP.put("<tree", new String[] {
				"uiTreeConfigEditorTab", "ui_tree_config" });
		UI_CONFIG_NODE_MAP.put("<tree/>", new String[] {
				"uiTreeConfigEditorTab", "ui_tree_config" });
	}

	private IFile file;

	public EditUIConfigAction() {

	}

	@Override
	public void run(IAction action) {

		if (file == null) {
			return;
		}

		if (FilenameUtils.isExtension(file.getName(), "xml")) {

			try {
				String xmlContent = FileUtils.readFileToString(file
						.getRawLocation().toFile(), "UTF-8");

				Iterator<String> iterator = UI_CONFIG_NODE_MAP.keySet()
						.iterator();

				for (; iterator.hasNext();) {
					String key = iterator.next();
					if (StringUtils.containsIgnoreCase(xmlContent, key)) {
						String[] editorConfigs = UI_CONFIG_NODE_MAP.get(key);

						WorkspaceResourceFileObject fileObject = new WorkspaceResourceFileObject(
								file.getRawLocation().toFile());

						FileResourceEditorInput editorInput = new FileResourceEditorInput(
								fileObject, editorConfigs[0]);

						editorInput.setImageDescriptor(ImageChache
								.getImageDescriptor(editorConfigs[1]));

						this.targetPart
								.getSite()
								.getPage()
								.openEditor(editorInput,
										MultiPageEditorPartAgent.EDITOR_ID);

					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		StructuredSelection structuredSelection = (StructuredSelection) selection;

		if (structuredSelection.isEmpty()) {
			file = null;
			return;
		}

		file = (IFile) structuredSelection.getFirstElement();

	}
}
