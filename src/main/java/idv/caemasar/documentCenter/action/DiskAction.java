package idv.caemasar.documentCenter.action;

import idv.caemasar.documentCenter.service.FileService;
public class DiskAction extends BaseAction
{
	private long diskSize;
	public long getDiskSize()
	{
		return diskSize;
	}
	public String execute() throws Exception
	{
		try
		{
			FileService fileService = serviceManager.getFileService();
			diskSize = fileService.getUserDiskSize(getCookieValue("u_id"));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return SUCCESS;
	}
}