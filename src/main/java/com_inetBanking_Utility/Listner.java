package com_inetBanking_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com_inetBanking_TestBase.TestBase;

public class Listner extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Execution start"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Execution Succesful"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		ScreenShot screenShot = new ScreenShot();
		screenShot.screenshot(result.getName());
		System.out.println("screenshot capture sucessful");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Execution Skipped"+result.getName());

	}


	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Case Execution Finish");

	}

}
