package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.FlightSearchPage;
import com.mercury.pages.MercurySignInPage;

public class FlightSearchTest extends BaseTest
{
	
	
  @Test
  public void tc002_search() {
		
		RemoteWebDriver driver = getDriver();
		  
		  MercurySignInPage mTS = new MercurySignInPage(driver);		  
		  mTS.loginToMercury("swathi", "swathi");
		  
		  FlightSearchPage fSP = new FlightSearchPage(driver);
		  fSP.flightSearch();
		  
		  
  }
}