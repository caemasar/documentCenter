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
		this.getHibernateTemplate().bulkUpdate("delete from File where user=? and path like ?",
				new Object[]
				{ userInfo.getCookieUser(), path });
	}

	public void delete(UserInfo userInfo, String file)
	{
		this.getHibernateTemplate().bulkUpdate("delete from File where user = ? and concat(path, file) = ?",
				new Object[]
				{ userInfo.getCookieUser(), file });
	}

	public void save(File file)
	{
		this.getHibernateTemplate().save(file);

	}

	public List<File> getFiles(String username, String path)
	{
		return (List<File>) this.getHibernateTemplate()
				.findByNamedParam(
						"from File where user = :user and path = :path order by uploadTime",
						new String[]
						{ "user", "path" }, new Object[]
						{ username, path });

	}

	public long getUserDiskSize(String username)
	{
	
		List<Long> fileSize = (List<Long>) this.getHibernateTemplate().find("select sum(size) from File where user = ?", username);
		if(fileSize.size() > 0)
			return fileSize.get(0);
		return 0;
	}
}
