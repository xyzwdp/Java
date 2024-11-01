package com.history.com.day14one;

public class AnimalDemo {

    /*
    多态
    概述
        同一个对象，在不同时刻表现出来的不同形态
    前提和体现
        有继承/实现关系
        有方法重写
         有父类引用指向子类对象
     */
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

        /*成员访问特点
        成员变量
            编译看左边
            执行看左边
        成员方法
            编译看左边
            执行看右边*/

        System.out.println(a.age);
        //System.out.println(a.weight);

        a.eat();
        //a.playGame();
    }
}
