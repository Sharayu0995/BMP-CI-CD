package com.bmp.PageObject;

import org.openqa.selenium.WebDriver;

import com.bmp.Library.AppLibrary;



public class TestSamplePage {

	WebDriver driver;
	AppLibrary appLibrary;

	String xpathSampleLocatorString = "xpath://locator";
	
	public TestSamplePage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	
}
