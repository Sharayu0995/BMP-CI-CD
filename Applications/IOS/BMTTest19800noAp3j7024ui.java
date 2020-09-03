package com.bmt.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import com.bmt.commons.Library;
import com.blazemeter.taurus.testng.TestNGRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BMTTest19800noAp3j7024ui {
	public AppiumDriver<MobileElement> driver;
	public Library lib;

	@BeforeClass
	public void setup() throws MalformedURLException {
		lib = new Library("Test Started");
		driver = lib.launchDriver();
	}

	@Test
	public void registrationTest() throws Exception {
		lib.enterMobileText("xpath://XCUIElementTypeApplication[@name='Distribution']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField","test@mail.com");
lib.saveScreenshot();
lib.clickMobileElement("xpath://XCUIElementTypeApplication[@name='Distribution']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
lib.clickMobileElement("id:Done");
lib.saveScreenshot();
lib.enterMobileText("xpath://XCUIElementTypeApplication[@name='Distribution']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField","test12");
lib.saveScreenshot();
lib.clickMobileElement("xpath://XCUIElementTypeApplication[@name='Distribution']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField");


	}

	@AfterClass
	public void afterClass() {
		lib.quitBrowser();
	}

}