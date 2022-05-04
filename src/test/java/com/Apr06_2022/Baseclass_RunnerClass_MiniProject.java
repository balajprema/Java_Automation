package com.Apr06_2022;

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

public class Baseclass_RunnerClass_MiniProject extends BaseClass {
	public static void main(String[] args) throws Throwable {

		browserLaunch("chrome");
		launchURL("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.id("username"));
		passInputs(username, "balajravi94");

		WebElement pass = driver.findElement(By.id("password"));
		passInputs(pass, "1234567890");

		WebElement login = driver.findElement(By.id("login"));
		clickElement(login);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement location = driver.findElement(By.id("location"));
		dropdowntext(location, "New York");

		WebElement hotel = driver.findElement(By.id("hotels"));
		dropdownindex(hotel, 3);

		WebElement type = driver.findElement(By.id("room_type"));
		dropdowntext(type, "Super Deluxe");

		WebElement nos = driver.findElement(By.id("room_nos"));
		dropdowntext(nos, "2 - Two");

		WebElement adult = driver.findElement(By.id("adult_room"));
		dropdownvalue(adult, "2");

		WebElement child = driver.findElement(By.id("child_room"));
		dropdownindex(child, 1);

		WebElement submit = driver.findElement(By.id("Submit"));
		clickElement(submit);

		WebElement button = driver.findElement(By.id("radiobutton_0"));
		clickElement(button);

		WebElement cont = driver.findElement(By.id("continue"));
		clickElement(cont);

		WebElement firstname = driver.findElement(By.id("first_name"));
		passInputs(firstname, "Balaji");

		WebElement lastname = driver.findElement(By.id("last_name"));
		passInputs(lastname, "R");

		WebElement address = driver.findElement(By.id("address"));
		passInputs(address, "Los Angels");

		WebElement cc = driver.findElement(By.id("cc_num"));
		passInputs(cc, "9874561230789456");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		dropdownvalue(cctype, "AMEX");

		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		dropdownvalue(exp, "3");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		dropdowntext(year, "2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		passInputs(cvv, "1234");

		WebElement booknow = driver.findElement(By.id("book_now"));
		clickElement(booknow);

		Thread.sleep(6000);
		screenshot("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Screenshots\\Baseclass_Miniproj.png");
	}
}
