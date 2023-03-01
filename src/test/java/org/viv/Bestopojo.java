package org.viv;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bestopojo extends BaseClasss {
	
		public Bestopojo() {
		PageFactory.initElements(driver, this);
		}

	//private web elements
	@FindBy (xpath="//i[@class='fa fa fa-user']")
	private WebElement accountclick;
	
	@FindBy (id="phone")
	private WebElement username;
	
   @FindBy (id="password")
   private WebElement passwd;
   
   @FindBy (name="login")
   private WebElement clicklogin;
   
   @FindBy (xpath="//span[text()='Dosa']")
   private WebElement clickdosa;
   
   @FindBy (name="//h2[text()='Masala Dosa']")
   private WebElement clkmasaladosa;
   
   @FindBy (xpath="//i[@class='fa fa fa-user']")
   private WebElement accountclic;
   
   @FindBy (id="name")
   private WebElement entername;
   
   @FindBy (name="email")
   private WebElement enteremail;
   
   @FindBy (id="phone")
   private WebElement phonenumber;
   
   @FindBy(id="password_reg")
   private WebElement pwd;
   
   @FindBy (name="login")
   private WebElement log;
   
   @FindBy (id="lte-top-search-ico")
   private WebElement search;
   
   @FindBy (xpath="(//input[@placeholder='Search'])[1]")
   private WebElement typeproduct;

public WebElement getAccountclick() {
	return accountclick;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPasswd() {
	return passwd;
}

public WebElement getClicklogin() {
	return clicklogin;
}

public WebElement getClickdosa() {
	return clickdosa;
}

public WebElement getClkmasaladosa() {
	return clkmasaladosa;
}

public WebElement getAccountclic() {
	return accountclic;
}

public WebElement getEntername() {
	return entername;
}

public WebElement getEnteremail() {
	return enteremail;
}

public WebElement getPhonenumber() {
	return phonenumber;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLog() {
	return log;
}

public WebElement getSearch() {
	return search;
}

public WebElement getTypeproduct() {
	return typeproduct;
}
   
 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
