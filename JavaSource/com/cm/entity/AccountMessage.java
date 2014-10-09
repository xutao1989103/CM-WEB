package com.cm.entity;

import java.io.Serializable;

import com.cm.entity.AccountMessage.CustomerJson;

public class AccountMessage<T> implements Serializable{
	private Integer code;
	
	private String message;
	
	private CustomerJson result;

	public CustomerJson getResult() {
		return result;
	}

	public void setResult(CustomerJson result) {
		this.result = result;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public class CustomerJson{
		private Customer customer;

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
	}


}

