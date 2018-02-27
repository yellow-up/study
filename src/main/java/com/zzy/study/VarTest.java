package com.zzy.study;

import org.junit.Test;

/**
 * Created by Fairyland on 2017/9/18.
 */
public class VarTest {

    int i = 5;

    @Test
    public void var(){
        i = 9;
        System.out.println(i);//9
        int i =7;
        System.out.println(i);//7
        System.out.println(new VarTest().i);//5

    }



}
