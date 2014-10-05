package com.cm.biz.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;

import com.cm.biz.AccountBiz;
import com.cm.dao.AccountDao;
import com.cm.entity.Account;
import com.cm.exception.BizException;

public class AccountBizImpl<T extends Account> implements AccountBiz<T>{

	@Inject
	private AccountDao<T> dao;
	
	public boolean addAccount(T entity) throws DataAccessException {
		if (entity == null) {
			throw new BizException(Account.class.getName() + "对象参数信息为Empty！");
		}
		return dao.addAccount(entity);
	}

	public T getAccount(Integer id) throws DataAccessException {
		return dao.getAccount(id);
	}

	public List<T> getList() throws DataAccessException {
		return dao.getList();
	}

	public boolean deleteAccount(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return dao.deleteAccount(id);
	}

	public List<T> getListByNameAndPassword(Map map) throws DataAccessException {
		// TODO Auto-generated method stub
		return dao.getListByNameAndPassword(map);
	}


}
