package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class Registration_Page {
	static AppLibrary appLibrary;

	public static String emailInput = "id:txtRegEmail";
	public static String passInput = "id:txtRegPassword";
	public static String confirmPassInput = "id:txtConfirmPassword";
	public static String registerButt = "id:kc-login";
	public static String Signupbutt = "xpath://button[@class='signUpButton']";
	public static String CreatNewTest = "xpath://button[text()='Create Test']";
	public static String profile = "id:profile-div";
	public static String logout = "link:Logout";

	public static String emailLogin = "id:txtEmail";
	public static String passLogin = "id:txtPassword";
	public static String loginButt = "id:kc-login";

	public Registration_Page(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	public static void skipthetour() {
		appLibrary.findElement("link:Skip").click();
	
	}

	public static void logout() throws Exception
	{
		appLibrary.clickElement(profile);
		appLibrary.clickElement(logout);

	}
	public Registration_Page register(String email, String pass, String confirmPass) throws Exception {
		appLibrary.clickElement(Signupbutt);

		appLibrary.enterInput(emailInput, email);
		appLibrary.enterText(passInput, pass);
		appLibrary.enterText(confirmPassInput, confirmPass);

		appLibrary.clickElement(registerButt);
		
		if( appLibrary.findElement("link:Skip").isDisplayed()){
			
		skipthetour();
		appLibrary.findElement(CreatNewTest);
		logout();
		}
		else
		{
			appLibrary.findElement(CreatNewTest);
			logout();
			
		}
		
		
		appLibrary.enterText(emailLogin, email);
		appLibrary.enterText(passLogin, pass);
		appLibrary.clickElement(loginButt);
		appLibrary.findElement(CreatNewTest);
		System.out.println("Login Done");

		return new Registration_Page(appLibrary);

	}

}
