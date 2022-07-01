package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is login page")
	public void user_is_login_page() {
		System.out.println("inside login page");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Hello world");

	}

	@And("clicks login button")
	public void clicks_login_button() {
		System.out.println("inside login page enter click button");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside login page user able to see browser");

	}


}
