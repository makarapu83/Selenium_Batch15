package com.mercury.tests;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
  
	
	
	ThreadLocal<RemoteWebDriver> threadDriver = new ThreadLocal<RemoteWebDriver>();
	Logger log = LoggerFactory.getLogger(getClass());


	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void beforeMethod(@Optional("firefox") String browser) {

		RemoteWebDriver driver = null;

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

		threadDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public RemoteWebDriver getDriver(){
		return threadDriver.get();
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod(ITestResult result){
		log.info(result.toString());

		String testCase = result.getName();

		if(!(ITestResult.FAILURE==result.getStatus())){ //true
			log.info("Execution result: "+testCase+ " Test Result is -- PASS");			
		}else if(ITestResult.FAILURE == result.getStatus()){ //true
			log.info("Execution result: "+testCase+ " Test Result is -- FAIL");	
			
			String screenshotName = result.getName()+"_"+getTimeStamp()+".png";
			try{

				File file = new File("Screenshots");
				if(!file.exists()){
					file.mkdirs();
				}
				File targetFile = new File("Screenshots",screenshotName);
				File screenShotFile = ((TakesScreenshot) threadDriver.get()).getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(screenShotFile, targetFile);
			}catch(Exception e){
				log.info("An exception occured while taking screenshot "+e.getCause());
			}			
		}

		if(threadDriver.get() !=null){
			threadDriver.get().close();
			threadDriver.get().quit();
			
		}
	}

	public String getTimeStamp(){
		String timeNow;
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Calendar cal = Calendar.getInstance();
		timeNow = dateFormat.format(cal.getTime());
		return timeNow;
	}


}
