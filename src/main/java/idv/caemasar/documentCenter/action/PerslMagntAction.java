package idv.caemasar.documentCenter.action;

public class PerslMagntAction extends BaseAction{
	@SuppressWarnings("unused")
	public String execute() throws Exception {
		try {
			if (true) {//判断有没有权限
				return SUCCESS;
			} else {
				//this.addFieldError("password", "账户或密码输入错误!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ERROR;
	}

}
