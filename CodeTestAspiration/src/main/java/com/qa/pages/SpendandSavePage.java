package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class SpendandSavePage extends TestBase{
	
	
	//Object Repo 
		@FindBy(xpath="//h1[contains(text(),'Spend & Save Plans')]")
		WebElement title;
		
		@FindBy(xpath="//div[contains(@class, 'card-original')]")
		WebElement card1;
		
		@FindBy(xpath="//div[contains(@class, 'card-plus')]")
		WebElement card2;
		
		@FindBy(xpath="//button[@ng-click='getAspirationOriginal()']")
		WebElement card1Button;
		
		@FindBy(xpath="//button[@ng-click='getAspirationPlus()']")
		WebElement card2Button;
		
		
		
		//constructor
		public SpendandSavePage() {
			PageFactory.initElements(driver,  this);
		}
		
	    //actions
		public String ValidateSpendandSavePageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
		}
		
		public boolean SpendandSavePagePageTitle() {
		return title.isDisplayed();
		}
		
		public boolean cardOG(){
		return card1.isDisplayed();
		}
		
		public boolean cardPlus(){
		return card2.isDisplayed();
		}
		
		
		public GetAspirationOGLinkPage ClickOnOG(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", card1Button); 
		return new GetAspirationOGLinkPage();
		}
		

		public GetAspirationPlusLinkPage ClickOnPlus(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", card2Button); 
		return new GetAspirationPlusLinkPage();
		}
		
}
