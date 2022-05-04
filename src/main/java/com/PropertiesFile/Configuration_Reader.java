package com.PropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
    public static Properties p ;
   public Configuration_Reader() throws Throwable {
	   File f = new File ("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\src\\main\\java\\com\\PropertiesFile\\Adactin.properties");
		 FileInputStream fis = new FileInputStream(f); 
		 p = new Properties();
		 p.load(fis);
	   
   }
	
	public String getUrl() throws Throwable {
	
		 String url = p.getProperty("url");
		 return url;		 
}
	public String getusername() throws Throwable {
	
		 String username = p.getProperty("username");
		 return username;		 
}
	public String getpassword ( ) throws Throwable {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getfirstname () {
	String firstname = p.getProperty("firstname");
	return firstname;
}
	public String getlastname ( ) {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getaddress( ) {
		String address = p.getProperty("address");
		return address;
	}
	
	public String getccnum () {
		String ccnum = p.getProperty("ccnum");
		return ccnum;
	}
	
	public String getcvv () {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
}