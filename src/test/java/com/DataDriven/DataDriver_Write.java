package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_Write {
	
	public static void Write_Data() throws Throwable {
		File f = new File("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Excel\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("Details");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Kruthi");
		w.getSheet("Details").getRow(0).createCell(1).setCellValue("123");
		w.getSheet("Details").createRow(1).createCell(0).setCellValue("Revathi");
		w.getSheet("Details").getRow(1).createCell(1).setCellValue("Rev#1223");
		w.getSheet("Details").createRow(2).createCell(0).setCellValue("Balaji");
		w.getSheet("Details").getRow(2).createCell(1).setCellValue("Balaj&678");
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();

	}
	
	public static void main(String[] args) throws Throwable {
		Write_Data();
	}
}
