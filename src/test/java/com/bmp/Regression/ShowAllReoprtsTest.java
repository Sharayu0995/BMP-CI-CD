package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;

import com.bmp.PageObject.LoginPage;
import com.bmp.PageObject.ReportPage;

public class ShowAllReoprtsTest extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}
	@Test
	public void showAllReoprtsTest() throws Exception
	{
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		String testSuiteName="BMT_16_7_11:55";
		new LoginPage(appLibrary).login("qa638@mailinator.com", "test12");
		new ReportPage(appLibrary).selectShowallReports();
		new ReportPage(appLibrary).testSuiteReport(testSuiteName);
		
		
		
		
	}
}
