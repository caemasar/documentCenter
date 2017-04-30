package idv.caemasar.documentCenter.dao;

import java.util.List;

import idv.caemasar.documentCenter.entity.DirInfo;
import idv.caemasar.documentCenter.entity.Directory;
import idv.caemasar.documentCenter.utils.UserInfo;

public interface DirectoryDAO
{
    public void save(Directory directory);
	public void delete(UserInfo userInfo, String path);	
	public List<DirInfo> getDirInfo(String user, String parentPath);
}
