package com.cm.dao;

import java.util.List;

public interface BaseDao<T> {
	public boolean add(String classMethod, T entity) throws Exception;

	public boolean edit(String classMethod, T entity) throws Exception;

	public T get(String classMethod, T entity) throws Exception;

	public List<T> getAll(String classMethod) throws Exception;

	public boolean remove(String classMethod, T entity) throws Exception;
}
