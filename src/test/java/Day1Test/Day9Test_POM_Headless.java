// POM having Pageobject class for web element locator and actions defined
// Benefits are clean code, easy maintain, less rework, obj seprated from test
// Every unique object locator is created only once.
 
package Day1Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import okio.Options;
import pages.GoogleSearchPageObjects;

public class Day9Test_POM_Headless {

	
	private static WebDriver driver = null;
		
	public static String browserName2 = null;
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
		System.out.println("inside the test");
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		Day8ReadPropFile.getproperties();
		 if (browserName2.equalsIgnoreCase("chrome"))	
		 {
			// setting up the system path
				
				System.out.println("ProjectPath = "+projectPath);
				System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver.exe");
				DesiredCapabilities cap = new DesiredCapabilities();
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.merge(cap);// we can merge them
				driver = new ChromeDriver ();
				//ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.setHeadless(true);
		 }
		 else if (browserName2.equalsIgnoreCase("firefox"))
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
