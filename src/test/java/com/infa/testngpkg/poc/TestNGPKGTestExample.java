package com.infa.testngpkg.poc;

import org.testng.annotations.Test;

public class TestNGPKGTestExample {
    private String pkgName =  TestNGPKGTestExample.class.getPackage().getName();

    @Test(groups = {"unit_test"})
    public void pocTest_1(){
        System.out.println("First Test case from package :: "+pkgName);
    }

    @Test(groups = {"regression"})
    public void pocTest_2(){
        System.out.println("Second Test case from package :: "+pkgName);
    }

    @Test(groups = {"regression"})
    public void pocTest_3(){
        System.out.println("Third Test case from package :: "+pkgName);
    }
}
