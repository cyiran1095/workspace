package com.course.testng.suite;


import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforSuite(){
     System.out.println("beforeTest运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterTest运行了");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("befoorClass运行了");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass运行了");
    }

    @BeforeTest
    public void beforTest() {
        System.out.println("beforTest");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
}
