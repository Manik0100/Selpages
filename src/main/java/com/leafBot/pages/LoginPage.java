package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() { // Pagefactory code
	}

	public LoginPage enterUsername(String data) {
		driver.findElementById("username").sendKeys(data);
		return this;
	}

	public void enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		//return this;
	
	//public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		/*
		 * HomePage page = new HomePage(); return page;
		 */
		//return new HomePage();
	//}

}
}
