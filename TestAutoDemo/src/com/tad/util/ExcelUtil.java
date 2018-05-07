package com.tad.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelUtil {

private static FileInputStream fis;
	
	public ExcelUtil() throws FileNotFoundException {
		 fis=new FileInputStream(TestUtil.EXL_FILE_PATH+TestUtil.EXL_FILE_NAME);

	}
	
}
