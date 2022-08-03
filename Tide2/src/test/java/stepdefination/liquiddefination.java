package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class liquiddefination {
	
	@Given("I am on Tidewebsite")
	public void verifytide() {
		System.out.println("Tide.com");
	}
		
		
		@When("I click on  liquid")
		public void verify() {
			System.out.println("liquid");
		}
			
			@And("hover on liquid")
			public void verifylq() {
				System.out.println("liquid");
			}
				
				@Then("should display liquid")
				public void verifyliquid() {
					System.out.println("liquid");
				}}
