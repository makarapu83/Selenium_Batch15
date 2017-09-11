package com.mercury.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.Parameters;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class FunctionLibrary{

Logger log= LoggerFactory.getLogger(getClass());

	public void fnSelectByIndex(WebElement element, int x){
		Select select = new Select(element);
		select.selectByIndex(x);
	}

	public void fnSelectByValue(WebElement element, String val){
		Select select = new Select(element);
		select.selectByValue(val);		
	}

	public void fnVerifySelectedDropDownOption(WebElement element, String val){
		Select select = new Select(element);
		WebElement ele = select.getFirstSelectedOption();		
		Assert.assertEquals(val, ele.getText());		
	}


	public void fnClick(WebElement element){
		element.click();
	}

	public void clickByJS(WebElement element, RemoteWebDriver driver){

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void fnAlertAccept(RemoteWebDriver driver){
		Alert al = driver.switchTo().alert();		
		al.accept();
		log.info("Alert accepted");
	}
	
	
	public void fnSwitchToChildWindow(RemoteWebDriver driver, String mainWindow){
		
		Set<String> allWindows = driver.getWindowHandles(); //main, child
		
		for (String window : allWindows){ // window1 - main, child
			if(!window.equals(mainWindow)){ // mains = main, child
				driver.switchTo().window(window); // switch to child
				
				log.info("The child window is "+ driver.getTitle());
				log.info("The child window is "+ driver.getCurrentUrl());
			}
		}			
	}
	
	
	public void fnWaitforElementClickable(RemoteWebDriver driver, WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void fnWaitForFrameAndSwitchToIt(RemoteWebDriver driver, WebElement frame){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));	
		
	}
	
	public void fnDargDrop(RemoteWebDriver driver, WebElement source, WebElement destination){
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination);
		act.build().perform();
		
		
	}
}
