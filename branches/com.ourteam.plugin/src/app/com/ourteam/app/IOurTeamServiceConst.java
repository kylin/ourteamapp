package com.ourteam.app;

import com.ourteam.bpm.service.BPMServiceFactory;
import com.ourteam.bpm.service.IBPMService;
import com.ourteam.business.service.IMeetingService;
import com.ourteam.business.service.MeetingServiceFactory;
import com.ourteam.calendar.service.CalendarServiceFactory;
import com.ourteam.calendar.service.ICalendarService;
import com.ourteam.hr.service.DepartmentServiceFactory;
import com.ourteam.hr.service.EmployeeServiceFactory;
import com.ourteam.hr.service.IDepartmentService;
import com.ourteam.hr.service.IEmployeeService;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.product.service.IProductCatalogService;
import com.ourteam.product.service.IProductService;
import com.ourteam.product.service.IProductVersionService;
import com.ourteam.product.service.ProductCatalogServiceFactory;
import com.ourteam.product.service.ProductServiceFactory;
import com.ourteam.product.service.ProductVersionServiceFactory;
import com.ourteam.project.service.IProjectService;
import com.ourteam.project.service.ProjectServiceFactory;
import com.ourteam.report.service.IReportService;
import com.ourteam.report.service.ReportServiceFactory;
import com.ourteam.resource.service.IResourceService;
import com.ourteam.resource.service.ResourceServiceFactory;
import com.ourteam.system.service.ISysRoleService;
import com.ourteam.system.service.ISysUserService;
import com.ourteam.system.service.ISystemApplicationService;
import com.ourteam.system.service.ISystemNotifyConfigService;
import com.ourteam.system.service.ISystemSerialCodeService;
import com.ourteam.system.service.SysRoleServiceFactory;
import com.ourteam.system.service.SysUserServiceFactory;
import com.ourteam.system.service.SystemApplicationServiceFactory;
import com.ourteam.system.service.SystemNotifyConfigServiceFactory;
import com.ourteam.system.service.SystemSerialCodeServiceFactory;
import com.ourteam.team.service.ITeamService;
import com.ourteam.team.service.TeamServiceFactory;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public interface IOurTeamServiceConst {

	static final ISystemSerialCodeService SERIAL_CODE_SERVICE = SystemSerialCodeServiceFactory
			.getSystemSerialCodeService();

	static final IResourceService RESOURCE_SERVICE = ResourceServiceFactory
			.getResourceService();

	static final ICalendarService CALENDAR_SERVICE = CalendarServiceFactory
			.getCalendarService();

	static final IMeetingService MEETING_SERVICE = MeetingServiceFactory
			.getMeetingService();

	static final ITeamService TEAM_SERVICE = TeamServiceFactory
			.getTeamService();

	static final IReportService REPORT_SERVICE = ReportServiceFactory
			.getReportService();

	static final IMiddleWareService MIDDLE_WARE_SERVICE = MiddleWareServiceFactory
			.getMiddleWareService();

	static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	static final ISystemApplicationService APPLICATION_SERVICE = SystemApplicationServiceFactory
			.getSystemApplicationService();

	static final IProjectService PROJECT_SERVICE = ProjectServiceFactory
			.getProjectService();

	static final IProductCatalogService PRODUCT_CATALOG_SERVICE = ProductCatalogServiceFactory
			.getProductCatalogService();

	static final IProductService PRODUCT_SERVICE = ProductServiceFactory
			.getProductService();

	static final IProductVersionService PRODUCT_VERSION_SERVICE = ProductVersionServiceFactory
			.getProductVersionService();

	static final IBPMService BPM_SERVICE = BPMServiceFactory.getBPMService();

	static final ISysUserService SYS_USER_SERVICE = SysUserServiceFactory
			.getSysUserService();

	static final ISysRoleService SYS_ROLE_SERVICE = SysRoleServiceFactory
			.getSysRoleService();

	static final IDepartmentService DEPARTMENT_SERVICE = DepartmentServiceFactory
			.getDepartmentService();

	static final IEmployeeService EMPLOYEE_SERVICE = EmployeeServiceFactory
			.getEmployeeService();

	static final ISystemNotifyConfigService SYS_NOTIFY_CONFIG_SERVICE = SystemNotifyConfigServiceFactory
			.getSystemNotifyConfigService();

	static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();
}
