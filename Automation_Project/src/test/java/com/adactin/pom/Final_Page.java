package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Page {
	
	public static WebDriver driver;

	@FindBy(id = "finish")
	private WebElement finish;

	public Final_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getFinish() {
		return finish;
	}
	
}
