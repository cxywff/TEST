package com.hyst.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *  文件生成工具类 （字符流）
 * @author DongYi
 * @version 创建时间：2016年4月12日 下午3:23:26
 */
public class OutPut {
	
	/**
	 * @description 根据表名生成 自定义实体类及对应mapper.xml、service、Dao文件
	 * @param voName 模型名称
	 * @param tableName 表名
	 */
	public static void creatFile(String voName,String tableName){
		String xml=GetString.creatXml(tableName, voName);
		String vo=GetString.creat(tableName, voName);
		String path=System.getProperty("user.dir").replace("\\", "/");;
		String javapath=path+"/src/com/hyst/vo/"+voName.substring(voName.lastIndexOf(".")+1,voName.length())+".java";
		String xmlpath=path+"/src/com/hyst/config/mapper/"+voName.substring(voName.lastIndexOf(".")+1,voName.length())+".mapper.xml";
		File xmlfile=new File(xmlpath);
		File jaFile=new File(javapath);
		System.out.println(xmlpath+"\n"+javapath);
		if (!xmlfile.exists()) {
			try {
				xmlfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!jaFile.exists()) {
			try {
				jaFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		OutPut.out(xml, xmlfile);
		OutPut.out(vo, jaFile);
	}
	
	
	
		/**
		 * 写文件
		 * @param context 内容
		 * @param path	  路径
		 */
	public static void out(String context,File file){
			Writer writer=null;
			BufferedWriter bw=null;
			try {
				bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
				bw.write(context,0,context.length());
				bw.flush();
				System.out.println("-------------------生成文件完毕--------------------");
			} catch (IOException e) {
				System.err.println("-------------------生成文件失败--------------------");
			}finally{
				if (bw!=null) {
					try {
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}
		
	}
}
