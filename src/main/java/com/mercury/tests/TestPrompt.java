package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.ConfermationPage;
import com.mercury.pages.FlightSearchPage;
import com.mercury.pages.MercurySignInPage;
import com.mercury.pages.PromptPage;

public class TestPrompt extends BaseTest
{
  @Test
  public void tc002_search() {
		
		RemoteWebDriver driver = getDriver();
		
		PromptPage ppt = new PromptPage(driver);
		ppt.fnprompt();
 
		  
		  
		  
}
}
