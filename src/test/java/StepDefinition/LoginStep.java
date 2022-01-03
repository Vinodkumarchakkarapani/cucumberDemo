package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("login page"); 
	}

	@When("the user enter valid username and password")
	public void the_user_enter_valid_username_and_password() {
		System.out.println("Entering the Data"); }

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println(" click login "); }

	@Then("the users should be navigated to home page")
	public void the_users_should_be_navigated_to_home_page() {
		System.out.println("move to home page"); }

}
