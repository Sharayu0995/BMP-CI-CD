package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.LoginPage;
import com.bmp.PageObject.Registration_Page;
import com.bmp.PageObject.SharedFolderPage;

public class SharedFolderFunTest extends TestBase {
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("SharedFolderFunTest");
	}

	@Test
	public void FolderTest() throws Exception {
		

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
		new LoginPage(appLibrary).login("qa638@mailinator.com", "test123");

		new SharedFolderPage(appLibrary).createFolder();

		new SharedFolderPage(appLibrary).verifyFolder();
		

	}
}
