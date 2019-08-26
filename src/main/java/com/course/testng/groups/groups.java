package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


/*
这是分组测试，可以根据组的名称来安装顺序执行，嗯，就是这样

 */
public class groups {
    @Test(groups ="server")
    public void test1(){

        System.out.println("这是服务端组1");
    }

    @Test(groups = "server")
    public void test2(){

        System.out.println("这是服务端组2");
    }


    @Test(groups = "client")
    public void test3(){

        System.out.println("这是客户端组3");
    }

    @Test(groups = "client")
    public void test4(){

        System.out.println("这是客户端组4");
    }

    @BeforeGroups("server")
    public void onServer1(){

        System.out.println("这是服务端运行运行之前的方法1111111111");
    }
    @AfterGroups("server")
    public void onServer2(){

        System.out.println("这是服务端运行运行之后的方法2222222222");

    }

    @BeforeGroups("client")
    public void onClient(){

        System.out.println("这是客户端运行之前的方法33333333333333");
    }

    @AfterGroups("client")
    public void onClient2(){

        System.out.println("这是客户端行运行之后的方法444444444444");
    }


}
