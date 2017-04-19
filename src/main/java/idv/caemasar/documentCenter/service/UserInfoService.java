package idv.caemasar.documentCenter.service;

import java.util.List;

import idv.caemasar.documentCenter.entity.UserInfo;

/**
 * 创建时间: 2017年4月16日 下午10:49:15
 * 描述: UserInfoService.java
 * 
 * @author Caemasar
 * @version 1.0
 */
public interface UserInfoService {
	UserInfo load(Integer id);

	UserInfo get(Integer id);

	List<UserInfo> findAll();

	void persist(UserInfo entity);

	Integer save(UserInfo entity);

	void saveOrUpdate(UserInfo entity);

	void delete(Integer id);

	void flush();
}