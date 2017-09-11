package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.AlertPage;

public class AlertTest extends BaseTest {
  @Test
  public void f() {
	  
		RemoteWebDriver driver = getDriver();
		AlertPage ap=new AlertPage(driver);
		ap.alerthandle();
		
	  
  }
}
