<<<<<<< HEAD
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginPage extends ProjectHooks{
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	@And("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	 
	@And("Click Login button")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}

}
=======
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginPage extends ProjectHooks{
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" Element entered successfully","pass");
		return this;
	}
	
	@And("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" Page entered successfully","pass");
		return this;
	}
	 
	@And("Click Login button")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		reportStep("User Login button clicked successfully", "pass");
		return new HomePage();
	}

}
>>>>>>> e9c21cee583f9eb3d059caad077898802ef9c75e
