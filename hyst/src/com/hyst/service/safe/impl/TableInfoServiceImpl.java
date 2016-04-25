package com.hyst.service.safe.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyst.dao.safe.TableInfoDao;
import com.hyst.service.safe.TableInfoService;
import com.hyst.service.safe.TableInfoUtil;
import com.hyst.vo.TableInfo;

/**
 * @author DongYi
 * @version 创建时间：2016年4月21日 下午6:33:27
 * 类说明
 */
@Service("tableInfoService")
public class TableInfoServiceImpl implements TableInfoService {

	@Autowired
	private TableInfoDao tableInfoDao;
	/**
	 * @param tableInfoDao the tableInfoDao to set
	 */
	public void setTableInfoDao(TableInfoDao tableInfoDao) {
		this.tableInfoDao = tableInfoDao;
	}
	
	public List<TableInfo> getList() {
		Map< String, Integer> map=new HashMap<String, Integer>();
		map.put("id", 0);
		List<TableInfo> flist = tableInfoDao.list(map);

		
		return null;
	}

	/**
	 * 获取功能菜单
	 */
	@Override
	public List<TableInfo> creatMenu() {
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("parentId", 0);
		//得到顶级菜单项
		List<TableInfo> flist=tableInfoDao.listByParentId(map);
		TableInfoUtil.getSonTable(flist, tableInfoDao);
		System.out.println("得到菜单为：\t"+flist);
		
		return null;
	}

}
