package com.cm.entity;

import java.io.Serializable;
import java.sql.Date;

public class Task implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private Integer taskId;
	private String taskName;
	private String content;
	private Date createTime;
	private Integer createId;
	private Integer acceptId;
	private Integer status;
	private Integer isDeleted;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getCreateId() {
		return createId;
	}
	public void setCreateId(Integer createId) {
		this.createId = createId;
	}
	public Integer getAcceptId() {
		return acceptId;
	}
	public void setAcceptId(Integer acceptId) {
		this.acceptId = acceptId;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
