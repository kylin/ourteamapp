package com.ourteam.app.workspace;

import org.eclipse.core.runtime.IProgressMonitor;
import org.netbeans.lib.cvsclient.commandLine.BasicListener;
import org.netbeans.lib.cvsclient.event.EnhancedMessageEvent;
import org.netbeans.lib.cvsclient.event.MessageEvent;
import org.netbeans.lib.cvsclient.event.TerminationEvent;

public class CVSJobListener extends BasicListener implements ICMSJobListener {

	private IProgressMonitor progressMonitor;

	private final StringBuffer taggedLine = new StringBuffer();

	public CVSJobListener(IProgressMonitor progressMonitor) {
		super();
		this.progressMonitor = progressMonitor;
	}

	public void messageSent(MessageEvent e) {
		super.messageSent(e);
		String line = e.getMessage();
		if (e instanceof EnhancedMessageEvent) {
			return;
		}

		if (e.isTagged()) {
			String message = MessageEvent.parseTaggedMessage(this.taggedLine,
					e.getMessage());
			if (message != null) {
				this.progressMonitor.subTask(message);
			}
		} else {
			this.progressMonitor.subTask(line);
		}
	}

	@Override
	public void commandTerminated(TerminationEvent e) {
		super.commandTerminated(e);
		this.progressMonitor.subTask("结束中...");
	}

	
}
