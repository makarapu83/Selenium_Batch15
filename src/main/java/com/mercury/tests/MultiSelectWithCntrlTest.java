package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.MultiSelcectWithCntrlPage;

public class MultiSelectWithCntrlTest extends BaseTest {
  @Test
  public void f() {
	  
	  RemoteWebDriver driver=getDriver();
	  
	  MultiSelcectWithCntrlPage mCP=new MultiSelcectWithCntrlPage(driver);
	  mCP.keyBoardCntlHandle();
	  
  }
}
