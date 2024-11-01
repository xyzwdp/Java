package com.two;

public class Person {
    //一个类即使什么也不写，它也会存在一个方法
    //显示的定义构造器
    String name;
    int age;
    //实例化初始值
    //1、使用new关键字，本质是在调用构造器
    //2、用来生产构造起
    /*Command + N / Control + Enter / Control + N：
    *这个快捷键组合也可以用来生成代码，包括构造器、getter、setter等
     */

    public Person() {
    }

    //有参构造：一旦定义you can构造，无参构造就必须显示定义
    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }





}
