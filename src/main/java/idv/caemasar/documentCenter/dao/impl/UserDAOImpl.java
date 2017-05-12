package idv.caemasar.documentCenter.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.UserDAO;
import idv.caemasar.documentCenter.entity.DcTDepartments;
import idv.caemasar.documentCenter.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	public void save(User user) {
		try {
			user.setU_password(user.getPasswordMD5());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getHibernateTemplate().save(user);
	}

	public String getPasswordMD5(User user) {
		String hql = "select u_password from User where u_username = ?";

		@SuppressWarnings("unchecked")
		java.util.List<String> passwordMD5 = (List<String>) this.getHibernateTemplate().find(hql, user.getU_username());

		if (passwordMD5.size() > 0)
			return passwordMD5.get(0);
		return null;
	}

	public boolean exists(User user) {
		return (getPasswordMD5(user) != null) ? true : false;
	}

	@Override
	public int getUserID(User user) {
		String hql = "select u_id from User where u_username = ?";

		@SuppressWarnings("unchecked")
		java.util.List<Integer> u_ids = (List<Integer>) this.getHibernateTemplate().find(hql, user.getU_username());
		if (u_ids.size() > 0)
			return u_ids.get(0);
		return -1;
	}

	@Override
	public int getUserDeptID(int uID) {
		String hql = "select u_deptid from User where u_id = ?";

		@SuppressWarnings("unchecked")
		java.util.List<Integer> u_deptids = (List<Integer>) this.getHibernateTemplate().find(hql, uID);
		if (u_deptids.size() > 0)
			return u_deptids.get(0);
		return -1;
	}

	@Override
	public List<User> getMemberByDeptID(int dept_id) {
		@SuppressWarnings("unchecked")
		List<User> Users = (List<User>) this.getHibernateTemplate().findByNamedParam(
				"from User where u_deptid = :u_deptid", new String[] { "u_deptid" }, new Object[] { dept_id });
		if (Users.size() > 0) {
			return Users;
		}
		return null;
	}

}
