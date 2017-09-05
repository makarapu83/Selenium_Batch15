package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class PromptPage extends FunctionLibrary
{
	RemoteWebDriver driver; 
	
	@FindBy(how=How.XPATH, using="//button")
	public WebElement _OnclickPromtButton;
	
	public PromptPage(RemoteWebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void fnprompt()
	{
		driver.get("file:///C:/Selenium/prompt.html");
		fnClick(_OnclickPromtButton);
		gettxtprompt(driver);
		fnVerifyPrompt(_OnclickPromtButton, "swathi");
		fnAlertAccept(driver);
		
	}
  
}
