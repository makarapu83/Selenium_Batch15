package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.XpathDemoExPage;

public class XpathDemoExTest extends BaseTest{
  @Test
  public void f() {
	  
	  RemoteWebDriver driver = getDriver();
	  
	  XpathDemoExPage xep = new XpathDemoExPage(driver);
	  xep.xpathPgSignIn("mngr96576", "UhUhUha");
	  
  }
}
