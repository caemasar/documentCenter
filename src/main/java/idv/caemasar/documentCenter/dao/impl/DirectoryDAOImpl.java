package idv.caemasar.documentCenter.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.DirectoryDAO;
import idv.caemasar.documentCenter.entity.DirInfo;
import idv.caemasar.documentCenter.entity.Directory;
import idv.caemasar.documentCenter.utils.UserInfo;

public class DirectoryDAOImpl extends HibernateDaoSupport implements DirectoryDAO
{

	public void delete(UserInfo userInfo, String path)
	{			
		this.getHibernateTemplate().bulkUpdate("delete from Directory where user = ? and path = ?",new Object[]{userInfo.getCookieUser(), path});
		this.getHibernateTemplate().bulkUpdate("delete from Directory where user=? and parentPath like ?", new Object[]{userInfo.getCookieUser(), path + "%"});
	}

	public void save(Directory directory)
	{
		this.getHibernateTemplate().save(directory);

	}

	public List<DirInfo> getDirInfo(String u_id, String parent_path)
	{

		@SuppressWarnings("unchecked")
		List<DirInfo> directories = (List<DirInfo>) this.getHibernateTemplate().findByNamedQueryAndNamedParam("myDirInfo",new String[]{"u_id", "parent_path"}, new Object[] {
				u_id, parent_path });

		return directories;
	}

}
