package com.bmp.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bmp.Library.AppLibrary;

public class CreateNewTestPage {

	private static final long GLOBALTIMEOUT = 10000;
	AppLibrary appLibrary;
	public static String CreateTestButt = "id:btnCreateTest";
	public static String UploadScriptsButt = "id:btnUploadFiles";
	public static String FileInput = "xpath://input[@type='file']";
	public static String addButt = "class:add-button";
	public static String SaveTest = "id:save-test";
	public static String TestName = "id:testName";
	public static String TestN = "id:testName";
	public static String testName = "";
	public static String javaFile = "";
	public static String ymlFile = "";
	public static String jarFile = "";
	public static String appFile = "";
	public static String TestsMenu = "id:TestsMenu";
	public static String TestsSearch = "id:txtSearch";
	public static String test = "class:name";
	public static String testNameBlock = "id:testName";
	public static String testNameinBlock = "";

	public CreateNewTestPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	public CreateNewTestPage newTest() throws Exception {

		appLibrary.clickElement(LoginPage.CreatNewTest);

		appLibrary.findElement(FileInput)
				.sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/BeanLogin.app.zip");
		AppLibrary.waitTillDataLoaded("//div[@title='BeanLogin.app.zip']", "title", "BeanLogin.app.zip");

		appLibrary.findElement(FileInput).sendKeys(
				"D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/Demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar");

		AppLibrary.waitTillDataLoaded("//div[@title='Demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar']", "title",
				"Demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar");

		appLibrary.findElement(FileInput)
				.sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/RegistrationTestIos.java");
		AppLibrary.waitTillDataLoaded("//div[@title='RegistrationTestIos.java']", "title", "RegistrationTestIos.java");

		appLibrary.findElement(FileInput)
				.sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/appiumDemoTaurus.yml");
		AppLibrary.waitTillDataLoaded("//div[@title='appiumDemoTaurus.yml']", "title", "appiumDemoTaurus.yml");

		appLibrary.waitTillElementLoaded(FileInput);

		// appLibrary.waitTillElementisDisplayed(addButt);

		appLibrary.findElement(SaveTest).click();

		testName = appLibrary.findElement(TestN).getAttribute("value");

		return new CreateNewTestPage(appLibrary);

	}

	public CreateNewTestPage VerificationOfCreatedTest() throws Exception {
		appLibrary.findElement(TestsMenu).click();
		appLibrary.findElement(TestsSearch).sendKeys(testName);

		appLibrary.findElement(test).click();
		testNameinBlock = appLibrary.findElement(testNameBlock).getAttribute("value");

		if (testName.contains(testNameinBlock)) {
			System.out.println("Test was created");
		} else {
			System.out.println("Something bad happening");

		}

		return new CreateNewTestPage(appLibrary);
	}

}
