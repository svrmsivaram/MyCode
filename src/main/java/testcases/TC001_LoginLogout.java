package testcases;

import org.junit.Test;

import wrappers.WrapperMethods;

public class TC001_LoginLogout extends WrapperMethods{
	@Test
	public void login() {
		//WrapperMethods wm = new WrapperMethods();
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByClassName("decorativeSubmit");
		closeBrowser();
	}

}
