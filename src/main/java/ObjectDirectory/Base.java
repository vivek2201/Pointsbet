package ObjectDirectory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Base {
	
	public static WebDriver driver=null;
	
	public void browserOpening() throws IOException,FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.singhal\\MavenProject\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		System.out.println("not finding chromedriver");
		Properties prop=new Properties();
		System.out.println("not finding file");
		FileInputStream fis=new FileInputStream("C:\\Users\\priya\\Pointsbet\\src\\main\\java\\ObjectDirectory\\Sorce.properties");
		
		prop.load(fis);
		String browser=prop.getProperty("Browser");
		String URL=prop.getProperty("URL");
		//Assert.assertEquals(prop.getProperty("URL"),"https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		if(browser.equals("Chrome"))
		{
		driver= new ChromeDriver();
	    driver.get(URL);
		}	
	}
	
	
	

}
