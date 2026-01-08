package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S07DataDrivenTesting {
	WebDriver driver;
	
	@Given("Launch OHRM application")
	public void launch_ohrm_application() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter username as {string}")
	public void enter_username_as(String un) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	}

	@When("Enter password as {string}")
	public void enter_password_as(String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}

	@When("Click on Submit")
	public void click_on_submit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Dashboard page should display")
	public void dashboard_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}
}
