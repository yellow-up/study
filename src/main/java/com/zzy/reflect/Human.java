package com.zzy.reflect;

/**
 * Created by Fairyland on 2018/1/4.
 */
public class Human {

    private String name;
    private int age;
    private String race;


    Human(){}

    Human(String name){
        this.name = name;
    }

    Human(String name,String race){
        this.name = name;
        this.race = race;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void eat(String foodName){
        System.out.println("eat "+foodName);
    }

    public boolean isAdult(int age){
        return age >= 18;
    }

    public boolean isAdult(int age,String countryName){
        return age >= 18;
    }

    public static String bath(String type){
        return type;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello world,你好世界");
    }



}
