package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("Launch Google")
	public void launch_google() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com");
	}

	@When("Enter keyword to search in search box")
	public void enter_keyword_to_search_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Cucumber");
	}

	@When("Hit Enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("A valid search result should display")
	public void a_valid_search_result_should_display() {
	    System.out.println("Search works");
	}
}
