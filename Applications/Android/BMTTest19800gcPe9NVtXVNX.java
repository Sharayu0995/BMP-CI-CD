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

public class BMTTest19800gcPe9NVtXVNX {
	public AppiumDriver<MobileElement> driver;
	public Library lib;

	@BeforeClass
	public void setup() throws MalformedURLException {
		lib = new Library("Test Started");
		driver = lib.launchDriver();
	}

	@Test
	public void registrationTest() throws Exception {
		lib.enterMobileText("id:textInputEditTextEmail","test@mail.com");
lib.saveScreenshot();
lib.enterMobileText("id:textInputEditTextPassword","test12");
lib.saveScreenshot();
lib.saveScreenshot();
lib.clickMobileElement("id:appCompatButtonLogin");
lib.swipeToUp();
lib.swipeToDown();


	}

	@AfterClass
	public void afterClass() {
		lib.quitBrowser();
	}

}