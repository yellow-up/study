package com.zzy.designpattern.proxy;

import org.junit.Test;

/**
 * Created by Fairyland on 2017/12/15.
 */
public class ProxyTest {

    @Test
    public void test(){
        Human yrp = new YRProxy();
        yrp.action();
    }


}
