package com.history.com.day3;

public class MethoDemo4 {
    public static void main(String[] args) {
        //调用方法
        int result1 = sum(10, 20);
        System.out.println(result1);

        double result2 = sum(10.0, 20.0);
        System.out.println(result2);

        float result3 = sum(10, 20, 30);
        System.out.println(result3);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static float sum(int a, int b, int c) {
        return a + b + c;
    }
}
