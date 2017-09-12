package com.mercury.tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mercury.pages.FlightSearchPage;
import com.mercury.pages.PracticePage;


public class PracticeTest extends BaseTest
{
    @Test 
	public void testcase_p1()
     {
		
		RemoteWebDriver driver = getDriver();
		
		PracticePage p = new PracticePage(driver);
		p.fnPracticepath();
}
}
