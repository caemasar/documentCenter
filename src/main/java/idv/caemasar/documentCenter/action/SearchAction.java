package idv.caemasar.documentCenter.action;

import java.util.List;

import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.service.FileService;

public class SearchAction extends BaseAction {
	private List<File> files;
	private String kwyWord;

	public String getKwyWord() {
		return kwyWord;
	}

	public void setKwyWord(String kwyWord) {
		this.kwyWord = kwyWord;
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
			files = fileService.searchFiles(Integer.parseInt(getCookieValue("u_id")), kwyWord);
			String pathname;
			for (File file : files) {
				pathname= directoryService.getDirPath(String.valueOf(file.getFile_path()));
				file.setFlie_pathname(pathname);
			}
			return SUCCESS;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}
