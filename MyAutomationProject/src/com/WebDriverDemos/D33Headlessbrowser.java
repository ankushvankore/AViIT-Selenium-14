package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class D33Headlessbrowser {

	public static void main(String[] args) {
		//ChromeOptions op = new ChromeOptions();
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--headless");
		//WebDriver driver = new ChromeDriver(op);
		WebDriver driver = new EdgeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}

}
