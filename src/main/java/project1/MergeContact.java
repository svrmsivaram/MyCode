package project1;

import org.testng.annotations.Test;

public class MergeContact extends LoginLeafTaps {

	@Test
	public void mergeContact()	{			
		String contactId ="12023",contactId1="12026",errorMessage ="No records to display";
		clickByLink("Contacts");
		clickByLink("Merge Contacts");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByXpath("(//label[text()='Contact Id:']/following::input)[1]",contactId);
		clickByXpath("//button[text()='Find Contacts']");
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByXpath("(//label[text()='Contact Id:']/following::input)[1]",contactId1);
		clickByXpath("//button[text()='Find Contacts']");
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a");
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
		clickByLink("Find Contacts");
		enterByXpath("//label[text()='Contact Id:']/following::input",contactId);
		clickByXpath("//button[text()='Find Contacts']");
		verifyTextByXpath("//div[text()='No records to display']", errorMessage);
		
	}
}
