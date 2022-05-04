package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.project.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\project\\automation", 
                 glue = "com\\automation\\stepdefinition",
                 monochrome = true,
                 tags = {"@smokeTest"},
                 plugin = {"pretty"}
                 )
public class Runner {
     
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver = Base_Class.browserLaunch("chrome");
     }
	//@AfterClass
	//public static void teardown() {
	//	driver.quit();

	//}
}
