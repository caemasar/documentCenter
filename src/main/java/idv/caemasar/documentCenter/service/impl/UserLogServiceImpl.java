package idv.caemasar.documentCenter.service.impl;

import idv.caemasar.documentCenter.dao.UserLogDAO;
import idv.caemasar.documentCenter.service.UserLogService;

public class UserLogServiceImpl implements UserLogService {
	private UserLogDAO userLogDAO;

	public UserLogServiceImpl(UserLogDAO userLogDAO) {
		this.userLogDAO = userLogDAO;
	}

	@Override
	public void recordUser(int u_id, String addr) {
		userLogDAO.recordUser(u_id, addr);
	}

}
