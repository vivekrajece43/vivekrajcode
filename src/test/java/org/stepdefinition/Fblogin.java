package org.stepdefinition;

import org.base.BaseClasss;
import org.viv.Fbloginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends BaseClasss {
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/login/");

	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		Fbloginpojo f = new Fbloginpojo();
		passText("vivekrajtnstc2gmail.com",f.getEmail());
		
	  
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		Fbloginpojo f = new Fbloginpojo();
		passText("1234", f.getPassword());
	
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   Fbloginpojo f = new Fbloginpojo();
	   clickBtn(f.getLoginbtn());
	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
		System.out.println(" to check your credentials");
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	  
	}



}
