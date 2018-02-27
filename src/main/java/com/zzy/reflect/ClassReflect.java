package com.zzy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Fairyland on 2018/1/4.
 */
public class ClassReflect {

    public static void main(String[] args) {

        Class humanClass = Human.class;

        Method[] methods = humanClass.getDeclaredMethods();
        //System.out.println(Arrays.toString(methods));
        for(Method m : methods){
            System.out.println(m.toString());
        }

        Method method = null;
        try {
            method = humanClass.getDeclaredMethod("isAdult", int.class, String.class);
            //System.out.println(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Field[] fields = humanClass.getDeclaredFields();
        for(Field field : fields){
            //System.out.println(field);
        }

        Constructor[] conss = humanClass.getDeclaredConstructors();

        for(Constructor cons : conss){
            //System.out.println(cons.toString());
        }

        Human human = new Human();

        try {
            boolean flag = (Boolean) method.invoke(human,17, "China");
            //System.out.println(flag);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Method bathMethod = humanClass.getDeclaredMethod("bath",String.class);
            String type = (String) bathMethod.invoke(null,"shower");
            System.out.println(type);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(humanClass.getCanonicalName());


    }

}
