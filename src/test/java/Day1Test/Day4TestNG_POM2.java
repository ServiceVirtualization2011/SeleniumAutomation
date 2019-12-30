// POM having Pageobject class for webelement locator and actions defined
// Benefits are clean code, easy maintain, less rework, obj seprated from test
// Every unique object locator is created only once.

package Day1Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class Day4TestNG_POM2 {

	 WebDriver driver = null;

	// using TestNG we don't need main method as needed for java.
	@BeforeTest
	public  void setupTest()
		{
			// setting up the system path
			String projectPath = System.getProperty("user.dir");
			System.out.println("ProjectPath = "+projectPath);
			System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver ();
		}
	@Test
	public void GooglechromeTestNG()
	{
			// Test started
			// Initialize driver object and invoke PO class constructor.
			GoogleSearchPageObjects searchpageObj = new GoogleSearchPageObjects(driver); 
			System.out.println("Test Started");
			driver.get("https://google.com");
			System.out.println("Title of Home page is"+driver.getTitle());
			searchpageObj.setTextInSearchBox("ABCD");
			searchpageObj.ClickSearchButton();
			
		}
	@AfterTest
	public void teardownTest()
	{
		driver.close();
		System.out.println("Test Ended");
	}
}
