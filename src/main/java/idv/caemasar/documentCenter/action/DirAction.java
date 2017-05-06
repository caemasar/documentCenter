package idv.caemasar.documentCenter.action;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.entity.DirInfo;
import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.utils.UserInfo;

public class DirAction extends BaseAction implements ModelDriven<UserInfo>
{
	private List<DirInfo> dirInfo;



	/**
	 * dirInfo属性的getter方法
	 */
	public List<DirInfo> getDirInfo()
	{
		return dirInfo;
	}

	/**
	 * dirInfo属性的setter方法
	 */
	public void setDirInfo(List<DirInfo> dirInfo)
	{
		this.dirInfo = dirInfo;
	}

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
			dirInfo = directoryService.getDirInfo(userInfo.getCookieUser(),
					userInfo.getParentPath());
			System.out.println(dirInfo);
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}