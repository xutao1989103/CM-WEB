package com.cm.biz;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface AccountBiz<T> {
	/**
	 * <b>function:</b> 添加Account对象信息
	 * @param entity Account
	 * @return boolean 是否成功
	 * @throws DataAccessException
	 */
	public boolean addAccount(T entity) throws DataAccessException;
	
	/**
	 * <b>function:</b> 根据id对到Account信息
	 * @param id 编号id
	 * @return Account
	 * @throws DataAccessException
	 */
	public T getAccount(Integer id) throws DataAccessException;
	
	/**
	 * function 根据id删除Account
	 * @param id
	 * @return boolean 
	 * @throws DataAccessException
	 * 
	 */
    public boolean deleteAccount(Integer id)throws DataAccessException;
	
	/**
	 * <b>function:</b> 查询所有Account信息
	 * @param id 编号id
	 * @return Account
	 * @throws DataAccessException
	 */
	public List<T> getList() throws DataAccessException;
	
	/**
	 * <b>function:</b> 根据uername和password查询所有Account信息
	 * @param id 编号id
	 * @return List
	 * @throws DataAccessException
	 */
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException;

}
