package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class LoginPage {
	AppLibrary appLibrary;
	public static String emailLogin = "id:txtEmail";
	public static String passLogin = "id:txtPassword";
	public static String loginButt = "id:kc-login";
	public static String CreatNewTest = "xpath://button[text()='Create Test']";

	public LoginPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();

	}
	public LoginPage login(String email, String password) throws Exception {
		appLibrary.enterText(emailLogin, email);
		appLibrary.enterText(passLogin, password);
		appLibrary.clickElement(loginButt);
		appLibrary.findElement(CreatNewTest);
		return new LoginPage(appLibrary);


	}
	
	
	}


