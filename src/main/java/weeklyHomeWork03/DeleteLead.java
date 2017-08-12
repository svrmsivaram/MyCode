package weeklyHomeWork03;



import org.testng.annotations.Test;

import project1.LoginLeafTaps;

public class DeleteLead extends LoginLeafTaps{
	
	@Test(dependsOnMethods={"weeklyHomeWork03.CreateLead.createLead"})
	public void deleteLead()
	{
		String phoneNumber ="9790441444",leadId,errorMessage ="No records to display";
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByXpath("//input[@name='phoneNumber']",phoneNumber);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		leadId =getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']",leadId);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		verifyTextByXpath("//div[contains(text(),'No records to display')]", errorMessage);
	}

}
