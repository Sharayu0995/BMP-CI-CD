package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.ForgotPassPage;
import com.bmp.PageObject.Registration_Page;

public class FogotPassFunTest extends TestBase {
	public static String emailLogin = "id:txtEmail";
	public static String passLogin = "id:txtPassword";
	public static String loginButt = "id:kc-login";
	public static String CreatNewTest = "xpath://button[text()='Create Test']";

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("FogotPassFunTest");
	}

	@Test
	public void forgotPass() throws Exception {
		String newPass = "test123";
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		String unique = "qa_" + AppLibrary.randInt() + "@mailinator.com";
		System.out.println(unique);

		// appLibrary.getDriverInstance();
		appLibrary.launchApp();
		appLibrary.clickElement(Registration_Page.registerButt);

		new Registration_Page(appLibrary).register(unique, "test12", "test12");

		if (appLibrary.findElement("link:Skip").isDisplayed()) {

			Registration_Page.skipthetour();
			appLibrary.findElement(CreatNewTest);
			Registration_Page.logout();
		} else {
			appLibrary.findElement(CreatNewTest);
			Registration_Page.logout();

		}

		new ForgotPassPage(appLibrary).forgotPass(unique, newPass);

		appLibrary.enterText(emailLogin, unique);
		appLibrary.enterText(passLogin, newPass);
		appLibrary.clickElement(loginButt);
		appLibrary.findElement(CreatNewTest);
		System.out.println("Forgpt password fun test passsed");

	}

}
