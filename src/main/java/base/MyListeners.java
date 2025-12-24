package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ExtentReportManager;

public class MyListeners implements ITestListener {

	 public static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        ExtentReportManager.getExtentReports();
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = ExtentReportManager.getExtentReports().createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test failed: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReportManager.getExtentReports().flush();
    }

    public static ExtentTest getReport() {
    	
    	return test;
    }
}