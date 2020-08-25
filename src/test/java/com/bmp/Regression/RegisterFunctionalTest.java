package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.Registration_Page;

public class RegisterFunctionalTest extends TestBase {
	

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("RegisterFunctionalTest");
	}

	
	@Test
	
	
	public void registrationTest() throws Exception {
		
		
		String unique = "qa_" + AppLibrary.randInt()+"@mailinator.com";
		
		
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
		
		System.out.println("Email :" +unique);
		System.out.println();
		
		new Registration_Page(appLibrary).register(unique, "test12", "test12");
		
		
		System.out.println("Registration functional test passed");

		
		
	}

}
