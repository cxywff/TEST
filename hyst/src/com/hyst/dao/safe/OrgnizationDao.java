package com.hyst.dao.safe;

import java.util.List;
import java.util.Map;

import com.hyst.dao.BaseDao;
import com.hyst.vo.Orgnization;

/**
 * @author DongYi
 * @version 创建时间：2016年4月25日 下午2:16:00
 * 类说明
 */
public interface OrgnizationDao extends BaseDao<Orgnization>{
	/**
	 * 根据父ID查询部门列表
	 * @param map 父ID
	 * @return
	 */
	public List<Orgnization> listByParentId(Map map);
}
