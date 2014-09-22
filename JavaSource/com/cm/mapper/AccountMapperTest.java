package com.cm.mapper;

import java.util.List;

import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.cm.entity.Account;

public class AccountMapperTest extends AbstractJUnit38SpringContextTests{
	private AccountMapper mapper;
	
	public void testGetAccount() {
		System.out.println(mapper.getAccount());
	}
	
	public void testGetAccountById() {
		System.out.println(mapper.getAccountById("28"));
	}
	
	public void testGetAccountByName() {
		System.out.println(mapper.getAccountByName("user"));
	}
	
	public void testGetAccountByNames() {
		System.out.println(mapper.getAccountByNames("user"));
	}
	
	public void testAdd() {
		Account account = new Account();
		account.setEmail("temp@155.com");
		account.setPassword("abc");
		account.setRoleId(1);
		account.setSalt("ss");
		account.setStatus(0);
		account.setUsername("Jack");
		mapper.addAccount(account);
	}
	
	public void testEditAccount() {
		Account acc = mapper.getAccountByNames("Jack");
		System.out.println(acc);
		acc.setUsername("Zhangsan");
		acc.setPassword("123123");
		mapper.editAccount(acc);
		System.out.println(mapper.getAccountById(acc.getAccountId() + ""));
	}
	
	public void testRemoveAccount() {
		Account acc = mapper.getAccountByNames("Jack");
		mapper.removeAccount(acc.getAccountId());
		System.out.println(mapper.getAccountByNames("Jack"));
	}
	
	public void testAccountList() {
		List<Account> acc = mapper.getAllAccount();
		System.out.println(acc.size());
		System.out.println(acc);
	}

}
