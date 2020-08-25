package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;



public class TestSampleRegression extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("TestSampleRegression");
	}

	@Test
	public void launch() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
	}
}