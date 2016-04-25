package com.hyst.service.safe.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyst.dao.safe.UserDeptViewDao;
import com.hyst.service.safe.UserDeptViewService;
import com.hyst.vo.UserDeptView;

/**
 * @author DongYi
 * @version 创建时间：2016年4月21日 上午9:59:18
 * 类说明
 */
@Service("userDeptViewService")
public class UserDeptViewServiceImpl implements UserDeptViewService {
	@Autowired
	private UserDeptViewDao userDeptViewDao;
	/**
	 * @param userDeptViewDao the userDeptViewDao to set
	 */
	public void setUserDeptViewDao(UserDeptViewDao userDeptViewDao) {
		this.userDeptViewDao = userDeptViewDao;
	}
	
	public List<UserDeptView> getList() {
		Map< String, Integer> map=new HashMap<String, Integer>();
		map.put("id", 1);
		return userDeptViewDao.list(map);
	}

}
