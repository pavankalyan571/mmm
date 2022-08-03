package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchdefination {
	
	@Given("I am on Tidewebsite")
	public void verifysearch() {
		System.out.println("Tide.com");
	}
		
		
		@When("I click on  search")
		public void verify() {
			System.out.println("search");
		}
			
			@And("hover on search")
			public void verifysh() {
				System.out.println("search");
			}
				
				@Then("should display search")
				public void verifyshr() {
					System.out.println("search");
				}
}



