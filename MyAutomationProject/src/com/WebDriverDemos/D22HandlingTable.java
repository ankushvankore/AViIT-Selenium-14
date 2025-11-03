package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D22HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//driver.findElement(By.linkText("Money")).click();
		//driver.findElement(By.partialLinkText("More Gainers")).click();
		
		List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));

		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total no of Rows: " + rows.size());
		
		Random rnd = new Random();
		int n = rnd.nextInt(rows.size());
		
		System.out.println(rows.get(n).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+(n+1)+"]")).getText());
		
		driver.close();
	}

}
