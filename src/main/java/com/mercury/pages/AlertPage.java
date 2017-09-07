package com.mercury.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class AlertPage extends FunctionLibrary{
  
	Logger log = LoggerFactory.getLogger(getClass());
	RemoteWebDriver driver;
	
	public AlertPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	/*@FindBy(how=How.XPATH, using="//button")
	public WebElement _alertButton;*/
	
	@FindBy(how=How.TAG_NAME, using="button")
	public WebElement _alertButton;
	
	public void alertHandle(){
		driver.get("file:///F:/Techies/Backup_data_6years/Learning/MyNotes/confirmation.html");
		fnClick(_alertButton);
		
		fnAlertAccept(driver);
		log.info("Alert Handle");
		
		
	}
}
