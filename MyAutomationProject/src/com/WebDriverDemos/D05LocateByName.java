package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.name("email"));
		//Read the control on page whose name is email and store in userName object.
		//This object is now representing the control on page. 
		//Operations on this object will reflect on the control.
		userName.sendKeys("test@gmail.com");	//sendKeys() will enter text in textbox
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234567890");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
