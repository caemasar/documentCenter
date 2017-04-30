package idv.caemasar.documentCenter.service;

import java.util.List;

import idv.caemasar.documentCenter.entity.DirInfo;
import idv.caemasar.documentCenter.utils.UserInfo;
public interface DirectoryService
{
    public String addDirectory(UserInfo userInfo) throws Exception;   
	public void deleteDirectory(UserInfo userInfo, String path);
	public List<DirInfo> getDirInfo(String user, String parentPath);
}
