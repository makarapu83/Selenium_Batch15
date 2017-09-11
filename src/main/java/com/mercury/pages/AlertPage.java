package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class AlertPage extends FunctionLibrary {
 
	  RemoteWebDriver driver;
	  
	  @FindBy(how=How.XPATH, using="//button")
		public WebElement _ClickOnMeButton;
	  
	  public AlertPage(RemoteWebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	  
	     public void alerthandle() {
	    
	     driver.get("file:///C:/Users/hp/Downloads/confirmation.html");
	    
	     fnClick(_ClickOnMeButton);
	     fnAlertToGetText(driver);
	     fnAlertAccept(driver);
	     //  fnAlertDismiss(Driver);
	     
       	 
	    
}}
