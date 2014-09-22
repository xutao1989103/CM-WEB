package com.cm.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.cm.dao.BaseMapperDao;
import com.cm.mapper.BaseSqlMapper;

@SuppressWarnings("unchecked")
@Repository
public class BaseMapperDaoImpl<T> extends SqlSessionTemplate implements BaseMapperDao<T> {
	@Inject
	public BaseMapperDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}
	
	private Class<? extends BaseSqlMapper> mapperClass;
	
	public void setMapperClass(Class<? extends BaseSqlMapper> mapperClass) {
		this.mapperClass = mapperClass;
	}

	private BaseSqlMapper<T> getMapper() {
		return this.getMapper(mapperClass);
	}
	
	public boolean add(T entity) throws Exception {
		boolean flag = false;
		try {
			this.getMapper().add(entity);
			flag = true;
		} catch (Exception e) {
			flag = false;
			throw e;
		}
		return flag;
	}

	public boolean edit(T entity) throws Exception {
		boolean flag = false;
		try {
			this.getMapper().edit(entity);
			flag = true;
		} catch (Exception e) {
			flag = false;
			throw e;
		}
		return flag;
	}

	public T get(T entity) throws Exception {
		return this.getMapper().get(entity);
	}

	public List<T> getAll() throws Exception {
		return this.getMapper().getList(null);
	}

	public boolean remove(T entity) throws Exception {
		boolean flag = false;
		try {
			this.getMapper().remvoe(entity);
			flag = true;
		} catch (Exception e) {
			flag = false;
			throw e;
		}
		return flag;
	}

}
