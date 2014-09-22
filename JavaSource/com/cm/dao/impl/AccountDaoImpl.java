package com.cm.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;

import com.cm.dao.AccountDao;
import com.cm.entity.Account;
import com.cm.mapper.AccountMapper;

public class AccountDaoImpl<T extends Account> implements AccountDao<T> {
	
	@Inject
	private AccountMapper mapper;


	public boolean addAccount(T entity) throws DataAccessException {
		boolean flag = false;
		try {
			mapper.addAccount(entity);
			flag = true;
		} catch (DataAccessException e) {
			flag = false;
			throw e;
		}
		return flag;
	}

	public T getAccount(Integer id) throws DataAccessException {
		T entity = null;
		try {
			entity = (T) mapper.getAccountById(String.valueOf(id));
		} catch (DataAccessException e) {
			throw e;
		}
		return entity;
	}

	public List<T> getList() throws DataAccessException {
		return (List<T>) mapper.getAllAccount();
	}

}
