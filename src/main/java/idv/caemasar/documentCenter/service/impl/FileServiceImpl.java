package idv.caemasar.documentCenter.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import idv.caemasar.documentCenter.dao.FileDAO;
import idv.caemasar.documentCenter.service.DirectoryService;
import idv.caemasar.documentCenter.service.FileService;
import idv.caemasar.documentCenter.utils.UploadFile;
import idv.caemasar.documentCenter.utils.UserInfo;

public class FileServiceImpl implements FileService
{
	private FileDAO fileDAO;

	public FileServiceImpl(FileDAO fileDAO)
	{
		this.fileDAO = fileDAO;
	}

	private String saveFile(File uploadFile, String fn) throws Exception
	{
		File file = new File(fn);
		int index = 0;
		String filename = file.getName();
		while (file.exists())
		{
			int extIndex = filename.lastIndexOf(".");

			if (extIndex > 0)
				fn = filename.substring(0, extIndex) + "("
						+ String.valueOf(index) + ")"
						+ filename.substring(extIndex);
			else
				fn = filename + "(" + String.valueOf(index) + ")";
			fn = file.getPath().substring(0,
					file.getPath().lastIndexOf(file.getName()))
					+ fn;
			file = new File(fn);
			index++;
		}
		FileOutputStream fos = new FileOutputStream(fn);
		InputStream is = new java.io.FileInputStream(uploadFile);
		byte[] buffer = new byte[8192];
		int count = 0;
		while ((count = is.read(buffer)) > 0)
		{
			fos.write(buffer, 0, count);
		}
		fos.close();
		is.close();
		return file.getName();

	}
			
	
	public void addFiles(UploadFile uploadFile,ServiceManager manager) throws Exception
	{
		int i = 0;			
		for(File f: uploadFile.getUpload())
		{			
			String currentPath = uploadFile.getUserInfo().getUserRoot()
					+ (File.separator.equals("\\") ? uploadFile.getUploadPath().replaceAll("/",
							"\\\\") : uploadFile.getUploadPath());
			String fn = saveFile(f, currentPath + uploadFile.getUploadFileName().get(i));
			idv.caemasar.documentCenter.entity.File file = new idv.caemasar.documentCenter.entity.File();
			file.setFile_userid(Integer.parseInt(uploadFile.getUserInfo().getUid()));
			file.setFile_filename(new File(fn).getName());
			DirectoryService directoryService = manager
					.getDirectoryService();
			int path_id = directoryService.getDirID(uploadFile.getUserInfo().getUid(), uploadFile.getUploadPath());
			file.setFile_path(path_id);
			file.setFile_size(f.length());
			file.setFile_uploadtime(new java.util.Date());
			fileDAO.save(file);			
			i++;
		}

	}
 
	public void deleteFile(UserInfo userInfo, String file)
	{
		fileDAO.delete(userInfo, file);	
		idv.caemasar.documentCenter.utils.MyFile.deleteAny(userInfo.getAbsolutePath(file));
	}


	public List<idv.caemasar.documentCenter.entity.File> getFiles(String u_id, String path)
	{		
		return fileDAO.getFiles(u_id, path);
	}
 
	public long getUserDiskSize(String u_id)
	{		
		return fileDAO.getUserDiskSize(u_id);
	}

	@Override
	public List<idv.caemasar.documentCenter.entity.File> searchFiles(int uID, String kwyWord) {
		return fileDAO.searchFiles(uID, kwyWord);
	}
}
