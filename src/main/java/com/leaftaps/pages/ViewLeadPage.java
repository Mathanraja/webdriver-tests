<<<<<<< HEAD
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class ViewLeadPage extends ProjectHooks {

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" is matching with first name", "pass");
		return this;
	}

}
=======
package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class ViewLeadPage extends ProjectHooks {

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" is matching with first name", "pass");
		return this;
	}

}
>>>>>>> e9c21cee583f9eb3d059caad077898802ef9c75e
