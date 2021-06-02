package com.infa.poc;

import org.testng.annotations.*;

public class TestNGTestExample {

    @BeforeClass
    public void pocBeforeClass(){System.out.println("Initialization should be done here");}

    @BeforeMethod
    public void pocBeforeMethod(){System.out.println("Execute before every method");}

    @Test(priority = 2)
    public void pocTest_1(){
        System.out.println("First Test case");
    }

    @Test(priority = 3)
    public void pocTest_2(){
        System.out.println("Second Test case");
    }

    @Test(priority = 1)
    public void pocTest_3(){
        System.out.println("Third Test case");
    }

    @AfterMethod
    public void pocAfterMethod(){System.out.println("Execute After every method");}

    @AfterClass
    public void pocAfterClass(){System.out.println("Release of resource should be done here");}

}
