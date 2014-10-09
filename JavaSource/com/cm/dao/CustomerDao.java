package com.cm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface CustomerDao<T> {
	/**
	 * <b>function:</b> 根据name和pass查询所有customer信息
	 * @param id 编号id
	 * @return List<Account>
	 * @throws DataAccessException
	 */
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException;

}
