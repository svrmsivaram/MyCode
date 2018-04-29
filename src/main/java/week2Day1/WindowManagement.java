package week2Day1;

import java.util.Set;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import weeklyHomeWork01.TestStep;

public class WindowManagement {

	public static void main(String[] args) throws Exception {
		TestStep ts = new TestStep();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver dr = ts.openChromeBrowser("https://www.irctc.co.in",dc);
		ts.clickbyLinkText(dr, "Contact Us");
		Set<String> allwin = dr.getWindowHandles();
		for (String ew : allwin) {
			
			dr.switchTo().window(ew);
			if(dr.getTitle().startsWith("Contact Us"))
			{
				System.out.println("Current Title :"+dr.getTitle());
				System.out.println("Current URL is :"+dr.getCurrentUrl());
			}
			
		}
		dr.quit();
	}

}
