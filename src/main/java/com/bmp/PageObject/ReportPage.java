package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class ReportPage
{

	AppLibrary appLibrary;
	public static String reportMenu="id:dropdownSubMenureport";
	public static String testSummaryOption="xpath://a[contains(text(),'Tests Summary')]";
	public static String searchTxt="xpath://input[@type='search']";
	
	
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
	
}
