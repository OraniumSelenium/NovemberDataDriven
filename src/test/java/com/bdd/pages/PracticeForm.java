package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.stepdefinitionfile.BaseClass;

public class PracticeForm extends BaseClass{
	
	public static By frstname = By.xpath("//input[@placeholder='First Name']");
	public static By lastname = By.xpath("//input[@placeholder='Last Name']");
	public static By email = By.xpath("//input[@placeholder='name@example.com']");
	
	
	public void enterFirstname(String firstname)
	{
		com.enterValue(frstname, firstname);
	}
	
	public void enterLastname(String lname)
	{
		com.enterValue(lastname, lname);
	}
	
	public void enteremail(String emaill)
	{
		com.enterValue(email, emaill);
	}
	
}
