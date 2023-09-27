package com.qa.test;

import org.testng.annotations.Test;

import com.qa.base.TestBaseClass;
import com.qa.pages.HomePage;

public class TC_HomePageTest extends TestBaseClass {
	
	@Test
	public void HomePageTest()
	{
		
		HomePage homePageTest = new HomePage(TestBaseClass.driver);
		homePageTest.navigate();
		homePageTest.verifyIsHomePageOpen();
		homePageTest.verifyButtonsInHomePage();
	}

}
