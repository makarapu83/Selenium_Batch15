package com.mercury.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

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
	     
	        public void fnSelectByvisibleStringFromMonth(WebElement element , String s) {
		    	Select select = new Select(element);
		    	select.selectByVisibleText(s);
		 	      }
	      
	       public void fnSelectByIndexFromDay(WebElement element , int x) {
		    	Select select = new Select(element);
		    	select.selectByIndex(x);
		 	      }
	       public void fnSelectByvisibleStringToCity(WebElement element , String s) {
		    	Select select = new Select(element);
		    	select.selectByVisibleText(s);
		 	      }
	       public void fnSelectByvisibleStringToMonth(WebElement element , String s) {
		    	Select select = new Select(element);
		    	select.selectByVisibleText(s);
		 	      }
	      
	       public void fnSelectByIndexToDay(WebElement element , int x) {
		    	Select select = new Select(element);
		    	select.selectByIndex(x);
		 	      }
	     
	      }
	      
	
	
