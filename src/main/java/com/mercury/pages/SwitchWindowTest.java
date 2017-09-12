package com.mercury.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.tests.BaseTest;

public class SwitchWindowTest extends BaseTest
{
  @Test
  public void tc001_search() {
		
		RemoteWebDriver driver = getDriver();
		
		SwitchWindow window = new SwitchWindow(driver);
		window.fnswitchwindow();
 
		  
		  
		  
}
}
