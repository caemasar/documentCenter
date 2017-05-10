package idv.caemasar.documentCenter.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.FileDAO;
import idv.caemasar.documentCenter.entity.File;
import idv.caemasar.documentCenter.utils.UserInfo;

public class FileDAOImpl extends HibernateDaoSupport implements FileDAO
{


	public void deleteFiles(UserInfo userInfo, String path)
	{
		this.getHibernateTemplate().bulkUpdate("delete from File where file_userid = ? and file_path like ?",
				new Object[]
				{ Integer.parseInt(userInfo.getUid()), Integer.parseInt(path) });
	}

	public void delete(UserInfo userInfo, String file)
	{
		this.getHibernateTemplate().bulkUpdate("delete from File where file_userid = ? and concat(file_path, file_filename) = ?",
				new Object[]
				{ userInfo.getUid(), file });
	}

	public void save(File file)
	{
		
		
		this.getHibernateTemplate().save(file);

	}

	@SuppressWarnings("unchecked")
	public List<File> getFiles(String u_id, String path_id)
	{
		return (List<File>) this.getHibernateTemplate()
				.findByNamedParam(
						"from File where file_userid = :file_userid and file_path = :file_path order by file_uploadtime",
						new String[]
						{ "file_userid", "file_path" }, new Object[]
						{ Integer.parseInt(u_id), Integer.parseInt(path_id) });

	}

	public long getUserDiskSize(String u_id)
	{
	
		@SuppressWarnings("unchecked")
		List<Long> fileSize = (List<Long>) this.getHibernateTemplate().find("select sum(file_size) from File where file_userid = ?", u_id);
		if(fileSize.size() > 0)
			return fileSize.get(0);
		return 0;
	}
}
