package weeklyHomeWork03;

import org.testng.annotations.Test;

import project1.LoginLeafTaps;

public class MergeLead extends LoginLeafTaps{

	@Test(enabled =false )
	public void mergeLead() throws InterruptedException{
		
    	String leadId ="120",leadId1="120",errorMessage ="No records to display";
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",leadId);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		switchToParentWindow();
		//switchToLastWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",leadId1);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a");
		switchToParentWindow();
		clickByLink("Merge");
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",leadId);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		verifyTextByXpath("//div[contains(text(),'No records to display')]", errorMessage);
		
		}
}
