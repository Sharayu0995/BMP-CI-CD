package com.bmp.PageObject;

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
	public static String message="id:SuccessAlertMsg";

	public CreateNewTestPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	public CreateNewTestPage newTest(String tName) throws Exception {

		appLibrary.clickElement(LoginPage.CreatNewTest);

		appLibrary.findElement(FileInput)
				.sendKeys("D:\\ls\\BMP\\BMP-Project\\Applications\\IOS\\Zencanna Distribution.app.zip");
		AppLibrary.waitTillDataLoaded("//div[@title='Zencanna Distribution.app.zip']", "title", "Zencanna Distribution.app.zip");

		appLibrary.findElement(FileInput).sendKeys(
				"D:\\ls\\BMP\\BMP-Project\\Applications\\IOS\\BMT_MobileAutomation.jar");

		AppLibrary.waitTillDataLoaded("//div[@title='BMT_MobileAutomation.jar']", "title",
				"BMT_MobileAutomation.jar");

		appLibrary.findElement(FileInput)
				.sendKeys("D:\\ls\\BMP\\BMP-Project\\Applications\\IOS\\BMTTest19800noAp3j7024ui.java");
		AppLibrary.waitTillDataLoaded("//div[@title='BMTTest19800noAp3j7024ui.java']", "title", "BMTTest19800noAp3j7024ui.java");

		appLibrary.findElement(FileInput)
				.sendKeys("D:\\ls\\BMP\\BMP-Project\\Applications\\IOS\\BMTYaml198007SZnhENLpQLM.yml");
		AppLibrary.waitTillDataLoaded("//div[@title='BMTYaml198007SZnhENLpQLM.yml']", "title", "BMTYaml198007SZnhENLpQLM.yml");

		appLibrary.waitTillElementLoaded(FileInput);

		// appLibrary.waitTillElementisDisplayed(addButt);

		
		appLibrary.findElement(TestN).clear();
         appLibrary.enterInput(TestN, tName);
        // appLibrary.sleep(5000);
         appLibrary.findElement(SaveTest).click();
         //Verify Created Test
         appLibrary.findElement(message);
		//testName = appLibrary.findElement(TestN).getAttribute("value");

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
