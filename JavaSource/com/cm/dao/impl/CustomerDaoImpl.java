package com.cm.dao.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;

import com.cm.dao.CustomerDao;
import com.cm.entity.Customer;
import com.cm.mapper.CustomerMapper;

public class CustomerDaoImpl<T extends Customer > implements CustomerDao<T>{
	@Inject
	private CustomerMapper mapper;

	public List<T> getListByNameAndPassword(Map map) throws DataAccessException {
		// TODO Auto-generated method stub
		return (List<T>) mapper.getListByNameAndPassword(map);
	}

}
