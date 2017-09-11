package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class MouseOverPage extends FunctionLibrary{
  
	RemoteWebDriver driver;
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	public MouseOverPage(RemoteWebDriver driver){
		
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH, using="//a/span[text()='Electronics']")
		public WebElement _linkElectronics;
	

	@FindBy(how=How.XPATH, using="//a/span[text()='Mobiles']")
		public WebElement _linkMobiles;
	
	
	public void mouseOverHanble(){
		
		driver.get("https://www.flipkart.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(_linkElectronics);
		act.build().perform();
		
		
		fnClick(_linkMobiles);
		
		
		
		
	}
	
}
