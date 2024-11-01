package com.history.com.day2;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //arr = null;
        //NullPointerException
        //数组不能为空
        System.out.println(arr[0]);

        //ArrayIndexOutOfBoundsException    数组索引越界异常
        //System.out.println(arr[3]);

        int [] arr2=new int[0];
        //System.out.println(arr2[0]);
        System.out.println(arr2);
    }
}
