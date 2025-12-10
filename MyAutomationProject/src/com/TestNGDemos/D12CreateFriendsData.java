package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D12CreateFriendsData {
	String fPath = "ExcelFiles\\FriendsData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void createData() {
		//First Row
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Amita");
		
		//row = sheet.createRow(0);
		cell = row.createCell(1);
		cell.setCellValue("Charpe");
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Trupti");
		
		cell = row.createCell(1);
		cell.setCellValue("Killedar");
		
		sheet.createRow(2).createCell(0).setCellValue("Mehwash");
		sheet.getRow(2).createCell(1).setCellValue("Khan");
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("My Friends");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
