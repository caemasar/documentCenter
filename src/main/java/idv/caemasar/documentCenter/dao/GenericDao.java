package idv.caemasar.documentCenter.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 创建时间: 2017年4月16日 下午10:44:49
 * 描述: GenericDao.java
 * 
 * @author Caemasar
 * @version 1.0
 * @param <T>
 * @param <PK>
 */
interface GenericDao<T, PK extends Serializable> {

	T load(PK id);

	T get(PK id);

	List<T> findAll();

	void persist(T entity);

	PK save(T entity);

	void saveOrUpdate(T entity);

	void delete(PK id);

	void flush();
}