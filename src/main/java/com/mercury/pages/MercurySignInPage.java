package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MercurySignInPage {
	RemoteWebDriver driver;
	
	@FindBy(how=How.NAME, using="userName")
		public WebElement _uname;
	
	@FindBy(how=How.NAME, using="password")
		public WebElement _pwd;


	@FindBy(how=How.NAME, using="login")
		public WebElement _login;

	public MercurySignInPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
  
  public void loginToMercury(String u, String p) {
	  driver.get("http://newtours.demoaut.com/");
	  _uname.clear();
	  _uname.sendKeys(System.getenv(u));
	  _pwd.clear();
	  _pwd.sendKeys(System.getenv(p));
	  _login.click();
  }
}
