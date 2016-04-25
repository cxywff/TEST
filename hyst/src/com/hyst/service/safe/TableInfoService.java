package com.hyst.service.safe;

import java.util.List;

import com.hyst.vo.TableInfo;

/**
 * @author DongYi
 * @version 创建时间：2016年4月21日 下午6:32:32
 * 类说明
 */
public interface TableInfoService {
	public List<TableInfo> getList();
	public List<TableInfo> creatMenu();
}
