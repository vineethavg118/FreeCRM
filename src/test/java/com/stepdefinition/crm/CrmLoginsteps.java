package com.stepdefinition.crm;

import org.apache.poi.util.SystemOutLogger;

import com.baseclasses.Library;
import com.freecrm.login.CrmLoginPage;
import com.reusablefunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmLoginsteps extends Library{
	CrmLoginPage crmlogin;
	
	@Given("browser is launched and navigated to the url")
	public void browser_is_launched_and_navigated_to_the_url() {
		browserSetUp();  
		logger.info("browser is launched");
	}

	@When("user enters {string} and {string} and click on login button")
	public void user_enters_username_and_password(String username, String password) {
		crmlogin = new CrmLoginPage(driver);
		crmlogin.Login(username, password);    
	}

	@Then("verify the tiltle")
	public void verify_the_title() {
		SeleniumUtilities sel= new SeleniumUtilities(driver);
	     sel.getTitle();
	    

	    
	}

	
}