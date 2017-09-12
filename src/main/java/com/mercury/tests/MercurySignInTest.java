package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.MercurySignInPage;

public class MercurySignInTest extends BaseTest{
	
	
	
  @Test
  public void tc001_login() {
	  
	  RemoteWebDriver driver = getDriver();
	  
	  MercurySignInPage mTS = new MercurySignInPage(driver);
	  
	  mTS.loginToMercury();
	  
  }
}
