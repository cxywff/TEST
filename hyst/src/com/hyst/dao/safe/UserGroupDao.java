package com.hyst.dao.safe;

import org.springframework.stereotype.Repository;

import com.hyst.dao.BaseDao;
import com.hyst.vo.UserGroup;

/**
 * @author DongYi
 * @version 创建时间：2016年4月22日 上午10:30:00
 * 类说明:用户组Dao
 */
@Repository("userGroupDao")
public interface UserGroupDao extends BaseDao<UserGroup>{

}
