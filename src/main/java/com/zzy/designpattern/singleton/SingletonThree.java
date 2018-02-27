package com.zzy.designpattern.singleton;

/**
 * 饿汉式
 * Created by Fairyland on 2017/12/14.
 */
public class SingletonThree {
    private static SingletonThree instance = new SingletonThree();

    private SingletonThree(){};

    public static SingletonThree getInstance(){
        return instance;
    }

}
