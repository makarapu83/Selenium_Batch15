package com.mercury.tests;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.sun.jna.AltCallingConvention;

import junit.framework.Assert;

import org.testng.annotations.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class FunctionLibrary {

	        public void fnSelectByIndex(WebElement element , int x) {
	    	   Select select = new Select(element);
	    	   select.selectByIndex(x);
	            }   
	    	  
	  	      public void fnSelectByValue(WebElement element , String s) {
		    	Select select = new Select(element);
		    	select.selectByValue(s);
		         }
	     
	        public void fnSelectByvisibleText(WebElement element , String s) {
		    	Select select = new Select(element);
		    	select.selectByVisibleText(s);
		 	      }
	      
	        public void fnVerifySelectDropDownList(WebElement element , String s) {
	        	Select select=new Select(element);
	        	WebElement ele = select.getFirstSelectedOption();
	        	Assert.assertEquals(s, ele.getText() );
	             }
	        
	        public void fnClick(WebElement element) {
	            element.click();
	             }
	      
	        public void clickByJS(WebElement element , RemoteWebDriver Driver) {
	        	JavascriptExecutor js = (JavascriptExecutor)Driver;
	        	js.executeScript("arguments[0].click()", element);
	        	  }
	        
	        public void fnAlertAccept(RemoteWebDriver Driver) {
	        	Alert alt = Driver.switchTo().alert();
	        	alt.accept();
	             }
	        
	        public void fnAlertDismiss(RemoteWebDriver Driver) {
	        	Alert alt = Driver.switchTo().alert();
	        	alt.dismiss();
	             }
	        public void fnSendKeysToTextField(RemoteWebDriver Driver) {
	        	Alert alt = Driver.switchTo().alert();
	             alt.sendKeys("Bhavani");
	         	       	        
	             }
	        public void fnVerifySentText(RemoteWebDriver Driver) {
	        	//Alert alt = Driver.switchTo().alert();
	        	String bodyText = Driver.findElement(By.xpath(".//*[contains(text(),'Bhavani!')]")).getText();
	        	Assert.assertTrue("Text not found!", bodyText.contains("Bhavani"));
	        	
	        	        	
	    }
	        public void fnAlertToGetText(RemoteWebDriver Driver ) {
	        	Alert alt = Driver.switchTo().alert();
	        	String message = alt.getText();
	            System.out.println("alert message is:" + message);
	           
	            
				}
	       
	        }
	     


	
