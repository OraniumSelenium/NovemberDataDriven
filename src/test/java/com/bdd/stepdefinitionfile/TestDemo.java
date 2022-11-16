package com.bdd.stepdefinitionfile;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class TestDemo extends BaseClass{
	
	
	@Given("User open the application {string}")
	public void user_open_the_application(String string) {
		
System.setProperty("webdriver.chrome.driver", "C:\\neworkspace\\SeleniumWeekday_Oct\\exe\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.get(string);
	 
	}



}
