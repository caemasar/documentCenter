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
		this.getHibernateTemplate().bulkUpdate("delete from Directory where dir_userid = ? and dir_path = ?",new Object[]{Integer.parseInt(userInfo.getUid()), path});
		this.getHibernateTemplate().bulkUpdate("delete from Directory where dir_userid = ? and dir_parent_path like ?", new Object[]{Integer.parseInt(userInfo.getUid()), path + "%"});
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

	@Override
	public int getDirID(String u_id, String path) {
		String hql = "select dir_id from Directory where dir_userid = ? and dir_path = ?";

		@SuppressWarnings("unchecked")
		java.util.List<Integer> dir_id = (List<Integer>) this.getHibernateTemplate().find(hql, Integer.parseInt(u_id),path);
		if (dir_id.size() > 0)
			return dir_id.get(0);
		return -1;
	}

	@Override
	public String getDirPath(String dir_id) {
		String hql = "select dir_path from Directory where dir_id = ?";

		@SuppressWarnings("unchecked")
		java.util.List<String> dir_path = (List<String>) this.getHibernateTemplate().find(hql, Integer.parseInt(dir_id));
		if (dir_path.size() > 0)
			return dir_path.get(0);
		return "///";
	}

}
