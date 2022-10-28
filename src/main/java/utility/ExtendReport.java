package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	public static ExtentReports getReports() {
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("ExtendReports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent .setSystemInfo("RepotedBy","Vighnesh");
		extent.setSystemInfo("TestType","Regression");
		return extent;
	

}
}
