package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.ConfermationPage;
import com.mercury.pages.FlightSearchPage;
import com.mercury.pages.MercurySignInPage;
import com.mercury.pages.SwitchWindow;

public class SwitchWindowTest extends BaseTest
{
  @Test
  public void tc001_search() {
		
		RemoteWebDriver driver = getDriver();
		
		SwitchWindow window = new SwitchWindow(driver);
		window.fnswitchwindow();
 
		  
		  
		  
}
}
