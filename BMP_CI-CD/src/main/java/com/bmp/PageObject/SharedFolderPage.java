package com.bmp.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;


import com.bmp.Library.AppLibrary;

public class SharedFolderPage {
	AppLibrary appLibrary;
	public static String folderName = "IOSFiles";
	public static String SharedFolderLink = "link:Shared Folders";
	public static String plusButt = "xpath://button[@title='Create new shared folder']";
	public static String folderNameField = "id:txtFolderName";
	public static String saveFolder = "id:btnCreateFolder";
	public static String clickOnfolder = "xpath://a[text()='IOSFiles']";
	public static String fileUpload = "name:file";

	public static String emailInput1 = "id:txtRegEmail";
	public static String passInput1 = "id:txtRegPassword";
	public static String confirmPassInput1 = "id:txtConfirmPassword";
	public static String registerButt1 = "id:kc-login";

	public static String Signupbutt = "xpath://button[@class='signUpButton']";

	public static String profile = "xpath://div[@id='profile-div']";
	public static String createTest = "xpath://button[text()='Create Test']";
	public static String folder = "xpath://a[text()='Shared Folder']";

	
	public static String folderLink = "xpath://input[@class='chkSelectFolder'][@value='IOSFiles']";
	public static String selectFolder = "id:GetSelectedfolderDiv";
	public static String addbutt = "class:add-button";

	public static String savebutt = "id:save-test";
	public static String testName = "id:testName";
	//WebDriverWait wait=new WebDriverWait(appLibrary.driver, 120);

	public SharedFolderPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();

	}

	public SharedFolderPage createFolder() throws Exception {

		appLibrary.clickElement(profile);
		appLibrary.clickElement(SharedFolderLink);
		appLibrary.clickElement(plusButt);
		appLibrary.findElement(folderNameField).sendKeys(folderName);
		appLibrary.clickElement(saveFolder);
		appLibrary.waitForPageToLoad();
		appLibrary.clickElement(clickOnfolder);
		appLibrary.findElement(fileUpload)
				.sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)\\appiumDemoTaurus.yml");
		appLibrary.waitForPageToLoad();

		appLibrary.findElement(fileUpload)
				.sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)\\RegistrationTestIos.java");
		appLibrary.waitForPageToLoad();

		appLibrary.findElement(fileUpload).sendKeys(
				"D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)\\Demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar");
		appLibrary.waitForPageToLoad();

		appLibrary.findElement(fileUpload)
				.sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)\\BeanLogin.app.zip");
		appLibrary.waitForPageToLoad();
		return new SharedFolderPage(appLibrary);

	}

	public SharedFolderPage verifyFolder() throws Exception {
		appLibrary.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		appLibrary.clickElement(createTest);
		appLibrary.clickElement(folder);
		
		appLibrary.clickElement(folderLink);
		appLibrary.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		appLibrary.clickElement(selectFolder);
		appLibrary.waitTillElementLoaded(addbutt);
		
		appLibrary.clickElement(savebutt);
		return new SharedFolderPage(appLibrary);

	}

}