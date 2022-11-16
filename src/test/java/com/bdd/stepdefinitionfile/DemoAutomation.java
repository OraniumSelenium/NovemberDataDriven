package com.bdd.stepdefinitionfile;

import cucumber.api.java.en.When;

public class DemoAutomation extends BaseClass{
	
	@When("User click emailfield and enter a value {string}")
	public void user_click_emailfield_and_enter_a_value(String emaill) {
	 demo.enteremail(emaill);  
	}

	@When("User click password and send a value {string}")
	public void user_click_password_and_send_a_value(String pass) {
	
		demo.enterpassword(pass);
	}


}
