package Day1Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Day6ExtentTestNG {

	ExtentHtmlReporter Reporter;
	ExtentReports extent;
	@BeforeSuite
	public void setup()
	{
		Reporter = new ExtentHtmlReporter("extent.html");
		extent =  new ExtentReports();
		extent.attachReporter(Reporter);
		
	}
	
	@Test
	public void test1() throws IOException
	{
		ExtentTest test = extent.createTest("MyFirstTest","Hello Ashish");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test2() throws IOException
	{
		ExtentTest test = extent.createTest("MyFirstTest","Hello Ashish");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test3() throws IOException
	{
		ExtentTest test = extent.createTest("MyFirstTest","Hello Ashish");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test4() throws IOException
	{
		ExtentTest test = extent.createTest("MyFirstTest","Hello Ashish");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test5() throws IOException
	{
		ExtentTest test = extent.createTest("MyFirstTest","Hello Ashish");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	
	@AfterSuite
	public void teardown()
	{
		extent.flush();
	}
	
}
