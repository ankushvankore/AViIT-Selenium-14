package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04TestAutomation {
	WebDriver driver;
	
	@Given("Open Test Automation App")
	public void open_test_automation_app() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://testautomationpractice.blogspot.com/?m=1");
	}

	@When("Enter name as {string}")
	public void enter_name_as(String name) {
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
	}

	@When("Enter Email id as {string}")
	public void enter_email_id_as(String email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}

	@When("Enter Phone no as {string}")
	public void enter_phone_no_as(String phone) {
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
	}

	@When("Enter Address as {string}")
	public void enter_address_as(String address) {
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(address);
	}

	@When("Select Gender {string}")
	public void select_gender(String gender) {
	    if(gender.equals("Male"))
	    	driver.findElement(By.xpath("//input[@id='male']")).click();
	    else
	    	driver.findElement(By.xpath("//input[@id='female']")).click();
	}

	@Then("Registration success")
	public void registration_success() {
	    System.out.println("Thank you for registration!!!");
	}
}
