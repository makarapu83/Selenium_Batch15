package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.WindowsSwitchPage;

public class WindowsSwitchTest extends BaseTest {
  @Test
  public void f() {
	  
	  RemoteWebDriver driver=getDriver();
	  WindowsSwitchPage wSp=new WindowsSwitchPage(driver);
	  wSp.windowHandle();
	  
  }
}
