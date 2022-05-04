package com.Apr11_2022;
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
import com.pageobjectmanager.Page_Object_Manager;
import com.pageobjectmodel.Login;
public class POManager_RC_MP extends BaseClass {
	
	public static WebDriver driver =	browserLaunch("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		launchURL("https://adactinhotelapp.com/");
	
		passInputs(pom.getinstanceLp().getUsername() , "balajravi94");
		passInputs(pom.getinstanceLp().getPass(), "1234567890");
		clickElement(pom.getinstanceLp().getLogin());
		
		waitmethod(20);
		
		dropdowntext(pom.getinstanceSh().getLocation(), "New York");
		dropdownindex(pom.getinstanceSh().getHotel(), 3);
		dropdowntext(pom.getinstanceSh().getType(), "Super Deluxe");
		dropdowntext(pom.getinstanceSh().getNos(), "2 - Two");
		dropdownvalue(pom.getinstanceSh().getAdultroom(), "2");
		dropdownindex(pom.getinstanceSh().getChildroom(), 1);
		clickElement(pom.getinstanceSh().getSubmit());
		
		clickElement(pom.getinstancecn().getButton());
		clickElement(pom.getinstancecn().getCont());
		
		passInputs(pom.getinstancebh().getFirstname(), "Balaji");
		passInputs(pom.getinstancebh().getLastname(), "R");
		passInputs(pom.getinstancebh().getAddress(), "Los Angels");
		passInputs(pom.getinstancebh().getCcnum(), "9874561236521478");
		dropdownvalue(pom.getinstancebh().getCctype(), "AMEX");
		dropdownvalue(pom.getinstancebh().getExpmonth(), "3");
		dropdowntext(pom.getinstancebh().getExpyear(), "2022");
		passInputs(pom.getinstancebh().getCvv(), "1234");
		clickElement(pom.getinstancebh().getBooknow());

		sleep(6000);
		screenshot("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Screenshots\\PageObjectManagerMiniproj.png");
		
		clickElement(pom.getinstancelg().getLogout());
	}
}
