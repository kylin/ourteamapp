/*ModelBaseExplorer Class
 * COPYRIGHT FUJITSU LIMITED 2011-
 * Revision history:
 * 2011/09/03 FNST)qilin Create
 */

package com.ourteam.plugin.modelbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ui.eclipse.ImageChache;
import net.ui.eclipse.viewpart.AbstractMultiViewPart;
import net.ui.eclipse.viewpart.AbstractViewPart;
import net.ui.eclipse.viewpart.IViewPartProvider;
import net.ui.eclipse.viewpart.ViewPartFactory;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.reflect.ConstructorUtils;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.system.domain.ApplicationDomain;
import com.ourteam.system.domain.SystemModule;

/**
 * ModelBaseExplorer
 * 
 * 
 * @author qilin
 * 
 */
public class ModelBaseExplorer extends AbstractMultiViewPart {

	private Map<SystemModule, AbstractViewPart> moduleViewPartCache = new HashMap<SystemModule, AbstractViewPart>();

	
	
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		ModelBaseContext.start(site.getShell());
		super.init(site);
	}

	@Override
	protected AbstractViewPart[] getViewParts() {
		try {

			ApplicationDomain applicationDomain = IOurTeamServiceConst.APPLICATION_SERVICE
					.getApplicationDomainById(12);

			this.setPartName(applicationDomain.getName());
			this.setTitleImage(ImageChache.getImage(applicationDomain
					.getSmallIcon()));

			SystemModule[] modules = IOurTeamServiceConst.APPLICATION_SERVICE
					.getSystemModules(applicationDomain.getId(), 0);

			List<AbstractViewPart> viewParts = new ArrayList<AbstractViewPart>();

			for (int i = 0; i < modules.length; i++) {
				SystemModule systemModule = modules[i];

				if (moduleViewPartCache.containsKey(systemModule) == false) {

					Class viewClass = Class.forName(systemModule
							.getModuleCode());

					AbstractViewPart viewPart = null;

					if (ClassUtils.isAssignable(viewClass,
							IViewPartProvider.class)) {

						viewPart = ViewPartFactory
								.createViewPart((IViewPartProvider) viewClass
										.newInstance());

					} else {

						viewPart = (AbstractViewPart) ConstructorUtils
								.invokeConstructor(Class.forName(systemModule
										.getModuleCode()), new Object[0]);
					}

					viewPart.setViewSite(getSite());

					viewPart.setPartName(systemModule.getModuleName());

					if (StringUtils.isNotBlank(systemModule.getModuleIcon())) {
						viewPart.setTitleImage(ImageChache
								.getImage(systemModule.getModuleIcon()));
					}

					if (StringUtils.isNotBlank(systemModule.getRemarks())) {
						viewPart.setTitleToolTip(systemModule.getRemarks());
					}

					moduleViewPartCache.put(systemModule, viewPart);

					viewParts.add(viewPart);

				} else {
					viewParts.add(moduleViewPartCache.get(systemModule));
				}

			}

			return viewParts.toArray(new AbstractViewPart[viewParts.size()]);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
