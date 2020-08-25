package com.bmp.Regression;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.DeleteTestPage;
import com.bmp.PageObject.LoginPage;

public class DeleteTest extends TestBase
{

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}
	
	@Test
	public void DeleteTest() throws Exception
	{
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
		new LoginPage(appLibrary).login("qa638@mailinator.com","test12");
		new DeleteTestPage(appLibrary).DeleteRandomTest();
		new DeleteTestPage(appLibrary).searchDeleteRandomTestName(testName);
	}
}
