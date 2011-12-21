package com.ourteam.app.middleware.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.TreeNodeItem;

import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class ServerEditorHelper {

	private static List<IEditorProvider<TreeNodeItem>> serverEditorProviderList = new ArrayList<IEditorProvider<TreeNodeItem>>();

	static {
		serverEditorProviderList.add(new DatabaseEditorProvider());
		serverEditorProviderList.add(new SVNServerEditorProvider());
		serverEditorProviderList.add(new CVSServerEditorProvider());

		serverEditorProviderList.add(new MiddleWareTypeEditorProvider(
				MiddleWareTypeEnum.DATABASE_SERVER));

		serverEditorProviderList.add(new MiddleWareTypeEditorProvider(
				MiddleWareTypeEnum.APPLICATION_SERVER));

	}

	public static List<IEditorProvider<TreeNodeItem>> getServerEditorProviderList() {
		return serverEditorProviderList;
	}
}
