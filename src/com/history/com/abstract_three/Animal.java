package com.history.com.abstract_three;

public abstract class Animal {
    private int age = 11;
    private final String city ="杭州";

    //抽象类中可以使用构造方法
    public Animal(){}

    public Animal(int age){
        this.age=age;
    }

    public void show(){
        System.out.println(age);
        //不能给常量赋值
        //city="贵阳";
        System.out.println(city);
    }
    public abstract void eat();

}
