package com.StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleTitle {
	WebDriver driver;
	String title;
	
	@Given("Open Google")
	public void open_google() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com");
	}

	@When("Read the title")
	public void read_the_title() {
		title = driver.getTitle();
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		Assert.assertTrue(title.equals("Google"));
	}
}
