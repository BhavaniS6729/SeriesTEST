package com.qa.stepDefs;

import org.openqa.selenium.WebDriver;

import com.qa.pages.HomePage;
import com.qa.utils.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageStepDef extends TestBase{
	//WebDriver driver;

	HomePage homepage = new HomePage();

	@Given("^user lands on HomePage$")
	public void user_lands_on_HomePage() throws Throwable {
	    TestBase.initialization();
	    String title = homepage.validateHomePageTitle();
	    Assert.assertEquals("Aspiration | Green Financial Services", title);
	}
	
	
	@Then("^user clicks on Spend Save Link$")
	public void user_clicks_on_Spend_Save_Link() throws Throwable {
		HomePage homepage = new HomePage();
		homepage.ClickOnSpendSaveLink();   
	}
	
	
}

	