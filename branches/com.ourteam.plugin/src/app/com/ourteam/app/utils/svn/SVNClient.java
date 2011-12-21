package com.ourteam.app.utils.svn;

import org.tigris.subversion.svnclientadapter.ISVNClientAdapter;
import org.tigris.subversion.svnclientadapter.SVNClientException;
import org.tigris.subversion.svnclientadapter.svnkit.SvnKitClientAdapterFactory;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;

public class SVNClient {

	static {
		try {
			SvnKitClientAdapterFactory.setup();
			DAVRepositoryFactory.setup();
			// JhlClientAdapterFactory.setup();
		} catch (SVNClientException e) {
			e.printStackTrace();
		}
	}

	protected void init() {

	}
	
	public static ISVNClientAdapter getSvnClientAdapter() {
		return getSvnClientAdapter(null,null);
	}

	public static ISVNClientAdapter getSvnClientAdapter(String userName,
			String password) {
		ISVNClientAdapter clientAdapter = SvnKitClientAdapterFactory
				.createSVNClient(SvnKitClientAdapterFactory.SVNKIT_CLIENT);

		if (userName != null) {
			clientAdapter.setUsername(userName);
		}

		if (password != null) {
			clientAdapter.setPassword(password);
		}

		return clientAdapter;
	}
}
