package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class XpathDemoExPage1 {
	
	 RemoteWebDriver driver;
	    
	    @FindBy(how=How.XPATH , using="//a[contains(text(),'SAP MM')]")
	    public WebElement _SapMM; // selected sap mm by using Contains from (a) 
	    
	    @FindBy(how=How.XPATH , using="//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']")
	    public WebElement _SeleniumSiblings; // selected all siblings of selenium
	    
	    public XpathDemoExPage1(RemoteWebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void xpathPgaxea()
	    {
	    	driver.get("http://demo.guru99.com/selenium/guru99home/");
	    	
	  
	   
	
	
	
	
  }
}
