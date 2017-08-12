package week5Day1;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static void main(String[] args) {
		
		ExtentReports er =new ExtentReports("./testreport/repor.html",false);
		
		ExtentTest et = er.startTest("CreateLead","Creating Lead Value");
		et.assignAuthor("Siva");
		et.assignCategory("Regression");
		
		et.log(LogStatus.PASS,"enterByID", "enteringCompanyByID"+et.addScreenCapture("./../snaps/snap1.jpg"));
		et.log(LogStatus.FAIL, "enterByName", "enterbyCOmapny Name");
		et.log(LogStatus.WARNING,"enterByValue","Enter By Company Value");
		et.log(LogStatus.ERROR, "Enterbyerror","Enter bY error");

		er.endTest(et);
		er.flush();
	}

}
