package homeWorkDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import weeklyHomeWork01.TestStep;

public class CloseFrame {

	public static void main(String[] args) throws Exception {
		TestStep ts = new TestStep();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver dr = ts.openChromeBrowser("http://layout.jquery-dev.com/demos/iframe_local.html",dc);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		dr.findElementByXPath("/html/body/div[2]/p/button").click();
			dr.switchTo().frame("childIframe");
		dr.findElementByXPath("/html/body/div[2]/p/button").click();
		dr.findElementByXPath("/html/body/div[3]/p/button").click();
		}

}
