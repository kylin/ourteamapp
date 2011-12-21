package net.ui.eclipse.viewpart;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.common.AbstractContentViewerComposite;
import net.ui.eclipse.editorpart.AbstractDataModelEditorInput;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.eclipse.editorpart.IEditor;
import net.ui.eclipse.editorpart.IEditorPartSaveListener;
import net.ui.eclipse.editorpart.IEditorProvider;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;

public abstract class AbstractStructuredViewPart<T> extends AbstractViewPart
		implements ISelectionProvider, SelectionListener, IOpenListener {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractStructuredViewPart.class);

	private ISelection theSelection = StructuredSelection.EMPTY;

	private List<ISelectionChangedListener> listeners = new ArrayList<ISelectionChangedListener>();

	private AbstractContentViewerComposite contentComposite;

	abstract protected List<IEditorProvider<T>> getEditorProviderList(
			T datamodel);

	abstract protected AbstractContentViewerComposite createContentViewerComposite(
			Composite parent);
	
	abstract protected void addSelectionlistener(SelectionListener listener); 

	public AbstractStructuredViewPart() {
		super();
	}

	@Override
	public void doCreatePartControl(Composite parent) {

		FillLayout fillLayout = new FillLayout();

		parent.setLayout(fillLayout);

		contentComposite = createContentViewerComposite(parent);

		if (contentComposite != null && contentComposite.isDisposed() == false) {

			contentComposite.setActionHandler(actionHandler);

			StructuredViewer viewer = contentComposite.getViewer();

			viewer.addOpenListener(this);
			
			//SelectionEvent.addListener(viewer.getControl(), this);
			
			addSelectionlistener(this);

		}

		getSite().setSelectionProvider(this);

	}

	@Override
	public void setFocus() {
		if (contentComposite != null && contentComposite.isDisposed() == false) {
			contentComposite.setFocus();
		}
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	public ISelection getSelection() {
		return theSelection;
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	public void setSelection(ISelection selection) {
		theSelection = selection;

		final SelectionChangedEvent e = new SelectionChangedEvent(this,
				selection);

		Object[] listenersArray = listeners.toArray();

		for (int i = 0; i < listenersArray.length; i++) {
			final ISelectionChangedListener l = (ISelectionChangedListener) listenersArray[i];
			SafeRunner.run(new SafeRunnable() {
				public void run() {
					l.selectionChanged(e);
				}
			});
		}

		this.updateActionStatus();

		if (selection.isEmpty() == false) {
			openEditor(
					(T) ((IStructuredSelection) selection).getFirstElement(),
					false);

		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {

		final IStructuredSelection selection = (IStructuredSelection) contentComposite
				.getViewer().getSelection();

		setSelection(selection);

	}

	@Override
	public void widgetSelected(SelectionEvent e) {

		widgetDefaultSelected(e);
	}

	public void refresh() {
		this.contentComposite.reLoadContent();
	}

	abstract public IEditorProvider<T> getEditorProvider(T item);

	public IEditorReference[] findEditorReferences(final T item) {

		IEditorProvider<T> editorProvider = getEditorProvider(item);

		if (editorProvider == null) {
			return new IEditorReference[0];
		}

		IEditorInput input = editorProvider.getEditorInput(item);

		IEditorReference[] editorReferences = getSite()
				.getWorkbenchWindow()
				.getActivePage()
				.findEditors(input, editorProvider.getEditorId(),
						IWorkbenchPage.MATCH_INPUT);

		return editorReferences;

	}

	abstract protected void update(
			AbstractContentViewerComposite contentViewerComposite,
			IDataModelEditorInput<?> editorInput);

	abstract protected ImageDescriptor getEditorImage(T t);

	@SuppressWarnings({ "rawtypes" })
	protected void openEditor(final T item, boolean open) {

		IEditorProvider<T> editorProvider = getEditorProvider(item);

		if (editorProvider == null) {
			return;
		}

		IEditorInput input = editorProvider.getEditorInput(item);

		final AbstractDataModelEditorInput editorInput = (AbstractDataModelEditorInput) input;

		editorInput.setImageDescriptor(getEditorImage(item));

		IEditorPart editorPart = null;

		try {
			IEditorReference[] editorReferences = findEditorReferences(item);

			if (ArrayUtils.isNotEmpty(editorReferences)) {
				editorPart = editorReferences[0].getEditor(true);

				if (editorPart instanceof IEditor) {
					((IEditor) editorPart).setCanSaveChange(editorProvider
							.canSave());
				}

				if (editorInput.exists()) {

					getSite().getWorkbenchWindow().getActivePage()
							.activate(editorPart);

					getSite().getWorkbenchWindow().getActivePage()
							.activate(this);

				} else {
					editorPart.setFocus();
					MessageDialog.openWarning(this.getSite().getShell(), "提示",
							"对象'" + editorInput.getName() + "'已不存在，点击确认关闭编辑器");
					getSite().getWorkbenchWindow().getActivePage()
							.closeEditor(editorPart, false);
				}

			} else if (open == true) {

				editorInput.reloadDataModel();

				if (StringUtils.isEmpty(editorProvider.getEditorId())) {
					throw new IllegalArgumentException(
							"Editor Id Can Not Be Null");
				}

				editorPart = getSite().getWorkbenchWindow().getActivePage()
						.openEditor(editorInput, editorProvider.getEditorId());

				if (editorPart != null) {

					if (editorPart instanceof IEditor) {
						((IEditor) editorPart).setCanSaveChange(editorProvider
								.canSave());
					}

					editorPart
							.addPropertyListener(new IEditorPartSaveListener() {

								public void propertyChanged(Object source,
										int propId) {
									if (AbstractEditorPart.EDITOR_SAVED == propId) {
										update(contentComposite, editorInput);
									}
								}

							});
				}
			}

		} catch (Exception ex) {
			IStatus status = new Status(IStatus.ERROR,
					"com.ourteam.app.modelbase", 10, "OpenEditor Error", ex);
			ErrorDialog.openError(this.getSite().getShell(),
					"OpenEditor Error", ex.getLocalizedMessage(), status);

			logger.error("OpenEditor Error", ex);
		}

	}

	public void closeEditor() {
		ISelection selection = this.getSelection();

		if (selection.isEmpty() == false) {
			T treeItem = (T) ((IStructuredSelection) selection)
					.getFirstElement();

			IEditorReference[] editorReferences = this
					.findEditorReferences(treeItem);

			this.getSite().getWorkbenchWindow().getActivePage()
					.closeEditors(editorReferences, false);
		}
	}

	@Override
	public void open(OpenEvent event) {

		IStructuredSelection selectedItem = (IStructuredSelection) getSelection();

		if (selectedItem.isEmpty() == false) {
			showBusy(true);
			openEditor((T) selectedItem.getFirstElement(), true);
			showBusy(false);
		}

	}

}
