package com.cm.biz;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface CustomerBiz<T> {
	/**
	 * <b>function:</b> ����name��pass��ѯ����Customer��Ϣ
	 * @param id ���id
	 * @return List
	 * @throws DataAccessException
	 */
	public List<T> getListByNameAndPassword(Map map) throws DataAccessException;
}
