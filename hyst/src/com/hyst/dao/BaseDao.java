package com.hyst.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	/**
	 * 根据动态条件查询
	 * @param obj 条件对象
	 * @return 符合条件的对象集合
	 */
	public List byOrder(Object obj);
	/**
	 * 根据条件查询列表
	 * @param m 查询条件的map<条件名称,条件值>集合
	 * @return
	 */
	public List list(Map m);
	/**
	 * 查询单条信息
	 * @param id 唯一标示
	 * @return 信息记录
	 */
	public Object getOne(int id);
	/**
	 * 数据库单条插入
	 * @param obj 插入的的对象
	 * @return 受影响记录数
	 */
	public int insert(Object obj);
	/**
	 * 单条信息更新
	 * @param obj 更新对象
	 * @return 受影响记录数
	 */
	public int update(Object obj);
	/**
	 * 根据id删除记录
	 * @param id
	 * @return 受影响记录数
	 */
	public int delete(Integer  id);
}
