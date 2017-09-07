package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class FlightSearchPage extends FunctionLibrary{

	RemoteWebDriver driver;



	@FindBy(how=How.XPATH, using="//input[@name='tripType' and @value='oneway']")
		public WebElement _onewayRadioButton;

	@FindBy(how=How.XPATH, using = "//select[@name='passCount']")
		public WebElement _passengerDropDown;
	
	@FindBy(how=How.XPATH, using = "//select[@name='fromPort']")
		public WebElement _fromCity;
	
	@FindBy(how=How.XPATH, using = "//input[@name='servClass' and @value='Business']")
		public WebElement _businessClass;

	public FlightSearchPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void flightSearch(){
		//Selecting one way radio button
		fnClick(_onewayRadioButton);
		
		//Selecting Passenger Count
		fnSelectByIndex(_passengerDropDown,2);
	
		//Selecting From City
		fnSelectByValue(_fromCity,"London");		
		
		//Verifying the selected dropdown value
		fnVerifySelectedDropDownOption(_fromCity, "London");
		
		//Selecting Business CLass		
		clickByJS(_businessClass, driver);
				
	}


}
