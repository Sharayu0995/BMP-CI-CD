package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.LoginPage;

public class LoginFunctionalTest extends TestBase {
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("LoginFunctionalTest");
	}
	@Test
	public void loginTest() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();

		new LoginPage(appLibrary).login("qa638@mailinator.com", "test123");
		System.out.println("Login functional test passed");

	}

}
