package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.mercury.tests.FunctionLibrary;

public class DragAndDropPage extends FunctionLibrary {
 
	RemoteWebDriver driver;
	
	Logger log=LoggerFactory.getLogger(getClass());
	
	public DragAndDropPage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="draggable")
	public WebElement _DraggableSrc;
	
	@FindBy(how=How.ID, using="droppable")
	public WebElement _DroppableDest;
	
	@FindBy(how=How.XPATH, using="//iframe[@class='demo-frame']")
	public WebElement _iFrame;
	
	public void dragDropHandle() {
		driver.get("http://jqueryui.com/droppable/");
		fnWaitForFrameAndSwitchToIt(driver, _iFrame);
		fnDargDrop(driver, _DraggableSrc, _DroppableDest);
		driver.switchTo().defaultContent();
	}
}
