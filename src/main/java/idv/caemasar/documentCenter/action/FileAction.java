package idv.caemasar.documentCenter.action;

import java.util.List;

import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.service.FileService;

public class FileAction extends BaseAction 
{
    private List<File> files;
    private String path;
    
	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public List<File> getFiles()
	{
		return files;
	}

	public void setFiles(List<File> files)
	{
		this.files = files;
	}

	public String execute() throws Exception
	{
		try
		{
			FileService fileService = serviceManager.getFileService();
		    files = fileService.getFiles(userInfo.getCookieUser(), path);
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}