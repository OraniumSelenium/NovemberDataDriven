package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\neworkspace\\NewBDD\\src\\test\\java\\com\\bdd\\featurefile",
					glue="com.bdd.stepdefinitionfile",
					plugin= {"pretty","html:cucumberreport"},
					tags= {"~@reg"},
					dryRun=true, // to know the unimplemented steps before execution
					monochrome=true) // to view the console information in more readable format
public class TestRunner {

}
