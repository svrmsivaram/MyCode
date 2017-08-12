package project1;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wrappers.ReadExcel;
import wrappers.WrapperMethods;

public class LoginLeafTaps extends WrapperMethods {

	@Parameters ({"browser","url","usr","pwd"})
	@BeforeMethod(groups={"common"})
	public void login(String browser, String url , String usr , String pwd)
	{
		invokeApp(browser,url);
		enterById("username",usr);
		enterById("password",pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod(groups={"common"})
	public void closeBrow()
	{
		closeBrowser();
	}
	
	@DataProvider(name="1234")
	public static String[][] getData() {
		String[][] set1 ={{"hari","Test","CTS","9191552222","siva@gamil.com"},{"hari","Test","CTS","9790441444","har@gmail.com"}};
		return set1;
	}
	@DataProvider(name="CL")
	public static String[][] readexl() throws InvalidFormatException, IOException{
		ReadExcel re = new ReadExcel();
		return re.readExcel("createLead");
	}
}

