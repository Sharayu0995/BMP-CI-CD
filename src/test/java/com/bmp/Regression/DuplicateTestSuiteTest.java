package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.CreateNewTestPage;
import com.bmp.PageObject.CreateTestSuite;
import com.bmp.PageObject.LoginPage;

public class DuplicateTestSuiteTest extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}

	@Test
	public void editTestSuite() throws Exception
	{
	
	String testSuiteName="Test_Suite_"+AppLibrary.randIntDigits(0, 999);
	String editTestnm="Edited_TestSuite_"+AppLibrary.randIntDigits(0, 99);
	new LoginPage(appLibrary).login("qa638@mailinator.com", "test12");
	new CreateNewTestPage(appLibrary).newTest(testName);
	new CreateTestSuite(appLibrary).newTestSuite(testSuiteName, testName);
	
	new CreateTestSuite(appLibrary).deleteTestSuite(testSuiteName);
	//Edit Test
	new CreateTestSuite(appLibrary).editTestSuite(editTestnm);
	//Duplicate Test
	new CreateTestSuite(appLibrary).duplicateTestSuite(editTestnm+"-Copy");
	}
}
