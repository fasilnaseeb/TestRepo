package com.crm.Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	
	public String getExceldata(String path,String sheet,int r,int c) throws Throwable {
		
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return value;
		
	}
	
	public void setExceldata(String path,String sheet,int r,int c,String data) throws Throwable {
		
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
	
	public int getRowCount(String path,String sheet) throws Throwable {
		
		FileInputStream fis =new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheet).getLastRowNum();
		return rowcount;
	}
	
	public String getPropertyFile(String path,String key) throws Throwable {
		
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key, "notfound");
		return value;
		
		
	}

}
