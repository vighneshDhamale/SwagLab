package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.SwagLabLoginPage;
import utility.ExtendReport;
import utility.Parametrization;
import utility.ScreenShot;
@Listeners(listeners.TestNgListeners.class)
public class SwagLabLoginPageTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void createReport() {
	extent=ExtendReport.getReports();
}
	
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.openChromeBrowser();
		}

	@Test
	public void validateswagLabLoginPage() throws Exception{
		test=extent.createTest("SwagLabLoginPageTest");
		SwagLabLoginPage swagLabLoginPage=new SwagLabLoginPage(driver);
	
		swagLabLoginPage.enterusername(Parametrization.getExcelData(0, 1, "Sheet1"));
		swagLabLoginPage.enterpassword(Parametrization.getExcelData(2, 1, "Sheet1"));
		swagLabLoginPage.clickOnLogin();
		//Assert.assertTrue(false);
		//Thread.sleep(2000);
		//ScreenShot.takeScreenShot(driver, "Login");
		String expectedUrl="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
	}

	@AfterMethod
public void addResults(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS,result.getName());
	}
	else if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL,result.getName());
	}
	if(result.getStatus()==ITestResult.SKIP) {
		test.log(Status.SKIP,result.getName());
	}
}

	@AfterTest
public void FlushReport() {
	extent.flush();
}
}
