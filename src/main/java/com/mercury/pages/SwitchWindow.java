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

public class SwitchWindow extends FunctionLibrary
{
	RemoteWebDriver driver;
	Logger log = LoggerFactory.getLogger(getClass());
	
	@FindBy(how = How.CSS, using= "#button1")
	public WebElement _OnClickbtn1;
	
	public SwitchWindow(RemoteWebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void fnswitchwindow()
	{
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String mainWindow =  driver.getWindowHandle();
		log.info("Main Window is :" +mainWindow);
		
		fnClick(_OnClickbtn1);
	}
  
}
