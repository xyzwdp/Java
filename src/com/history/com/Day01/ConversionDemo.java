package com.history.com.Day01;

public class ConversionDemo {
    public static void main(String[] args){
        //自动类型转换
        double a=10;
        System.out.println(a);

        //定义byte类型变量
        byte b=20;
        float c=b;
        int d=b;
        short g=b;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //不可以转换
        //char e=b;

        //强制类型转换
        int h=(int)88.88;
        System.out.println(h);


    }
}
