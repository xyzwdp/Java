package com.history.com.day2;

public class MethonDemo4 {
    public static void main(String[] args) {
        //调用getMax方法
        //调用方法时，数据数量与类型必须一致

        getMax(11, 22);

        int a = 33;
        int b = 6;
        getMax(a, b);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println("a为最大值：" + a);
        } else {
            System.out.println("b为最大值：" + b);
        }
    }
}
