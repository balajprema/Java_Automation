package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	
	public static void Particular_Column() throws Throwable {
		 
		File f = new File("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Excel\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.getSheet("Details");
		Row row = sheet.getRow(1);
	
		for (Cell cell : row) {
			System.out.println(row);
		}

} 
public static void main(String[] args) throws Throwable {
		Particular_Column();
	}	
}
