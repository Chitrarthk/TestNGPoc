package com.infa.poc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterTestExample {

    @Parameters({"username","password","db_url"})
    @Test
    public void parameterTest(String usrName,String password, String dbUrl){
        System.out.println("Username :: "+usrName);
        System.out.println("Password :: "+password);
        System.out.println("Db Url :: "+dbUrl);
    }
}
