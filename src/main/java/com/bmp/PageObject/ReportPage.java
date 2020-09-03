package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class ReportPage
{

	AppLibrary appLibrary;
	public static String reportMenu="id:dropdownSubMenureport";
	public static String testSummaryOption="xpath://a[contains(text(),'Tests Summary')]";
	public static String searchTxt="xpath://input[@type='search']";
	public static String showAllReportsOption="xpath://a[contains(text(),'Show all reports')]";
	public static String selectTestSuite="id:TestReport_25296591";
	public static String testSuiteSummary="xpath://div[@class='overview-details']";
	public static String testSuiteScreenShot="xpath://a[@title='Shreenshots']";
	public static String verifyScreenshot="xpath://div[@class='item active']";
	public static String testSuiteLogs="xpath://a[@title='Logs']";
	public static String searchTxtTestSuite="xpath://input[@id='txtSearch']";
	
	
	
	
	
	public ReportPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}
	
	public ReportPage searchReportByPassorFail(String passText,String failText) throws Exception
	{
		appLibrary.clickElement(reportMenu);
		appLibrary.clickElement(testSummaryOption);
		appLibrary.enterInput(searchTxt, passText);
		appLibrary.findElements(searchTxt).clear();
		appLibrary.enterInput(searchTxt, failText);
		
		return new ReportPage(appLibrary);
	}
	public ReportPage searchReportByTestSuiteName(String testSuiteName) throws Exception
	{
		appLibrary.clickElement(reportMenu);
		appLibrary.clickElement(testSummaryOption);
		appLibrary.enterInput(searchTxt, testSuiteName);
		return new ReportPage(appLibrary);
	}
	
	public ReportPage selectShowallReports() throws Exception
	{
		appLibrary.clickElement(reportMenu);
		appLibrary.clickElement(showAllReportsOption);
		return new ReportPage(appLibrary);
	}
	 
    public ReportPage testSuiteReport(String testSuiteName) throws Exception
    {
    	appLibrary.enterInput(searchTxtTestSuite, testSuiteName);
    	//appLibrary.clickElement(selectTestSuite);
    	appLibrary.findElement(testSuiteScreenShot);
    	//appLibrary.findElement(verifyScreenshot);
    	appLibrary.findElement(testSuiteLogs);
    	return new ReportPage(appLibrary);
    }
}
