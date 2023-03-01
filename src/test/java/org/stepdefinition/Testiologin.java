package org.stepdefinition;

import org.base.BaseClasss;
import org.viv.Testiopojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testiologin extends BaseClasss {
	Testiopojo t;
	
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
	   windowMaximize();
	}

	@When("User has to hit the testio url")
	public void user_has_to_hit_the_testio_url() {
		launchUrl("https://cirro.io/users/sign_in");
	    
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		 t= new Testiopojo();
		 passText(em, t.getEmail());
		 
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String password) {
		t= new Testiopojo();
		passText(password, t.getPassword());
	    
	}

	@When("User has to click  login button")
	public void user_has_to_click_login_button() {
		t= new Testiopojo();
		clickBtn(t.getLoginbtn());
	    
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	   
	}



}
