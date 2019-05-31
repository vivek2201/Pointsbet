package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectDirectory.Base;
import Pointsbet.DepositPage;
import Pointsbet.HomePage;
import Pointsbet.LandingPage;
import Pointsbet.LoginFunction;
import Pointsbet.LoginWindow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends Base{
	
		
	   
	
	@Given("^user is created with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_is_created_with_and_password(String arg1, String arg2) throws Throwable {
	    
		LoginFunction loginfunction=new LoginFunction(Base.driver);
		loginfunction.login(arg1,arg2);
		
	}
	

	@Given("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is logged in");
	}
	
	@When("^Click on right menu$")
	public void click_on_right_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000L);
		HomePage homepage=new HomePage(Base.driver);
		homepage.clickOnMenu().click();
	   
	}

	@When("^Click on Deposit button$")
	public void click_on_Deposit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage=new HomePage(Base.driver);
		homepage.clickOnDeposit().click();
	   
	 
	}

	@When("^Click on Other Methods$")
	public void click_on_Other_Methods() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnOtherMethod().click();
		
	
	}

	@When("^Click on Credit/debit Card option$")
	public void click_on_Credit_debit_Card_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnCreditCard().click();
	    
	}

	@When("^Enter Cardnumber \"([^\"]*)\" and Expiry date \"([^\"]*)\" and CVV \"([^\"]*)\" and Amount \"([^\"]*)\"$")
	public void enter_Cardnumber_and_Expiry_date_and_CVV_and_Amount(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.CardDetails(arg1,arg2,arg3,arg4);
	    
	 
	}

	@When("^Hit the Deposit button$")
	public void hit_the_Deposit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnDepositButton().click();
		Thread.sleep(4000L);
	
		
	   
	}

	@Then("^Deposit should successfully happen$")
	public void deposit_should_successfully_happen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Deposit is done");
	  
	}
	
	@When("^Click on Online banking$")
	public void click_on_Online_banking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnOnlineBanking().click();
	    
	}

	@When("^Click on Other banks$")
	public void click_on_Other_banks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnOtherBank().click();
	}

	@When("^Enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.enterDemoText(arg1);
	    
	}

	@When("^Click on demo bank$")
	public void click_on_demo_bank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnDemoBank().click();
	}







	


}
