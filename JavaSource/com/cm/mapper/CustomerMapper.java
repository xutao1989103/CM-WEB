package com.cm.mapper;

import java.util.List;
import java.util.Map;

import com.cm.entity.Customer;

public interface CustomerMapper extends BaseSqlMapper<Customer>{
	public List<Customer> getListByNameAndPassword(Map map);

}
