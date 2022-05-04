package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Cart_Page;
import com.automation.runner.Runner;
import com.project.baseclass.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Cart_StepDefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	Cart_Page cp = new Cart_Page(driver);
	
	 @Before
		public void beforeHooks(Scenario scenario) {
			String status = scenario.getStatus();
			System.out.println("Scenario status : "+status);
	     }
	    @After
		public void afterHooks(Scenario scenario) throws Throwable {
			if (scenario.isFailed()) {
				screenshots("C:\\Users\\ELCOT\\eclipse-workspace\\Automation_Project\\screenshots\\image.png");
			}
			System.out.println("Exit from the page");

		}

	@When("^User clicks the checkout button$")
	public void user_clicks_the_checkout_button() throws Throwable {
	    clickOnelement(cp.getCheckout());
	}

	@Then("^User validates the checkout button$")
	public void user_validates_the_checkout_button() throws Throwable {
	    
	}
}
