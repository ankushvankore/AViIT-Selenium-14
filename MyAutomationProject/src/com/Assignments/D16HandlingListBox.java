package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D16HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// WebElement listBox = driver.findElement(By.id("multiselect1"));
		// Select cars = new Select(listBox);
		Select cars = new Select(driver.findElement(By.id("multiselect1")));
		List<WebElement> allCars = cars.getOptions();

		System.out.println("All cars in the list");
		for (WebElement c : allCars)
			System.out.println(c.getText());

		if (cars.isMultiple()) {
			cars.selectByIndex(1);
			cars.selectByContainsVisibleText("Hyun");

			List<WebElement> selectedCars = cars.getAllSelectedOptions();

			System.out.println("Selected Cars...");
			for (WebElement sc : selectedCars)
				System.out.println(sc.getText());
		}
		//cars.deselectByIndex(1);
		//cars.deSelectByContainsVisibleText("Sw");
		//cars.deselectByValue("swiftx");
		//cars.deselectByVisibleText("Swift");
		cars.deselectAll();
	}

}
