package com.four;

//在Java中，所有的类，都默认直接或间接继承Oobject
//父类：基类
public class Person {
    //pubulic:公共的
    //private：私有的
    //default:
    //prorected
//    private int money=1000;
    protected int money=1000;
//    public int money=1000;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("旺旺");
    }
}
