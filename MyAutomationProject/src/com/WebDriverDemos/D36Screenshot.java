package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class D36Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		SearchContext ss = driver.findElement(By.cssSelector("div[id=\"shadow_host\"]")).getShadowRoot();
		ss.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Amita");
		ss.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot, new File("ScreenShots\\TrialScreenShot.jpeg"));
		
		System.out.println("Screenshot captured!!!");
		
		driver.close();
	}

}
