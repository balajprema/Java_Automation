package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Shopping_Page;
import com.automation.runner.Runner;
import com.project.baseclass.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Shopping_Stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	Shopping_Page sp = new Shopping_Page(driver);
	
	 @Before
		public void beforeHooks(Scenario scenario) {
			String status = scenario.getStatus();
			System.out.println("Scenario status : "+status);
	     }
	    @After
		public void afterHooks(Scenario scenario) throws Throwable {
			if (scenario.isFailed()) {
				screenshots("C:\\Users\\ELCOT\\eclipse-workspace\\Automation_Project\\screenshots\\image2.png");
			}
			System.out.println("Exit from the page");

		}
	    
	@When("^User adds the backpack to cart$")
	public void user_adds_the_backpack_to_cart() throws Throwable {
	    clickOnelement(sp.getBackpack());
	}

	@When("^User adds the jacket to cart$")
	public void user_adds_the_jacket_to_cart() throws Throwable {
	    clickOnelement(sp.getJacket());
	}

	@When("^User adds the tshirt to cart$")
	public void user_adds_the_tshirt_to_cart() throws Throwable {
	    clickOnelement(sp.getTshirt());
	}

	@When("^User clicks the Shopping cart$")
	public void user_clicks_the_Shopping_cart() throws Throwable {
	    clickOnelement(sp.getCart());
	}

	@Then("^User validates the Shopping cart$")
	public void user_validates_the_Shopping_cart() throws Throwable {
	    
	}

	
	
}
