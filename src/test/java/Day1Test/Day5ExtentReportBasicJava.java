package Day1Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
// Arun how to use the constructer here for POM
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPageObjects;

public class Day5ExtentReportBasicJava {

	private static WebDriver driver = null;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter Reporter = new ExtentHtmlReporter("extent.html");
		// create ExtentReport and attach reporters
		ExtentReports extent =  new ExtentReports();
		extent.attachReporter(Reporter);
		
		
		// creates a toggle for the given test, add all log events
		ExtentTest test = extent.createTest("MyFirstTest","Hello Ashish");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath = "+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver.exe");
		System.out.println("Test Started");
		test.log(Status.INFO, "Starting test case");
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchpageObj = new GoogleSearchPageObjects(driver); 
		
		driver.get("https://google.com");
		test.pass("Navigated to Google.com");
		//driver.findElement(By.name("q")).sendKeys("Ashish Sharma");
		searchpageObj.setTextInSearchBox("ABCD");
		test.pass("Entered text in search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//searchpageObj.ClickSearchButton();
		test.pass("pressed enter key via keyboard");
		driver.close();
		test.pass("closed the borwser");
		System.out.println("Test Ended");
		test.info("Test completed");
		extent.flush();
	}

}
