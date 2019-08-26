package com.course.testng;

/*
忽略测试，默认是ture，就是全部执行，如果enable设置为false那就不执行了
 */
import org.testng.annotations.Test;

public class lgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1执行了");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2执行了");
    }

    @Test(enabled = false)
    public void ignore3(){
        System.out.println("ignore3执行了");
    }

}
