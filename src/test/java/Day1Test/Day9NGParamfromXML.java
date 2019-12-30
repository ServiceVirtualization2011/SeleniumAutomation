package Day1Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day9NGParamfromXML {

	WebDriver driver ;
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	String projPath = System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("Inside setup step checking browser name");
		if (browserName.equalsIgnoreCase("chrome"))	
		 {
			System.setProperty("webdriver.chrome.driver",projPath+"/Drivers/chromedriver.exe");
				driver = new ChromeDriver ();
		 }
		 else if (browserName.equalsIgnoreCase("firefox"))
		 {
			System.setProperty("webdriver.gecko.driver",projPath+"\\Drivers\\geckodriver.exe");
			driver =new FirefoxDriver(); 
		 }
	}
	@Test
	public void test1()
	{
		System.out.println("Inside Main test1");
		logger.info("info logger for Test");
		System.out.println("Thread count is:"+ Thread.currentThread().getId());
		driver.get("http://google.com");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("Inside tear down step");
		driver.close();
		logger.info("info logger for Browser closed");
		Reporter.log("Reporter log for test");
		System.out.println("Browser has been closed");
	}
	
	
	
}
