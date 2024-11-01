package com.history.com.day13three;

public class Zi extends Fu{


    public final int age = 10;
    public void show(){
        //age = 100;
        //final修饰的值不能被再次修饰

        System.out.println(age);
    }
    /*@Override
    public void method(){
        System.out.println("Zi method");
    }*/
    //final修饰的方法叫最终方法，是不能被重写的
}
