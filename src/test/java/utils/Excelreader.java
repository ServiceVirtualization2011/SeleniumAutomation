package utils;

import  java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
 
import org.apache.poi.xssf.usermodel.XSSFRow;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {
	
	 
	public static class ExcelRows {
	 
	public static void main(String args[]) throws Exception
	 
	{
	 
	String path = "C:\\Users\\ashis\\eclipse-workspace\\Selenium_JavaFramework\\Excel\\userdata.xlsx";
	 
	// Open the Excel file
	 
	FileInputStream ExcelFile = new FileInputStream(path);
	 
	// Access the required test data sheet
	 
	@SuppressWarnings("resource")
	XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
	 
	XSSFSheet ExcelWSheet = ExcelWBook.getSheet("Sheet1");
	 
	int totalRows = ExcelWSheet.getPhysicalNumberOfRows();
	 
	System.out.println("Total number of Rows :::"+totalRows);
	 
	}
	 
	}
}
