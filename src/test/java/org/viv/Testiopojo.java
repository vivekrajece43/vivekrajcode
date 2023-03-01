package org.viv;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testiopojo extends BaseClasss {
	//1.Non parameterized constructor
		public Testiopojo() {
			PageFactory.initElements(driver, this);
		}
			//2.private web elements
			
			@FindBy(id="user_email")
			private WebElement email;
			
			@FindBy(xpath="//input[@type='password']")
			private WebElement password;
			
			@FindBy(xpath="//input[@type='submit']")
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
