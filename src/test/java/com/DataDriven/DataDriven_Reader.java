package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Reader {

	public static void all_Data() throws Throwable {
		System.out.println("** ALL DATA ***");
		File f = new File("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Excel\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		// Interface
		Workbook w = new XSSFWorkbook(fis); // upcasting
		Sheet sheet = w.getSheetAt(0);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheet.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);

				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int num = (int) numericCellValue; // narrowing type casting
					System.out.println(num);
				}
			}
		}
	}

	public static void Particular_Data() throws Throwable {

		System.out.println("** PARTICULAR DATA **");
		File f = new File("C:\\Users\\user\\eclipse-workspace-new\\Maven_Project\\Excel\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num = (int) numericCellValue;
			System.out.println(num);
		}

	}

	public static void main(String[] args) throws Throwable {
		all_Data();
		Particular_Data();
	}
}
