package Day1Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class Day2Test_Import_pages_Class {

	static WebDriver driver = null;  // defining driver variable at class level to be used across the Dev2Test class has to be static and private
	
	public static void main (String[] args )
	{
		googlesearch();  
// Test method and locator are written in google search class and not in main class thus need to be called.
		
	}
	
	public static void googlesearch () 
	{
		System.out.println("Test started");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/ashis/eclipse-workspace/Selenium_JavaFramework/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();   
		// go to google.com
		driver.get("https:google.com");
		
		//enter the text in search textbox
		GoogleSearchPage.textbox_search(driver).sendKeys("Ashish Sharma");
		
		//driver.findElement(By.name("q")).sendKeys("Ashish Sharma");  now we getting this web element from page class
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click on search button		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		System.out.println("Test completed");
	
		// close the browser
		driver.close();
	}	
}