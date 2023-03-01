package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClasss;
import io.cucumber.datatable.*;
import org.viv.Fbregpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbregistration extends BaseClasss {
	Fbregpojo f;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
		
	   
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		f=new Fbregpojo();
		clickBtn(f.getCreatenewacc());
	    
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(30000);
		Map<String, String> m = d.asMap(String.class, String.class);
		f=new Fbregpojo();
		passText(m.get("firstname2"),f.getFirstnametxtbox());
	    
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		f=new Fbregpojo();
		passText("mahalingam",f.getSecondnametextbox());
	   
	}

	@When("To pass mobilenumber or email in email text box")
	public void to_pass_mobilenumber_or_email_in_email_text_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		f=new Fbregpojo();
		passText(m.get(1).get("password1"),f.getMobileoremailtextbox());
	    
	}

	@When("To create new password using new passwordtext box")
	public void to_create_new_password_using_new_passwordtext_box() {
		f=new Fbregpojo();
		passText("hjkghssj", f.getNewpassword());
	   
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		f=new Fbregpojo();
		closeEntireBrowser();
	   
	}


	

}
