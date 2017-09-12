package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class PracticePage extends FunctionLibrary
{
	RemoteWebDriver driver;
	
	
	@FindBy(how = How.CSS, using = "#navbtn_tutorials")
	public WebElement _onClickTutorial;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'HTML')]")
	public WebElement _onClickLearnHtml;
	
	public PracticePage(RemoteWebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void fnPracticepath()
	{
		driver.get("https://www.w3schools.com/");
		fnClick(_onClickTutorial);
		fnClick(_onClickLearnHtml);
	}
  
}
