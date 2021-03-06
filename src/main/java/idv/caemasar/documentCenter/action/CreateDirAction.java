package idv.caemasar.documentCenter.action;

import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.utils.UserInfo;

public class CreateDirAction extends BaseAction implements
		ModelDriven<UserInfo>
{
	public UserInfo getModel()
	{
		return userInfo;
	}
	public String execute() throws Exception
	{
		try
		{
			DirectoryService directoryService = serviceManager
					.getDirectoryService();
			userInfo.setUid(getCookieValue("u_id"));
			setResult(directoryService.addDirectory(userInfo));
			return SUCCESS;
		}
		catch (Exception e)
		{
			setResult("建立目录失败");
		}
		return ERROR;
	}

}