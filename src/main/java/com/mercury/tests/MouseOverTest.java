package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.MouseOverPage;

public class MouseOverTest extends BaseTest {
  @Test
  public void f() {
	  
	      RemoteWebDriver driver=getDriver();
	      
	      MouseOverPage mOP=new MouseOverPage(driver);
	      mOP.mouseOverHandel();
	      
	      
	  
  }
}
