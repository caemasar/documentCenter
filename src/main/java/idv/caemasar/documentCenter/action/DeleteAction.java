package idv.caemasar.documentCenter.action;

import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.service.FileService;
public class DeleteAction extends BaseAction
{
    private String[] paths;

	public void setPaths(String paths)
	{
		this.paths = paths.split(";");
	}

	public String execute() throws Exception
	{
		try
		{
			DirectoryService directoryService = serviceManager.getDirectoryService();
			FileService fileService = serviceManager.getFileService();
			for (String path : paths)
			{
				if (path != null)
				{
					// 删除目录
					if (path.charAt(path.length() - 1) == '/')
					{												
						directoryService.deleteDirectory(userInfo, path);
					}
					//  删除文件
					else
					{
						fileService.deleteFile(userInfo, path);
					}					
				}
			}		
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}