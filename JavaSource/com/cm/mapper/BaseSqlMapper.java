package com.cm.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface BaseSqlMapper<T> extends SqlMapper {
	public void add(T entity) throws DataAccessException;
	
	public void edit(T entity) throws DataAccessException;
	
	public void remvoe(T entity) throws DataAccessException;
	
	public T get(T entity) throws DataAccessException;
	
	public List<T> getList(T entity) throws DataAccessException;

}
