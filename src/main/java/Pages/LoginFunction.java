package Pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectDirectory.Base;

public class LoginFunction extends Base{
	
	public WebDriver driver=null;

	public LoginFunction(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String username,String password) throws FileNotFoundException, IOException, InterruptedException
	{
		browserOpening();
		LandingPage landingpage=new LandingPage(Base.driver);
		landingpage.pushnotication().click();
		landingpage.loginButton().click();
		userdeatils(username,password);
		LoginWindow loginwindow=new LoginWindow(Base.driver);
		loginwindow.hitButton().click();
		
		
		
	}
	public void userdeatils(String arg1, String arg2) {
		
		// TODO Auto-generated method stub
		LoginWindow loginwindow=new LoginWindow(Base.driver);
		loginwindow.enterusername().sendKeys(arg1);;
		loginwindow.enterPassword().sendKeys(arg2);;
		
	}

}
