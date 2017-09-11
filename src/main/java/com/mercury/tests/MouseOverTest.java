package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.MouseOverPage;

public class MouseOverTest extends BaseTest{
  
	
	@Test
  public void test001_mouseOver() {
		
		RemoteWebDriver driver = getDriver();
		
		MouseOverPage mOP = new MouseOverPage(driver);
		
		mOP.mouseOverHanble();
  }
}
