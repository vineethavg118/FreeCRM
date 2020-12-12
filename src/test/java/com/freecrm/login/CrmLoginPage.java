package com.freecrm.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmLoginPage {
	WebDriver driver;
	
	@FindBy (name ="email")
	WebElement username;
	
	@FindBy (name = "password")
	WebElement password;
	
	@FindBy (xpath = "//div[text()='Login']")
	WebElement loginbutton;
	
	public CrmLoginPage (WebDriver driver) {
		this.driver = driver;
				PageFactory.initElements(driver, this);
	}
	
	public void Login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();		
	}
	
	
	
	
	

}
