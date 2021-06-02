package com.infa.poc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataproviderExample {

    @Test(dataProvider = "testData")
    public void testDataProvider(String userName, String pwd, String dbUrl){
        System.out.println("User :: "+userName+" Password :: "+pwd+" DB Url :: "+dbUrl);
    }

    @DataProvider(name="testData")
    public Object[][] parameters(){
        /**
         * Row show number of test cases and column shows for each test cases number of
         * input
         */
        Object[][] data = new Object[2][3];
        data[0][0] = "user1";
        data[0][1] = "pwd1";
        data[0][2] = "db1";
        data[1][0] = "user2";
        data[1][1] = "pwd2";
        data[1][2] = "db2";
        return  data;
    }
}
