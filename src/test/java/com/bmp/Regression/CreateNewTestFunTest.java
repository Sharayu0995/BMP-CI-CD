package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.CreateNewTestPage;
import com.bmp.PageObject.LoginPage;

public class CreateNewTestFunTest extends TestBase {
	
	
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("CreateNewTestFunctionalTest");
	}

	@Test
	public void newTestCreator() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
		new LoginPage(appLibrary).login("qa638@mailinator.com", "test12");

		
		new CreateNewTestPage(appLibrary).newTest(testName);
		new CreateNewTestPage(appLibrary).VerificationOfCreatedTest();
	}

}
