package com.hyst.service.impl.info;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyst.dao.info.InfoEquipInfo_ViewDao;
import com.hyst.service.info.InfoEquipInfo_ViewService;
import com.hyst.vo.InfoEquipInfo_View;

/**
 * @author DongYi
 * @version 创建时间：2016年4月13日 上午11:09:40
 * 类说明
 */
@Service("infoEquipInfo_ViewServiceImpl")
public class InfoEquipInfo_ViewServiceImpl implements InfoEquipInfo_ViewService{
	@Autowired
	private InfoEquipInfo_ViewDao infoEquipInfo_ViewDao;
	/**
	 * @param infoEquipInfo_ViewDao the infoEquipInfo_ViewDao to set
	 */
	public void setInfoEquipInfo_ViewDao(
			InfoEquipInfo_ViewDao infoEquipInfo_ViewDao) {
		this.infoEquipInfo_ViewDao = infoEquipInfo_ViewDao;
	}
	
	@Override
	public List<InfoEquipInfo_View> getList() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("isDelete", 0);
		return infoEquipInfo_ViewDao.list(map);
	}
	
}
