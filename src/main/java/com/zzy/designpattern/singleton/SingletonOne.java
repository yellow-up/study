package com.zzy.designpattern.singleton;

/**
 * 懒汉式，线程不安全<br>
 *
 *
 * Created by Fairyland on 2017/12/14.
 */
public class SingletonOne {

    private static SingletonOne instance = null;

    private SingletonOne(){};

    public static SingletonOne getInstance(){

        if(instance == null){
            return new SingletonOne();
        }
        return instance;
    }


}
