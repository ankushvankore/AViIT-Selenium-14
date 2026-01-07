package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05GoogleLinks {
	WebDriver driver;
	@Given("Launch {string}")
	public void launch(String url) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get(url);
	}

	@When("Click on About Link")
	public void click_on_about_link() {
	    driver.findElement(By.linkText("About")).click();
	}

	@Then("About page should open")
	public void about_page_should_open() {
		Assert.assertTrue(driver.getCurrentUrl().contains("about"));
	}

	@When("Click on Store Link")
	public void click_on_store_link() {
	    driver.findElement(By.linkText("Store")).click();
	}

	@Then("Store page should open")
	public void store_page_should_open() {
		Assert.assertTrue(driver.getCurrentUrl().contains("store"));

	}

	@When("Click on Gmail Link")
	public void click_on_gmail_link() {
	    driver.findElement(By.partialLinkText("Gmail")).click();
	}

	@Then("Gmail page should open")
	public void gmail_page_should_open() {
		Assert.assertTrue(driver.getCurrentUrl().contains("gmail"));

	}

	@When("Click on Advt Link")
	public void click_on_advt_link() {
	    driver.findElement(By.partialLinkText("Adv")).click();
	}

	@Then("Advt page should open")
	public void advt_page_should_open() {
		Assert.assertTrue(driver.getCurrentUrl().contains("ads"));

	}
}
