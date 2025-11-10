package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D28HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Alert alt;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 100)", "");
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();			//Will click on Ok button
		
		WebElement button2 = driver.findElement(By.id("timerAlertButton"));
		js.executeScript("arguments[0].click()", button2);
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement button3 = driver.findElement(By.id("confirmButton"));
		js.executeScript("arguments[0].click()", button3);
		alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.dismiss();			//Will click on Cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		WebElement button4 = driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].click()", button4);
		alt = driver.switchTo().alert();
		alt.sendKeys("Amita");
		Thread.sleep(2000);
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
