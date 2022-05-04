package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Final_Page;
import com.automation.runner.Runner;
import com.project.baseclass.Base_Class;

import cucumber.api.java.en.*;

public class Final_Stepdefinition extends Base_Class{
	public static WebDriver driver = Runner.driver;
	
	Final_Page fp = new Final_Page(driver);
	
	@When("^User clicks the finish button$")
	public void user_clicks_the_finish_button() throws Throwable {
	    clickOnelement(fp.getFinish());
	}

	@Then("^User validates the finish button$")
	public void user_validates_the_finish_button() throws Throwable {
	    
	}
}
