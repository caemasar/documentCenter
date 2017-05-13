package idv.caemasar.documentCenter.dao;

import java.util.List;

import idv.caemasar.documentCenter.entity.User;

public interface UserDAO
{
    public void save(User user);
    public boolean exists(User user);
	public String getPasswordMD5(User user);
	public int getUserID(User user);
	public int getUserDeptID(int uID);
	public List<User> getMemberByDeptID(int dept_id);
	public String getUsernameByID(int uID);
}
