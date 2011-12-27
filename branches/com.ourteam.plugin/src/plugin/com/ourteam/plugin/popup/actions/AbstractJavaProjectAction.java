package com.ourteam.plugin.popup.actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.ourteam.plugin.modelbase.ModelBaseContext;

abstract public class AbstractJavaProjectAction implements
		IObjectActionDelegate {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractJavaProjectAction.class);

	protected Shell shell;

	protected IPackageFragmentRoot packageFragmentRoot;

	protected IPackageFragment packageFragment;

	protected IJavaProject javaProject;
	
	protected IWorkbenchPart targetPart;

	/**
	 * Constructor for Action1.
	 */
	public AbstractJavaProjectAction() {
		super();
		
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		this.targetPart = targetPart;
		ModelBaseContext.start(shell);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		StructuredSelection structuredSelection = (StructuredSelection) selection;

		if (structuredSelection.isEmpty()) {
			return;
		}

		if (structuredSelection.getFirstElement() instanceof IJavaProject) {
			this.javaProject = (IJavaProject) structuredSelection
					.getFirstElement();
		} else if (structuredSelection.getFirstElement() instanceof IPackageFragmentRoot) {
			this.packageFragmentRoot = (IPackageFragmentRoot) structuredSelection
					.getFirstElement();

			this.javaProject = this.packageFragmentRoot.getJavaProject();

		} else if (structuredSelection.getFirstElement() instanceof IPackageFragment) {
			this.packageFragment = (IPackageFragment) structuredSelection
					.getFirstElement();

			Object parent = this.packageFragment.getParent();

			while (parent instanceof IPackageFragmentRoot == false) {
				parent = ((IJavaElement) parent).getParent();
			}

			this.packageFragmentRoot = (IPackageFragmentRoot) parent;

			this.javaProject = this.packageFragmentRoot.getJavaProject();
		}

	}

}
