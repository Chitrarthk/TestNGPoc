package com.infa.poc;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGListenerTest{

    @Test
    public void testPass(){
        Assert.assertEquals("true","true");
    }

    @Test
    public void testFail(){
        Assert.assertEquals("true","false");
    }
}
