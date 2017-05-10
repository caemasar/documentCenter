package idv.caemasar.documentCenter.action;

import java.util.List;

import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.service.FileService;

public class FileAction extends BaseAction {
	private List<File> files;
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public String execute() throws Exception {
		try {
			FileService fileService = serviceManager.getFileService();
			DirectoryService directoryService = serviceManager.getDirectoryService();
			int pathId = directoryService.getDirID(getCookieValue("u_id"), path);
			files = fileService.getFiles(getCookieValue("u_id"), String.valueOf(pathId));
			String pathname = directoryService.getDirPath(String.valueOf(pathId));
			for (File file : files) {
				file.setFlie_pathname(pathname);
			}
			return SUCCESS;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}