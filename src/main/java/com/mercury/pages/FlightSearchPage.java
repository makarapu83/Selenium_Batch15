package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class FlightSearchPage extends FunctionLibrary {
 
	
	    RemoteWebDriver driver;
	    
	    @FindBy(how=How.XPATH, using="//input[@name='tripType' and @value='oneway']")
		public WebElement _onewayRadioButton;
	
	    @FindBy(how=How.XPATH, using="//select[@name='passCount']")
		public WebElement _passangersDropDown;
	
	  
	    @FindBy(how=How.XPATH, using="//select[@name='fromPort']")
		public WebElement _FromCityDropDown;
	    
	    
	    @FindBy(how=How.XPATH, using="//select[1][@name='fromMonth']")
		public WebElement _FromMonthDropDown;
	    
	    @FindBy(how=How.XPATH, using="//select[2][@name='fromDay']")
	 	public WebElement _FromDayDropDown;
	    
	    @FindBy(how=How.XPATH, using="//select[@name='toPort']")
 		public WebElement _ToCityDropDown;
    
	    @FindBy(how=How.XPATH, using="//select[1][@name='toMonth']")
 		public WebElement _ToMonthDropDown;
    
	    @FindBy(how=How.XPATH, using="//select[2][@name='toDay']")
 		public WebElement _ToDayDropDown;
    	      
	    @FindBy(how=How.XPATH, using="//input[@name='servClass' and @value='Business']")
 		public WebElement _BussinessClassRadioButton;
     
		@FindBy(how=How.XPATH, using="//input[@name='findFlights']")
 		public WebElement _ContinueButton;
      
	    public FlightSearchPage(RemoteWebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void FlightSearch() {
	    	
	    	fnClick(_onewayRadioButton);
	    	fnSelectByIndex(_passangersDropDown, 2);
	    	fnSelectByValue(_FromCityDropDown, "New York");
	    	fnVerifySelectDropDownList(_FromCityDropDown, "New York");
	    	fnSelectByvisibleText(_FromMonthDropDown, "September");
	    	fnSelectByIndex(_FromDayDropDown, 10);
	    	fnSelectByvisibleText(_ToCityDropDown, "London");
	    	fnSelectByvisibleText(_ToMonthDropDown, "November");
	    	fnSelectByIndex(_ToDayDropDown, 11);
	   	 	fnClick(_BussinessClassRadioButton);
	    	clickByJS(_ContinueButton,driver);
	    	
	    	
	    	
	    }

			
		}

			
		

					
		
	    
	    
	  
