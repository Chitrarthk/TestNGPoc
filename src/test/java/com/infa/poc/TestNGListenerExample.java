package com.infa.poc;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

public class TestNGListenerExample implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test passed :: "+iTestResult.getName()+" "+iTestResult.getClass());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed :: "+iTestResult.getName()+" "+iTestResult.getClass());
        System.out.println("Test failed :: "+iTestResult.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
