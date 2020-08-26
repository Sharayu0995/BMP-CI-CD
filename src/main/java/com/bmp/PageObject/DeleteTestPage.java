package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class DeleteTestPage
{
	AppLibrary appLibrary;
	 public static String testMenu="xpath://*[@id='TestsMenu']";
	 public static String searchInput="id:txtSearch";
	 public static String humburgerButton="xpath://*[@id='test-actions-dropdown-toggle']";
	 public static String deleteOption="xpath://span[contains(text(),'Delete Test')]";
	 
	 public static String deleteMessage="xpath://*[@class='alert alert-success']";
	 public static String testName="id:testName";
	 public static String notTestFoundMessage="xpath://*[@id='divNoData']";
	 
	public DeleteTestPage(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	//Delete Any Test
	public DeleteTestPage deleteTest() throws Exception
	{
		appLibrary.clickElement(testMenu);
		
		String myTestName=appLibrary.findElement(testName).getText();
		System.out.println(myTestName);
		appLibrary.clickElement(humburgerButton);
		appLibrary.clickElement(deleteOption);
		
	     appLibrary.findElement(deleteMessage);
		return new DeleteTestPage(appLibrary);
	}
	
	//Verify Deleted Test
	public DeleteTestPage verifyDeletedTest(String testname) throws Exception
	{
		appLibrary.clickElement(testMenu);
		
		String myTestName=appLibrary.findElement(testName).getText();
		System.out.println(myTestName);
		appLibrary.enterInput(searchInput, myTestName);
		appLibrary.findElement(notTestFoundMessage);
		System.out.println("Test is not Found");
	
		return new DeleteTestPage(appLibrary);
	}
	//=============================================================================================================
	//Search Test  function
	public DeleteTestPage searchTest(String testname) throws Exception
	{
		appLibrary.clickElement(testMenu);
		
        appLibrary.enterInput(searchInput, testname);
        return new DeleteTestPage(appLibrary);
	}
	
	//Test deleted by Search
	public DeleteTestPage searchTesttoDelete(String testname) throws Exception
	{
		
		appLibrary.clickElement(humburgerButton);
		
		appLibrary.clickElement(deleteOption);
		
	    appLibrary.findElement(deleteMessage);
	   
	    //Verify
	    appLibrary.enterInput(searchInput, testname);
        appLibrary.findElement(notTestFoundMessage);
		
		return new DeleteTestPage(appLibrary);
	}
	
}
