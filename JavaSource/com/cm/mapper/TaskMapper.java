package com.cm.mapper;

import java.util.List;
import java.util.Map;

import com.cm.entity.Task;

public interface TaskMapper extends BaseSqlMapper<Task>{
	
	public Task getTaskById(Integer id);
	
	public void addTask(Task task);
	
	public void editTask(Task task);
	
	public void removeTask(int id);
	
}
