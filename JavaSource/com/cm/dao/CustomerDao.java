package com.cm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface CustomerDao<T> {
	/**
	 * <b>function:</b> ����name��pass��ѯ����customer��Ϣ
	 * @param id ���id
	 * @return List<Account>
	 * @throws DataAccessException
	 */
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException;

}
