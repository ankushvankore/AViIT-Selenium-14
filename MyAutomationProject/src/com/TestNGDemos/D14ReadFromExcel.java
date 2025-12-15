package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D14ReadFromExcel {
	String fPath = "ExcelFiles\\OrangeORMLoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;	
	
	@Test(enabled = false)
	public void readData() {
		row = sheet.getRow(0);	//Read the 1st row
		cell = row.getCell(0);	//Read the 1st cell from 1st row
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		cell = row.getCell(1);
		data = cell.getStringCellValue();
		System.out.println(data);
		
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	}
	
	@Test
	public void readAllData() {
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < rows; i++)
		{
			row = sheet.getRow(i);
			//int cells = sheet.getRow(i).getPhysicalNumberOfCells();
			for(int j = 0; j < cells; j++)
			{
				cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		//As we are not supposed to create a workbook, we need to pass FileInputStream object
		//This will read the existing workbook
		sheet = wb.getSheet("Login Data");
		//As we are supposed to read the data from existing sheet
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
