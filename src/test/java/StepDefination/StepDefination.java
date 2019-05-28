package StepDefination;

import ObjectDirectory.Base;
import Pointsbet.LandingPage;
import cucumber.api.java.en.Given;

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



	


}
