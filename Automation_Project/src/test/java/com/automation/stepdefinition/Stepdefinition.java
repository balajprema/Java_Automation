package com.automation.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;
import com.automation.runner.Runner;
import com.project.baseclass.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	LoginPage lp = new LoginPage(driver);
    @Before
	public void beforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
		System.out.println("Scenario status : "+status);
     }
    @After
	public void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			screenshots("C:\\Users\\ELCOT\\eclipse-workspace\\Automation_Project\\screenshots\\image1.png");
		}
		System.out.println("Exit from the page");

	}
	
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
	    url("https://www.saucedemo.com/");
	}

	@When("^User enters the \"([^\"]*)\" as Username$")
	public void user_enters_the_as_Username(String arg1) throws Throwable {
	   inputOfelement(lp.getUsername(), arg1);
	}

	@When("^User enters the \"([^\"]*)\" as Password$")
	public void user_enters_the_as_Password(String arg1) throws Throwable {
	    inputOfelement(lp.getPassword(), arg1);
	}

	@When("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
	    clickOnelement(lp.getLogin());
	}

	@Then("^User validates the login button$")
	public void user_validates_the_login_button() throws Throwable {
	    
	}

}
