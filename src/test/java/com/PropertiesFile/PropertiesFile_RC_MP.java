package com.PropertiesFile;
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
public class PropertiesFile_RC_MP extends BaseClass {
	
	public static WebDriver driver =	browserLaunch("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		String url = File_Reader_Manager.getInstancefrm().getInstanceCR().getUrl();
		launchURL(url);
	    
		String username = File_Reader_Manager.getInstancefrm().getInstanceCR().getusername();
		passInputs(pom.getinstanceLp().getUsername(), username); 
		String password = File_Reader_Manager.getInstancefrm().getInstanceCR().getpassword();
		passInputs(pom.getinstanceLp().getPass(), password);
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
		
		String fir = File_Reader_Manager.getInstancefrm().getInstanceCR().getfirstname();
		passInputs(pom.getinstancebh().getFirstname(), fir);
		String last = File_Reader_Manager.getInstancefrm().getInstanceCR().getlastname();
		passInputs(pom.getinstancebh().getLastname(), last);
		String add = File_Reader_Manager.getInstancefrm().getInstanceCR().getaddress();
		passInputs(pom.getinstancebh().getAddress(), add);
		String num = File_Reader_Manager.getInstancefrm().getInstanceCR().getccnum();
		passInputs(pom.getinstancebh().getCcnum(), num);
		dropdownvalue(pom.getinstancebh().getCctype(), "AMEX");
		dropdownvalue(pom.getinstancebh().getExpmonth(), "3");
		dropdowntext(pom.getinstancebh().getExpyear(), "2022");
		String cvv = File_Reader_Manager.getInstancefrm().getInstanceCR().getcvv();
		passInputs(pom.getinstancebh().getCvv(), cvv);
		clickElement(pom.getinstancebh().getBooknow());

		sleep(6000);
		screenshot("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Screenshots\\PropertiesfilerMiniproj.png");
		
		clickElement(pom.getinstancelg().getLogout());
	}
}
