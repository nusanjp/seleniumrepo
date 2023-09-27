package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.PageBaseClass;

public class LoginPage extends PageBaseClass {
	


	public LoginPage(WebDriver driver)
	{
		super(driver);
		logger.info("Start Login Page Constructor.");
		
	}
	

	
	public void navigate()
	{
		driver.get("");
		logger.info("Open Login Page.");
	}
}
