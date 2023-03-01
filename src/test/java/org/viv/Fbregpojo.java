package org.viv;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbregpojo extends BaseClasss{
	//non parameterized constructor
	public Fbregpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createnewacc;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstnametxtbox;
	
	@FindBy(name="lastname")
	private WebElement secondnametextbox;
	
	@FindBy(name="reg_email__")
	private WebElement mobileoremailtextbox;
	
	@FindBy(name="reg_passwd__")
	private WebElement newpassword;
	

	public WebElement getCreatenewacc() {
		return createnewacc;
	}

	public WebElement getFirstnametxtbox() {
		return firstnametxtbox;
	}

	public WebElement getSecondnametextbox() {
		return secondnametextbox;
	}

	public WebElement getMobileoremailtextbox() {
		return mobileoremailtextbox;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

}
