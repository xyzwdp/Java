package com.history.com.day5.student01;

public class Student {
    //成员变量
    private String name;
    private int age;

    //get/set方法
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age  = a;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name + "," + age);
    }
}
