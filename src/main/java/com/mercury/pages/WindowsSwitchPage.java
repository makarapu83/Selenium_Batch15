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

public class WindowsSwitchPage extends FunctionLibrary {
	
	  RemoteWebDriver driver;
	  
	  Logger log = LoggerFactory .getLogger(getClass());  // it is responsible for logging information gets class from log
	  
	    @FindBy(how=How.CSS, using="#button1") //# is used for CSS to find Id
	    public WebElement _NewWindowButton;
	  
	   public WindowsSwitchPage(RemoteWebDriver driver) {
		   this.driver=driver;   //driver page is initialized to 
		   PageFactory.initElements(driver, this);//page initialized from pagefactory
		   
	   }

	  public void windowHandle() {
		  driver.get("http://toolsqa.com/automation-practice-switch-windows/"); //Open application
		  String mainWindow=driver.getWindowHandle(); //get the current window i.e mainwindow
		  log.info("The MainWindow is:" +driver.getTitle()); //prints mainwindow tittle
		  log.info(" The MainWindow is:"+driver.getCurrentUrl()); // prints mainwindow url
		  fnWaitForElementClickable(driver, _NewWindowButton);
		  fnClick(_NewWindowButton);
		  fnSwitchToChildWindow(driver, mainWindow);
	  }
	
	
 }
