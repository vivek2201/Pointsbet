package Pointsbet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	public WebDriver driver=null;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	public WebElement findUsername() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//span[@class='hidden-xs ng-binding']"));
		
	}

	public WebElement  clickOnMenu() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000L);
		return driver.findElement(By.xpath("//button[@ng-click='$ctrl.toggleNav($ctrl.navItems.user)']"));
		
	}

	public WebElement clickOnDeposit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000L);
		return driver.findElement(By.xpath(" //nav[@id='user-nav']//a[@href='/account/deposit']"));
		
	
	}
	

}
