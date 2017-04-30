package idv.caemasar.documentCenter.action;

import java.io.File;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.entity.User;
import idv.caemasar.documentCenter.service.UserService;

public class RegisterAction extends BaseAction implements ModelDriven<User> {
	private User user = new User();

	public User getModel() {
		return user;
	}

	@Override
	public void validate() {

		System.out.println("v1=========================================");
		clearFieldErrors();
		System.out.println("v2=========================================");
		if ("".equals(user.getValidationCode())) {
			System.out.println("v3=========================================");
			return;
		}
		System.out.println("v4=========================================");
		Object obj = ActionContext.getContext().getSession().get("validation_code");
		System.out.println("v5=========================================");
		String validationCode = (obj != null) ? obj.toString() : "";
		System.out.println("v6=========================================");
		if (!validationCode.equalsIgnoreCase(user.getValidationCode())) {
			System.out.println("v7=========================================");
			if (user.getValidationCode() != null) {
				System.out.println("v8=========================================");
				this.addFieldError("validationCode", "验证码输入错误!");
			}
		}
		System.out.println("v9=========================================");
	}

	public String execute() throws Exception {
		System.out.println("1=========================================");
		try {
			UserService userService = serviceManager.getUserService();
			System.out.println("2=========================================");

			userService.addUser(user);
			System.out.println("3=========================================");

			File dir = new File(userInfo.getRoot() + user.getUser());
			System.out.println("4=========================================");

			if (!dir.exists())
				dir.mkdir();
			result = "<" + user.getUser() + ">注册成功！";
			System.out.println("5=========================================");
			return SUCCESS;
		} catch (Exception e) {
			result = e.getMessage();
			System.out.println("e=========================================");

			return ERROR;
		}

	}
}