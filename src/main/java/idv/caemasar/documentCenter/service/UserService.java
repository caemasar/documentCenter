package idv.caemasar.documentCenter.service;

import java.util.List;

import idv.caemasar.documentCenter.entity.User;
public interface UserService
{
    public void addUser(User user) throws Exception;   
	public boolean verifyUser(User user);
	public int getUserID(User user);
	public int getUserDeptID(int uID);
	public List<User> getMemberByDeptID(int dept_id);
}
