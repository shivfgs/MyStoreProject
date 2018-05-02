package com.tad.util;

import java.io.FileInputStream;

import com.tad.base.TestBase;

public class ExcelReader extends TestBase{
	
	public ExcelReader() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	FileInputStream fis=new FileInputStream(prop.getProperty("excelPath"));

}
