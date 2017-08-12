package weeklyHomeWork01;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CreatContact {

	public static void main(String[] args) throws Exception {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		TestStep ts= new TestStep();
		RemoteWebDriver dr= ts.openChromeBrowser("http://www.leaftaps.com/opentaps",dc);
		ts.enterById(dr, "username", "DemoSalesManager");
		ts.enterById(dr, "password", "crmsfa");
	    ts.clickbyclassname(dr, "decorativeSubmit");
	    ts.clickbyLinkText(dr, "CRM/SFA");
		ts.clickbyLinkText(dr, "Create Contact");
		ts.enterByXpath(dr, "//*[@id='firstNameField']","Firstname");
		ts.enterById(dr, "lastNameField", "Lastname");
		ts.clickbyclassname(dr, "smallSubmit");
		
		
	}

}
