package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("Amita");
		WebElement password = driver.findElement(By.cssSelector("input[class=\"form-control\"][id=\"txtPassword\"]"));
		password.sendKeys("amita123");
		WebElement loginBtn = driver.findElement(By.className("btn-block"));
		loginBtn.click();
		
		WebElement errMsg = driver.findElement(By.className("error"));
		String msg = errMsg.getText();
		System.out.println("Error Message: " + msg);
		
		driver.close();
	}

}
