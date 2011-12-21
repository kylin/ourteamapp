package net.ui.eclipse;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public abstract class AbstractPerspectiveFactory implements IPerspectiveFactory {

	private IPageLayout pageLayout;

	abstract protected boolean isEditorAreaVisible();

	abstract protected void doCreateInitialLayout(IPageLayout layout);

	abstract protected String getPerspectiveId();

	@Override
	public void createInitialLayout(IPageLayout layout) {
		this.pageLayout = layout;
		layout.setEditorAreaVisible(isEditorAreaVisible());
		doCreateInitialLayout(layout);

		layout.addPerspectiveShortcut(getPerspectiveId());
	}

	protected void addView(IFolderLayout folderLayout, String viewId,
			boolean closAble) {

		folderLayout.addView(viewId);
		
		this.pageLayout.getViewLayout(viewId).setCloseable(closAble);
	}

	public IPageLayout getPageLayout() {
		return pageLayout;
	}

}
