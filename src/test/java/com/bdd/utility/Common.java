package com.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinitionfile.BaseClass;

public class Common extends BaseClass{
	
	
	public void clickElement(By loc) throws InterruptedException
	{
		WebElement ele = driver.findElement(loc);
		ele.click();
		Thread.sleep(2000);
	}
	
	public void enterValue(By loc,String value)
	{
		WebElement ele = driver.findElement(loc);
		ele.click();
		ele.clear();
		ele.sendKeys(value);
	}
	
	public void verifypagetitle()
	{
	String actuatlTitle =	driver.getTitle();
	}

}
