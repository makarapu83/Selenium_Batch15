package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class FlightSearchPage extends FunctionLibrary
{
	RemoteWebDriver driver; 
	
	@FindBy(how=How.XPATH, using="//input[@name='tripType' and @value='oneway']")
	public WebElement _onewayRadioButton;
	
	@FindBy(how = How.XPATH, using = "//select[@name ='passCount']")
	public WebElement _passengers;
	
	@FindBy(how = How.XPATH, using = "//select[@name='fromPort']")
	public WebElement _fromCity;
	
	@FindBy(how = How.XPATH, using = "//select[@name='fromMonth']")
	public WebElement _fromMonth;
	
	@FindBy(how = How.XPATH, using = "//select[@name='fromDay']")
	public WebElement _fromDay;
	
	@FindBy(how = How.XPATH, using = "//select [@name='toPort']")
	public WebElement _toCity;
	
	@FindBy(how=How.XPATH, using = "//input[@name='servClass' and @value='Business']")
	public WebElement _businessClass;

	public FlightSearchPage(RemoteWebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public void flightSearch()
	{
		
		fnClick(_onewayRadioButton);
		fnselectByIndex(_passengers,2);
		fnSelectByValue(_fromCity,"London");
		fnSelectByValue(_fromMonth,"5");
		fnselectByIndex(_fromDay,5);
		fnSelectByvisibility(_toCity,"Sydney");
		fnClick(_businessClass);
		
	}

	
  
}
