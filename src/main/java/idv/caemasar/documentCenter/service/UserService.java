package idv.caemasar.documentCenter.service;

import idv.caemasar.documentCenter.entity.User;
public interface UserService
{
    public void addUser(User user) throws Exception;   
	public boolean verifyUser(User user);
}
