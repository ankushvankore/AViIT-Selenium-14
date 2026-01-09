package com.WebTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener{
	public void onStart(ITestContext result)
	{
		System.out.println("Test started!!!");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Ends!!!");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + " test fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName() + " test skipped");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() + " test started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + " test pass");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
