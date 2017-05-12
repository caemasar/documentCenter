package idv.caemasar.documentCenter.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.entity.DcTDepartments;
import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.entity.User;
import idv.caemasar.documentCenter.service.DepartmentService;
import idv.caemasar.documentCenter.service.UserService;

public class DeptAction extends BaseAction {
	private DcTDepartments department;
	

	public DcTDepartments getDepartment() {
		return department;
	}


	public void setDepartment(DcTDepartments department) {
		this.department = department;
	}


	public String execute() throws Exception {
		try {
			UserService userService = serviceManager.getUserService();
			int dept_id = userService.getUserDeptID(Integer.parseInt(getCookieValue("u_id")));
			DepartmentService deptService = serviceManager.getDepartmentService();
			department = deptService.getDepartment(dept_id);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ERROR;
	}
}
