package net.ui.eclipse.editorpart;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ShowTextContributionItem;
import net.ui.eclipse.action.ToolBarBuilder;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;

public class EditorHelper {

	public static void buildEditorToolbar(IEditor editor,
			IToolBarManager toolBarManager,
			ISelectionChangedListener selectionChangedListener) {

		if (editor == null || toolBarManager == null) {
			return;
		}
		
		toolBarManager.removeAll();

		String[] actiongroupIds = editor.getActionGroupIds();

		if (ArrayUtils.isNotEmpty(actiongroupIds)
				&& editor.getToolBarBuilder() == null) {
			ActionGroupBean[] actionGroupBeans = new ActionGroupBean[actiongroupIds.length];

			for (int i = 0; i < actionGroupBeans.length; i++) {
				actionGroupBeans[i] = UIConfigFactory.getInstance()
						.getActionGroupConfig(actiongroupIds[i]);

			}

			ToolBarBuilder toolBarBuilder = new ToolBarBuilder(toolBarManager,
					actionGroupBeans, editor.getActionHandler(),
					editor.getCustomActionControl());

			editor.setToolBarBuilder(toolBarBuilder);

			toolBarBuilder.updateActionStatus();

			if (editor instanceof ISelectionProvider
					&& selectionChangedListener != null) {
				((ISelectionProvider) editor)
						.addSelectionChangedListener(selectionChangedListener);
			}

			toolBarManager.add(new ShowTextContributionItem(null));

		} else if (editor.getToolBarBuilder() != null) {
			editor.getToolBarBuilder().reBuildActionItems(false);
			editor.getToolBarBuilder().updateActionStatus();
			toolBarManager.add(new ShowTextContributionItem(null));
		}
		else{
			ToolBarBuilder toolBarBuilder = new ToolBarBuilder(toolBarManager,
					new ActionGroupBean[]{}, editor.getActionHandler(),
					editor.getCustomActionControl());

			editor.setToolBarBuilder(toolBarBuilder);
			
			toolBarManager.add(new ShowTextContributionItem(null));
		}

	}
}
