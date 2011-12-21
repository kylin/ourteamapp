package net.ui.eclipse.viewpart;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.common.AbstractContentViewerComposite;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractTableViewPart<T> extends
		AbstractStructuredViewPart<T> {

	public AbstractTableViewPart() {
		super();
	}

	private TableViewComposite<T> tableViewComposite;

	abstract protected TableViewComposite<T> createTableComposite(
			Composite parent);

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new TableViewActionHandler<T>(this);
	}

	@Override
	protected AbstractContentViewerComposite createContentViewerComposite(
			Composite parent) {

		tableViewComposite = createTableComposite(parent);

		return tableViewComposite;
	}

	public TableViewComposite<T> getTableViewComposite() {
		return tableViewComposite;
	}

	@Override
	protected void addSelectionlistener(SelectionListener listener) {
		tableViewComposite.getTable().addSelectionListener(listener);

	}

	@Override
	protected ImageDescriptor getEditorImage(T t) {
		Image image = getTableViewComposite().getColumnImage(t, 0);
		if (image != null) {
			return ImageDescriptor.createFromImage(image);
		} else {
			return null;
		}
	}

	@Override
	public IEditorProvider<T> getEditorProvider(T item) {
		IEditorProvider<T> editorProvider = null;

		List<IEditorProvider<T>> editorProviders = getEditorProviderList(item);

		if (editorProviders == null) {
			return null;
		}

		for (Iterator<IEditorProvider<T>> iterator = editorProviders.iterator(); iterator
				.hasNext();) {
			IEditorProvider<T> tempEditorProvider = iterator.next();

			if (tempEditorProvider.isMatched(item)) {
				editorProvider = tempEditorProvider;
				break;
			}

		}

		return editorProvider;
	}

	@Override
	protected void update(
			AbstractContentViewerComposite contentViewerComposite,
			IDataModelEditorInput<?> editorInput) {
		tableViewComposite.getTableViewer()
				.update(editorInput.getDataModel(),
						tableViewComposite.getColumnProperties().toArray(
								new String[0]));
	}

	public List<T> getSelectedData() {
		return this.tableViewComposite.getSelectedDataList();
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		this.refresh();
	}

	static public class TableViewActionHandler<T> extends
		AbstractDispatchActionHandler {

		private AbstractTableViewPart<T> tableViewPart;

		public TableViewActionHandler(AbstractTableViewPart<T> tableViewPart) {
			super();
			this.tableViewPart = tableViewPart;
		}

		public AbstractTableViewPart<T> getTableViewPart() {
			return tableViewPart;
		}

		public void refresh(ActionEvent actionEvent) throws Exception {
			getTableViewPart().refresh();
		}

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return true;
		}
	}

}
