package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D07Asseretions {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
	
	@Test(dataProvider = "getLoginData")
	public void login(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		actUrl = driver.getCurrentUrl();
		
		//Assert.assertEquals(actUrl, expUrl);
		//Assert.assertTrue(actUrl.equals(expUrl));
		Assert.assertTrue(actUrl.contains("dashboard"));
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "amita", "amita123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "trupti", "trupti123" },
			new Object[] { "mehwash", "mehwash123" },
		};
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
