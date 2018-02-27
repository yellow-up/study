package com.zzy.study;

import java.util.Random;

/**
 * Created by Fairyland on 2018/1/5.
 */
public class RandomNum {
    public static void main(String[] args) {
        Random ran = new Random();

        long seed = 1997;
        ran.setSeed(seed);

        for (int i = 0; i <5 ; i++) {
            seed = ran.nextLong();
            System.out.println(seed);
            ran.setSeed(seed);
        }

        System.out.println("?,?,?");

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
