package com.hyst.service.safe;

import com.hyst.dao.safe.UserDeptViewDao;
import com.hyst.vo.UserDeptView;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author DongYi
 * @version 创建时间：2016年4月21日 上午9:57:25
 * 类说明
 */
public interface UserDeptViewService {
	public List<UserDeptView> getList();
}
