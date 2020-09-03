package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class DuplicateTestPage {
	AppLibrary appLibrary;

	public static String DuplicatedTestName = "";
	public static String testsToggle = "id:test-actions-dropdown-toggle";
	public static String DuplicateTestOption = "xpath://a/span[contains(text(),'Duplicate Test')]";

	public DuplicateTestPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	public DuplicateTestPage CreateDuplicateTest() throws Exception {

		new CreateNewTestPage(appLibrary).newTest();
		Thread.sleep(1000);
		appLibrary.findElement(CreateNewTestPage.TestsMenu).click();

		appLibrary.findElement(CreateNewTestPage.TestsSearch).sendKeys(CreateNewTestPage.testName);
		appLibrary.findElement(testsToggle).click();
		appLibrary.findElement(DuplicateTestOption).click();

		appLibrary.findElement(CreateNewTestPage.TestsMenu).click();

		// CreateNewTestPage.testName
		appLibrary.findElement(CreateNewTestPage.TestsSearch).sendKeys(CreateNewTestPage.testName);
		Thread.sleep(2000);
		appLibrary.findElement(CreateNewTestPage.test).click();

		DuplicatedTestName = appLibrary.findElement(CreateNewTestPage.testNameBlock).getAttribute("value");
		System.out.println(DuplicatedTestName);
		System.out.println("Duplicated Test name is =" + DuplicatedTestName);

		return new DuplicateTestPage(appLibrary);

	}

	public DuplicateTestPage VerifyDuplicateTest() {

		if (DuplicatedTestName.contains("Copy")) {
			System.out.println("Test was duplicated");
		} else {
			System.out.println("Something bad happening");
		}

		return new DuplicateTestPage(appLibrary);

	}

}
