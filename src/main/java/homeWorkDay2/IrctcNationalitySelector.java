package homeWorkDay2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcNationalitySelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.get("https://www.irctc.co.in");
		dr.manage().window().maximize();
		dr.findElementByLinkText("Sign up").click();
		Select se = new Select(dr.findElementById("userRegistrationForm:nationalityId"));
		List<WebElement> allopt = se.getOptions();
		se.selectByVisibleText(selecFirstOpt(allopt,"E",2));
		}

	private static String selecFirstOpt(List<WebElement> opt, String starchar, int numpos) {
		String name= null;
		int i =1;
		for (WebElement we : opt) {
			if((we.getText().startsWith(starchar)==true))
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
