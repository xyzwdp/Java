package com.history.comone.outertwo;


public class InerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调用方法
        //Inner i = new Inner();

        /*Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

        //常用调用内部类方法
        Outer o = new Outer();
        o.method();
    }
}
