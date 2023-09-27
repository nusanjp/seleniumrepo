package com.qa.base;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBaseClass {
	protected WebDriver driver;
	public Logger logger;
	
	public PageBaseClass() {}
	
	public PageBaseClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initialize the web elements to page factory.
		
		logger = Logger.getLogger("XYZ Bank Project");  //write to the log file
		PropertyConfigurator.configure("./Properties/log4j.properties"); //configure log4j properties file.
	}
	
	public abstract void navigate(); 
	
}
