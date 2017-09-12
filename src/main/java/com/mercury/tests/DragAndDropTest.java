package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
  @Test
  public void f() {
	  
	  RemoteWebDriver driver= getDriver();
	  
	  DragAndDropPage dDP=new DragAndDropPage(driver);
	  dDP.dragDropHandle();
	  
  }
}
