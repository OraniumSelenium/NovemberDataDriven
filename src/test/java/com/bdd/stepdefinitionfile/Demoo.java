package com.bdd.stepdefinitionfile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demoo extends BaseClass{
	
	


	@Given("User opens a browser and url")
	public void user_opens_a_browser_and_url() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\neworkspace\\Selenium_Oct\\exe\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		
		driver.get("https://www.demoblaze.com/index.html");
	}


	@When("User click the phone category")
	public void user_click_the_phone_category1() throws InterruptedException {
	  
	hmpg.clickPhoneCategory();
				
	}

	@When("User click the first product")
	public void user_click_the_first_product1() throws InterruptedException {
	
		hmpg.clickFrstProd();
	}

	@When("User click the cart button")
	public void user_click_the_cart_button1() throws InterruptedException {
	
	  prodpg.clickAddToCart();
	}

	@Then("User validate the alert box with success msg")
	public void user_validate_the_alert_box_with_success_msg1() {
		
		prodpg.validateSuccessMsg();
	
	}
	
	@Then("user verify page title")
	public void validatepagetitle()
	{
		
	}
		



}
