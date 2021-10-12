package com.qa.stepDefs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.HomePage;
import com.qa.pages.SpendandSavePage;
import com.qa.utils.Utilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SpendAndSaveStepDef {
	WebDriver driver;

	SpendandSavePage SpendSavePage = new SpendandSavePage();

	
	@Given("^user is on Save and Spend Page$")
	public void user_is_on_Save_and_Spend_Page() throws Throwable {
		String title2 = SpendSavePage.ValidateSpendandSavePageTitle();
	    Assert.assertEquals("Cash Management Services - Investing & Retirement Planning | Aspiration", title2);
	}
	
	
	@Then("^Two cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		boolean title3 = SpendSavePage.SpendandSavePagePageTitle();
	    Assert.assertTrue(title3);
	}

	
	@Then("^validate the Two card products, Aspiration and Aspiration Plus$")
	public void validate_the_card_products_Aspiration_and_Aspiration_Plus() throws Throwable {
		boolean card1 = SpendSavePage.cardOG();
		Assert.assertTrue(card1);
		boolean card2 = SpendSavePage.cardPlus();
		Assert.assertTrue(card2);
	}

	
	@Then("^click on cardOne Get Aspiration$")
	public void click_on_card_Get_Aspiration() throws Throwable {
		SpendSavePage.ClickOnOG(); 	
//		WebDriverWait block = new WebDriverWait(driver,10);
//		block.until(ExpectedConditions.visibilityOfElementLocated(By.className("heading text-center ng-scope")));
//		String Header3 = driver.findElement(By.xpath("//div[contains(@class, 'heading text-center ng-scope')]")).getText();
//		Assert.assertEquals("Get Started with Aspiration", Header3);
	}
	
	
	@Then("^validate input field for email address to signup is displayed$")
	public void validate_input_field_for_email_address_to_signup_is_displayed() throws Throwable {
		driver.switchTo().activeElement();
		String modalWindowPage = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/h3[1]")).getText();
		System.out.println(modalWindowPage);
		Assert.assertEquals("Get Started with Aspiration", modalWindowPage); 
	}
	
	
	@Then("^click on x$")
	public void click_on_x() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	} 

	
	@Then("^click on cardTwo Get Aspiration Plus$")
	public void click_on_card_Get_Aspiration_Plus() throws Throwable {
		SpendSavePage.cardPlus(); 	 
	}


	
	@Then("^validate the modal with monthly and yearly plans appear$")
	public void validate_the_modal_with_monthly_and_yearly_plans_appears() throws Throwable {
		driver.switchTo().activeElement();
		String modalWindowPage = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println(modalWindowPage);
		Assert.assertEquals("Aspiration Plus", modalWindowPage); 
	}

	
	@Then("^validate Yearly radio button with bigAmount is displayed$")
	public void validate_Yearly_radio_button_with_bigAmount_is_displayed() throws Throwable {
		//radiobutton 1 validation 
	}

	
	@Then("^validate monthly radio button with smallAmount is displayed$")
	public void validate_monthly_radio_button_with_smallAmount_is_displayed() throws Throwable {
		//radiobutton 2 validation 

	}
	
}
