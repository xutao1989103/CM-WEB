package com.cm.dao.impl;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;

import com.cm.dao.TaskDao;
import com.cm.entity.Task;
import com.cm.mapper.TaskMapper;

public class TaskDaoImpl<T extends Task> implements TaskDao<T> {
	@Inject
	private TaskMapper mapper;

	public boolean addTask(T entity) throws DataAccessException {
		boolean flag = false;
		try {
			mapper.addTask(entity);
			flag = true;
		} catch (DataAccessException e) {
			flag = false;
			throw e;
		}
		return flag;
	}

	public T getTask(Integer id) throws DataAccessException {
		T entity = null;
		try {
			entity = (T) mapper.getTaskById(id);
		} catch (DataAccessException e) {
			throw e;
		}
		return entity;
	}

	public boolean deleteTask(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		boolean flag=false;
		try{
			mapper.removeTask(id);
			flag=true;
		}catch(DataAccessException e){
			flag=false;
			throw e;
		}
		return flag;
	}
}
