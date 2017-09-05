package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class Prompt extends FunctionLibrary
{
	RemoteWebDriver driver; 
	
	@FindBy(how=How.XPATH, using="//button")
	public WebElement _OnclickPromtButton;
	
	public Prompt(RemoteWebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public fnprompt()
	{
		driver.get("file:///C:/Selenium/prompt.html");
		fnClick(_OnclickPromtButton);
		
	}
  
}
