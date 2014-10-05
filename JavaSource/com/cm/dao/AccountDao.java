package com.cm.dao;

import java.util.List;
import java.util.Map;

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
	 * <b>function:</b> ����idɾ��Account��Ϣ
	 * @param id ���id
	 * @return boolean
	 * @throws DataAccessException
	 */
	public boolean deleteAccount(Integer id) throws DataAccessException;
	
	/**
	 * <b>function:</b> ��ѯ����Account��Ϣ
	 * @param id ���id
	 * @return Account
	 * @throws DataAccessException
	 */
	public List<T> getList() throws DataAccessException;
	
	/**
	 * <b>function:</b> ����username��password��ѯ����Account��Ϣ
	 * @param id ���id
	 * @return List<Account>
	 * @throws DataAccessException
	 */
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException;

}
