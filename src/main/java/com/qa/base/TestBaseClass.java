package com.qa.base;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBaseClass {
	
	private static String KEYVALUE = "webdriver.chromedriver.driver";
	private static String CHROME_DRIVER = "./Drivers/chromedriver";
	private static String BINARY_PATH = "./Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing";
	private static int DEFAULT_TIMEOUT_SECOND = 30;
	public static WebDriver driver;
	
	@BeforeSuite
	public void Initialization()
	{
		//initialize the Webdriver and Chrome driver.
		
		System.setProperty(KEYVALUE, CHROME_DRIVER);
		ChromeOptions option = new ChromeOptions();
		option.setBinary(BINARY_PATH);
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_TIMEOUT_SECOND));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void tearDown()
	{
		driver.quit();  //quit the driver
	}
}
