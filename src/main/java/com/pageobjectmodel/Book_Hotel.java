package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	WebElement firstname;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy (id = "last_name")
	WebElement lastname;
	
	@FindBy (id = "address")
	WebElement address;
	
	@FindBy(id = "cc_num" )
	WebElement ccnum;
	
	@FindBy(id = "cc_type")
	WebElement cctype;
	
	@FindBy (id = "cc_exp_month")
	WebElement expmonth;
	
	@FindBy (id = "cc_exp_year")
	WebElement expyear;
	
	@FindBy(id = "cc_cvv")
    WebElement cvv;
	
	@FindBy (id = "book_now")
	WebElement booknow;
	
	
	
}
