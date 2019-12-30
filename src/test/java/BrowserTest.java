import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	// main press ctrl+space this will create a main class 
	
	public static void main(String[] args) {
		// setting up the system path
		String projectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath = "+projectPath);
		
		// Gecko driver
		// provide the absolute path of driver
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\ashis\\eclipse-workspace\\Selenium_JavaFramework\\Drivers\\geckodriver.exe");
		
		// provide the relative path of driver
		//System.setProperty("webdriver.gecko.driver",projectPath+"\\Drivers\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		// Chrome Driver
		// Windows,MAC,LINUX paths change "\\" double backslash to '/' single forward slash to make in OS independent as \\ works only in windows.
		System.setProperty("webdriver.chrome.driver","C:/Users/ashis/eclipse-workspace/Selenium_JavaFramework/Drivers/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		// IE Driver
		//System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		
		System.out.println("Test has started opening the Driver");
		driver.get("https://mvnrepository.com/");
		driver.findElement(By.className("textfield")).sendKeys("Webdrivermanager");
		driver.findElement(By.className("button")).submit();
		//driver.close();
		System.out.println("Test Completed");
	}

}
