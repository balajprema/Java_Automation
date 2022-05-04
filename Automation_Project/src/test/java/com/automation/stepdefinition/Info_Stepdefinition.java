package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Info_Page;
import com.automation.runner.Runner;
import com.project.baseclass.Base_Class;

import cucumber.api.java.en.*;

public class Info_Stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	Info_Page ip = new Info_Page(driver);

	@When("^User enters \"([^\"]*)\" as firstname$")
	public void user_enters_as_firstname(String arg1) throws Throwable {
	    inputOfelement(ip.getFirstname(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as lastname$")
	public void user_enters_as_lastname(String arg1) throws Throwable {
	    inputOfelement(ip.getLastname(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as postal code$")
	public void user_enters_as_postal_code(String arg1) throws Throwable {
	    inputOfelement(ip.getPostalcode(), arg1);
	}

	@When("^User clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
	    clickOnelement(ip.getContinue1());
	}

	@Then("^User validates the continue button$")
	public void user_validates_the_continue_button() throws Throwable {
	   
	}
}
