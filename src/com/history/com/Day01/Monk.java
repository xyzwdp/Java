package com.history.com.Day01;

public class Monk {
    public static void main(String[] args){
        int height1=150;
        int height2=160;
        int height3=200;

        //三元运算符：关系表达式？表达式1：表达式2,真1假2
        //进行比较
        int tempheight=height1>height2?height1:height2;
        int maxheight=tempheight>height3?tempheight:height3;
        //输出结果

        System.out.println("tempheight:"+tempheight);//160
        System.out.println("maxheight"+maxheight);//200
    }
}
