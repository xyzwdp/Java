package com.history.com.day2;

public class MethonDemo {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        int max = Math.max(a, b);
//        int max=a>b?a:b;
        System.out.println("最大的数为："+max);
//        if (a > b) {
//            System.out.println("最大值为a：" + a);
//        } else {
//            System.out.println("最大值为b：" + b);
//        }
    }
}
