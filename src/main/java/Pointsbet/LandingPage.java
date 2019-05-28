package Pointsbet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectDirectory.Base;

public class LandingPage{
public WebDriver driver;

	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	WebElement pushnotification=driver.findElement(By.xpath("//button[@class='ab-message-button'][2]"));
	
	public WebElement pushnotication()
	{
		return pushnotification;
	}
	
	
	

}
