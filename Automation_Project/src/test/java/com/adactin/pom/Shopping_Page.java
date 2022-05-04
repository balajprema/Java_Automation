package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Page {
	public static WebDriver driver;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement backpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement jacket;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement tshirt;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement cart;

	public Shopping_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getBackpack() {
		return backpack;
	}

	public WebElement getJacket() {
		return jacket;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getCart() {
		return cart;
	}
}
