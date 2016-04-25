package com.hyst.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyst.service.safe.SafeService;
import com.hyst.service.safe.TableInfoService;
import com.hyst.service.safe.UserDeptViewService;
import com.hyst.vo.TableInfo;
import com.hyst.vo.UserDeptView;
import com.hyst.vo.UserGroup;

/**
 * @author DongYi
 * @version 创建时间：2016年4月20日 下午1:43:09
 * 类说明
 */
@Controller
public class SafeAdminController {
	@Autowired
	private SafeService safeService;

	public void setSafeService(SafeService safeService) {
		this.safeService = safeService;
	}
	
	@Autowired
	private UserDeptViewService userDeptViewService;
	public void setUserDeptViewService(UserDeptViewService userDeptViewService) {
		this.userDeptViewService = userDeptViewService;
	}
	@Autowired
	private TableInfoService tableInfoService;
	public void setTableInfoService(TableInfoService tableInfoService) {
		this.tableInfoService = tableInfoService;
	}
	@RequestMapping("main")
	public String main(){
//		/hyst/WebRoot/WEB-INF/view/safe/模板.jsp
		tableInfoService.creatMenu();
		return "/WEB-INF/view/safe/index.jsp";
	}
	/**
	 * 请求所有菜单
	 */
	public List<TableInfo> creatMenu(){
		return null;
	}
	
	
	/**
	 * 异步取得二级子菜单请求
	 * @return
	 */
	@RequestMapping("ajax")
	@ResponseBody
	public String getTree(){
		String s="<li><a id='userlist' href=\"javascript:;\" onclick='go(this)'>用户权限管理</a></li><li>"+
				"<a id='userGroupAjax' href=\"javascript:;\" >权限批授权管理</a></li>"+
				"<li><a href=\"#\">用户组管理</a></li>";
		return s;
	}
	/**
	 * 获取用户列表请求
	 * @param map
	 * @return
	 */
	@RequestMapping("userlist")
	@ResponseBody
	public List<UserDeptView> getUsers(ModelMap map){
		map.put("list", userDeptViewService.getList());
		return userDeptViewService.getList();
	}
	/**
	 * 请求用户组列表
	 * @return
	 */
	@RequestMapping("userGroupAjax")
	@ResponseBody
	public List<UserGroup> getUserGroups(){
		
		return safeService.getUserGroups(0, 0);
	}
}
