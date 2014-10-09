package com.cm.biz;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface CustomerBiz<T> {
	/**
	 * <b>function:</b> 根据name和pass查询所有Customer信息
	 * @param id 编号id
	 * @return List
	 * @throws DataAccessException
	 */
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException;
}
