package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.DuplicateTestPage;
import com.bmp.PageObject.LoginPage;

public class DuplicateFunTest extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}

	@Test
	public void DuplicateTesting() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();

		new LoginPage(appLibrary).login("qa638@mailinator.com", "test123");
		new DuplicateTestPage(appLibrary).CreateDuplicateTest();
		new DuplicateTestPage(appLibrary).VerifyDuplicateTest();

	}
}
