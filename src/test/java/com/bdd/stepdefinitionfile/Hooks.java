package com.bdd.stepdefinitionfile;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	//global
	
	@Before(order=2)
	public void precondition()
	{
		System.out.println("Precondition 1");
	}
	
	@Before(order=1)
	public void precondition2()
	{
		System.out.println("precndition 2");
	}
	
	@After
	public void postcondition()
	{
		System.out.println("Post condition");
	}
	
	@After
	public void postcondition2()
	{
		System.out.println("post contion2");
	}
	
	@Before("@reg")
	public void precoond()
	{
		System.out.println("precondition for specified scenario");
	}
	
@After("@test")
	public void postcond()
	{
		System.out.println("postcondition for specified scenario");
	}
}
