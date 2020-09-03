package com.bmp.Regression;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.CreateNewTestPage;
import com.bmp.PageObject.DeleteTestPage;
import com.bmp.PageObject.LoginPage;

public class SearchandDeleteTest extends TestBase
{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("DuplicateFunTest");
	}
	
	@Test
	public void deletedTest() throws Exception
	{
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		String myTestName="My Test" + AppLibrary.randIntDigits(0, 99);
        new LoginPage(appLibrary).login("qa638@mailinator.com", "test12");
		new CreateNewTestPage(appLibrary).newTest(myTestName);
		new DeleteTestPage(appLibrary).searchTest(myTestName);
		new DeleteTestPage(appLibrary).searchTesttoDelete(myTestName);
		
	}

}
