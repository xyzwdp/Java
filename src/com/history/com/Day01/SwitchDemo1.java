package com.history.com.Day01;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入月份（1-12）：");
        int month=sc.nextInt();

        /*
        switch (month){
            case 1:
                System.out.println("这是冬季");
                break;
            case 2:
                System.out.println("这是冬季");
                break;
            case 3:
                System.out.println("这是春季");
                break;
            case 4:
                System.out.println("这是春季");
                break;
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
                System.out.println("这是夏季");
                break;
            case 7:
                System.out.println("这是夏季");
                break;
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
                System.out.println("这是秋季");
                break;
            case 10:
                System.out.println("这是秋季");
                break;
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
                System.out.println("这是冬季");
                break;
            default:
                System.out.println("输入月份有误，请重新输入！");
                break;

            //case穿透

        }
         */
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("这是冬季");
                break;
            case 3:
            case 4:
            case 5:
                //break不能写在语句体之前，不然会击穿报错。
//                break;
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是春季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是春季");
                break;
            default:
                System.out.println("输入月份有误，请重新输入！");
                break;
        }
    }
}
