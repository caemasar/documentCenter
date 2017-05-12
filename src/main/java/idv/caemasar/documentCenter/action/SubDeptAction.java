package idv.caemasar.documentCenter.action;

import java.util.List;

import idv.caemasar.documentCenter.entity.DcTDepartments;
import idv.caemasar.documentCenter.service.DepartmentService;
import idv.caemasar.documentCenter.service.UserService;

public class SubDeptAction extends BaseAction {
	private List<DcTDepartments> departmentss;

	public List<DcTDepartments> getDepartmentss() {
		return departmentss;
	}

	public void setDepartmentss(List<DcTDepartments> departmentss) {
		this.departmentss = departmentss;
	}
	public String execute() throws Exception {
		try {
			UserService userService = serviceManager.getUserService();
			int dept_id = userService.getUserDeptID(Integer.parseInt(getCookieValue("u_id")));
			DepartmentService deptService = serviceManager.getDepartmentService();
			departmentss = deptService.getSubDepartment(dept_id);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ERROR;
	}
}
