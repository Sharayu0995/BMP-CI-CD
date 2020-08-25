package com.bmp.Regression;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.CreateNewTestPage;
import com.bmp.PageObject.EditTestPage;
import com.bmp.PageObject.LoginPage;

public class EditTestFunTest extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("EditTestFunTest");
	}

	@Test
	public void launch() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		new LoginPage(appLibrary).login("qa638@mailinator.com", "test123");
		new CreateNewTestPage(appLibrary).newTest(testName);
		new EditTestPage(appLibrary).DoEditTest();
		new EditTestPage(appLibrary).verifyEditedTest();



	}


}
