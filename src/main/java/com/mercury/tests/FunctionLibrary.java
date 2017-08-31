package com.mercury.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class FunctionLibrary {

	/*ThreadLocal<RemoteWebDriver> threadDriver = new ThreadLocal<RemoteWebDriver>();
	Logger log = LoggerFactory.getLogger(getClass());


	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void beforeMethod(@Optional("firefox") String browser) {

		RemoteWebDriver driver ;

		switch(browser){	  

		case "firefox":
			driver = new FirefoxDriver();
			threadDriver.set(driver);
			break;

		case "ie":

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			capabilities.setCapability(CapabilityType.VERSION, "11");
			capabilities.setCapability("nativeEvents", true);
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability("ignoreZoomSetting", true);			
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
			threadDriver.set(driver);

			break;

		case "chrome":
			driver = new ChromeDriver();
			break;
		}



	}

	public RemoteWebDriver getDriver(){
		return threadDriver.get();
	}
*/
}
