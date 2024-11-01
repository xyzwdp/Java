package com.history.com.Day01;

import java.util.Random;
import java.util.Scanner;

public class GussNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int j = 0;
        //打印值地址
        System.out.println(r);
        System.out.println("--------");

        int number = (int) (Math.random() * 100) + 1;
        //int number=r.nextInt(100) +1    ;

        System.out.println("number：" + number);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("请输入你要猜的数字（1-100的整数）：");
            int gussnumber = sc.nextInt();
            if (i < 5) {
                if (gussnumber > 100 || gussnumber < 0) {
                    if (j < 2) {
                        System.out.println("你怎么不听话，叫你输入0-100范围内的数，再给你一次机会，不扣次数");
                        j++;
                        i--;
//                        break;
                    } else {
                        System.out.println("你怎么不听话，叫你输入0-100范围内的数，给你机会不中用，扣你一次机会");
                    }


                } else if (gussnumber > number) {
                    System.out.println("你猜的数字" + gussnumber + "大了");
                } else if (gussnumber < number) {
                    System.out.println("你猜的数字" + gussnumber + "小了");
                } else {
                    System.out.println("恭喜你猜中了" + gussnumber);
                    break;
                }
            } else {
                System.out.println("这都没有猜中，你太垃圾了！！！");
            }


        }
        /*
        while (true){
            System.out.println("请输入你要猜的数字（1-100的整数）：");
            int guusnumber =sc.nextInt();
            if (guusnumber>number){
                System.out.println("你猜的数字"+guusnumber+"大了");
            }else if (guusnumber<number){
                System.out.println("你猜的数字"+guusnumber+"小了");
            }else{
                System.out.println("恭喜你猜中了"+guusnumber);
                break;
            }
        }
        */

    }


}
