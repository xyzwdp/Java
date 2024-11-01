package com.history.com.Day01;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] args){
        //创建对象

        Scanner sc=new Scanner(System.in);
        //Scanner st=new Scanner(System.in);

        //接收数据
       // System.out.println("输入一个整数与一个字符串：");
        //int i=sc.nextInt();
        System.out.println("输入一个字符串：");
        String a=sc.nextLine();
        //next方法返回会忽略空白字符
        String b=sc.next();
        //输出数据
        //System.out.println("i:"+i);
        System.out.println(a);
        System.out.println(b);
    }
}
