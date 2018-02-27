package com.zzy.designpattern.proxy;

/**
 * Created by Fairyland on 2017/12/15.
 */
public class YRProxy implements Human {

    private YellowRace yr = new YellowRace();

    public void action() {
        System.out.println("代理开始");
        yr.action();

    }
}
