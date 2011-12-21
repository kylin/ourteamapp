package com.ourteam.app.workspace;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.tigris.subversion.svnclientadapter.SVNNodeKind;
import org.tigris.subversion.svnclientadapter.SVNProgressEvent;

import com.ourteam.app.utils.svn.ISVNListener;

public class SVNJobListener implements ISVNListener, ICMSJobListener {

	private IProgressMonitor progressMonitor;

	public SVNJobListener(IProgressMonitor progressMonitor) {
		super();
		this.progressMonitor = progressMonitor;
	}

	@Override
	public void logCommandLine(String arg0) {

	}

	@Override
	public void logCompleted(String arg0) {
		this.progressMonitor.setTaskName(arg0);
	}

	@Override
	public void logError(String arg0) {
		this.progressMonitor.done();
	}

	@Override
	public void logMessage(String arg0) {
		
		this.progressMonitor.subTask(arg0);

	}

	@Override
	public void logRevision(long arg0, String arg1) {
		
	}

	@Override
	public void onNotify(File arg0, SVNNodeKind arg1) {
		
	}

	@Override
	public void setCommand(int arg0) {
		
	}

	@Override
	public void onProgress(SVNProgressEvent arg0) {
//		if (arg0.getProgress() == 0) {
//			this.progressMonitor.beginTask("SVN Task", (int) arg0.getTotal());
//		} else {
//			this.progressMonitor.worked(1);
//		}

	}

}
