package idv.caemasar.documentCenter.service;

import java.util.List;

import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.utils.UploadFile;
import idv.caemasar.documentCenter.utils.UserInfo;
public interface FileService
{
    public void addFiles(UploadFile uploadFile) throws Exception;   
	public void deleteFile(UserInfo userInfo, String file);
	public long getUserDiskSize(String username);
	public List<File> getFiles(String username, String path);
	
}
