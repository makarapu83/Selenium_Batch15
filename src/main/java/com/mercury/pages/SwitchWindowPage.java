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

public class SwitchWindowPage extends FunctionLibrary{
  
	RemoteWebDriver driver;
	Logger log = LoggerFactory.getLogger(getClass());
	
	
	@FindBy(how=How.CSS , using="#button1")
	public WebElement newWindowButton;
	
	
	public SwitchWindowPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void handleWindows(){
		driver.get("http://toolsqa.com/automation-practice-switch-windows/"); //Open application
		
		String mainWindow = driver.getWindowHandle(); //Get the current window is > mainWindow
		log.info("The main wondow is "+ driver.getTitle());
		
		fnWaitforElementClickable(driver, newWindowButton);
		
		fnClick(newWindowButton);
		
		fnSwitchToChildWindow(driver, mainWindow);
		
	}
	
	
	
	
}
