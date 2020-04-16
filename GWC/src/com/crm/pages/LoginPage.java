package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Generic.BaseTest;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='email']")private WebElement unTB;
	
	public void setUsername(String un) {
		
		unTB.sendKeys(un);
	}
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}
	

}
