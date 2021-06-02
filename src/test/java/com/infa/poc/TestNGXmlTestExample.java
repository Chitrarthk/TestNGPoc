package com.infa.poc;

import org.testng.annotations.Test;

public class TestNGXmlTestExample {
    @Test(groups = {"regression"})
    public void pocTest_1(){
        System.out.println("First Test case");
    }

    @Test(priority = 3)
    public void pocTest_2(){
        System.out.println("Second Test case");
    }

    @Test(groups = {"unit_test"})
    public void pocTest_3(){
        System.out.println("Third Test case");
    }
}
