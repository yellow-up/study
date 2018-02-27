package com.zzy.designpattern.singleton;

/**
 * 静态内部类式<br>
 *
 *
 * Created by Fairyland on 2017/12/15.
 */
public class SingletonFour {

    private static class SingletonHolder{
        private static final SingletonFour instance = new SingletonFour();
        static {
            System.out.println("实例化了");
        }
    }

    private SingletonFour(){};
    public static final SingletonFour getInstance(){
        return SingletonHolder.instance;
    }






}
