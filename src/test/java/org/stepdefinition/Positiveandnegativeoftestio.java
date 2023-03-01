package org.stepdefinition;

import org.base.BaseClasss;

import org.viv.Testiopojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Positiveandnegativeoftestio extends BaseClasss {
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the url of the testio application")
	public void to_launch_the_url_of_the_testio_application() {
		launchUrl("https://cirro.io/users/sign_up/test-io");
	   
	}

	@When("To pass invalid username in password field")
	public void to_pass_invalid_username_in_password_field() {
		Testiopojo t = new Testiopojo();
		passText("jhghgfdt", t.getPassword() );
	    
	}

	@When("check whether it navigate to the homepage or not")
	public void check_whether_it_navigate_to_the_homepage_or_not() {
		System.out.println("check the login credntilas");
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
	  closeEntireBrowser();
	}

	@When("user has to hit the testio url")
	public void user_has_to_hit_the_testio_url() {
		launchUrl("https://cirro.io/users/sign_up/test-io");
	    
	}

	@When("user has to pass the data {string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		Testiopojo t = new Testiopojo();
		passText("pass",t.getPassword());
	    
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		Testiopojo t = new Testiopojo();
		clickBtn(t.getLoginbtn());
	   
	}



}