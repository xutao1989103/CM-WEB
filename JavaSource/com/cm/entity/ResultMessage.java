package com.cm.entity;

import java.io.Serializable;

public class ResultMessage implements Serializable {
	public static final Integer SUCCESS=200;
	public static final Integer NOTSUCCESS=500;
	
	private Integer code;
	
	private Object message;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

}
