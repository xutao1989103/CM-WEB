package com.cm.dao.impl;

import javax.inject.Inject;

import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.cm.dao.BaseMapperDao;
import com.cm.entity.Account;
import com.cm.mapper.AccountMapper;

public class BaseMapperDaoImplTest extends AbstractJUnit38SpringContextTests{
	@Inject
	private BaseMapperDao<Account> dao;
	
	public void init() {
		dao.setMapperClass(AccountMapper.class);
	}
	
	public void testGet() throws Exception {
		init();
		Account a = new Account();
		a.setAccountId(4);
		System.out.println(dao.get(a));
	}
	
	public void testAdd() throws Exception {
		init();
		Account a = new Account();
		a.setUsername("ºú½õÌÎ");
		a.setPassword("beijin");
		System.out.println(dao.add(a));
	}

}
