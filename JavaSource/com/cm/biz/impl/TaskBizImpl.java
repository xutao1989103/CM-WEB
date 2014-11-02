package com.cm.biz.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;

import com.cm.biz.TaskBiz;
import com.cm.dao.TaskDao;
import com.cm.entity.Task;
import com.cm.exception.BizException;

public class TaskBizImpl<T extends Task> implements TaskBiz<T> {
	@Inject
	private TaskDao<T> dao;
	
	public boolean addTask(T entity) throws DataAccessException {
		if (entity == null) {
			throw new BizException(Task.class.getName() + "对象参数信息为Empty！");
		}
		return dao.addTask(entity);
	}

	public T getTask(Integer id) throws DataAccessException {
		return dao.getTask(id);
	}

	public boolean deleteTask(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return dao.deleteTask(id);
	}
}
