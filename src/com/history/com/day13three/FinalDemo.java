package com.history.com.day13three;

public class FinalDemo {
    public static void main(String[] args) {
        //final修饰基本类型变量，被final定义后，不能再被赋值
        final int age = 20;
        System.out.println(age);
        //age =100;
        //System.out.println(age);

        //final修饰引用类型变量
        final Student s = new Student();
        System.out.println(s);
        System.out.println(s.age);
        s.age=44;
        System.out.println(s.age);

        //final修饰的引用变量，地址值不能变，地址里的内容可以变
        /*s = new Student();
        System.out.println(s);*/
    }
}
