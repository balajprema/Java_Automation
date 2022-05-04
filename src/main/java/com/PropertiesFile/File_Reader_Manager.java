package com.PropertiesFile;

public class File_Reader_Manager {
	
	//constructor
	private File_Reader_Manager() {
		
	}
	
	
	// static method
	public static File_Reader_Manager getInstancefrm() {
		File_Reader_Manager fr = new File_Reader_Manager();
		return fr;

	} 
	
	//non static method
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr  = new Configuration_Reader();         
		return cr;
	}

	
	
}
