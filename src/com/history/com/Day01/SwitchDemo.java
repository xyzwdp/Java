package com.history.com.Day01;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数（1-7）：");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("您输入的星期数有误，请重新输入");
                break;
        }
    }
}
