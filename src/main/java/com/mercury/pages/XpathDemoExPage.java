package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class XpathDemoExPage extends FunctionLibrary {
 
	    RemoteWebDriver driver;
	    
	    @FindBy(how=How.XPATH , using="//td[text()='UserID']")
	    public WebElement _UserIDDisplayLabel;
	
	    @FindBy(how=How.XPATH , using="//td[text()='Password']")
	    public WebElement _passwordDisplayLabel;
	    		    
	    @FindBy(how=How.XPATH , using=" //span[contains(@class,'mandatory')]")
	    public WebElement _mandatoryfieldDisplayLabel; //(mandatory field) xpath using span tag
	   
	    @FindBy(how=How.XPATH , using="//input[@type='text']//following::input")
	    public WebElement _passwordandloginResetbtns; // selected following input fields of user ID
	    
	    @FindBy(how=How.XPATH , using="//input[@type='text']//following::input[1]")
	    public WebElement _passwordbtn; //selected following field of useID i.e password by focussing as INPUT[1]
	   
	    @FindBy(how=How.XPATH , using="//input[@type='text']")
	    public WebElement _UserId;
	   
	    @FindBy(how=How.XPATH , using="//input[@type='password']")
	    public WebElement _password;
	    
	    @FindBy(how=How.XPATH , using="//input[@type='password']//following::input[1]")
	    public WebElement _login;
	 
	    @FindBy(how=How.XPATH , using="//a[@href='Managerhomepage.php']//following::li[1]")
	    public WebElement _NewAccountTab; //selected new account tab through preceeding tab manager
	  
	    @FindBy(how=How.XPATH , using="//input[@type='text']")
	    public WebElement _CustomerName;
	   
	    @FindBy(how=How.XPATH , using="//td[2]/input[2][@type='radio']")
	    public WebElement _FemaleRadioBtn;  //selected female button through a table(td)
	    
	    @FindBy(how=How.XPATH , using=".//*[@id='dob']")
	    public WebElement _DateOfBirth;
	    
	    @FindBy(how=How.XPATH , using="//td[2]/textarea[@name='addr']")
	    public WebElement _Address;
	    
	  	@FindBy(how=How.XPATH , using="//input[@name='city']")
	    public WebElement _City;
	  	
	  	@FindBy(how=How.XPATH , using="//td[2]/input[@name='state']")
	    public WebElement _State;
	  	
	  	@FindBy(how=How.XPATH , using=" //td[2]/input[@name='pinno']")
	    public WebElement _PinNo;
	  
		@FindBy(how=How.XPATH , using=" //td[2]/input[@name='telephoneno']")
	    public WebElement _TelephoneNo;
	  
		@FindBy(how=How.XPATH , using="//input[@name='emailid']")
	    public WebElement _EmailId;
	   
		@FindBy(how=How.XPATH , using="//input[1][@type='submit']")
	    public WebElement _Submit;
	
	    public XpathDemoExPage(RemoteWebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void xpathPgSignIn(String u , String p)
	    {
	    	driver.get("http://demo.guru99.com/v1/");
	    	_UserId.sendKeys(u);
	    	_password.sendKeys(p);
	    	_login.click();
	    	_NewAccountTab.click();
	    	_CustomerName.sendKeys("Bhavani@073");
	    	_FemaleRadioBtn.click();
	    	_DateOfBirth.sendKeys("01-09-1990");
	    	_Address.sendKeys("colg of miletary eng, Qno:137");
	    	_City.sendKeys("Pune");
	    	_State.sendKeys("Maharastra");
	    	_PinNo.sendKeys("411031");
	    	_TelephoneNo.sendKeys("9030358884");
	    	_EmailId.sendKeys("bhavani.073@gmail.com");
	    	_Submit.click();
	    	
	    	
	    }
	  }
