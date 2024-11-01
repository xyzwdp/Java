package com.history.com.day4;


import java.util.Scanner;

/*需求：输入星期数，显示今天的减肥活动
    周一：跑步
    周二：游泳
    周三：慢走
    周四：动感单车
    周五：拳击
    周六：爬山
    周日：好好吃一顿

    思路：
        1、键盘录入一个星期数，用变量接收
        2、对星期数进行判断
        3、在对应的语句控制中输出对应的减肥活动*/
//快捷键导包，Alt+enter
//自动导包
public class Tste2 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿！！！");
                break;
            default:
                System.out.println("你输入的星期数有误！");
        }

    }
}