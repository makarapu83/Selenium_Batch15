package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.mercury.pages.AlertPage;

public class AlertTest extends BaseTest{
  
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Test
  public void f() {
		RemoteWebDriver driver = getDriver();
		
		AlertPage ap = new AlertPage(driver);		
		ap.alertHandle();
		
  }
}
