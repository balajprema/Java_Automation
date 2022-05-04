package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	WebElement button;
	

	

	public Continue(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getCont() {
		return cont;
	}

	@FindBy(id = "continue")
	WebElement cont;
	

}
