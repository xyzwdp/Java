package com.history.com.port_two;

/*
成员特点
    成员变量
        默认修饰符：public static final
        只能是常量

    构造方法
        接口没有构造方法，因为接口主要度行为进行抽象的，是没有具体存在
        一个父类如果没有父类，默认继承object类
    成员方法
        只能是抽象方法
        默认修饰符：public abstract
*/

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        //接口中变量默认被final修饰，为常量
        //i.num=30;
        System.out.println(i.num2);
        //i.num2=40;
        System.out.println(Inter.num);

    }
}
