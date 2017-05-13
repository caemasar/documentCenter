package idv.caemasar.documentCenter.service.impl;

import java.util.List;

import idv.caemasar.documentCenter.dao.UserDAO;
import idv.caemasar.documentCenter.entity.User;
import idv.caemasar.documentCenter.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean verifyUser(User user) {

		String passwordMD5 = userDAO.getPasswordMD5(user);
		boolean result = false;
		try {
			result = (user.getPasswordMD5().equals(passwordMD5)) ? true : false;
		} catch (Exception e) {

		}
		return result;
	}

	public void addUser(User user) throws Exception {
		if (userDAO.exists(user)) {
			throw new Exception("<" + user + ">已经存在！");
		} else {
			userDAO.save(user);
		}

	}

	@Override
	public int getUserID(User user) {
		return userDAO.getUserID(user);
	}

	@Override
	public int getUserDeptID(int uID) {
		return userDAO.getUserDeptID(uID);
	}

	@Override
	public List<User> getMemberByDeptID(int dept_id) {
		return userDAO.getMemberByDeptID(dept_id);
	}

	@Override
	public String getUsernameByID(int uID) {
		return userDAO.getUsernameByID(uID);
	}
}
