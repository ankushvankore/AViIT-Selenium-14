package com.WebTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05NormalReport {

	public static void main(String[] args) {
		WebDriver driver;

		ExtentSparkReporter htmlReport = new ExtentSparkReporter("Reports\\NormalReport.html");
		// This is the file in which we are going to store the report
		ExtentReports report = new ExtentReports();
		// This is object that will represent the report.
		ExtentTest test;
		// This object represents the tests

		report.attachReporter(htmlReport);
		// The generated report will be stored in the NormalReport.html file

		// Configuration about the Environment
		report.setSystemInfo("User Name", "Mehwash");
		report.setSystemInfo("Machine Name", "Dell");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Processor", "I5");

		// Set the look and fell and information about the file
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");

		test = report.createTest("Google Title Test");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());

		driver.close();

		test.log(Status.PASS, MarkupHelper.createLabel("Google Title", ExtentColor.GREEN));

		test = report.createTest("Google Search Test");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Maven", Keys.ENTER);

		driver.close();

		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search", ExtentColor.RED));

		report.flush(); // This will generate the report file
	}

}
