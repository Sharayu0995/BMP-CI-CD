package com.bmp.Regression;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.CreateNewTestPage;
import com.bmp.PageObject.CreateTestSuite;
import com.bmp.PageObject.LoginPage;

public class DeleteTestSuiteTest extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}
	
	@Test
	public void deleteTestSuite() throws Exception
	{
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		String testSuiteName="Test_Suite_"+AppLibrary.randIntDigits(0, 999);
		new LoginPage(appLibrary).login("qa638@mailinator.com", "test12");
		new CreateNewTestPage(appLibrary).newTest(testName);
		new CreateTestSuite(appLibrary).newTestSuite(testSuiteName, testName);
		
		new CreateTestSuite(appLibrary).deleteTestSuite(testSuiteName);
		
		
	}
}
