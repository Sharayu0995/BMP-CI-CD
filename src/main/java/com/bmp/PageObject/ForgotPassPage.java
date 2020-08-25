package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class ForgotPassPage {
	AppLibrary appLibrary;

	public static String FPLink = "id:loginForgotPasswordlink";
	public static String EmailofForgot = "id:txtEmail";
	public static String resetButt = "id:kc-login";
	public static String Pass = "id:txtPassword";
	public static String LoginOnforgot = "id:kc-login";
	public static String newPass = "id:txtPassword";
	public static String confirmPass = "id:txtConfirmPassword";
	public static String reset = "id:kc-login";

	public static String mailinator = "xpath://*[@id='addOverlay']";
	public static String Go = "xpath://button[@id='go-to-public']";
	public static String EmailName = "xpath://a[contains(text(),'Reset password')]";

	public static String TempPass = "xpath://div//span//p//span";

	public static String emailLogin = "id:txtEmail";
	public static String passLogin = "id:txtPassword";
	public static String msgbody = "id:msg_body";
	public static String profile = "id:profile-div";
	public static String logout = "link:Logout";

	public ForgotPassPage(AppLibrary appLibrary) throws Exception {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	public ForgotPassPage forgotPass(String email, String newPassw) throws Exception {

		appLibrary.clickElement(FPLink);
		appLibrary.enterText(EmailofForgot, email);
		appLibrary.clickElement(resetButt);

		appLibrary.gotoUrl("https://www.mailinator.com/");
		appLibrary.enterText(mailinator, email);
		appLibrary.clickElement(Go);
		appLibrary.clickElement(EmailName);
		appLibrary.switchToIframe(msgbody);

		String tempPassword = appLibrary.findElement(TempPass).getText();
		System.out.println(tempPassword);
		appLibrary.gotoUrl("https://test.blazemobilepro.com/");

		appLibrary.enterText(emailLogin, email);
		appLibrary.enterText(passLogin, tempPassword);
		Thread.sleep(3000);

		appLibrary.clickElement(LoginOnforgot);
		Thread.sleep(3000);
		appLibrary.enterText(newPass, newPassw);
		appLibrary.enterText(confirmPass, newPassw);
		appLibrary.clickElement(reset);

		if (appLibrary.findElement("link:Skip").isDisplayed()) {

			Registration_Page.skipthetour();
			appLibrary.findElement(Registration_Page.CreatNewTest);
			Registration_Page.logout();
		} else {
			appLibrary.findElement(Registration_Page.CreatNewTest);
			Registration_Page.logout();

		}

		
		

		return new ForgotPassPage(appLibrary);
	}
}
