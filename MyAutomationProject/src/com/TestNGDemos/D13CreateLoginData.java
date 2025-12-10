package com.TestNGDemos;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D13CreateLoginData {
	String fPath = "ExcelFiles\\OrangeORMLoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(dataProvider = "getLoginData")
	public void f(String un, String ps, String rs) {
		System.out.println(un);
		System.out.println(ps);
		System.out.println(rs);
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "User Name", "Password", "Result" },
			new Object[] { "admin", "admin123", "Not Run" },
			new Object[] { "amita", "amita123", "Not Run" },
			new Object[] { "admin", "admin123", "Not Run" },
			new Object[] { "trupti", "trupti123", "Not Run" },
		};
	}
	@BeforeTest
	public void beforeTest() {
		/*file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login Data");*/
	}

	@AfterTest
	public void afterTest() {
	}

}
