package com.bmp.Regression;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;

import com.bmp.PageObject.LoginPage;
import com.bmp.PageObject.ReportPage;

public class SearchReportByResultTest extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}
	
	@Test
	public void searchReportByGrade() throws Exception
	{
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		//String testSuiteName="Test_Suite_"+AppLibrary.randIntDigits(0, 999);
		//String testName="My IOS Test_"+AppLibrary.randIntDigits(0, 999); 
		new LoginPage(appLibrary).login("qa638@mailinator.com", "test12");
		new ReportPage(appLibrary).searchReportByPassorFail("Pass", "Fail");
		//Search By Test Name
		//new CreateNewTestPage(appLibrary).newTest(testName);
		//new CreateTestSuite(appLibrary).newTestSuite(testSuiteName, testName);
		//new ReportPage(appLibrary).searchReportByTestSuiteName(testSuiteName);
	}

}
