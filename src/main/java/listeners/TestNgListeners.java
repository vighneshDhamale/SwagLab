package listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;

import pojo.Browser;

public class TestNgListeners extends Browser implements ITestListener {
	  

		public void onTestSuccess(ITestResult result) {
			System.out.println("Test is Successful:"+result.getName());
		}
		public void onTestFailure(ITestResult result) {
			System.out.println("Test is Failed:"+result.getName());
			
		}
		public void onTestSkipped(ITestResult result) {
			 
			System.out.println("Test is Skipped"+result.getTestName());
		}
		public void onTestStart(ITestResult result) {
			System.out.println("Test is Started"+result.getTestName());
		}
	}

