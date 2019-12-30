package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	// we are creating a customized construction to get the wb and sheet name
	// create a constructor there is no return type for construction same name
	 public ExcelUtils (String excelPath, String sheetName)
	 {
		 try {
			 projpath = System.getProperty("user.dir");
			 workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
				 
	 }

	public static void main(String[] args) {
		//getRowCounts();
		//getCellDataString(0,0);
		//getCellDataNumber(1,1);
	}

	public int getRowCounts()
	{	
		int rowCount =sheet.getPhysicalNumberOfRows();
		System.out.println("The number of rows :"+ sheet.getPhysicalNumberOfRows());
		return rowCount;
	}
	
	public  int getColCounts()
	{	
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The number of column :"+ sheet.getRow(0).getPhysicalNumberOfCells());
		return colCount;
	}
	

	public String getCellDataString(int rowNum, int colNum)
	{
			String celldata =sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(celldata);
			return celldata;
	}
	public double getCellDataNumber(int rowNum, int colNum)
	{
		double celldatanum =sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println(celldatanum);
		return celldatanum;
	}

}
