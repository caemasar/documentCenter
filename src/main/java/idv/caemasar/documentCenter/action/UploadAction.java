package idv.caemasar.documentCenter.action;

import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.service.FileService;
import idv.caemasar.documentCenter.utils.UploadFile;

public class UploadAction extends BaseAction implements ModelDriven<UploadFile>
{

    private UploadFile uploadFile = new UploadFile();
    
	public UploadFile getModel()
	{		
		return uploadFile;
	}

	public String execute() throws Exception
	{	
		try
		{
			userInfo.setUid(getCookieValue("u_id"));
			uploadFile.setUserInfo(userInfo);
			FileService fileService = serviceManager.getFileService();
			fileService.addFiles(uploadFile,serviceManager);
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}