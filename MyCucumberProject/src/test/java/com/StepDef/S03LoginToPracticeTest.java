package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03LoginToPracticeTest {
	WebDriver driver;
	
	@Given("Launch Practice Test Application")
	public void launch_practice_test_application() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid user name")
	public void enter_valid_user_name() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='post-title']")).getText().contains("Logged"));
		
	}

	//Invalid data
	
	@When("Enter invalid user name and invalid password")
	public void enter_invalid_user_name_and_invalid_password() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amita");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("amita123");
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error']")).getText().contains("invalid"));
	}
}
