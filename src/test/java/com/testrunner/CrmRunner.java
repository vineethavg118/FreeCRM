package com.testrunner;

import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/CrmLogin.feature",
				plugin = {"pretty",
						"html:Reports/cucumber-html-report", 
						"json:Reports/cucumber-html-report/jsonreport.json",
						"rerun:target/cucumber-reports/rerun.txt",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						//"testng:target/testng-cucumber-reports/cuketestng.xml",
						},
		glue= {"com.stepdefinition.crm"}
		
		
		//strict= true
					
		)
public class CrmRunner extends AbstractTestNGCucumberTests {
	//create the report-extent-config.xml
	 public static void Extentsreport()
	  
	  {
	  Reporter.loadXMLConfig("/src/test/resources/Extent-config.xml");
	  Reporter.setSystemInfo("user", System.getProperty("user.name"));
	  Reporter.setSystemInfo("os", "Windows");
	  Reporter.setTestRunnerOutput("FreeCRM Report"); }

}



 


