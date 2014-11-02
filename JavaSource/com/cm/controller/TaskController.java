package com.cm.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cm.biz.TaskBiz;
import com.cm.entity.ResultMessage;
import com.cm.entity.Task;

@Controller
@RequestMapping("/task")
public class TaskController {
	@Inject
	private TaskBiz<Task> biz; 
	
	@RequestMapping(value="/getTask/{taskId}", method=RequestMethod.GET)
	public @ResponseBody ResultMessage getTaskById(@PathVariable("taskId") Integer taskId) {
		ResultMessage resultMessage = new ResultMessage();
		Task task=biz.getTask(taskId);
		resultMessage.setCode(200);
		resultMessage.setMessage(task);
		return resultMessage;
	}
	
}
