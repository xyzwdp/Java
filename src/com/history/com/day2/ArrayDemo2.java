package com.history.com.day2;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("----------------------");

        //定义第二个数组指向第一个数组
        //数组可以继承
        int[] arr1 = arr;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        //数组中的值可以改变
        arr1[0] = 111;
        arr1[1] = 222;
        arr1[2] = 333;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
