package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.AlertPage;
import com.mercury.pages.PromptPage;

public class PromptTest extends BaseTest {
  @Test
  public void f() {
	  

		RemoteWebDriver driver = getDriver();
		PromptPage pp=new PromptPage(driver);
		pp.promptHandle();
  }
}
