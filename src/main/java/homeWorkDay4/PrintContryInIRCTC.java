package homeWorkDay4;

import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import weeklyHomeWork01.TestStep;

public class PrintContryInIRCTC {

	public static void main(String[] args) {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		TestStep ts= new TestStep();
		ChromeDriver dr= ts.openChromeBrowser("https://www.irctc.co.in",dc);
		ts.clickbyLinkText(dr,"Sign up");
        Select se = new Select(dr.findElementById("userRegistrationForm:nationalityId"));
        List<WebElement> we = se.getOptions();
        for (WebElement ele : we) {
        	
        	System.out.println(ele.getText());
			
		}

	}

}
