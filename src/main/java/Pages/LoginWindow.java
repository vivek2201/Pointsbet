package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWindow {
	public WebDriver driver=null;
	

	public LoginWindow(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//driver.findElement(By.id("login-button")).click();


	public WebElement enterusername() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//input[@id='login-username']"));
		
		
	}

	public WebElement enterPassword() {
		// TODO Auto-generated method stub
	return	driver.findElement(By.xpath("//input[@id='Password']"));
		
	}

	public WebElement hitButton() {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("login-button"));
	}
	
	

}
