package com.StepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S06InsuranceProject {
	WebDriver driver;
	@Given("Launch Tricentis Application")
	public void launch_tricentis_application() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://sampleapp.tricentis.com/101/index.php");
	}

	@When("Click on Automobile Link")
	public void click_on_automobile_link() {
		driver.findElement(By.partialLinkText("Auto")).click();
	}

	@When("Enter following data")
	public void enter_following_data(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(dataTable);
		
		List<List<String>>data = dataTable.asLists();
		System.out.println(data);
		
		System.out.println(data.get(0).get(0));
		
		new Select(driver.findElement(By.id("make"))).selectByValue(data.get(0).get(0));
		driver.findElement(By.id("engineperformance")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("dateofmanufacture")).sendKeys(data.get(0).get(2));
	}

	@Then("Automobile Test complete")
	public void automobile_test_complete() {
	}
}
