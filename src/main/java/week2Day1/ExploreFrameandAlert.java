package week2Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreFrameandAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		dr.manage().window().maximize();
		dr.switchTo().frame("iframeResult");
		dr.findElementByXPath("/html/body/button").click();
		String giventxt ="Loop";
		dr.switchTo().alert().sendKeys(giventxt);
		Thread.sleep(5000);
		dr.switchTo().alert().accept();
		String txt = dr.findElementById("demo").getText();
		if(txt.contains(giventxt)==true)
		{
			System.out.println("Given Text is Present");
		}
		else
		{
			System.out.println("Given Text is not Present");
		}	

	}

}
