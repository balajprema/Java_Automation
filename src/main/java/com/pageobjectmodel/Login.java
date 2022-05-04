package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement pass;
	
	@FindBy (id = "login")
	private WebElement login;
	
	
	public Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	 }

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	

}
