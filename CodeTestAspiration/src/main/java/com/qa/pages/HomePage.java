package com.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class HomePage extends TestBase{
	
	//Object Repo 
	@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[1]/a[1]/svg[1]/title[1]")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Spend & Save']")
	WebElement link1;
	
	
	//constructor
	public HomePage() {
		PageFactory.initElements(driver,  this);
	}
	
    //actions
	public String validateHomePageTitle() {
	System.out.println(driver.getTitle());
	return driver.getTitle();
	}
	
	public SpendandSavePage ClickOnSpendSaveLink(){
    JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", link1); 
	return new SpendandSavePage();
	}
	 
	public boolean homePageTitle() {
	return logo.isDisplayed();
	}
	
	
	

	
}
