package idv.caemasar.documentCenter.service.impl;

import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.service.FileService;
import idv.caemasar.documentCenter.service.UserService;

public class ServiceManager
{
    private UserService userService;
    private DirectoryService directoryService;
    private FileService fileService;

	public FileService getFileService()
	{
		return fileService;
	}
	public void setFileService(FileService fileService)
	{
		this.fileService = fileService;
	}
	/**
	 * directoryService属性的getter方法
	 */
	public DirectoryService getDirectoryService()
	{
		return directoryService;
	}
	/**
	 * directoryService属性的setter方法
	 */
	public void setDirectoryService(DirectoryService directoryService)
	{
		this.directoryService = directoryService;
	}
	/**
	 * userService属性的getter方法
	 */
	public UserService getUserService()
	{
		return userService;
	}
	/**
	 * userService属性的setter方法
	 */
	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}
}
