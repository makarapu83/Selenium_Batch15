package com.mercury.pages;

import org.openqa.selenium.Keys;
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

public class MultiSelcectWithCntrlPage extends FunctionLibrary {
 
	RemoteWebDriver driver;
	
	Logger log=LoggerFactory.getLogger(getClass());
	public MultiSelcectWithCntrlPage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	     @FindBy(how=How.ID, using="chkveg")
	     public WebElement _List;
	     
	     @FindBy(how=How.XPATH, using="//option[1][@value='ch']")
	     public WebElement _cheese;
	   
	     @FindBy(how=How.XPATH ,using="//option[2][@value='tomatoes']")
	     public WebElement _tomatos;
	   
	     @FindBy(how=How.XPATH, using="//option[6][@value='onions']")
	     public WebElement _onions;
	   
	     
	     
	     public void keyBoardCntlHandle() {
	    	 driver.get("file:///C:/Users/hp/Downloads/multiSelect.html");
	    	 //fnClick(_List);
	    	 Actions act=new Actions(driver);
	    		  act.keyDown(Keys.CONTROL);
	    		 
	    	// fnKeyBoardCntrl(driver, _List);
	    	 fnSelectByvisibleText(_List, "Cheese");
	    	// fnClick(_cheese);
	    	 fnSelectByvisibleText(_List, "Tomatoes");
	    	// fnClick(_tomatos);
	    	 fnSelectByvisibleText(_List, "Onions");
	    	// fnClick(_onions);
	    	 act.keyUp(Keys.CONTROL);
	    	 act.build().perform();
	     }
}
