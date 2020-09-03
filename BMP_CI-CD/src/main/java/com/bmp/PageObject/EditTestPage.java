package com.bmp.PageObject;

import org.openqa.selenium.WebDriver;

import com.bmp.Library.AppLibrary;

public class EditTestPage {

	WebDriver driver;
	AppLibrary appLibrary;

	public static String EditTestOption = "xpath://span[contains(text(),'Edit Test')]";
	public static String NewName = "Edited_Test";
	public static String NewNameReturned = "Edited_Test";

	public static String Desc = "Test is being Edited";
	public static String delete = "name:Command";
	public static String DescBlock = "id:txtDesc";
	public static String DescReturned = "";

	public static String validMsg = "xpath://label[contains(text(),'Please Upload .yml and .zip of app file before you')]";
	public static String validMsgReturned = "";

	public EditTestPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public EditTestPage DoEditTest() throws Exception {
		appLibrary.findElement(CreateNewTestPage.TestsMenu).click();

		appLibrary.findElement(CreateNewTestPage.TestsSearch).sendKeys("MobileTest_24_7_02:14 PM");// CreateNewTestPage.testName
		appLibrary.findElement(DuplicateTestPage.testsToggle).click();
		appLibrary.findElement(EditTestOption).click();
		
		  appLibrary.findElement(CreateNewTestPage.TestN).clear(); Thread.sleep(2000);
		  appLibrary.findElement(CreateNewTestPage.TestN).sendKeys(NewName);
		  appLibrary.findElement(DescBlock).sendKeys(Desc);
		 
		//appLibrary.findElement(delete).click();
		Thread.sleep(5000);

		appLibrary.findElement(CreateNewTestPage.SaveTest).click();
		return new EditTestPage(appLibrary);

	}

	public EditTestPage verifyEditedTest() {
		appLibrary.findElement(CreateNewTestPage.TestsMenu).click();
		appLibrary.findElement(CreateNewTestPage.TestsSearch).sendKeys(NewName);
		NewNameReturned = appLibrary.findElement(CreateNewTestPage.testNameBlock).getAttribute("value");

		appLibrary.findElement(CreateNewTestPage.test).click();

		DescReturned = appLibrary.findElement(DescBlock).getAttribute("value");
		validMsgReturned = appLibrary.findElement(validMsg).getText();
		
		
		if (DescReturned.contains(Desc) && NewNameReturned.contains(NewName)) {
         System.out.println("Test was edited");
		}
		else
		{
			 System.out.println("Something wrong happening");
		}

		return new EditTestPage(appLibrary);

	}

}
