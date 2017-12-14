package com.qingshixun.project.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

public interface BaseDao<T,PK extends Serializable> {

	public void setSessionFactory(SessionFactory sessionFactory);
	
	/**
	 * 保存
	 * @param entity
	 */
	public void save(final T entity);
	
	/**
	 * 保存或更改
	 * @param entity
	 */
	public void saveOrUpdate(final T entity);
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(final PK id);
	
	/**
	 * 更新
	 * @param entity
	 */
	public void update(final T entity);
	
	/**
	 * 根据id获取
	 * @param id
	 * @return
	 */
	public T get(final PK id);
	

	/**
	 * 获取所有列表
	 * @return
	 */
	public List<T> getAll();
	
}
