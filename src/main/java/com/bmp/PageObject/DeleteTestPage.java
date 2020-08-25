package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class DeleteTestPage
{
	AppLibrary appLibrary;
	 public static String clickOnTestMenu="xpath://*[@id='TestsMenu']";
	 public static String searchTxt="id:txtSearch";
	 public static String selectTest="xpath://*[@id='detailContent']";
	 public static String clickonThreedottedButton="xpath://*[@id='test-actions-dropdown-toggle']";
	 public static String clickOnDeleteTest="xpath://span[contains(text(),'Delete Test')]";
	 
	 public static String verifyMsg="xpath://*[@class='alert alert-success']";
	 public static String testName="id:testName";
	 public static String verifyTestname="xpath://*[@id='divNoData']";
	 
	public DeleteTestPage(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	//Delete Any Random Test
	public DeleteTestPage DeleteRandomTest() throws Exception
	{
		appLibrary.clickElement(clickOnTestMenu);
		appLibrary.sleep(2000);
		String myTestName=appLibrary.findElement(testName).getText();
		System.out.println(myTestName);
		appLibrary.clickElement(clickonThreedottedButton);
		appLibrary.clickElement(clickOnDeleteTest);
		appLibrary.sleep(7000);
	     appLibrary.findElement(verifyMsg);
		return new DeleteTestPage(appLibrary);
	}
	
	//Verify Deleted Test
	public DeleteTestPage searchDeleteRandomTestName(String testname) throws Exception
	{
		appLibrary.clickElement(clickOnTestMenu);
		appLibrary.sleep(2000);
		String myTestName=appLibrary.findElement(testName).getText();
		System.out.println(myTestName);
		appLibrary.enterInput(searchTxt, myTestName);
		appLibrary.findElement(verifyTestname);
		System.out.println("Test is not Found");
	
		return new DeleteTestPage(appLibrary);
	}
	
	//Test deleted by Search
	public DeleteTestPage searchTesttoDelete(String testname) throws Exception
	{
		appLibrary.clickElement(clickOnTestMenu);
		appLibrary.sleep(2000);
        appLibrary.enterInput(searchTxt, testname);
        appLibrary.sleep(5000);
		appLibrary.clickElement(clickonThreedottedButton);
		appLibrary.sleep(2000);
		appLibrary.clickElement(clickOnDeleteTest);
		appLibrary.sleep(7000);
	    appLibrary.findElement(verifyMsg);
	    appLibrary.sleep(5000);
	    //Verify
	    appLibrary.enterInput(searchTxt, testname);
        appLibrary.findElement(verifyTestname);
		
		return new DeleteTestPage(appLibrary);
	}
	
}
