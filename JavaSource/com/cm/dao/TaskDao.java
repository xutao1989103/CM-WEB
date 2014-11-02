package com.cm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface TaskDao<T> {
	/**
	 * <b>function:</b> 添加Task对象信息
	 * @param entity Task
	 * @return boolean 是否成功
	 * @throws DataAccessException
	 */
	public boolean addTask(T entity) throws DataAccessException;
	
	/**
	 * <b>function:</b> 根据id对到Task信息
	 * @param id 编号id
	 * @return Task
	 * @throws DataAccessException
	 */
	public T getTask(Integer id) throws DataAccessException;
	
	/**
	 * <b>function:</b> 根据id删除Task信息
	 * @param id 编号id
	 * @return boolean
	 * @throws DataAccessException
	 */
	public boolean deleteTask(Integer id) throws DataAccessException;
	
	

}
