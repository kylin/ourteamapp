package net.ui.eclipse.editorpart;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import net.ui.eclipse.action.IActionHandler;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public abstract class AbstractTextEditorPart<K, T extends IDataModelEditorInput<K>>
		extends AbstractEditorPart<K, T> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractTextEditorPart.class);

	private Text editor;

	private Label lineNumberText;

	private ModifyListener modifyListener;

	private Composite textLeftBarComposite;

	abstract protected String getTextContent() throws Exception;

	protected String getEditorTextContent() {
		return editor.getText();
	}

	@Override
	protected void reloadDataModel() throws Exception {
		if (this.isDirty() == false) {
			if (modifyListener != null) {
				editor.removeModifyListener(modifyListener);
				modifyListener = null;
			}

			this.editor.setText(getTextContent());

			showTextLeftBarInfo();

			if (modifyListener == null) {

				modifyListener = new ModifyListener() {

					public void modifyText(final ModifyEvent event) {
						setDirty(true);
						showTextLeftBarInfo();
					}
				};

				editor.addModifyListener(modifyListener);
			}
		}
	}

	@Override
	public void doCreatePartControl(Composite parent) {
		
		parent.setLayout(new FillLayout());
		
		final ScrolledComposite scrolledComposite = new ScrolledComposite(parent,SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		
		final Composite textPanel = new Composite(scrolledComposite,SWT.NONE);
		
		textPanel.setLayout(new GridLayout(2, false));

		textLeftBarComposite = new Composite(textPanel, SWT.NONE);

		textLeftBarComposite
				.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		textLeftBarComposite.setLayout(new FillLayout(SWT.VERTICAL));

		lineNumberText = new Label(textLeftBarComposite,SWT.NONE);
	
		editor = new Text(textPanel, SWT.MULTI | SWT.BORDER);
		
		editor.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		scrolledComposite.setContent(textPanel);

		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		scrolledComposite.setMinSize(textPanel.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));
		scrolledComposite.addControlListener(new ControlAdapter() {

			public void controlResized(ControlEvent e) {
				scrolledComposite.setMinSize(textPanel.computeSize(
						SWT.DEFAULT, SWT.DEFAULT));
			}
		});

		scrolledComposite.update();
		
	}

	protected void showTextLeftBarInfo() {

		try {
			List<String> lineList = IOUtils.readLines(new StringReader(
					this.editor.getText()));
			lineNumberText.setText("");
			StringBuffer lineNumber = new StringBuffer();
			for (int i = 1; i <= lineList.size(); i++) {

				lineNumber.append(i).append(SystemUtils.LINE_SEPARATOR);
			}

			lineNumberText.setText(lineNumber.toString());
			
			//textLeftBarComposite.getParent().layout(true);

		} catch (IOException e) {
			logger.error("read text content error", e);
		}

	}

	@Override
	public String[] getActionGroupIds() {
		return null;
	}

	@Override
	public IActionHandler createActionHandler() {
		return null;
	}

	@Override
	protected void saveDataModel(K aDataModel) throws Exception {
		
	}

}