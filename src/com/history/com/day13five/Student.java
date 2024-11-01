package com.history.com.day13five;

public class Student {
    public String name;
    public int age;
    //public String university;
    //被所有对象共享的成员用static修饰
    public static String university;

    public void show(){
        System.out.println("姓名是："+name+",年纪是："+age+",学校是："+","+university);
    }
}
