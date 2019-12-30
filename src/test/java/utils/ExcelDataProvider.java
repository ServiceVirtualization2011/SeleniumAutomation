package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider
{
	
	/*
	 * //main method to call testdata method not required if dataprovider is build
	 * public static void main(String[] args) { String projpath =
	 * System.getProperty("user.dir"); String excelPath
	 * =projpath+"\\Excel\\orangeCRM.xlsx"; testData(excelPath,"Sheet1"); }
	 */
	 
	
	  @Test(dataProvider="test1data")
	  public void Test1(String username, String password)
	  { System.out.println(username +"|"+ password); }
	 
	
	@DataProvider (name="test1data")
	public Object[][] getData ()
	{
		String projpath = System.getProperty("user.dir");
		 String excelPath =projpath +"\\Excel\\orangeCRM.xlsx";
		testData(excelPath,"Sheet1");
		Object data[][] = testData(excelPath,"Sheet1");
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName)
	{
	 ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
			 int rowCount = excel.getRowCounts();
			 int colCount = excel.getColCounts();
			 
			 Object data[][] = new Object[rowCount-1][colCount];
			 
			 for (int i=1;i<rowCount; i++) {
				 for (int j=0; j<colCount; j++)
				 {
					 String celldata =excel.getCellDataString(i, j);
					 System.out.print(celldata +"|");
					 data[i-1][j]= celldata;
				 }
				 System.out.println();
			 }
			 return data;
}
}
