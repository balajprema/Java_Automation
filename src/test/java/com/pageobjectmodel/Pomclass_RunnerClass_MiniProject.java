package com.pageobjectmodel;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Apr05_2022.BaseClass;
import com.pageobjectmodel.Login;

public class Pomclass_RunnerClass_MiniProject extends BaseClass {
	
	
	public static void main(String[] args) throws Throwable {

		browserLaunch("chrome");
		launchURL("https://adactinhotelapp.com/");
		
		Login lp = new Login(driver);	
		
		passInputs(lp.getUsername(), "balajravi94");
		passInputs(lp.getPass(), "1234567890");
		clickElement(lp.getLogin());
		
		waitmethod(20);

		Search_Hotel sh = new Search_Hotel(driver);
		
		dropdowntext(sh.location, "New York");
		dropdownindex(sh.hotel, 3);
		dropdowntext(sh.type, "Super Deluxe");
		dropdowntext(sh.nos, "2 - Two");
		dropdownvalue(sh.adultroom, "2");
		dropdownindex(sh.childroom, 1);
		clickElement(sh.submit);
		
		Continue ct = new Continue(driver);
		
		clickElement(ct.button);
		clickElement(ct.cont);
		
		Book_Hotel bh = new Book_Hotel(driver);
		
		passInputs(bh.firstname, "Balaji");
		passInputs(bh.lastname, "R");
		passInputs(bh.address, "Los Angels");
		passInputs(bh.ccnum, "9874561236521478");
		dropdownvalue(bh.cctype, "AMEX");
		dropdownvalue(bh.expmonth, "3");
		dropdowntext(bh.expyear, "2022");
		passInputs(bh.cvv, "1234");
		clickElement(bh.booknow);

		sleep(6000);
		screenshot("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Screenshots\\PageObjectModelMiniproj.png");
		
		Logout lg = new Logout(driver);
		clickElement(lg.logout);
	}
}
