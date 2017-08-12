package weeklyHomeWork03;



import org.testng.annotations.Test;

import project1.LoginLeafTaps;

public class DuplicateLead extends LoginLeafTaps {
	
	@Test(enabled = false)
	public void duplicateLead()
	{
		String email="siva@gmail.com",title ="Duplicate Lead | opentaps CRM";
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterByXpath("//input[@name='emailAddress']",email);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		clickByLink("Duplicate Lead");
		verifyTitle(title);
		String fn = getTextById("createLeadForm_firstName");
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_firstName_sp", fn);
		
		
		
	}

}
