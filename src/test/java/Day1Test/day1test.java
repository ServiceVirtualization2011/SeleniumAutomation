package Day1Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1test {

	public static void main (String[] args )
	{
		googlesearch();  
// Test method and locator are written in google search class and not in main class thus need to be called.
		
	}
	
	public static void googlesearch () 
	{
		System.out.println("Test started");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/ashis/eclipse-workspace/Selenium_JavaFramework/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:google.com");
		driver.findElement(By.name("q")).sendKeys("Ashish Sharma");
		///driver.findElement(By.name("btnK")).click(); /// this is not working as text is getting overlapped
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test completed");
	
	}	
}