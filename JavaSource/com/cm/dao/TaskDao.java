package com.cm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface TaskDao<T> {
	/**
	 * <b>function:</b> ���Task������Ϣ
	 * @param entity Task
	 * @return boolean �Ƿ�ɹ�
	 * @throws DataAccessException
	 */
	public boolean addTask(T entity) throws DataAccessException;
	
	/**
	 * <b>function:</b> ����id�Ե�Task��Ϣ
	 * @param id ���id
	 * @return Task
	 * @throws DataAccessException
	 */
	public T getTask(Integer id) throws DataAccessException;
	
	/**
	 * <b>function:</b> ����idɾ��Task��Ϣ
	 * @param id ���id
	 * @return boolean
	 * @throws DataAccessException
	 */
	public boolean deleteTask(Integer id) throws DataAccessException;
	
	

}
