package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("case1这是一个测试用例");
    }
    @Test
    public void testCase2(){
        System.out.println("case2这是一个测试用例");
    }
    @BeforeMethod
    public void BeforMethod(){
        System.out.println("BeforMethon运行之前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethon运行之后");
    }



}
