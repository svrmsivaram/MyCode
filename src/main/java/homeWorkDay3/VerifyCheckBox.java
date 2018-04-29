package homeWorkDay3;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import weeklyHomeWork01.TestStep;

public class VerifyCheckBox {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		TestStep ts = new TestStep();
		RemoteWebDriver dr =ts.openChromeBrowser("http://testleaf.herokuapp.com/pages/checkbox.html",dc);
		if(dr.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected() == true)
		{
		System.out.println("Given Check box is selected");
	    }
		else
		{
			System.out.println("Not Selected");
		}
			
	}

}
