package com.mercury.tests;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.sun.jna.AltCallingConvention;

import junit.framework.Assert;

import org.testng.annotations.Parameters;

import java.util.Set;

import javax.sound.sampled.Control;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class FunctionLibrary {
	    
	        Logger log=LoggerFactory.getLogger(getClass());

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
	       public void fnWaitForElementClickable(RemoteWebDriver driver , WebElement element) {
	    	   WebDriverWait wait=new WebDriverWait(driver,30);
	    	   wait.until(ExpectedConditions.elementToBeClickable(element));
	           }   
	       public void fnMouseOver(RemoteWebDriver driver , WebElement element) {	    	   
	    		 Actions act=new Actions(driver);
	    		 act.moveToElement(element);
	    		 act.build().perform();	    		    		 
	    	    }
	      public void fnDargDrop(RemoteWebDriver driver, WebElement source, WebElement destination){
	  		
	  		Actions act = new Actions(driver);
	  		act.dragAndDrop(source, destination);
	  		act.build().perform();	  			 	
	     	}
	       public void fnSwitchToChildWindow(RemoteWebDriver driver,String mainWindow) {
	    	   Set<String>allwindows=driver.getWindowHandles(); // allwindows i.e main,child
	    	      for(String window:allwindows) {  //window mean main,child
	    	    	  if(!window.equals(mainWindow)){ //if window is not a mainwindow i.e itis a child window
	    	    		  driver.switchTo().window(window); //if itis child window switch to child
	    	    		  log.info("The child window is "+ driver.getTitle());
	    					log.info("The child window is "+ driver.getCurrentUrl());
	    				}}
	     
	    			}			
	    			   
	       public void fnWaitForFrameAndSwitchToIt(RemoteWebDriver driver, WebElement Frame) {
	    	   WebDriverWait wait=new WebDriverWait(driver, 30);
	    	   wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
	    	    	  }
   	     /*  public void fnKeyBoardCntrl(RemoteWebDriver driver,WebElement control) {
   	    	  	    		  Actions act=new Actions(driver);
   	    	  	    		  act.keyDown(Keys.CONTROL);
   	    	  	    		  
   	    	  	      }*/
	
}
	     


	
