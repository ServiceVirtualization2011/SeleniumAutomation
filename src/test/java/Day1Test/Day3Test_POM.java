// POM having Pageobject class for web element locator and actions defined
// Benefits are clean code, easy maintain, less rework, obj seprated from test
// Every unique object locator is created only once.
 
package Day1Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObjects;

public class Day3Test_POM {

	private static WebDriver driver = null;
	public static String browserName = null;
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
			try {
				googleSearchTest();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void googleSearchTest() throws IOException
		{
		String projectPath = System.getProperty("user.dir");
		Day8ReadPropFile.getproperties();
		 if (browserName.equalsIgnoreCase("chrome"))	
		 {
			// setting up the system path
				
				System.out.println("ProjectPath = "+projectPath);
				System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver.exe");
				driver = new ChromeDriver ();
		 }
		 else if (browserName.equalsIgnoreCase("firefox"))
		 {
			System.setProperty("webdriver.gecko.driver",projectPath+"\\Drivers\\geckodriver.exe");
			driver =new FirefoxDriver(); 
		 }
			// Initialize driver object and invoke PO class constructor.
			
			GoogleSearchPageObjects searchpageObj = new GoogleSearchPageObjects(driver); 
			logger.info("Browser Started");
			// Test started
			System.out.println("Test Started");
			driver.get("https://google.com");
			searchpageObj.setTextInSearchBox("ABCD");
			searchpageObj.ClickSearchButton();
			driver.close();
			System.out.println("Test Ended");
			//Day8ReadPropFile.setproperties();
		}

}
