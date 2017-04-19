package idv.caemasar.documentCenter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.caemasar.documentCenter.dao.UserInfoDao;
import idv.caemasar.documentCenter.entity.UserInfo;
import idv.caemasar.documentCenter.service.UserInfoService;

/**
 * 创建时间: 2017年4月16日 下午10:50:23
 * 描述: UserInfoServiceImpl.java UserInfoService的实现类
 * 
 * @author Caemasar
 * @version 1.0
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public UserInfo load(Integer id) {
		return null;
	}

	@Override
	public UserInfo get(Integer id) {
		return userInfoDao.get(id);
	}

	@Override
	public List<UserInfo> findAll() {
		return userInfoDao.findAll();
	}

	@Override
	public void persist(UserInfo entity) {
		userInfoDao.persist(entity);
	}

	@Override
	public Integer save(UserInfo entity) {
		return userInfoDao.save(entity);
	}

	@Override
	public void saveOrUpdate(UserInfo entity) {
		userInfoDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		userInfoDao.delete(id);
	}

	@Override
	public void flush() {
		userInfoDao.flush();
	}

}