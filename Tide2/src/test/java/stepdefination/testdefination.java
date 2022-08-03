package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testdefination {
	@Given("I am on Tidewebsite")
	public void verifyshop() {
		System.out.println("Tide.com");
	}
		
		
		@When("I click on  shopproducts")
		public void verify() {
			System.out.println("shopproducts");
		}
			
			@And("hover on shopproducts")
			public void verifyTide() {
				System.out.println("shopproducts");
			}
				
				@Then("should display shopproducts")
				public void verifyproducts() {
					System.out.println("shopproducts");
				}
}
