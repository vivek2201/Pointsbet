package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectDirectory.Base;

public class LandingPage{
public WebDriver driver=null;

	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement pushnotication() throws InterruptedException
	{
		Thread.sleep(5000L);
		return driver.findElement(By.xpath("//button[@class='ab-message-button'][2]"));
	}


	public WebElement loginButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000L);
		return driver.findElement(By.xpath("//button[@ng-click='$ctrl.openLoginModal()']"));
	}


	
	

}
