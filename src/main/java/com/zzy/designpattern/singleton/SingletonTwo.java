package com.zzy.designpattern.singleton;

/**
 * 懒汉式，线程安全<br>
 * Created by Fairyland on 2017/12/14.
 */
public class SingletonTwo {
    private static SingletonTwo instance = null;

    private SingletonTwo(){};

    public static synchronized SingletonTwo getInstance(){

        if(instance == null){
            return new SingletonTwo();
        }
        return instance;
    }

}
