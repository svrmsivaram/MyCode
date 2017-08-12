package weeklyHomeWork03;



import org.testng.annotations.Test;

import project1.LoginLeafTaps;

public class CreateLead extends LoginLeafTaps {
	
	@Test(groups={"smoke"}, dataProvider="CL")
	public void createLead(String FN,String LN, String CN, String PN, String EI){
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName",FN);
		enterById("createLeadForm_lastName", LN);
		selectVisibileTextById("createLeadForm_dataSourceId","Direct Mail");
		selectIndexById("createLeadForm_marketingCampaignId",3);
		enterById("createLeadForm_primaryPhoneNumber",PN);
		enterById("createLeadForm_primaryEmail",EI);
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_firstName_sp",FN );
		
	
	}

}
