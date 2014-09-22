package com.cm.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface AccountDao<T> {
	/**
	 * <b>function:</b> ���Account������Ϣ
	 * @param entity Account
	 * @return boolean �Ƿ�ɹ�
	 * @throws DataAccessException
	 */
	public boolean addAccount(T entity) throws DataAccessException;
	
	/**
	 * <b>function:</b> ����id�Ե�Account��Ϣ
	 * @param id ���id
	 * @return Account
	 * @throws DataAccessException
	 */
	public T getAccount(Integer id) throws DataAccessException;
	
	/**
	 * <b>function:</b> ��ѯ����Account��Ϣ
	 * @param id ���id
	 * @return Account
	 * @throws DataAccessException
	 */
	public List<T> getList() throws DataAccessException;

}
