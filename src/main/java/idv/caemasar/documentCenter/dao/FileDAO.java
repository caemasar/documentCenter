package idv.caemasar.documentCenter.dao;

import java.util.List;

import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.utils.UserInfo;

public interface FileDAO
{
    public void save(File file);
	public void deleteFiles(UserInfo userInfo, String path);
	public void delete(UserInfo userInfo, String file);
	public long getUserDiskSize(String username);
	public List<File> getFiles(String username, String path);
	
} 
