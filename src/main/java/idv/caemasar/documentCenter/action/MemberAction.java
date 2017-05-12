package idv.caemasar.documentCenter.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import idv.caemasar.documentCenter.entity.User;
import idv.caemasar.documentCenter.service.UserService;

public class MemberAction extends BaseAction {
	private List<User> members;
	private String deptID;

	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String execute() throws Exception {
		try {
			int dept_id = 0;
			if (deptID == null) {
				UserService userService = serviceManager.getUserService();
				dept_id = userService.getUserDeptID(Integer.parseInt(getCookieValue("u_id")));
			} else {
				dept_id = Integer.parseInt(deptID);
			}
			UserService userService = serviceManager.getUserService();
			members = userService.getMemberByDeptID(dept_id);

			return SUCCESS;
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return ERROR;
	}
}
