<<<<<<< HEAD
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class MyHomePage extends ProjectHooks{
	
	public MyLeadsPage clickLeadsLink() {
		click(locateElement(Locators.LINK_TEXT, "Leads"));
		reportStep("Leads link is clicked", "pass");
		return new MyLeadsPage();
	}

}
=======
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class MyHomePage extends ProjectHooks{
	
	public MyLeadsPage clickLeadsLink() {
		click(locateElement(Locators.LINK_TEXT, "Leads"));
		reportStep("Leads link is clicked", "pass");
		return new MyLeadsPage();
	}

}
>>>>>>> e9c21cee583f9eb3d059caad077898802ef9c75e
