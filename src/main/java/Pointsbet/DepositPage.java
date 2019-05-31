package Pointsbet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ObjectDirectory.Base;

public class DepositPage {
	public WebDriver driver=null;
	@FindBy(xpath="//div[contains(text(), 'Other Methods')]")
	WebElement OtherButton;
	
	@FindBy(xpath="//div[contains(text(), 'Credit/Debit Card')]")
	WebElement CreditCardOption;
	
	@FindBy(xpath="//input[@id='card-number']")
	WebElement cardNumber;
	@FindBy(xpath="//input[@id='expiry-date']")
	WebElement expirydate;
	@FindBy(xpath="//input[@id='cvv']")
	WebElement cvv;
	@FindBy(xpath="//h2[contains(text(),'Deposit Amount')]/following :: div/input[@type='tel']")
	WebElement Amount;
	
	@FindBy(xpath="//button[contains(text(),'Deposit')]")
	WebElement depositButton;
	
	
	@FindBy(xpath="//div[contains(text(),'Online Banking')]")
	WebElement onlineBanking;
	@FindBy(xpath="//div[contains(@title,'Search through thousands of banks and credit unions')]")
	WebElement otherBank;
	
	@FindBy(xpath="//input[@id='bank-list-search-input']")
	WebElement demobank;
	
	@FindBy(xpath="//div[@class='bank-list--item-logo']/div[contains(@title,'Demo Bank')]")
	WebElement selectDemoBank;


	public DepositPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement clickOnOtherMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return OtherButton;
	}


	public WebElement clickOnCreditCard() {
		// TODO Auto-generated method stub
		return CreditCardOption;
	}
	
	public void enterCardIframe() throws InterruptedException
	{
		Thread.sleep(5000L);
		WebElement debitcardFrame =driver.findElement(By.xpath("//iframe[@title='Card number']"));
		driver.switchTo().frame(debitcardFrame);
	}
	public void CardDetails(String arg1, String arg2, String arg3, String arg4) throws InterruptedException {


		entercardNumber(arg1);
		enterexpiryDate(arg2);
		enterCvv(arg3);
		amount(arg4);
		}
	
	private void entercvvFrame() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000L);
		WebElement dateFrame =driver.findElement(By.xpath("//iframe[@title='CVV']"));
		driver.switchTo().frame(dateFrame);
		
	}


	private void enterdateFrame() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000L);
		WebElement dateFrame =driver.findElement(By.xpath("//iframe[@title='MM / YY']"));
		driver.switchTo().frame(dateFrame);
	}


	public void entercardNumber(String arg1) throws InterruptedException
	{
		 Thread.sleep(4000L);
	     enterCardIframe();
	     Thread.sleep(3000L);
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.cardNumber.sendKeys(arg1);
		driver.switchTo().defaultContent();
	}
	public void enterexpiryDate(String arg2) throws InterruptedException
	{
		enterdateFrame();
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.expirydate.sendKeys(arg2);
		driver.switchTo().defaultContent();
	}
	public void enterCvv(String arg3) throws InterruptedException
	{
		entercvvFrame();
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.cvv.sendKeys(arg3);
		driver.switchTo().defaultContent();
	}
	public void amount(String arg4)
	{
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.Amount.sendKeys(arg4);
	}


	public WebElement clickOnDepositButton() {
		// TODO Auto-generated method stub
		return depositButton;
	}


	public WebElement clickOnOnlineBanking() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return onlineBanking;
		
	}


	public WebElement clickOnOtherBank() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3500L);
		enterOtherBankIframe();
		return otherBank;
	}


	

	public void enterDemoText(String arg1) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5500L);
		enterPaywithMyBankIframe();
		demobank.sendKeys(arg1);
		driver.switchTo().defaultContent();
		
		
	}
	public void enterPaywithMyBankIframe() throws InterruptedException
	{
		Thread.sleep(5000L);
		WebElement payWithMyBankFrame =driver.findElement(By.xpath("//div[@id='paywithmybank-panel']//iframe[@title='PayWithMyBank']"));
		driver.switchTo().frame(payWithMyBankFrame);
	}
	public void enterOtherBankIframe() throws InterruptedException
	{
		Thread.sleep(5000L);
		WebElement otherBankFrame =driver.findElement(By.xpath("//iframe[@id='paywithmybank-iframe-widget-container']"));
		driver.switchTo().frame(otherBankFrame);
	}



	public WebElement clickOnDemoBank() throws InterruptedException {
		// TODO Auto-generated method stub
		enterPaywithMyBankIframe();
		return selectDemoBank;
	}
	
	
	
	
	

}
