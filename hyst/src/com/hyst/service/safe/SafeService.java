package com.hyst.service.safe;

import java.util.List;

import com.hyst.vo.UserGroup;

/**
 * @author DongYi
 * @version 创建时间：2016年4月22日 上午10:34:59
 * 类说明
 */
public interface SafeService {
	/**
	 * 分页 查询所有用户组
	 * @param pageNo 当前页数
	 * @param pageSize 每页记录数
	 * @return 用户组列表
	 */
	public List<UserGroup> getUserGroups(int pageNo,int pageSize);
}
