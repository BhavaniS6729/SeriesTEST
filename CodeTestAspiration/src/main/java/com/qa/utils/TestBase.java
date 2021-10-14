package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	//Constructor
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream finput = new FileInputStream("/Users/vi.karne/eclipse-workspace"
					+ "/CodeTestAspiration/src/main/java/com/qa/config/config.properties");
			prop.load(finput);
		} catch (IOException e) {
			e.getLocalizedMessage(); 
		}
	}

	
	public static void initialization() {	
		String browserName = prop.getProperty("browser");
	
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/bhavani/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--test-type");
	    options.addArguments("--disable-web-security");
	    options.addArguments("--allow-running-insecure-content");
	    options.addArguments("--disable-site-isolation-trials");
	    options.setAcceptInsecureCerts(true);
	    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
	    options.addArguments("--disable-features=IsolateOrigins");
	    options.addArguments("--allow-cors");
	    driver = new ChromeDriver(options);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utilities.IMPL_WAIT, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Utilities.IMPL_WAIT, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();


		
}
}
