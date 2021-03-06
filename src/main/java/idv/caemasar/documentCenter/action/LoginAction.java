package idv.caemasar.documentCenter.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.entity.User;
import idv.caemasar.documentCenter.service.UserLogService;
import idv.caemasar.documentCenter.service.UserService;

public class LoginAction extends BaseAction implements ModelDriven<User> {
	private User user = new User();

	public User getModel() {
		return user;
	}

	@Override
	public void validate() {
		if ("".equals(user.getValidationCode()))
			return;
		Object obj = ActionContext.getContext().getSession().get("validation_code");

		String validationCode = (obj != null) ? obj.toString() : "";

		if (!validationCode.equalsIgnoreCase(user.getValidationCode())) {
			if (user.getValidationCode() != null) {
				this.addFieldError("validationCode", "验证码输入错误!");
			}
		}
		// clearFieldErrors();
	}

	public String execute() throws Exception {
		try {
			UserService userService = serviceManager.getUserService();
			UserLogService logService = serviceManager.getUserLogService();
			if (userService.verifyUser(user)) {
				int u_id = userService.getUserID(user);
				saveCookie("user", user.getU_username(), 24 * 60 * 60);
				saveCookie("u_id", String.valueOf(u_id), 24 * 60 * 60);
				userInfo.setUid(String.valueOf(u_id));
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getU_username());
				session.setMaxInactiveInterval(60 * 60 * 3);
				String addr = ServletActionContext.getRequest().getRemoteAddr();
				logService.recordUser(u_id, addr);
				return SUCCESS;
			} else {
				this.addFieldError("password", "账户或密码输入错误!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ERROR;
	}
}