package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		String projpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projpath+"\\Excel\\userdata.xlsx", "Sheet1");
		excel.getRowCounts();
		excel.getColCounts();
		System.out.println(excel.getCellDataNumber(1, 1));
		System.out.println(excel.getCellDataString(0, 0));
		
	}

}
