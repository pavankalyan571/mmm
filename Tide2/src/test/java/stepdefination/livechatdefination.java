package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class livechatdefination {
	
	@Given("I am on Tidewebsite")
	public void verifylive() {
		System.out.println("Tide.com");
	}
		
		
		@When("I click on  livechat")
		public void verify() {
			System.out.println("livechat");
		}
			
			@And("hover on livechat")
			public void verifylivechat() {
				System.out.println("shopproducts");
			}
				
				@Then("should display livechat")
				public void verifychat() {
					System.out.println("livechat");
				}
}


