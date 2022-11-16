package com.bdd.stepdefinitionfile;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Toolsqa_Register extends BaseClass{
	

@Given("User launches browser and open toolsqa application {string}")
public void user_launches_browser_and_open_toolsqa_application(String url) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\neworkspace\\Selenium_Oct\\exe\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	

	
	driver.get(url);
	
   
}


@When("User click the firstname and send a value {string}")
public void user_click_the_firstname_and_send_a_value(String fname) {
	
	practice.enterFirstname(fname);
  
}

@When("User click the lastname fields and send {string} as a testdata")
public void user_click_the_lastname_fields_and_send_as_a_testdata(String lname) {
	
	practice.enterLastname(lname);

}

@When("User click email and send a value {string}")
public void user_click_email_and_send_a_value(String emaill) {
	
	practice.enteremail(emaill);

}


}
