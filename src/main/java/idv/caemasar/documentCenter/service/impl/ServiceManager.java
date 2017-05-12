package idv.caemasar.documentCenter.service.impl;

import idv.caemasar.documentCenter.service.DepartmentService;
import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.service.FileService;
import idv.caemasar.documentCenter.service.UserService;

public class ServiceManager {
	private UserService userService;
	private DirectoryService directoryService;
	private FileService fileService;
	private DepartmentService departmentService;

	public FileService getFileService() {
		return fileService;
	}

	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}

	public DirectoryService getDirectoryService() {
		return directoryService;
	}

	public void setDirectoryService(DirectoryService directoryService) {
		this.directoryService = directoryService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
}
