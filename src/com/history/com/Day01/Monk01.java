package com.history.com.Day01;

import java.util.Scanner;

public class Monk01 {
    public static void main(String[] args){
        //创建对象
        Scanner sc=new Scanner(System.in);

        //创建变量
        System.out.println("请输入第1个和尚的身高");
        int height1=sc.nextInt();
        System.out.println("请输入第2个和尚的身高");
        int height2= sc.nextInt();
        System.out.println("请输入第3个和尚的身高");
        int height3=sc.nextInt();

        //三元运算得出最高值
        int tempheight = height1 > height2 ? height1:height2;
        int maxheight = tempheight > height3 ? tempheight:height3;

        //输出结果
        System.out.println("这三个和尚中最高的是:"+maxheight+"cm");
    }
}
