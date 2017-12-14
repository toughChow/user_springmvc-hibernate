package com.qingshixun.project.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qingshixun.project.dao.BaseDao;

@Repository
public class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

	protected Logger logger = LoggerFactory.getLogger(getClass());


	protected Class<T> entityClass;

	public BaseDaoImpl() {
		 this.entityClass = getSuperClassGenricType(getClass());

		// Type genType = getClass().getGenericSuperclass();
		// Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
		// entityClass = (Class<T>) params[0];
	}

	@Autowired
	protected SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// 获取当前session
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("rawtypes")
	private Class getSuperClassGenricType(final Class clazz) {
		Type genericSuperclass = clazz.getGenericSuperclass();
		if (!(genericSuperclass instanceof ParameterizedType)) {
			logger.warn(clazz.getSimpleName() + "`s superclass not paraterizedType");
			System.out.println(clazz.getSimpleName());
			return Object.class;
		}
		Type[] params = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
		return (Class) params[0];
	}

	@Override
	public void save(T entity) {
		getSession().save(entity);
	}

	@Override
	public void delete(PK id) {
		getSession().delete(id);
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public T get(PK id) {
		return (T) getSession().get(entityClass, id);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) getSession().createQuery("From" + entityClass);
	}

	@Override
	public void saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
	}
}
