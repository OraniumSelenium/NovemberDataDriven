package com.bdd.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinitionfile.BaseClass;

public class ProductPage extends BaseClass{
	
	public static By addtocartbutton  = By.xpath("//a[text()='Add to cart']");
	public static By prodname = By.tagName("h2");
	public static By prodPrice = By.tagName("h3");
	
	
	public void clickAddToCart() throws InterruptedException
	{
	
		
		com.clickElement(addtocartbutton);
	}

	public void validateSuccessMsg()
	{
		
		Alert alert = driver.switchTo().alert();
	String alertText =	alert.getText();
	
	if(alertText.equalsIgnoreCase("Product added"))
	{
		System.out.println("Product added successfully");
	}
	else
	{
		System.out.println("Product not added");
	}
	
	alert.accept();
	  
	}
}
