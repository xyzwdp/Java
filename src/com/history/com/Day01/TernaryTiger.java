package com.history.com.Day01;

public class TernaryTiger {
    public static void main(String[] args) {
        //定义老虎重量
        int weight1 = 180;
        int weight2 = 200;

        boolean result = weight1 == weight2 ? true : false;
        boolean result1 = weight1 != weight2 ? true : false;
        //输出结果
        System.out.println("result: " + result);
        System.out.println("result: " + result1);
    }
}
