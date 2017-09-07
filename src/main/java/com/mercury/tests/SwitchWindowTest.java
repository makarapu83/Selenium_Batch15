package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.SwitchWindowPage;

public class SwitchWindowTest extends BaseTest{
	
	
  @Test
  public void f() {
	  RemoteWebDriver driver = getDriver();
	  
	  SwitchWindowPage sWP = new SwitchWindowPage(driver);
	  sWP.handleWindows();
	  
  }
}
