package idv.caemasar.documentCenter.action;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.entity.User;
import idv.caemasar.documentCenter.service.UserService;

public class LoginAction extends BaseAction implements ModelDriven<User>
{
	private User user = new User();

	public User getModel()
	{
		return user;
	}

	@Override
	public void validate()
	{
		if("".equals(user.getValidationCode())) return;
		Object obj = ActionContext.getContext().getSession().get(
				"validation_code");
		 
		String validationCode = (obj != null) ? obj.toString() : "";

		if (!validationCode.equalsIgnoreCase(user.getValidationCode()))
		{
			if (user.getValidationCode() != null)
			{				
				this.addFieldError("validationCode", "验证码输入错误!");
			}
		}
		clearFieldErrors();
	}

	public String execute() throws Exception
	{
		try
		{
			UserService userService = serviceManager.getUserService();
			System.out.println("1-----------------------------");
			if(userService.verifyUser(user))
			{
				System.out.println("2-----------------------------");
				saveCookie("user", user.getUser(), 24 * 60 * 60);
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUser());
				session.setMaxInactiveInterval(60 * 60 * 3);
				System.out.println("3-----------------------------");
 			    return SUCCESS;
			}
		}
		catch (Exception e)
		{
			System.out.println("e-----------------------------");
		}
		return ERROR;
	}
}