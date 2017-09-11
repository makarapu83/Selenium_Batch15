package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class PromptPage extends FunctionLibrary{
 
	 RemoteWebDriver driver;
	 
	 @FindBy(how=How.XPATH, using="//button")
		public WebElement _ClickOnMeButton;
	
//	 @FindBy(how=How.XPATH, using=".//*[contains(text(),'Bhavani!')]")
//		public WebElement _SentTextToPrompt;
	 
	  public PromptPage(RemoteWebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	
	
	  public void promptHandle() {
		  
		  driver.get("file:///C:/Users/hp/Downloads/prompt.html");
		  fnClick(_ClickOnMeButton);
		  fnSendKeysToTextField(driver);
		  fnAlertAccept(driver);
		  fnVerifySentText(driver);   
	  }
}
