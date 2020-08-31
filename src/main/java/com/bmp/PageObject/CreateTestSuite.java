package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class CreateTestSuite 
{
	AppLibrary appLibrary;
	public static String createTestSuiteButton="xpath://button[contains(text(),'Create Test Suite')]";
	public static String testNameInput="id:TestSuiteName";
	public static String selectTestButton="id:btnCreateSuite";
	public static String selectTest="xpath:(//input[@name='id[]'])[1]";
	public static String saveTestSuiteButton="id:save-test";
	public static String runTestSuiteButton="id:run-test";
	public static String searchInput="xpath://div[@id='account-test-list_filter']/label/input[@type='search']";
	public static String seletcButton="xpath://button[contains(text(),'Select')]";
	public static String message="id:SuccessAlertMsg";
	public static String testSuiteMenu="id:TestSuiteMenu";
	public static String humburgerButton="xpath://button[@id='test-actions-dropdown-toggle']";
	public static String editTestSuiteOption="xpath://span[contains(text(),'Edit Test Suite')]";
	public static String searchTxtInput="xpath://input[@id='txtSearch']";
	public static String duplicateTestSuiteOption="xpath://span[contains(text(),'Duplicate Test Suite')]";
	public static String testSuites="xpath://a[contains(text(),'Test Suites')]";
	public static String deleteSuiteOption="xpath://span[contains(text(),'Delete Test Suite')]";
	
	
	
	public CreateTestSuite(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}
	
	public CreateTestSuite newTestSuite(String testSuiteName,String searchTestName) throws Exception
	{
		appLibrary.clickElement(createTestSuiteButton);
		appLibrary.findElement(testNameInput).clear();
		appLibrary.enterInput(testNameInput, testSuiteName);
		appLibrary.clickElement(selectTestButton);
		appLibrary.enterInput(searchInput, searchTestName);
		appLibrary.clickElement(selectTest);
		appLibrary.clickElement(seletcButton);
		appLibrary.clickElement(saveTestSuiteButton);
		appLibrary.findElement(message);
		appLibrary.clickElement(runTestSuiteButton);
		
		
		return new CreateTestSuite(appLibrary);
	}
	
	public CreateTestSuite editTestSuite(String editTestName) throws Exception
	{
		appLibrary.clickElement(testSuiteMenu);
		appLibrary.clickElement(humburgerButton);
		appLibrary.clickElement(editTestSuiteOption);
		appLibrary.findElement(testNameInput).clear();
		appLibrary.enterInput(testNameInput, editTestName);
		appLibrary.clickElement(saveTestSuiteButton);
		appLibrary.findElement(message);
		appLibrary.clickElement(testSuiteMenu);
		appLibrary.enterInput(searchTxtInput,editTestName);
		return new CreateTestSuite(appLibrary);
	}
	
	public CreateTestSuite duplicateTestSuite(String duplicateTestSuiteName) throws Exception
	{
		appLibrary.clickElement(humburgerButton);
		appLibrary.clickElement(duplicateTestSuiteOption);
		appLibrary.clickElement(testSuiteMenu);
		appLibrary.enterInput(searchTxtInput,duplicateTestSuiteName);
		return new CreateTestSuite(appLibrary);
	}
	
	public CreateTestSuite deleteTestSuite(String deletedTestsuiteName) throws Exception
	{
		appLibrary.clickElement(testSuites);
		appLibrary.enterInput(searchTxtInput,deletedTestsuiteName);
		appLibrary.clickElement(humburgerButton);
		appLibrary.clickElement(deleteSuiteOption);
		appLibrary.clickElement(testSuiteMenu);
		appLibrary.enterInput(searchTxtInput,deletedTestsuiteName);
		
		return new CreateTestSuite(appLibrary);
	}
}
