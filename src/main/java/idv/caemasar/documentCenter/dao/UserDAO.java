package idv.caemasar.documentCenter.dao;

import idv.caemasar.documentCenter.entity.User;

public interface UserDAO
{
    public void save(User user);
    public boolean exists(User user);
	public String getPasswordMD5(User user);
	public int getUserID(User user);
}
