package weeklyHomeWork01;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestStep {
	
	public TestStep()
	{
		System.out.println("Called Constructior");
	}
	
	public RemoteWebDriver openChromeBrowser(String str , DesiredCapabilities dc) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/*RemoteWebDriver dr = new RemoteWebDriver(URL  http://192.168.1.8:4444/wd/hub", desiredCapabilities)
*/
		RemoteWebDriver dr = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"), dc);
		//RemoteWebDriver dr = new RemoteWebDriver(dc)
		dr.manage().window().maximize();
		dr.get(str);
		return dr;
	}

	public void clickbyLinkText(RemoteWebDriver cd,String str)
	{
		cd.findElementByLinkText(str).click();
	}
	public void clickbyId(RemoteWebDriver cd,String str)
	{
		cd.findElementById(str).click();
	}
	public void clickbyclassname(RemoteWebDriver cd,String str)
	{
		cd.findElementByClassName(str).click();
	}
	public void enterbyLinkText(RemoteWebDriver cd,String str,String entrtext)
	{
		cd.findElementByLinkText(str).sendKeys(entrtext);
	}
	public void enterById(RemoteWebDriver cd,String str,String entrtext)
	{
		cd.findElementById(str).sendKeys(entrtext);
	}
	public void enterByclassname(RemoteWebDriver cd,String str,String entrtext)
	{
		cd.findElementByClassName(str).sendKeys(entrtext);
	}
	public void enterByXpath(RemoteWebDriver cd,String str,String entrtext)
	{
	    cd.findElementByXPath(str).sendKeys(entrtext);	
	}
	public void selectdropdown(RemoteWebDriver cd,String ele,String str)
	{
		Select se = new Select(cd.findElementById(ele));
		List<WebElement> allopt = se.getOptions();
		se.selectByVisibleText(selecFirstOpt(allopt,str,1));
	
	}
	public String selecFirstOpt(List<WebElement> opt, String starchar, int numpos) {
		String name= null;
		int i =1;
		for (WebElement we : opt) {
			if((we.getText().toUpperCase().startsWith(starchar.toUpperCase())==true))
			{
				if(i==numpos)
				{
					name = we.getText();
					break;
				}else
				{
					i++;
				}
			}
			}
		return name;
	}

	

}
