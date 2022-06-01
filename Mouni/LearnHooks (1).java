package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LearnHooks {

	@Before
	public void setUp() {
		System.out.println("Before any scenario");
	}
	
	@After
	public void tearDown() {
		System.out.println("After any scenario");
	}
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("User is on home page");
	}

	@Then("Enter username")
	public void enter_username() {
		System.out.println("User is on home page");

	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		System.out.println("click on submit button");

	}

	@Given("enter all the mandatory field values")
	public void enter_all_the_mandatory_field_values() {
		System.out.println("enter all the mandatory field values");

	}

	@Then("click on registry page submit button")
	public void click_on_registry_page_submit_button() {
		System.out.println("click on registry page submit button");

	}

	@Then("verify new user entry on web table")
	public void verify_new_user_entry_on_web_table() {
		System.out.println("verify new user entry on web table");

	}

	@Given("enter the {string} into email box")
	public void enter_the_into_email_box(String string) {
		System.out.println("enter the {string} into email box");

	}

	@Then("click on submit button to verify the username")
	public void click_on_submit_button_to_verify_the_username() {
		System.out.println("click on submit button to verify the username");

	}
}
