package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class MouseOverPage extends FunctionLibrary {
     
	     RemoteWebDriver driver;
	     
	     Logger log=LoggerFactory.getLogger(getClass());
	     
	     
	     public MouseOverPage(RemoteWebDriver driver) {
	    	 this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	 
	     }
	    	 @FindBy(how=How.XPATH , using="//a/span[text()='Electronics']")
	    	 public WebElement _ElectronicsLink;
	     
	    	 @FindBy(how=How.XPATH , using="//a/span[1][text()='Mobiles']")
	    	 public WebElement _MobileLink;
	     
	  public void mouseOverHandel() {
		  
		  driver.get("https://www.flipkart.com/");
		  fnMouseOver(driver, _ElectronicsLink);
		  fnClick(_MobileLink);
		  
		  	  }

}