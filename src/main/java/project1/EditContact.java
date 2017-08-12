package project1;

import org.testng.annotations.Test;

public class EditContact extends LoginLeafTaps {

	@Test
	public void editContact()
	{
		String title ="Find Contacts | opentaps CRM",firstName="johnpa12",marketingCampaign="Car and Driver",updatedFN ="TestGaya";
		clickByLink("Contacts");
		clickByLink("Find Contacts");
		enterByXpath("(//input[@name='firstName'])[3]",firstName);
		clickByXpath("//button[text()='Find Contacts']");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		verifyTitle(title);
		clickByLink("Edit");
		enterById("updateContactForm_firstName",updatedFN);
		selectVisibileTextById("addMarketingCampaignForm_marketingCampaignId", marketingCampaign);
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		verifyTextById("viewContact_firstName_sp",updatedFN );
	}
}
