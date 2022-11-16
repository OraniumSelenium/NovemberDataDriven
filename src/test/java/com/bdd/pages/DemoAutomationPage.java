package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.stepdefinitionfile.BaseClass;

public class DemoAutomationPage extends BaseClass
{

	
	public static By emailfield = By.xpath("//input[@placeholder='E mail']");
	
	public static By passwordfield = By.xpath("//input[@placeholder='Password']");
	
	
	public void enteremail(String emaill)
	{
		com.enterValue(emailfield, emaill);
	}
	
	public void enterpassword(String pass)
	{
		com.enterValue(passwordfield, pass);
	}
}
