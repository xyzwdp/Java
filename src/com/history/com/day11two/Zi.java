package com.history.com.day11two;

public class Zi extends Fu{
    public int age = 30;

    public void show(){
        int age = 20;
        System.out.println(age);

        //我要访问本类的成员变量
        System.out.println(this.age);

        //我要访问父类的成员变量
        System.out.println(super.age);
    }
}
