package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class ConfermationPage extends FunctionLibrary
{
RemoteWebDriver driver; 

 

	@FindBy(how=How.XPATH, using="//button")
	public WebElement _OnclickButton;


		
	public ConfermationPage(RemoteWebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void alertfunction()
	{
		driver.get("file:///C:/Selenium/confirmation.html");
		fnClick(_OnclickButton);
		getText(driver);
		fnAlertAccept(driver);
		//fndismiss(driver);
		
		
		
	}
  
}
