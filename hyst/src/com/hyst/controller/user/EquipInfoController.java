package com.hyst.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyst.service.info.InfoEquipInfo_ViewService;

/**
 * @author DongYi
 * @version 创建时间：2016年4月13日 上午10:52:57
 * 类说明
 */
@Controller
@RequestMapping("/info")
public class EquipInfoController {
	@Autowired 
	private InfoEquipInfo_ViewService infoEquipInfo_ViewService;
	public void setInfoEquipInfo_ViewService(
			InfoEquipInfo_ViewService infoEquipInfo_ViewService) {
		this.infoEquipInfo_ViewService = infoEquipInfo_ViewService;
	}
	@RequestMapping("list")
	public String getList(ModelMap map){
		map.addAttribute("list",infoEquipInfo_ViewService.getList());
		return "/infolist.jsp";
	}
}
