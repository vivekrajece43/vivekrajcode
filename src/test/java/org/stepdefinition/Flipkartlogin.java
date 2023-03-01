package org.stepdefinition;

import org.base.BaseClasss;
import org.openqa.selenium.By;
import org.viv.Flipkartpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Flipkartlogin extends BaseClasss {
	Flipkartpojo f;
	
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
		  
	}

	@When("user has to hit the flipkart url")
	public void user_has_to_hit_the_flipkart_url() {
		launchUrl("https://affiliate.flipkart.com/login");
	   
	}

	@When("user has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f= new Flipkartpojo();
		passText(em, f.getEmail());
		
		
	   }
	
	@When("user has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		f = new Flipkartpojo();
		passText(pass, f.getPassword());
	   
	}

	@When("user to click the login button in flipkart app")
	public void user_to_click_the_login_button_in_flipkart_app() {
		f = new Flipkartpojo();
		clickBtn(f.getLoginbtn());
	    
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	    
	}
}