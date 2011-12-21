package net.ui.eclipse.editorpart;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.action.ToolBarBuilder;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.PartInitException;

public class EditorPartAgent<K, T extends IEditorAgentInput> extends
		AbstractEditorPart<K, IDataModelEditorInput<K>> implements IEditor {

	public static final String EDITOR_ID = "net.ui.eclipse.editorpart.EditorPartAgent";

	private AbstractEditorPart<K, IDataModelEditorInput<K>> editorPart;

	private IActionHandler actionHandler;

	private ICustomActionControl customActionControl;

	public EditorPartAgent() {
		super();
	}

	public AbstractEditorPart<K, IDataModelEditorInput<K>> getEditorPart() {
		return editorPart;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		editorPart.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		editorPart.doSaveAs();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);

		try {
			editorPart = (AbstractEditorPart<K, IDataModelEditorInput<K>>) ((IEditorAgentInput) input)
					.getEditorPart();

			actionHandler = editorPart.getActionHandler();

			customActionControl = editorPart.getCustomActionControl();

			editorPart.init(site, input);

			editorPart.addPropertyListener(new IPropertyListener() {
				public void propertyChanged(Object source, int propertyId) {
					EditorPartAgent.this.handlePropertyChange(propertyId);
				}
			});

		} catch (Exception e) {
			throw new PartInitException(e.getLocalizedMessage(), e);
		}

	}

	protected void handlePropertyChange(int propertyId) {
		firePropertyChange(propertyId);
	}

	@Override
	public boolean isDirty() {
		return editorPart.isDirty();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return editorPart.isSaveAsAllowed();
	}

	@Override
	public void createPartControl(Composite parent) {
		editorPart.createPartControl(parent);
	}

	@Override
	public void setFocus() {
		editorPart.setFocus();
	}

	@Override
	protected void saveDataModel(K aDataModel) throws Exception {
		editorPart.saveDataModel(aDataModel);
	}

	@Override
	protected void reloadDataModel() throws Exception {
		editorPart.reloadDataModel();

	}

	@Override
	protected void doCreatePartControl(Composite parent) {
		editorPart.doCreatePartControl(parent);

	}

	public void setDirty(boolean dirty) {
		editorPart.setDirty(dirty);
	}

	public boolean isAutoReload() {
		return editorPart.isAutoReload();
	}

	public void setAutoReload(boolean autoReload) {
		editorPart.setAutoReload(autoReload);
	}

	public boolean isCanSaveChange() {
		return editorPart.isCanSaveChange();
	}

	@Override
	public void setCanSaveChange(boolean canSaveChange) {
		editorPart.setCanSaveChange(canSaveChange);
	}

	@Override
	public String[] getActionGroupIds() {
		return editorPart.getActionGroupIds();
	}

	@Override
	public IActionHandler createActionHandler() {
		return actionHandler;
	}

	@Override
	public ICustomActionControl getCustomActionControl() {
		return customActionControl;
	}

	@Override
	public void setToolBarBuilder(ToolBarBuilder toolBarBuilder) {
		editorPart.setToolBarBuilder(toolBarBuilder);
	}

	public ToolBarBuilder getToolBarBuilder() {
		return editorPart.getToolBarBuilder();
	}

	@Override
	public void onClosed() {
		if (editorPart instanceof IEditor) {
			((IEditor) editorPart).onClosed();
		}
	}

}
