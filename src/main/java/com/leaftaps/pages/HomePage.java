<<<<<<< HEAD
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class HomePage extends ProjectHooks{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public MyHomePage clickCrmsfaLink() {
		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("CRM/SFA link is clicked", "pass");
		return new MyHomePage();
	}
	
}
=======
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class HomePage extends ProjectHooks{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public MyHomePage clickCrmsfaLink() {
		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("CRM/SFA link is clicked", "pass");
		return new MyHomePage();
	}
	
}
>>>>>>> e9c21cee583f9eb3d059caad077898802ef9c75e
