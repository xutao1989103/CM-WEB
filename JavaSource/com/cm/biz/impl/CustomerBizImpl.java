package com.cm.biz.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;

import com.cm.biz.CustomerBiz;
import com.cm.dao.CustomerDao;
import com.cm.entity.Customer;

public class CustomerBizImpl<T extends Customer> implements CustomerBiz<T> {
	@Inject
	private CustomerDao dao;
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException {
		// TODO Auto-generated method stub
		return dao.getListByNameAndPassword(map);
	}

}
