package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import com.pageobjectmodel.Book_Hotel;
import com.pageobjectmodel.Continue;
import com.pageobjectmodel.Login;
import com.pageobjectmodel.Logout;
import com.pageobjectmodel.Search_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Login lp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login getinstanceLp() {
		if (lp == null) {
			lp = new Login(driver);
		}
		 
		return lp;
	} 

	private Search_Hotel sh;

	public Search_Hotel getinstanceSh() {
		
		if (sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}
	
	private Continue cn;
	
	public Continue getinstancecn () {
		if (cn == null) {
			cn = new Continue(driver);
		}
		return cn;
	}
	
	private Book_Hotel bh;
	
	public Book_Hotel getinstancebh () {
		if (bh==null) {
			 bh = new Book_Hotel(driver);
		}
		return bh;
		
	}
	
	private Logout lg;
	public Logout getinstancelg() {
		if (lg==null) {
			lg = new Logout(driver);
		}
		return lg;
	}
}
