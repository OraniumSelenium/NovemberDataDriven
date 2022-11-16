package com.bdd.stepdefinitionfile;

import org.openqa.selenium.WebDriver;

import com.bdd.pages.DemoAutomationPage;
import com.bdd.pages.HomePage;
import com.bdd.pages.PracticeForm;
import com.bdd.pages.ProductPage;
import com.bdd.utility.Common;

public class BaseClass {

	
	public static 	WebDriver driver;
	
	public static HomePage hmpg = new HomePage();
	
	public static ProductPage prodpg = new ProductPage();
	
	public static Common com = new Common();
	
	public static PracticeForm practice = new PracticeForm();
			
	public static DemoAutomationPage demo = new DemoAutomationPage();
}
