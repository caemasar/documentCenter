package idv.caemasar.documentCenter.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import idv.caemasar.documentCenter.dao.DirectoryDAO;
import idv.caemasar.documentCenter.dao.FileDAO;
import idv.caemasar.documentCenter.entity.DirInfo;
import idv.caemasar.documentCenter.entity.Directory;
import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.utils.UserInfo;

public class DirectoryServiceImpl implements DirectoryService
{
	private DirectoryDAO directoryDAO;
	private FileDAO fileDAO;

	public DirectoryServiceImpl(DirectoryDAO directoryDAO, FileDAO fileDAO)
	{
		this.directoryDAO = directoryDAO;
		this.fileDAO = fileDAO;
	}

	public String addDirectory(UserInfo userInfo) throws Exception
	{

		String currentPath = userInfo.getUserRoot() + userInfo.getParentPath()
				+ userInfo.getDir() + File.separator;
		currentPath = File.separator.equals("\\") ? currentPath.replaceAll("/",
				"\\\\") : currentPath;

		Directory directory = new Directory();
		directory.setUser(userInfo.getCookieUser());
		directory.setDir(userInfo.getDir());
		directory.setParentPath(userInfo.getParentPath());
		directory.setPath(userInfo.getParentPath() + userInfo.getDir() + "/");
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		userInfo.setTime(dateFormat.format(date));
 
		directory.setCreateTime(date);
		directoryDAO.save(directory);
		File dir = new File(currentPath);
		if (!dir.exists())
		{
			dir.mkdirs();
		}
		return "成功建立目录";

	}


	public List<DirInfo> getDirInfo(String user, String parentPath)
	{		
		return directoryDAO.getDirInfo(user, parentPath);
	}
	public void deleteDirectory(UserInfo userInfo, String path)
	{
		directoryDAO.delete(userInfo, path);
		fileDAO.deleteFiles(userInfo, path);	
		idv.caemasar.documentCenter.utils.MyFile.deleteAny(userInfo.getAbsolutePath(path));
	}
}