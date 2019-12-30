package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	
	By button_search = By.name("btnK");

	// create a constructor with same name as class to call driver from test
	public GoogleSearchPageObjects(WebDriver driver)
	{
	// setting the value of driver here to the value coming from constructor
	this.driver = driver;	
	}
	
	public void setTextInSearchBox (String text)
    {
	 driver.findElement(textbox_search).sendKeys(text);
    }
 
	public void ClickSearchButton () {
	driver.findElement(button_search).sendKeys(Keys.RETURN);
    }
 
}