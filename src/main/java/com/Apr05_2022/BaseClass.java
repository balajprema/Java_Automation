package com.Apr05_2022;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver; // if we not initialize default value null

	public static WebDriver browserLaunch(String browsername) {
		
		
			 ///////////////      1. launch Browser      ///////////////////
		
		
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}


		 	 ///////////////   2. CLOSE     /////////// //////
	public static void closeBrowser() {
		driver.close();
	}

		    ////////////       3. QUIT         ////////////////////////

	public static void quitBrowser() { // no need to pass parameter
		driver.quit();
	}
	
    /////////////////////////    4. Navigate to   ////////////////////////
	
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	
	/////////////////////////    5. Navigate back   ////////////////////////
	
	public void navigateBack() {
		 driver.navigate().back();
	}
	
	
    /////////////////////////    6. Navigate Forward   ////////////////////////
	
	public void navigateForward() {
		 driver.navigate().forward();
	}
	
	
    /////////////////////////    7. Navigate Refresh   ////////////////////////
	
	public void navigateRefresh() {
		 driver.navigate().refresh();
	}
	
	
    /////////////////////////    8. Get  ////////////////////////
	
	public static void launchURL(String url) {
		driver.get(url);
	}
	
    /////////////////////////    9. Alert   ////////////////////////
	
	public void alertAccept() {
		 driver.switchTo().alert().accept();
	}
	
	public void alertDismiss() {
		 driver.switchTo().alert().dismiss();
	}

	public void alertSendkeys(String parameter) {
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys(parameter);
	}
	
	
	  /////////////////////////   10.Action   ////////////////////////
	
	  /////////////////////////   11. Frames /////////////////////////
	
	  /////////////////////////    12. Robot     /////////////////////
	
	
	  /////////////////////////    13. Windows handles  //////////////
	

	// SENDKEYS
	public static void passInputs(WebElement element, String input) {
		element.sendKeys(input);
	}

	// CLICK
	public static void clickElement(WebElement element) {
		element.click();
	}

	// TAKE SCREENSHOT

	public static void screenshot(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		FileUtils.copyFile(src, des);
	}

	// DROPDOWN
	public static void dropdownindex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void dropdownvalue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void dropdowntext(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);

	}
	
	// WAIT
	
	public static void waitmethod (int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
  
	// SLEEP
	
	public static void sleep(int time) throws Throwable {
		Thread.sleep(time);

	}
}
