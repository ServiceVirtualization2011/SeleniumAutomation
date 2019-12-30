package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils_Hardcd {

	static String projpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getRowCounts();
		getCellDataString();
		getCellDataNumber();
	}

	public static void getRowCounts()
	{	
		try {
			workbook = new XSSFWorkbook(projpath+"\\Excel\\userdata.xlsx");
			sheet = workbook.getSheet("Sheet1");
			System.out.println("The number of rows :"+ sheet.getPhysicalNumberOfRows());
		} catch (IOException e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}

	public static void getCellDataString()
	{
		try {
			workbook = new XSSFWorkbook(projpath+"\\Excel\\userdata.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String celldata =sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(celldata);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void getCellDataNumber()
	{
		try {
			workbook = new XSSFWorkbook(projpath+"\\Excel\\userdata.xlsx");
			sheet = workbook.getSheet("Sheet1");
			 double celldatanum =sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(celldatanum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
