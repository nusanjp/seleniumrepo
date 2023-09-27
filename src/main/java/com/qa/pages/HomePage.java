package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.PageBaseClass;

public class HomePage extends PageBaseClass{
	
	
	private static String URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	private WebDriverWait wait;
	private static int DURATION_SECOND=30;
	private static String pageTitle = "XYZ Bank";
	
	//element locator for customer login button.
	@FindBy(xpath="//button[contains(text(),'Customer Login')]")
	private WebElement customerLoginBtn;
	
	//element locator for home button.
	@FindBy(css="button.home")
	private WebElement homeBtn;
	
	//element locator for manager login button.
	@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
	private WebElement managerLoginBtn;
	
	//Home page constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
		logger.info("TC_Home Page Test");
		logger.info("Home Page constructor is started..");
		wait = new WebDriverWait(driver,Duration.ofSeconds(DURATION_SECOND));
	}
	
	//Check whether or not home page is opened.
	public void verifyIsHomePageOpen()
	{
		if(wait.until(ExpectedConditions.titleIs(pageTitle)))
		{
			logger.info("Home Page is displayed");
		}
		else
		{
			logger.info("Home Page is NOT displayed.");
		}
		
	}
	
	//Verify buttons are available in Home Page
	public void verifyButtonsInHomePage()
	{
		checkButtonsInHomePage(homeBtn);
		checkButtonsInHomePage(customerLoginBtn);
		checkButtonsInHomePage(managerLoginBtn);

	}
	
	//Function to check buttons in Home page.
	public void checkButtonsInHomePage(WebElement element)
	{
		if(element.isDisplayed() && element.isEnabled())
		{
			logger.info(element.getText() +" "+  element.getTagName() + " is available in Home Page.");
		}
		else
		{
			logger.info(element.getText() +" "+ element.getTagName() + " is NOT available in Home Page.");
		}
	}
	
	//open the website URL.
	public void navigate()
	{
		driver.get(URL);
		logger.info("Open Home Page.");
	}

}
