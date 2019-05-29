package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectDirectory.Base;
import Pointsbet.HomePage;
import Pointsbet.LandingPage;
import Pointsbet.LoginWindow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends Base{
	
		@Given("^User landedv to the site$")
	public void user_landedv_to_the_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browserOpening();
		
	   
	}
	@Given("^Click on the Push notifaction message$")
	public void click_on_the_Push_notifaction_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage landingpage=new LandingPage(Base.driver);
		landingpage.pushnotication().click();

			}
	
	@Given("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage landingpage=new LandingPage(Base.driver);
		landingpage.loginButton().click();
	 
	}
	@When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginWindow loginwindow=new LoginWindow(Base.driver);
		loginwindow.enterusername().sendKeys(arg1);;
		loginwindow.enterPassword().sendKeys(arg2);;
		
	    
	}

	@When("^Hit the Login Button$")
	public void hit_the_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginWindow loginwindow=new LoginWindow(Base.driver);
		loginwindow.hitButton().click();
	    
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage=new HomePage(Base.driver);
		System.out.println(homepage.findUsername().getText());
		
	   
	}
	@Given("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is logged in");
	}
	
	@When("^Click on right menu$")
	public void click_on_right_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
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
	
	}

	@When("^Click on Credit/debit Card option$")
	public void click_on_Credit_debit_Card_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Enter Cardnumber \"([^\"]*)\" and Expiry date \"([^\"]*)\" and CVV \"([^\"]*)\" and Amount \"([^\"]*)\"$")
	public void enter_Cardnumber_and_Expiry_date_and_CVV_and_Amount(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^Hit the Deposit button$")
	public void hit_the_Deposit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Deposit should successfully happen$")
	public void deposit_should_successfully_happen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}







	


}
