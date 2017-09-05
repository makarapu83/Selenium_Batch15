package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.ConfermationPage;
import com.mercury.pages.FlightSearchPage;
import com.mercury.pages.MercurySignInPage;

public class ConfermationTest extends BaseTest
{
  @Test
  public void tc002_search() {
		
		RemoteWebDriver driver = getDriver();
		
		ConfermationPage cop = new ConfermationPage(driver);
		cop.alertfunction();
 
		  
		  
		  
}
}
