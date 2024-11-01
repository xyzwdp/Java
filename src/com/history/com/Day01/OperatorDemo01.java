package com.history.com.Day01;

public class OperatorDemo01 {
    public static void main(String[] args){
        //定义两个变量
        int a=10;
        //字符A的值为65，a为97
        char b='A';
        char c='a';
        char d='0';
        System.out.println(a+b);
        System.out.println(a+c);
        System.out.println(a+d);
        System.out.println(b+c);
        System.out.println("--------------");

        //char ch=a+b;
        //char类型会自动提升为int类型
        int f=a+b;
        System.out.println(f);

        double g=10+1.3;
        System.out.println(g);
    }
}
