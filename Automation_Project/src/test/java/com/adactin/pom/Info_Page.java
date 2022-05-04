package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info_Page {
	
	public static WebDriver driver;

	@FindBy(id = "first-name")
	private WebElement firstname;
	
	@FindBy(id = "last-name")
	private WebElement lastname;
	
	@FindBy(id = "postal-code")
	private WebElement postalcode;
	
	@FindBy(id = "continue")
	private WebElement continue1;

	public Info_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getContinue1() {
		return continue1;
	}
	
}
