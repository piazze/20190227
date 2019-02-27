package com.hxzy.dao;

import java.util.List;

/**
 * 通用的增、删、改、查
 * @author Administrator
 *
 * @param <T>
 */
public interface CommonDao<T> {
	/**
	 * 通用的新增
	 * @param t
	 * @return
	 */
	int add(T t);
	
	/**
	 * 通用的修改
	 * @param t
	 * @return
	 */
	int update(T t);
	
	/**
	 * 通用的根据id删除
	 * @param id
	 * @return
	 */
	int delete(Object id);
	
	/**
	 * 通用的根据主键查询数据
	 * @param id
	 * @return
	 */
	T queryOne(Object id);
	
	/**
	 * 查询所有数据，一定注意，在实际生产环境中此处实现方式为分页查询
	 * @return
	 */
	List<T> queryAll();
}
