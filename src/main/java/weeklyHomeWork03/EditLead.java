package weeklyHomeWork03;


import org.testng.annotations.Test;

import project1.LoginLeafTaps;

public class EditLead extends LoginLeafTaps {
	
	@Test(dependsOnMethods={"createLead"})
	public void editLead(){
	String firstName ="Sivaram",title ="View Lead | opentaps CRM",companyName="YetToJoin";
	clickByLink("Leads");
	clickByLink("Find Leads");
	enterByXpath("(//input[@name='firstName'])[3]",firstName);
	clickByXpath("//button[contains(text(),'Find Leads')]");
	clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	verifyTitle(title);
	clickByLink("Edit");
	enterById("updateLeadForm_companyName",companyName);
	clickByClassName("smallSubmit");
	verifyTextByXpath("//*[@id='viewLead_companyName_sp']", companyName);
 
	}
	
}
