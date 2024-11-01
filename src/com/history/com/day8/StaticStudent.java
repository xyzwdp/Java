package com.history.com.day8;

public class StaticStudent {
    public static void main(String[] args) {

    }
    //非静态，成员变量
    private String name = "张三";
    //静态成员变量
    private static String university = "家里蹲大学";

    //非静态方法
    public void show1(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show2();
    }

    //静态成员方法
    public static void show2(){
        //System.out.println(name);
        System.out.println(university);
        //show1();
        show2();
    }

}
