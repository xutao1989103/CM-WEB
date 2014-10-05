package com.cm.mapper;

import java.util.List;
import java.util.Map;

import com.cm.entity.Account;

public interface AccountMapper extends BaseSqlMapper<Account>{
	public List<Account> getAllAccount();
	
	public Account getAccount();
	
	public Account getAccountById(String id);
	
	public Account getAccountByNames(String spring);
	
	//Select("select * from account where username = #{name}")
	public Account getAccountByName(String name);
	
	public void addAccount(Account account);
	
	public void editAccount(Account account);
	
	public void removeAccount(int id);
	
	public List<Account> getListByNameAndPassword(Map map);

}
