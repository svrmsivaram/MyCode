package project1;

import org.testng.annotations.Test;

public class DeactivateContact extends LoginLeafTaps{
	
	@Test
	public void deactivateContact() {
		
		String firstName ="johnpa12",contactId,errorMessage ="No records to display",title ="View Contact | opentaps CRM",deActivateConfirnmessage="This contact was deactivated";
		clickByLink("Contacts");
		clickByLink("Find Contacts");
		enterByXpath("(//input[@name='firstName'])[3]",firstName);
		clickByXpath("//button[text()='Find Contacts']");
		contactId =getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		verifyTitle(title);
		clickByLinkNoSnap("Deactivate Contact");
		acceptAlert();
		verifyTextContainsByXpath("//span[@class='subSectionWarning']",deActivateConfirnmessage );
		clickByLink("Find Contacts");
		enterByXpath("//label[text()='Contact Id:']/following::input",contactId);
		clickByXpath("//button[text()='Find Contacts']");
		verifyTextByXpath("//div[text()='No records to display']", errorMessage);
	}

}
