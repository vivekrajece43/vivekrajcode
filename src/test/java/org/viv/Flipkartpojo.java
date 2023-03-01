package org.viv;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartpojo extends BaseClasss {

	
	//1.Non parameterized constructor
		public Flipkartpojo() {
			PageFactory.initElements(driver, this);
		}
			//2.private web elements
			
			@FindBy(id="inputEmail")
			private WebElement email;
			
			@FindBy(xpath="//input[@type='password']")
			private WebElement password;
			
			@FindBy(id="submitLogin")
			private WebElement loginbtn;
			
			//3.Getters to access webelements outside the class
			public WebElement getEmail() {
				return email;
			}

			public WebElement getPassword() {
				return password;
			}

			public WebElement getLoginbtn() {
				return loginbtn;
			}

			
}
