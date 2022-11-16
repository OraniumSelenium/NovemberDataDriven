package com.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinitionfile.BaseClass;

public class HomePage extends BaseClass{
	
	
	public static By phonelinkk = By.xpath("//a[text()='Phones']");
	public static By frstProdd = By.xpath("(//a[@class='hrefch'])[1]");
	
	public static By tset = By.tagName("");
	
	
	
	public void clickPhoneCategory() throws InterruptedException
	{
			com.clickElement(phonelinkk);
	}
	
	public void clickFrstProd() throws InterruptedException
	{

		
		com.clickElement(frstProdd);
		
	
	}
	
	

}
