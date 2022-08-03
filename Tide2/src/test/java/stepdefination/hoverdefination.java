package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hoverdefination {
	
	@Given("I am on Tidewebsite")
	public void verify() {
		System.out.println("Tide.com");
	}
		
		
		@When("I click on  shopproducts")
		public void verifywt() {
			System.out.println("whiteness");
		}
			
			@And("hover on whiteness")
			public void verifywhiteness() {
				System.out.println("whiteness");
			}
				
				@Then("should display whiteness")
				public void verifywtn() {
					System.out.println("whiteness");
				}
}



