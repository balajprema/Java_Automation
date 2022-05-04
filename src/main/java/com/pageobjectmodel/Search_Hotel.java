package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy (id = "location")
	public
	WebElement location;
	
	@FindBy(id = "hotels")
	WebElement hotel;
	
	@FindBy(id = "room_type")
	WebElement type;
	
	@FindBy(id = "room_nos")
	WebElement nos;
	
	@FindBy(id = "adult_room")
	WebElement adultroom;
	
	@FindBy (id = "child_room")
	WebElement childroom;
	
	@FindBy(id = "Submit")
	WebElement submit;
	

}
