package idv.caemasar.documentCenter.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.UserDAO;
import idv.caemasar.documentCenter.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO
{	

	public void save(User user)
	{
		this.getHibernateTemplate().save(user);		
	}
	
	public String getPasswordMD5(User user)
	{
		String hql = "select passwordMD5 from User where user = ?";

		@SuppressWarnings("unchecked")
		java.util.List<String> passwordMD5 = (List<String>) this.getHibernateTemplate().find(hql, user.getUser());
		
		if(passwordMD5.size() > 0)
			return passwordMD5.get(0);
		return null;
	}

	public boolean exists(User user)
	{		
		return (getPasswordMD5(user) != null)?true:false;
	}



}
