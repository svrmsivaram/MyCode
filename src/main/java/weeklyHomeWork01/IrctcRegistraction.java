package weeklyHomeWork01;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import weeklyHomeWork01.TestStep;

public class IrctcRegistraction {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		TestStep ts= new TestStep();
		ChromeDriver dr= ts.openChromeBrowser("https://www.irctc.co.in",dc);
		ts.clickbyLinkText(dr,"Sign up");
		ts.enterById(dr,"userRegistrationForm:userName","attestusr");
		ts.enterById(dr,"userRegistrationForm:password","test@123");
		ts.enterById(dr,"userRegistrationForm:confpasword","test@123");
		ts.selectdropdown(dr,"userRegistrationForm:securityQ","What is your pet");
		ts.enterById(dr,"userRegistrationForm:securityAnswer","Anjoy");
		ts.enterById(dr,"userRegistrationForm:firstName","Sivafirst");
		ts.enterById(dr,"userRegistrationForm:middleName","Middle");
		ts.enterById(dr,"userRegistrationForm:lastName","Lastname");
		ts.clickbyId(dr,"userRegistrationForm:gender:0");
		ts.clickbyId(dr,"userRegistrationForm:maritalStatus:0");
		ts.selectdropdown(dr,"userRegistrationForm:dobDay","01");
		ts.selectdropdown(dr,"userRegistrationForm:dobMonth","JAN");
		ts.selectdropdown(dr,"userRegistrationForm:dateOfBirth","1991");
		ts.selectdropdown(dr,"userRegistrationForm:occupation","Private");
		ts.enterById(dr,"userRegistrationForm:uidno","123245617894");
		ts.enterById(dr,"userRegistrationForm:idno","ASFD1234A");
		ts.enterById(dr,"userRegistrationForm:email","testing@gmail.com");
		ts.enterById(dr,"userRegistrationForm:mobile","9790441444");
		ts.selectdropdown(dr, "userRegistrationForm:nationalityId","Ind");
		ts.enterById(dr, "userRegistrationForm:address","7/1, Mannar Street");
		ts.enterById(dr, "userRegistrationForm:street", "Mannar Street");
		ts.enterById(dr, "userRegistrationForm:area","Vadapalani");
		ts.selectdropdown(dr, "userRegistrationForm:countries","In");
		ts.enterById(dr, "userRegistrationForm:pincode", "600026");
		ts.clickbyId(dr, "userRegistrationForm:statesName");
		Thread.sleep(10000);
		ts.selectdropdown(dr,"userRegistrationForm:cityName", "Che");
		Thread.sleep(10000);
		ts.selectdropdown(dr,"userRegistrationForm:postofficeName", "Vada");
		ts.enterById(dr, "userRegistrationForm:landline", "04448504111");

	}

}
