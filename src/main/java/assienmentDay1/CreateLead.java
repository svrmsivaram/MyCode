package assienmentDay1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class CreateLead  {

@Test(invocationCount=2)
public static void createLeadone() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Fise");
		driver.findElementById("createLeadForm_firstName").sendKeys("Siva");
		driver.findElementById("createLeadForm_lastName").sendKeys("Selva");
		driver.findElementByClassName("smallSubmit").click();	
		driver.close();

		
		
	//}
	
	//@Test
/*	public void createLead(){
		invokeApp("chrome","http://www.leaftaps.com/opentaps");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Fiserv");
		enterById("createLeadForm_firstName","Siva");
		enterById("createLeadForm_lastName", "Hari");
		selectVisibileTextById("createLeadForm_dataSourceId","Direct Mail");
		selectIndexById("createLeadForm_marketingCampaignId",3);
		clickByClassName("smallSubmit");
		clickByLink("Logout");
		closeBrowser();*/
	}

}
