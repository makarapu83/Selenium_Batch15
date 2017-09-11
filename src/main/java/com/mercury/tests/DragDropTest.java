package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.DragDropPage;

public class DragDropTest extends BaseTest {
  @Test
  public void test_drapDrop() {
	  
	  RemoteWebDriver driver = getDriver();
	  
	  DragDropPage dDP = new DragDropPage(driver);
	  
	  dDP.dragDropHandle();
	  
	  
  }
}
