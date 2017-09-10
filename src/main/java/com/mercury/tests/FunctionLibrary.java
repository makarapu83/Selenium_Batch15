package com.mercury.tests;


import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.Alert;
import junit.framework.Assert;

import org.testng.annotations.Parameters;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class FunctionLibrary 
{
	//Logger log = LoggerFactory.getLogger(getClass());
	 
	public void fnselectByIndex(WebElement element, int x)
	{
		Select byindex = new Select(element);
		byindex.selectByIndex(x);
					
	}
	
	public void fnSelectByValue(WebElement element, String str)
	{
		Select byvalue = new Select(element);
		byvalue.selectByValue(str);
	}
	
	public void fnSelectByvisibility(WebElement element, String str)
	{
		Select byvisisbility = new Select(element);
		byvisisbility.selectByVisibleText(str);
	}
	public void fnVerifySelectedDropDownOption(WebElement element, String val)
	{
		Select select = new Select(element);
		WebElement ele = select.getFirstSelectedOption();		
		Assert.assertEquals(val, ele.getText());
	}

	public void fnClick(WebElement element)
	{
	element.click();
	}
	public void clickByJS(WebElement element, RemoteWebDriver driver){

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void fnAlertAccept(RemoteWebDriver driver)
	{
		Alert al = driver.switchTo().alert();		
		al.accept();
	}
	public void fndismiss(RemoteWebDriver driver)
	{
		Alert dis = driver.switchTo().alert();
		dis.dismiss();

	}
	public void getText(RemoteWebDriver driver)
	{
		Alert txt = driver.switchTo().alert();
		String output = txt.getText();	
		System.out.println("Text is:"+ output);
		
	}
	
	public void gettxtprompt(RemoteWebDriver driver)
	{
		Alert gettxt = driver.switchTo().alert();
	    gettxt.sendKeys("akshita");
	    gettxt.accept();
		
	}
	public void fnVerifyPrompt(WebElement element, String val)
	{
		Select select = new Select(element);
		
	}
	
	public void fnSwitchChildWindow(RemoteWebDriver driver,String mainWindow)
	{
		Set<String> allwindows = driver.getWindowHandles();
		for(String window : allwindows )
		{
			if(!window.equals(mainWindow))
			{
				driver.switchTo().window(window);
			
				System.out.println("Child Window is:"+ driver.getTitle());
				//log.info("Child Window is:" + driver.getCurrentUrl());
	
		}
			
		
	}

	

}
}