package org.stepdefinition;

import org.base.BaseClasss;
import org.viv.Bestopojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestobites extends BaseClasss{
	Bestopojo j;
	@Given("To launch the chrome browser and maximize the window of besto app")
	public void to_launch_the_chrome_browser_and_maximize_the_window_of_besto_app() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the besto app")
	public void to_launch_the_url_of_the_besto_app() {
		launchUrl("https://bistrobitesdc.com/");
	   
	}

	@When("To click the account button")
	public void to_click_the_account_button() {
		j= new Bestopojo();
		clickBtn(j.getAccountclick());
	   
	}

	@When("To pass invalid username in phone field of besto app")
	public void to_pass_invalid_username_in_phone_field_of_besto_app() {
		j= new Bestopojo();
		passText("786545634453",j.getUsername());
	    
	}

	@When("To pass invalid password in password field of besto app")
	public void to_pass_invalid_password_in_password_field_of_besto_app() {
		j= new Bestopojo();
		passText("123445", j.getPasswd());
	   
	}

	@When("To click the login button of besto app")
	public void to_click_the_login_button_of_besto_app() {
		j= new Bestopojo();
		clickBtn(j.getClicklogin());
	   
	}

	@When("To check the output of besto app")
	public void to_check_the_output_of_besto_app() {
		j= new Bestopojo();
	   System.out.println("to check the output");
	}

	@Then("close the browser of besto app")
	public void close_the_browser_of_besto_app() {
		j= new Bestopojo();
		
	    
	}

	@When("user hits the url of besto app")
	public void user_hits_the_url_of_besto_app() {
		j= new Bestopojo();
		launchUrl("https://bistrobitesdc.com/");
	    
	}

	@When("user select the  dosa in dropdown labeled")
	public void user_select_the_dosa_in_dropdown_labeled() throws InterruptedException {
		Thread.sleep(3000);
		j= new Bestopojo();
		clickBtn(j.getClickdosa());
	   
	}

	@When("user select the masala dosa in list")
	public void user_select_the_masala_dosa_in_list() {
		j= new Bestopojo();
		clickBtn(j.getClkmasaladosa());
	   
	}

	@When("user check the available time")
	public void user_check_the_available_time() {
		j= new Bestopojo();
	   System.out.println("check the item near");
	}




}
