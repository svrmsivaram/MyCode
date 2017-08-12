package homeWorkDay3;

import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import weeklyHomeWork01.TestStep;

public class SelectDropDownValue {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		TestStep ts = new TestStep();
		ChromeDriver dr =ts.openChromeBrowser("http://testleaf.herokuapp.com/pages/Dropdown.html",dc);
		
		Select se = new Select(dr.findElementById("dropdown1"));
		List<WebElement> wb = se.getOptions();
		int n = wb.size();
		se.selectByIndex(n-2);	
		
	Select se1 = new Select(dr.findElementByXPath("//*[@id='contentblock']/section/div[6]/select"));
	List<WebElement> wb1 = se1.getOptions();
	int n1 = wb1.size();
	se1.selectByIndex(n1-2);	
	se1.selectByIndex(n1-3);
	//*[@id="contentblock"]/section/div[6]/select
	    
	
	}
}
